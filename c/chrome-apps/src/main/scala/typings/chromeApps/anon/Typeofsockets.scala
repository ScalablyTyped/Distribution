package typings.chromeApps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofsockets extends StObject {
  
  /**
    * Use the chrome.sockets.tcp API to send and receive data over the network using TCP connections.
    * This API supersedes the TCP functionality previously found in the chrome.socket API.
    * @since Chrome 33.
    * @requires Manifest: 'Sockets': {...}
    */
  val tcp: Typeoftcp
  
  /**
    * Use the chrome.sockets.tcpServer API to create server applications using TCP
    * connections. This API supersedes the TCP functionality previously found in
    * the chrome.socket API.
    *
    * @since Chrome 33
    * @see https://developer.chrome.com/apps/sockets_tcpServer
    */
  val tcpServer: TypeoftcpServer
  
  /**
    * Use the chrome.sockets.udp API to send and receive data over the network
    * using UDP connections. This API supersedes the UDP functionality previously
    * found in the 'socket' API.
    * @requires Manifest: 'sockets': {...}
    * @since Chrome 33
    * @see https://developer.chrome.com/apps/sockets_udp
    */
  val udp: Typeofudp
}
object Typeofsockets {
  
  inline def apply(tcp: Typeoftcp, tcpServer: TypeoftcpServer, udp: Typeofudp): Typeofsockets = {
    val __obj = js.Dynamic.literal(tcp = tcp.asInstanceOf[js.Any], tcpServer = tcpServer.asInstanceOf[js.Any], udp = udp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofsockets]
  }
  
  extension [Self <: Typeofsockets](x: Self) {
    
    inline def setTcp(value: Typeoftcp): Self = StObject.set(x, "tcp", value.asInstanceOf[js.Any])
    
    inline def setTcpServer(value: TypeoftcpServer): Self = StObject.set(x, "tcpServer", value.asInstanceOf[js.Any])
    
    inline def setUdp(value: Typeofudp): Self = StObject.set(x, "udp", value.asInstanceOf[js.Any])
  }
}
