package typings.chromeApps.chrome.bluetoothSocket

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.bluetoothSocket.create")
@js.native
object create extends js.Object {
  /**
    * Creates a Bluetooth socket.
    * @param callback Called when the socket has been created
    * */
  def apply(callback: js.Function1[/* createInfo */ CreateInfo, Unit]): Unit = js.native
  /**
    * Creates a Bluetooth socket.
    * @param properties The socket properties (optional)
    * @param callback Called when the socket has been created
    */
  def apply(properties: SocketProperties, callback: js.Function1[/* createInfo */ CreateInfo, Unit]): Unit = js.native
}

