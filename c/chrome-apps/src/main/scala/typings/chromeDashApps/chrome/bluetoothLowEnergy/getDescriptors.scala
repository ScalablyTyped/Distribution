package typings.chromeDashApps.chrome.bluetoothLowEnergy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.bluetoothLowEnergy.getDescriptors")
@js.native
object getDescriptors extends js.Object {
  /**
    * Get a list of GATT characteristic descriptors that belong to the given characteristic.
    * @param characteristicId The instance ID of the GATT characteristic whose descriptors should be returned.
    * @param callback Called with the list of descriptors that belong to the given characteristic.
    */
  def apply(characteristicId: String, callback: js.Function1[/* result */ js.Array[Descriptor], Unit]): Unit = js.native
}

