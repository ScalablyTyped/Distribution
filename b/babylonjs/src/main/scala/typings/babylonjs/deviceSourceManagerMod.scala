package typings.babylonjs

import typings.babylonjs.anon.CurrentState
import typings.babylonjs.deviceEnumsMod.DeviceType
import typings.babylonjs.deviceInputSystemMod.DeviceInputSystem
import typings.babylonjs.deviceTypesMod.DeviceInput
import typings.babylonjs.engineMod.Engine
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.sceneMod.IDisposable
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deviceSourceManagerMod {
  
  @JSImport("babylonjs/DeviceInput/InputDevices/deviceSourceManager", "DeviceSource")
  @js.native
  class DeviceSource[T /* <: DeviceType */] protected () extends StObject {
    /**
      * Default Constructor
      * @param deviceInputSystem Reference to DeviceInputSystem
      * @param deviceType Type of device
      * @param deviceSlot "Slot" or index that device is referenced in
      */
    def this(deviceInputSystem: DeviceInputSystem, /** Type of device */
    deviceType: DeviceType) = this()
    def this(
      deviceInputSystem: DeviceInputSystem,
      /** Type of device */
    deviceType: DeviceType,
      /** "Slot" or index that device is referenced in */
    deviceSlot: Double
    ) = this()
    
    val _deviceInputSystem: js.Any = js.native
    
    /** "Slot" or index that device is referenced in */
    val deviceSlot: Double = js.native
    
    /** Type of device */
    val deviceType: DeviceType = js.native
    
    /**
      * Get input for specific input
      * @param inputIndex index of specific input on device
      * @returns Input value from DeviceInputSystem
      */
    def getInput(inputIndex: DeviceInput[T]): Double = js.native
    
    /**
      * Observable to handle device input changes per device
      */
    val onInputChangedObservable: Observable[CurrentState[T]] = js.native
  }
  
  @JSImport("babylonjs/DeviceInput/InputDevices/deviceSourceManager", "DeviceSourceManager")
  @js.native
  class DeviceSourceManager protected () extends IDisposable {
    /**
      * Default Constructor
      * @param engine engine to pull input element from
      */
    def this(engine: Engine) = this()
    
    /**
      * Function to add device name to device list
      * @param deviceType Enum specifying device type
      * @param deviceSlot "Slot" or index that device is referenced in
      */
    var _addDevice: js.Any = js.native
    
    val _deviceInputSystem: js.Any = js.native
    
    val _devices: js.Any = js.native
    
    val _firstDevice: js.Any = js.native
    
    /**
      * Function to remove device name to device list
      * @param deviceType Enum specifying device type
      * @param deviceSlot "Slot" or index that device is referenced in
      */
    var _removeDevice: js.Any = js.native
    
    /**
      * Updates array storing first connected device of each type
      * @param type Type of Device
      */
    var _updateFirstDevices: js.Any = js.native
    
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
}
