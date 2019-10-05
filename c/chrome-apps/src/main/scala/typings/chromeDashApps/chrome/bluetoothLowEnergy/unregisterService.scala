package typings.chromeDashApps.chrome.bluetoothLowEnergy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.bluetoothLowEnergy.unregisterService")
@js.native
object unregisterService extends js.Object {
  /**
    * Unregister the given service with the local GATT server.
    * If the service ID is invalid, the lastError will be set.
    * This function is only available if the app has both
    *   the bluetooth:low_energy and the bluetooth:peripheral permissions set to true.
    * The peripheral permission may not be available to all apps.
    * @since Chrome 52.
    * @param serviceId Unique ID of a current registered service.
    * @param callback Callback with the result of the register operation.
    */
  def apply(serviceId: String, callback: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
}

