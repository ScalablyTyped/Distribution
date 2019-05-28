package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofsignedInDevices extends js.Object {
  /**
    * Fired when the DeviceInfo object of any of the signed in devices
    * changes, or when a device is added or removed.
    * Provides *devices*:
    * The array of all signed in devices.
    */
  val onDeviceInfoChange: chromeDashAppsLib.chromeNs.eventsNs.Event[
    js.Function1[
      /* devices */ js.Array[chromeDashAppsLib.chromeNs.signedInDevicesNs.DeviceInfo], 
      scala.Unit
    ]
  ] = js.native
  /**
    * Gets the array of signed in devices, signed into the same account as the current profile.
    * @param callback The callback to be invoked with the array of DeviceInfo objects.
    */
  def get(
    callback: js.Function1[
      /* devices */ js.Array[chromeDashAppsLib.chromeNs.signedInDevicesNs.DeviceInfo], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Gets the array of signed in devices, signed into the same account as the current profile.
    * @param isLocal If true only return the information for the local device.
    * If false or omitted return the list of all devices including the local device.
    * @param callback The callback to be invoked with the array of DeviceInfo objects.
    */
  def get(
    isLocal: scala.Boolean,
    callback: js.Function1[
      /* devices */ js.Array[chromeDashAppsLib.chromeNs.signedInDevicesNs.DeviceInfo], 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

