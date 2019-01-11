package typings
package chromeDashAppsLib.chromeNs.bluetoothNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.bluetooth")
@js.native
object ^ extends js.Object {
  /** Fired when the state of the Bluetooth adapter changes. */
  val onAdapterStateChanged: chromeDashAppsLib.chromeNs.bluetoothNs.BluetoothEvent[chromeDashAppsLib.chromeNs.bluetoothNs.AdapterState] = js.native
  /** Fired when information about a new Bluetooth device is available. */
  val onDeviceAdded: chromeDashAppsLib.chromeNs.bluetoothNs.BluetoothEvent[chromeDashAppsLib.chromeNs.bluetoothNs.Device] = js.native
  /** Fired when information about a known Bluetooth device has changed. */
  val onDeviceChanged: chromeDashAppsLib.chromeNs.bluetoothNs.BluetoothEvent[chromeDashAppsLib.chromeNs.bluetoothNs.Device] = js.native
  /** Fired when a Bluetooth device that was previously discovered has been out of range for long enough to be considered unavailable again, and when a paired device is removed. */
  val onDeviceRemoved: chromeDashAppsLib.chromeNs.bluetoothNs.BluetoothEvent[chromeDashAppsLib.chromeNs.bluetoothNs.Device] = js.native
  /** Get information about the Bluetooth adapter. */
  def getAdapterState(
    callback: js.Function1[/* adapterInfo */ chromeDashAppsLib.chromeNs.bluetoothNs.AdapterState, scala.Unit]
  ): scala.Unit = js.native
  /** Get information about a Bluetooth device known to the system. */
  def getDevice(
    deviceAddress: java.lang.String,
    callback: js.Function1[/* deviceInfo */ chromeDashAppsLib.chromeNs.bluetoothNs.Device, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Get a list of Bluetooth devices known to the system, including paired and recently discovered devices.
    * @param callback Called when the search is completed.
    */
  def getDevices(
    callback: js.Function1[/* devices */ js.Array[chromeDashAppsLib.chromeNs.bluetoothNs.Device], scala.Unit]
  ): scala.Unit = js.native
  /**
    * @since Chrome 67.
    * @description Get a list of Bluetooth devices known to the system, including paired and recently discovered devices.
    * @param filter Some criteria to filter the list of returned bluetooth devices. If the filter is not set or set to {}, returned device list will contain all bluetooth devices. Right now this is only supported in ChromeOS, for other platforms, a full list is returned.
    * @param callback Called when the search is completed.
    */
  def getDevices(
    filter: chromeDashAppsLib.chromeNs.bluetoothNs.DeviceFilter,
    callback: js.Function1[/* devices */ js.Array[chromeDashAppsLib.chromeNs.bluetoothNs.Device], scala.Unit]
  ): scala.Unit = js.native
  /**
    * Start discovery. Newly discovered devices will be returned via the onDeviceAdded event. Previously discovered devices already known to the adapter must be obtained using getDevices and will only be updated using the |onDeviceChanged| event if information about them changes.
    * Discovery will fail to start if this application has already called startDiscovery. Discovery can be resource intensive: stopDiscovery should be called as soon as possible.
    */
  def startDiscovery(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /** Stop discovery. */
  def stopDiscovery(callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

