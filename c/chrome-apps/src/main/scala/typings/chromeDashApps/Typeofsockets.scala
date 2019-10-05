package typings.chromeDashApps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofsockets extends js.Object {
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
  @scala.inline
  def apply(tcp: Typeoftcp, tcpServer: TypeoftcpServer, udp: Typeofudp): Typeofsockets = {
    val __obj = js.Dynamic.literal(tcp = tcp, tcpServer = tcpServer, udp = udp)
  
    __obj.asInstanceOf[Typeofsockets]
  }
}

