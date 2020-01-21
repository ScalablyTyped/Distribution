package typings.chromeApps.chrome.bluetoothLowEnergy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.bluetoothLowEnergy.createCharacteristic")
@js.native
object createCharacteristic extends js.Object {
  /**
    * Create a locally hosted GATT characteristic. This characteristic must be hosted under a valid service. If the service ID is not valid, the lastError will be set. This function is only available if the app has both the bluetooth:low_energy and the bluetooth:peripheral permissions set to true. The peripheral permission may not be available to all apps.
    * @since Chrome 52.
    * @param characteristic The characteristic to create.
    * @param serviceId ID of the service to create this characteristic for.
    * @param callback Called with the created characteristic's unique ID.
    */
  def apply(
    characteristic: Characteristic,
    serviceId: String,
    callback: js.Function1[/* characteristicId */ String, Unit]
  ): Unit = js.native
}

