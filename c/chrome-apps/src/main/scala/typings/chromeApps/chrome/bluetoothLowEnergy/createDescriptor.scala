package typings.chromeApps.chrome.bluetoothLowEnergy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.bluetoothLowEnergy.createDescriptor")
@js.native
object createDescriptor extends js.Object {
  /**
    * Create a locally hosted GATT descriptor. This descriptor must be hosted under a valid characteristic. If the characteristic ID is not valid, the lastError will be set. This function is only available if the app has both the bluetooth:low_energy and the bluetooth:peripheral permissions set to true. The peripheral permission may not be available to all apps.
    * @since Chrome 52.
    * @param descriptor The descriptor to create.
    * @param characteristicId ID of the characteristic to create this descriptor for.
    * @param callback Called with the created desciptor's unique ID.
    */
  def apply(
    descriptor: Descriptor,
    characteristicId: String,
    callback: js.Function1[/* descriptorId */ String, Unit]
  ): Unit = js.native
}

