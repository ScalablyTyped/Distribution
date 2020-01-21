package typings.chromeApps.chrome.bluetoothLowEnergy

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.bluetoothLowEnergy.writeDescriptorValue")
@js.native
object writeDescriptorValue extends js.Object {
  /**
    * Write the value of a specified characteristic descriptor from a remote peripheral.
    * @param descriptorId The instance ID of the GATT characteristic descriptor whose value should be written to.
    * @param value The value that should be sent to the remote descriptor as part of the write request.
    * @param callback Called when the write request has completed.
    */
  def apply(descriptorId: String, value: ArrayBuffer, callback: js.Function0[Unit]): Unit = js.native
}

