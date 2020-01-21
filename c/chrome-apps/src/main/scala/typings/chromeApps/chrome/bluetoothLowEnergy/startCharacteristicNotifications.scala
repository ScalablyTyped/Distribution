package typings.chromeApps.chrome.bluetoothLowEnergy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.bluetoothLowEnergy.startCharacteristicNotifications")
@js.native
object startCharacteristicNotifications extends js.Object {
  /**
    * Enable value notifications/indications from the specified characteristic. Once enabled, an application can listen to notifications using the onCharacteristicValueChanged event.
    * @see onCharacteristicValueChanged
    * @param characteristicId The instance ID of the GATT characteristic that notifications should be enabled on.
    * @param callback Called when the request has completed.
    */
  def apply(characteristicId: String, callback: js.Function0[Unit]): Unit = js.native
  /**
    * Enable value notifications/indications from the specified characteristic. Once enabled, an application can listen to notifications using the onCharacteristicValueChanged event.
    * @see onCharacteristicValueChanged
    * @param characteristicId The instance ID of the GATT characteristic that notifications should be enabled on.
    * @param properties Notification session properties (optional).
    * @param callback Called when the request has completed.
    */
  def apply(characteristicId: String, properties: IProperties, callback: js.Function0[Unit]): Unit = js.native
}

