package typings.chromeDashApps.chrome.bluetoothLowEnergy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.bluetoothLowEnergy.getService")
@js.native
object getService extends js.Object {
  /**
    * Get the GATT service with the given instance ID.
    * @param serviceId The instance ID of the requested GATT service.
    * @param callback Called with the requested Service object.
    */
  def apply(serviceId: String, callback: js.Function1[/* result */ Service, Unit]): Unit = js.native
}

