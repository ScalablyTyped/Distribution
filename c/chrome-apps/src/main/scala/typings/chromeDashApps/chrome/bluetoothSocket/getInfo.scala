package typings.chromeDashApps.chrome.bluetoothSocket

import typings.chromeDashApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.bluetoothSocket.getInfo")
@js.native
object getInfo extends js.Object {
  /**
    * Retrieves the state of the given socket.
    * @param socketId The socket identifier.
    * @param callback Called when the socket state is available.
    *                 Callback returning object containing the socket information.
    */
  def apply(socketId: integer, callback: js.Function1[/* socketInfo */ SocketInfo, Unit]): Unit = js.native
}

