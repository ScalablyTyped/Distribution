package typings.chromeDashApps.chrome.signedInDevices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.signedInDevices.get")
@js.native
object get extends js.Object {
  /**
    * Gets the array of signed in devices, signed into the same account as the current profile.
    * @param callback The callback to be invoked with the array of DeviceInfo objects.
    */
  def apply(callback: js.Function1[/* devices */ js.Array[DeviceInfo], Unit]): Unit = js.native
  /**
    * Gets the array of signed in devices, signed into the same account as the current profile.
    * @param isLocal If true only return the information for the local device.
    * If false or omitted return the list of all devices including the local device.
    * @param callback The callback to be invoked with the array of DeviceInfo objects.
    */
  def apply(isLocal: Boolean, callback: js.Function1[/* devices */ js.Array[DeviceInfo], Unit]): Unit = js.native
}

