package typings.chromeDashApps.chrome.bluetoothLowEnergy

import typings.chromeDashApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.bluetoothLowEnergy.registerAdvertisement")
@js.native
object registerAdvertisement extends js.Object {
  /**
    * Create an advertisement and register it for advertising.
    * To call this function, the app must have
    *  the bluetooth:low_energy and bluetooth:peripheral permissions set to true.
    * Additionally this API is only available to auto launched apps in Kiosk Mode
    *  of by setting the 'enable-ble-advertising-in-apps' flag.
    *  See https://developer.chrome.com/apps/manifest/bluetooth
    * Note: On some hardware, central and peripheral modes at the same time
    *  is supported but on hardware that doesn't support this,
    *  making this call will switch the device to peripheral mode.
    * In the case of hardware which does not support both central and peripheral mode,
    *  attempting to use the device in both modes will lead to undefined behavior
    *  or prevent other central-role applications from behaving correctly
    *  (including the discovery of Bluetooth Low Energy devices).
    * @since Chrome 47.
    * @param advertisement The advertisement to advertise.
    * @param callback Called once the registeration is done and we've started advertising. Returns the id of the created advertisement.
    */
  def apply(advertisement: Advertisement, callback: js.Function1[/* advertisementId */ integer, Unit]): Unit = js.native
}

