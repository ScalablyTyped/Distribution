package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.DeviceSourceType
import typings.babylonjs.BABYLON.IUIEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.DeviceSourceManager")
@js.native
open class DeviceSourceManager protected ()
  extends StObject
     with typings.babylonjs.BABYLON.DeviceSourceManager {
  /**
    * Default constructor
    * @param engine - Used to get canvas (if applicable)
    */
  def this(engine: typings.babylonjs.BABYLON.Engine) = this()
  
  /* CompleteClass */
  override def _addDevice(deviceSource: typings.babylonjs.BABYLON.DeviceSource[typings.babylonjs.BABYLON.DeviceType]): Unit = js.native
  
  /* CompleteClass */
  override def _onInputChanged(deviceType: typings.babylonjs.BABYLON.DeviceType, deviceSlot: Double, eventData: IUIEvent): Unit = js.native
  
  /* CompleteClass */
  override def _removeDevice(deviceType: typings.babylonjs.BABYLON.DeviceType, deviceSlot: Double): Unit = js.native
  
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
  
  /* CompleteClass */
  var onDeviceConnectedObservable: typings.babylonjs.BABYLON.Observable[DeviceSourceType] = js.native
  
  /* CompleteClass */
  var onDeviceDisconnectedObservable: typings.babylonjs.BABYLON.Observable[DeviceSourceType] = js.native
}
