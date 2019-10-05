package typings.chromeDashApps.chrome.bluetoothLowEnergy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.bluetoothLowEnergy.stopCharacteristicNotifications")
@js.native
object stopCharacteristicNotifications extends js.Object {
  /**
    * Disable value notifications/indications from the specified characteristic. After a successful call, the application will stop receiving notifications/indications from this characteristic.
    * @param characteristicId The instance ID of the GATT characteristic on which this app's notification session should be stopped.
    * @param [callback] Called when the request has completed (optional).
    */
  def apply(characteristicId: String): Unit = js.native
  def apply(characteristicId: String, callback: js.Function0[Unit]): Unit = js.native
}

