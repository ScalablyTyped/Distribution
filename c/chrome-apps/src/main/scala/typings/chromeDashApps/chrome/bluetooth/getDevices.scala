package typings.chromeDashApps.chrome.bluetooth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.bluetooth.getDevices")
@js.native
object getDevices extends js.Object {
  /**
    * Get a list of Bluetooth devices known to the system, including paired and recently discovered devices.
    * @param callback Called when the search is completed.
    */
  def apply(callback: js.Function1[/* devices */ js.Array[Device], Unit]): Unit = js.native
  /**
    * @since Chrome 67.
    * @description Get a list of Bluetooth devices known to the system, including paired and recently discovered devices.
    * @param filter Some criteria to filter the list of returned bluetooth devices. If the filter is not set or set to {}, returned device list will contain all bluetooth devices. Right now this is only supported in ChromeOS, for other platforms, a full list is returned.
    * @param callback Called when the search is completed.
    */
  def apply(filter: DeviceFilter, callback: js.Function1[/* devices */ js.Array[Device], Unit]): Unit = js.native
}

