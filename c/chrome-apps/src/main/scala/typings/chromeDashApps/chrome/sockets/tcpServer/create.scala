package typings.chromeDashApps.chrome.sockets.tcpServer

import typings.chromeDashApps.chrome.sockets.CreateInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.sockets.tcpServer.create")
@js.native
object create extends js.Object {
  /**
    * Creates a TCP server socket.
    *
    * @see https://developer.chrome.com/apps/sockets_tcpServer#method-create
    * @param callback Called when the socket has been created.
    */
  def apply(callback: js.Function1[/* createInfo */ CreateInfo, Unit]): Unit = js.native
  /**
    * Creates a TCP server socket.
    *
    * @see https://developer.chrome.com/apps/sockets_tcpServer#method-create
    * @param properties The socket properties.
    * @param callback   Called when the socket has been created.
    */
  def apply(properties: SocketProperties, callback: js.Function1[/* createInfo */ CreateInfo, Unit]): Unit = js.native
}

