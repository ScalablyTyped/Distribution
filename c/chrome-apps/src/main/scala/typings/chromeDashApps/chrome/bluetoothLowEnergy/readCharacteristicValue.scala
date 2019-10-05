package typings.chromeDashApps.chrome.bluetoothLowEnergy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.bluetoothLowEnergy.readCharacteristicValue")
@js.native
object readCharacteristicValue extends js.Object {
  /**
    * Retrieve the value of a specified characteristic from a remote peripheral.
    * @param characteristicId The instance ID of the GATT characteristic whose value should be read from the remote device.
    * @param callback Called with the Characteristic object whose value was requested. The value field of the returned Characteristic object contains the result of the read request.
    */
  def apply(characteristicId: String, callback: js.Function1[/* result */ Characteristic, Unit]): Unit = js.native
}

