package typings.chromeDashApps.chrome.bluetoothLowEnergy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.bluetoothLowEnergy.getDescriptor")
@js.native
object getDescriptor extends js.Object {
  /**
    * Get the GATT characteristic descriptor with the given instance ID.
    * @param descriptorId The instance ID of the requested GATT characteristic descriptor.
    * @param callback Called with the requested Descriptor object.
    */
  def apply(descriptorId: String, callback: js.Function1[/* result */ Descriptor, Unit]): Unit = js.native
}

