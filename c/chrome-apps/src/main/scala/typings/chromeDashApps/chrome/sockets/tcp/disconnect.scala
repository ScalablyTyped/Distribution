package typings.chromeDashApps.chrome.sockets.tcp

import typings.chromeDashApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.sockets.tcp.disconnect")
@js.native
object disconnect extends js.Object {
  /**
    * @description Disconnects the socket.
    * @param socketId The socket identifier.
    * @param [callback] Called when the disconnect attempt is complete.
    */
  def apply(socketId: integer): Unit = js.native
  def apply(socketId: integer, callback: js.Function0[Unit]): Unit = js.native
}

