package typings.chromeDashApps.chrome.bluetoothLowEnergy

import typings.chromeDashApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.bluetoothLowEnergy.unregisterAdvertisement")
@js.native
object unregisterAdvertisement extends js.Object {
  /**
    * Unregisters an advertisement and stops its advertising.
    * If the advertisement fails to unregister the only way
    *  to stop advertising might be to restart the device.
    * @since Chrome 47.
    * @param advertisementId Id of the advertisement to unregister.
    * @param callback Called once the advertisement is unregistered and is no longer being advertised.
    */
  def apply(advertisementId: integer, callback: js.Function0[Unit]): Unit = js.native
}

