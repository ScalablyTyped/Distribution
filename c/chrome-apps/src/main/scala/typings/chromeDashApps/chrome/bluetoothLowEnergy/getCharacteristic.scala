package typings.chromeDashApps.chrome.bluetoothLowEnergy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.bluetoothLowEnergy.getCharacteristic")
@js.native
object getCharacteristic extends js.Object {
  /**
    * Get the GATT characteristic with the given instance ID that belongs to the given GATT service, if the characteristic exists.
    * @param characteristicId The instance ID of the requested GATT characteristic.
    * @param callback Called with the requested Characteristic object.
    */
  def apply(characteristicId: String, callback: js.Function1[/* result */ Characteristic, Unit]): Unit = js.native
}

