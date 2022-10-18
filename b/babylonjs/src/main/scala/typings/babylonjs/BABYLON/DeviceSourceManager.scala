package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceSourceManager
  extends StObject
     with IDisposable
     with IObservableManager {
  
  /**
    * @param deviceSource - Source to add
    * @internal
    */
  def _addDevice(deviceSource: DeviceSourceType): Unit = js.native
  
  /* private */ val _devices: Any = js.native
  
  /* private */ var _engine: Any = js.native
  
  /* private */ val _firstDevice: Any = js.native
  
  /* private */ var _onDisposeObserver: Any = js.native
  
  /**
    * @param deviceType - DeviceType
    * @param deviceSlot - DeviceSlot
    * @param eventData - Event
    * @internal
    */
  def _onInputChanged[T /* <: DeviceType */](deviceType: T, deviceSlot: Double, eventData: IUIEvent): Unit = js.native
  
  /* private */ var _updateFirstDevices: Any = js.native
  
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
}
