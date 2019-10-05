package typings.chromeDashApps.chrome.bluetoothSocket

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.bluetoothSocket.getSockets")
@js.native
object getSockets extends js.Object {
  /**
    * Retrieves the list of currently opened sockets owned by the application.
    * @param callback Called when the list of sockets is available.
    *                 Returns an array of socket info.
    */
  def apply(callback: js.Function1[/* sockets */ js.Array[SocketInfo], Unit]): Unit = js.native
}

