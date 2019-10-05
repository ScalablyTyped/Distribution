package typings.chromeDashApps.chrome.bluetooth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.bluetooth.getDevice")
@js.native
object getDevice extends js.Object {
  /** Get information about a Bluetooth device known to the system. */
  def apply(deviceAddress: String, callback: js.Function1[/* deviceInfo */ Device, Unit]): Unit = js.native
}

