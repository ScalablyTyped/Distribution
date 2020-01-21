package typings.chromeApps.chrome.bluetoothLowEnergy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.bluetoothLowEnergy.notifyCharacteristicValueChanged")
@js.native
object notifyCharacteristicValueChanged extends js.Object {
  /**
    * Notify a remote device of a new value for a characteristic.
    * If the shouldIndicate flag in the notification object is true, an indication will be sent instead of a notification.
    * Note, the characteristic needs to correctly set the 'notify' or 'indicate' property during creation for this call to succeed.
    * This function is only available if the app has both the bluetooth:low_energy and the bluetooth:peripheral permissions set to true.
    * The peripheral permission may not be available to all apps.
    * @since Chrome 52.
    * @param characteristicId The characteristic to send the notication for.
    * @param notification Notification object
    * @param callback Callback called once the notification or indication has been sent successfully.
    */
  def apply(characteristicId: String, notification: INotification, callback: js.Function0[Unit]): Unit = js.native
}

