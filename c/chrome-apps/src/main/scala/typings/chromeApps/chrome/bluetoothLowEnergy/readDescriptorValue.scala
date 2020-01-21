package typings.chromeApps.chrome.bluetoothLowEnergy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.bluetoothLowEnergy.readDescriptorValue")
@js.native
object readDescriptorValue extends js.Object {
  /**
    * Retrieve the value of a specified characteristic descriptor from a remote peripheral.
    * @param descriptorId The instance ID of the GATT characteristic descriptor whose value should be read from the remote device.
    * @param callback Called with the Descriptor object whose value was requested. The value field of the returned Descriptor object contains the result of the read request.
    */
  def apply(descriptorId: String, callback: js.Function1[/* result */ Descriptor, Unit]): Unit = js.native
}

