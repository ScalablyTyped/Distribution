package typings.babylonjs

import typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DeviceType
import typings.babylonjs.deviceInputInputDevicesDeviceSourceMod.DeviceSource
import typings.babylonjs.deviceInputInternalDeviceSourceManagerMod.DeviceSourceType
import typings.babylonjs.deviceInputInternalDeviceSourceManagerMod.IObservableManager
import typings.babylonjs.enginesEngineMod.Engine
import typings.babylonjs.eventsDeviceInputEventsMod.IUIEvent
import typings.babylonjs.miscObservableMod.Observable
import typings.babylonjs.sceneMod.IDisposable
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deviceInputInputDevicesDeviceSourceManagerMod {
  
  @JSImport("babylonjs/DeviceInput/InputDevices/deviceSourceManager", "DeviceSourceManager")
  @js.native
  open class DeviceSourceManager protected ()
    extends StObject
       with IDisposable
       with IObservableManager {
    /**
      * Default constructor
      * @param engine - Used to get canvas (if applicable)
      */
    def this(engine: Engine) = this()
    
    /* CompleteClass */
    override def _addDevice(deviceSource: DeviceSource[DeviceType]): Unit = js.native
    /**
      * @param deviceSource - Source to add
      * @internal
      */
    def _addDevice(deviceSource: DeviceSourceType): Unit = js.native
    
    /* private */ val _devices: Any = js.native
    
    /* private */ var _engine: Any = js.native
    
    /* private */ val _firstDevice: Any = js.native
    
    /* private */ var _onDisposeObserver: Any = js.native
    
    /* CompleteClass */
    override def _onInputChanged(deviceType: DeviceType, deviceSlot: Double, eventData: IUIEvent): Unit = js.native
    /**
      * @param deviceType - DeviceType
      * @param deviceSlot - DeviceSlot
      * @param eventData - Event
      * @internal
      */
    def _onInputChanged[T /* <: DeviceType */](deviceType: T, deviceSlot: Double, eventData: IUIEvent): Unit = js.native
    
    /* CompleteClass */
    override def _removeDevice(deviceType: DeviceType, deviceSlot: Double): Unit = js.native
    
    /* private */ var _updateFirstDevices: Any = js.native
    
    /**
      * Releases all held resources
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * Gets a DeviceSource, given a type and slot
      * @param deviceType - Type of Device
      * @param deviceSlot - Slot or ID of device
      * @returns DeviceSource
      */
    def getDeviceSource[T /* <: DeviceType */](deviceType: T): Nullable[DeviceSource[T]] = js.native
    def getDeviceSource[T /* <: DeviceType */](deviceType: T, deviceSlot: Double): Nullable[DeviceSource[T]] = js.native
    
    /**
      * Gets an array of DeviceSource objects for a given device type
      * @param deviceType - Type of Device
      * @returns All available DeviceSources of a given type
      */
    def getDeviceSources[T /* <: DeviceType */](deviceType: T): js.Array[DeviceSource[T]] = js.native
    
    /* CompleteClass */
    var onDeviceConnectedObservable: Observable[DeviceSourceType] = js.native
    
    /* CompleteClass */
    var onDeviceDisconnectedObservable: Observable[DeviceSourceType] = js.native
  }
}
