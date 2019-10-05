package typings.chromeDashApps.chrome.bluetoothSocket

import typings.chromeDashApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.bluetoothSocket.connect")
@js.native
object connect extends js.Object {
  /**
    * Connects the socket to a remote Bluetooth device.
    * When the connect operation completes successfully,
    * onReceive events are raised when data is received
    * from the peer. If a network error occur while the
    * runtime is receiving packets, a onReceiveError
    * event is raised, at which point no more onReceive
    * event will be raised for this socket until the
    * setPaused(false) method is called.
    *
    * @param socketId The socket identifier.
    * @param address The address of the Bluetooth device.
    * @param uuid The UUID of the service to connect to.
    * @param callback Called when the connect attempt is complete.
    */
  def apply(socketId: integer, address: String, uuid: String, callback: js.Function0[Unit]): Unit = js.native
}

