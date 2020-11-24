package typings.chromeApps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofsockets extends js.Object {
  
  /**
    * Use the chrome.sockets.tcp API to send and receive data over the network using TCP connections.
    * This API supersedes the TCP functionality previously found in the chrome.socket API.
    * @since Chrome 33.
    * @requires Manifest: 'Sockets': {...}
    */
  val tcp: Typeoftcp = js.native
  
  /**
    * Use the chrome.sockets.tcpServer API to create server applications using TCP
    * connections. This API supersedes the TCP functionality previously found in
    * the chrome.socket API.
    *
    * @since Chrome 33
    * @see https://developer.chrome.com/apps/sockets_tcpServer
    */
  val tcpServer: TypeoftcpServer = js.native
  
  /**
    * Use the chrome.sockets.udp API to send and receive data over the network
    * using UDP connections. This API supersedes the UDP functionality previously
    * found in the 'socket' API.
    * @requires Manifest: 'sockets': {...}
    * @since Chrome 33
    * @see https://developer.chrome.com/apps/sockets_udp
    */
  val udp: Typeofudp = js.native
}
object Typeofsockets {
  
  @scala.inline
  def apply(tcp: Typeoftcp, tcpServer: TypeoftcpServer, udp: Typeofudp): Typeofsockets = {
    val __obj = js.Dynamic.literal(tcp = tcp.asInstanceOf[js.Any], tcpServer = tcpServer.asInstanceOf[js.Any], udp = udp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofsockets]
  }
  
  @scala.inline
  implicit class TypeofsocketsOps[Self <: Typeofsockets] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTcp(value: Typeoftcp): Self = this.set("tcp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTcpServer(value: TypeoftcpServer): Self = this.set("tcpServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUdp(value: Typeofudp): Self = this.set("udp", value.asInstanceOf[js.Any])
  }
}
