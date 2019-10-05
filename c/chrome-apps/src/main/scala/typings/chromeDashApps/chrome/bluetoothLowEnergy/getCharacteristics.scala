package typings.chromeDashApps.chrome.bluetoothLowEnergy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.bluetoothLowEnergy.getCharacteristics")
@js.native
object getCharacteristics extends js.Object {
  /**
    * Get a list of all discovered GATT characteristics that belong to the given service.
    * @param serviceId The instance ID of the GATT service whose characteristics should be returned.
    * @param callback Called with the list of characteristics that belong to the given service.
    */
  def apply(serviceId: String, callback: js.Function1[/* result */ js.Array[Characteristic], Unit]): Unit = js.native
}

