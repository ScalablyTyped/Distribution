package typings.chromeDashApps.chrome.bluetoothLowEnergy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.bluetoothLowEnergy.createService")
@js.native
object createService extends js.Object {
  /**
    * Create a locally hosted GATT service. This service can be registered to be available on a local GATT server. This function is only available if the app has both the bluetooth:low_energy and the bluetooth:peripheral permissions set to true. The peripheral permission may not be available to all apps.
    * @since Chrome 52.
    * @param service The service to create.
    * @param callback Called with the created services's unique ID.
    */
  def apply(service: Service, callback: js.Function0[Unit]): Unit = js.native
}

