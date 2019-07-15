import javax.swing.*;

public class ClientTest {
    public static void main(String[] args){
        Client charlie;
        charlie = new Client("127.0.0.1");
        charlie.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        charlie.startRunning();
    }
}