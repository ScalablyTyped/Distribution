package typings.chromeApps.chrome.bluetoothLowEnergy

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.bluetoothLowEnergy.writeCharacteristicValue")
@js.native
object writeCharacteristicValue extends js.Object {
  /**
    * Write the value of a specified characteristic from a remote peripheral.
    * @param characteristicId The instance ID of the GATT characteristic whose value should be written to.
    * @param value The value that should be sent to the remote characteristic as part of the write request.
    * @param callback Called when the write request has completed.
    */
  def apply(characteristicId: String, value: ArrayBuffer, callback: js.Function0[Unit]): Unit = js.native
}

