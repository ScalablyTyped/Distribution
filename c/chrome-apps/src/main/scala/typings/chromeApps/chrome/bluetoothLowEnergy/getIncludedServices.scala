package typings.chromeApps.chrome.bluetoothLowEnergy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.bluetoothLowEnergy.getIncludedServices")
@js.native
object getIncludedServices extends js.Object {
  /**
    * Get a list of GATT services that are included by the given service.
    * @param serviceId The instance ID of the GATT service whose included services should be returned.
    * @param callback Called with the list of GATT services included from the given service.
    */
  def apply(serviceId: String, callback: js.Function1[/* result */ js.Array[Service], Unit]): Unit = js.native
}

