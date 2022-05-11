package tugas.oop;
    interface InterfaceNotifikasi {
    void sendMessage(String receiver, String content);
    }
    class EmailNotification implements InterfaceNotifikasi{

    @Override
    public void sendMessage(String receiver, String content) {
        System.out.println("Mengirim email ke " + receiver + " dengan isi:");
        System.out.println(content);
    }   
}
class SMSNotification implements InterfaceNotifikasi{

    @Override
    public void sendMessage(String receiver, String content) {
        System.out.println("Mengirim SMS ke " + receiver + " dengan isi:");
        System.out.println(content);
    }    
}
class PushNotification implements InterfaceNotifikasi{

    @Override
    public void sendMessage(String receiver, String content) {
        System.out.println("Mengirim Notif ke " + receiver + " dengan isi:");
        System.out.println(content);
    }  
}


public class TugasOOP3 {
    public static void main(String[] args) {
        String emailPenerima = "tugasoop@gmail.com";
        String nomerHp = "+6285878988008";
        String mobileId = "iphone8";

        EmailNotification emailNotif = new EmailNotification();
        SMSNotification smsNotif = new SMSNotification();
        PushNotification pushNotif = new PushNotification();

        String message = "Tolong persiapkan alat-alat buat UTS tanggal 17 mei 2022";
        
        emailNotif.sendMessage(emailPenerima, message);
        smsNotif.sendMessage(nomerHp, message);
        pushNotif.sendMessage(mobileId, message);
    }
}