package typings.chromeApps.chrome.sockets.tcpServer

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.sockets.tcpServer.disconnect")
@js.native
object disconnect extends js.Object {
  /**
    * Disconnects the listening socket, i.e. stops accepting new connections
    * and releases the address/port the socket is bound to. The socket
    * identifier remains valid, e.g. it can be used with listen to accept
    * connections on a new port and address.
    *
    * @see https://developer.chrome.com/apps/sockets_tcpServer#method-disconnect
    * @param socketId The socket identifier.
    * @param callback Called when the disconnect attempt is complete.
    */
  def apply(socketId: integer): Unit = js.native
  def apply(socketId: integer, callback: js.Function0[Unit]): Unit = js.native
}

