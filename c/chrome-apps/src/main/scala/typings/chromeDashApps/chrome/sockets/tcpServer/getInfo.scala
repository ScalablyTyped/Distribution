package typings.chromeDashApps.chrome.sockets.tcpServer

import typings.chromeDashApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.sockets.tcpServer.getInfo")
@js.native
object getInfo extends js.Object {
  /**
    * Retrieves the state of the given socket.
    *
    * @see https://developer.chrome.com/apps/sockets_tcpServer#method-getInfo
    * @param socketId The socket identifier.
    * @param callback Called when the socket state is available.
    */
  def apply(
    socketId: integer,
    callback: js.Function1[/* socketInfo */ typings.chromeDashApps.chrome.sockets.tcpServer.SocketInfo, Unit]
  ): Unit = js.native
}

