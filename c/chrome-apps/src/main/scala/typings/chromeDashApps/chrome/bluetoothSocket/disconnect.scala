package typings.chromeDashApps.chrome.bluetoothSocket

import typings.chromeDashApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.bluetoothSocket.disconnect")
@js.native
object disconnect extends js.Object {
  /**
    * Disconnects the socket. The socket identifier remains valid.
    * @param socketId The socket identifier.
    * @param [callback] Called when the disconnect attempt is complete.
    */
  def apply(socketId: integer): Unit = js.native
  def apply(socketId: integer, callback: js.Function0[Unit]): Unit = js.native
}

