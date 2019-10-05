package typings.chromeDashApps.chrome.bluetoothLowEnergy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.bluetoothLowEnergy.getServices")
@js.native
object getServices extends js.Object {
  /**
    * Get all the GATT services that were discovered on the remote device with the given device address.
    * Note: If service discovery is not yet complete on the device, this API will return a subset (possibly empty) of services. A work around is to add a time based delay and/or call repeatedly until the expected number of services is returned.
    * @param deviceAddress The Bluetooth address of the remote device whose GATT services should be returned.
    * @param callback Called with the list of requested Service objects.
    */
  def apply(deviceAddress: String, callback: js.Function1[/* result */ js.Array[Service], Unit]): Unit = js.native
}

