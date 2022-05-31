package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceSourceManager
  extends StObject
     with IDisposable {
  
  /**
    * Function to add device name to device list
    * @param deviceType Enum specifying device type
    * @param deviceSlot "Slot" or index that device is referenced in
    */
  /* private */ var _addDevice: js.Any = js.native
  
  /* private */ val _deviceInputSystem: js.Any = js.native
  
  /* private */ val _devices: js.Any = js.native
  
  /* private */ val _firstDevice: js.Any = js.native
  
  /**
    * Function to remove device name to device list
    * @param deviceType Enum specifying device type
    * @param deviceSlot "Slot" or index that device is referenced in
    */
  /* private */ var _removeDevice: js.Any = js.native
  
  /**
    * Updates array storing first connected device of each type
    * @param type Type of Device
    */
  /* private */ var _updateFirstDevices: js.Any = js.native
  
  /**
    * Gets a DeviceSource, given a type and slot
    * @param deviceType Enum specifying device type
    * @param deviceSlot "Slot" or index that device is referenced in
    * @returns DeviceSource object
    */
  def getDeviceSource[T /* <: DeviceType */](deviceType: T): Nullable[DeviceSource[T]] = js.native
  def getDeviceSource[T /* <: DeviceType */](deviceType: T, deviceSlot: Double): Nullable[DeviceSource[T]] = js.native
  
  /**
    * Gets an array of DeviceSource objects for a given device type
    * @param deviceType Enum specifying device type
    * @returns Array of DeviceSource objects
    */
  def getDeviceSources[T /* <: DeviceType */](deviceType: T): js.Array[DeviceSource[T]] = js.native
  
  /**
    * Returns a read-only list of all available devices
    * @returns Read-only array with active devices
    */
  def getDevices(): js.Array[DeviceSource[DeviceType]] = js.native
  
  /**
    * Observable to be triggered when after a device is connected, any new observers added will be triggered against already connected devices
    */
  val onDeviceConnectedObservable: Observable[DeviceSource[DeviceType]] = js.native
  
  /**
    * Observable to be triggered when after a device is disconnected
    */
  val onDeviceDisconnectedObservable: Observable[DeviceSource[DeviceType]] = js.native
}
