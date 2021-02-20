package typings.chromeApps.global.chrome

import typings.chromeApps.chrome.bluetooth.AdapterState
import typings.chromeApps.chrome.bluetooth.BluetoothEvent
import typings.chromeApps.chrome.bluetooth.Device
import typings.chromeApps.chrome.bluetooth.DeviceFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region chrome.bluetooth*
///////////////
// Bluetooth //
///////////////
/**
  * @since Chrome 37
  * @requires Manifest: 'bluetooth': {...}
  * @description
  * Use the chrome.bluetooth API to connect to a Bluetooth device.
  * All functions report failures via chrome.runtime.lastError.
  * **Important: This API works only on OS X, Windows and Chrome OS.**
  */
object bluetooth {
  
  /** Get information about the Bluetooth adapter. */
  @JSGlobal("chrome.bluetooth.getAdapterState")
  @js.native
  def getAdapterState(callback: js.Function1[/* adapterInfo */ AdapterState, Unit]): Unit = js.native
  
  /** Get information about a Bluetooth device known to the system. */
  @JSGlobal("chrome.bluetooth.getDevice")
  @js.native
  def getDevice(deviceAddress: String, callback: js.Function1[/* deviceInfo */ Device, Unit]): Unit = js.native
  
  /**
    * Get a list of Bluetooth devices known to the system, including paired and recently discovered devices.
    * @param callback Called when the search is completed.
    */
  @JSGlobal("chrome.bluetooth.getDevices")
  @js.native
  def getDevices(callback: js.Function1[/* devices */ js.Array[Device], Unit]): Unit = js.native
  /**
    * @since Chrome 67.
    * @description Get a list of Bluetooth devices known to the system, including paired and recently discovered devices.
    * @param filter Some criteria to filter the list of returned bluetooth devices. If the filter is not set or set to {}, returned device list will contain all bluetooth devices. Right now this is only supported in ChromeOS, for other platforms, a full list is returned.
    * @param callback Called when the search is completed.
    */
  @JSGlobal("chrome.bluetooth.getDevices")
  @js.native
  def getDevices(filter: DeviceFilter, callback: js.Function1[/* devices */ js.Array[Device], Unit]): Unit = js.native
  
  /** Fired when the state of the Bluetooth adapter changes. */
  @JSGlobal("chrome.bluetooth.onAdapterStateChanged")
  @js.native
  val onAdapterStateChanged: BluetoothEvent[AdapterState] = js.native
  
  /** Fired when information about a new Bluetooth device is available. */
  @JSGlobal("chrome.bluetooth.onDeviceAdded")
  @js.native
  val onDeviceAdded: BluetoothEvent[Device] = js.native
  
  /** Fired when information about a known Bluetooth device has changed. */
  @JSGlobal("chrome.bluetooth.onDeviceChanged")
  @js.native
  val onDeviceChanged: BluetoothEvent[Device] = js.native
  
  /** Fired when a Bluetooth device that was previously discovered has been out of range for long enough to be considered unavailable again, and when a paired device is removed. */
  @JSGlobal("chrome.bluetooth.onDeviceRemoved")
  @js.native
  val onDeviceRemoved: BluetoothEvent[Device] = js.native
  
  /**
    * Start discovery. Newly discovered devices will be returned via the onDeviceAdded event. Previously discovered devices already known to the adapter must be obtained using getDevices and will only be updated using the |onDeviceChanged| event if information about them changes.
    * Discovery will fail to start if this application has already called startDiscovery. Discovery can be resource intensive: stopDiscovery should be called as soon as possible.
    */
  @JSGlobal("chrome.bluetooth.startDiscovery")
  @js.native
  def startDiscovery(callback: js.Function0[Unit]): Unit = js.native
  
  /** Stop discovery. */
  @JSGlobal("chrome.bluetooth.stopDiscovery")
  @js.native
  def stopDiscovery(callback: js.Function0[Unit]): Unit = js.native
}
