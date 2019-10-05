package typings.chromeDashApps.chrome.bluetoothLowEnergy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.bluetoothLowEnergy.disconnect")
@js.native
object disconnect extends js.Object {
  /**
    * Closes the app's connection to the device with the given address. Note that this will not always destroy the physical link itself, since there may be other apps with open connections.
    * @param deviceAddress The Bluetooth address of the remote device.
    * @param [callback] Called when the disconnect request has completed.
    */
  def apply(deviceAddress: String): Unit = js.native
  def apply(deviceAddress: String, callback: js.Function0[Unit]): Unit = js.native
}

