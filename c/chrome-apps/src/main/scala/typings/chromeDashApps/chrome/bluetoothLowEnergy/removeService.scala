package typings.chromeDashApps.chrome.bluetoothLowEnergy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.bluetoothLowEnergy.removeService")
@js.native
object removeService extends js.Object {
  /**
    * Remove the specified service, unregistering it if it was registered.
    * If the service ID is invalid, the lastError will be set.
    * This function is only available if the app has both
    *   the bluetooth:low_energy and the bluetooth:peripheral permissions set to true.
    * The peripheral permission may not be available to all apps.
    * @since Chrome 52.
    * @param serviceId Unique ID of a current registered service.
    * @param [callback] Callback called once the service is removed.
    */
  def apply(serviceId: String): Unit = js.native
  def apply(serviceId: String, callback: js.Function0[Unit]): Unit = js.native
}

