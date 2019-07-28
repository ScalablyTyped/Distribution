package typings.chromeDashApps.chromeNs.signedInDevicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.signedInDevices")
@js.native
object ^ extends js.Object {
  /**
    * Fired when the DeviceInfo object of any of the signed in devices
    * changes, or when a device is added or removed.
    * Provides *devices*:
    * The array of all signed in devices.
    */
  val onDeviceInfoChange: typings.chromeDashApps.chromeNs.eventsNs.Event[js.Function1[/* devices */ js.Array[DeviceInfo], Unit]] = js.native
  /**
    * Gets the array of signed in devices, signed into the same account as the current profile.
    * @param callback The callback to be invoked with the array of DeviceInfo objects.
    */
  def get(callback: js.Function1[/* devices */ js.Array[DeviceInfo], Unit]): Unit = js.native
  /**
    * Gets the array of signed in devices, signed into the same account as the current profile.
    * @param isLocal If true only return the information for the local device.
    * If false or omitted return the list of all devices including the local device.
    * @param callback The callback to be invoked with the array of DeviceInfo objects.
    */
  def get(isLocal: Boolean, callback: js.Function1[/* devices */ js.Array[DeviceInfo], Unit]): Unit = js.native
}

