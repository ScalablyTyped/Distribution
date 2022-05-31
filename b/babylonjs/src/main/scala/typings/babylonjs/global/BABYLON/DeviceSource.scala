package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.DeviceInput
import typings.babylonjs.anon.InputIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.DeviceSource")
@js.native
class DeviceSource[T /* <: typings.babylonjs.BABYLON.DeviceType */] protected ()
  extends StObject
     with typings.babylonjs.BABYLON.DeviceSource[T] {
  /**
    * Default Constructor
    * @param deviceInputSystem Reference to DeviceInputSystem
    * @param deviceType Type of device
    * @param deviceSlot "Slot" or index that device is referenced in
    */
  def this(
    deviceInputSystem: typings.babylonjs.BABYLON.DeviceInputSystem,
    /** Type of device */
  deviceType: typings.babylonjs.BABYLON.DeviceType
  ) = this()
  def this(
    deviceInputSystem: typings.babylonjs.BABYLON.DeviceInputSystem,
    /** Type of device */
  deviceType: typings.babylonjs.BABYLON.DeviceType,
    /** "Slot" or index that device is referenced in */
  deviceSlot: Double
  ) = this()
  
  /* private */ /* CompleteClass */
  override val _deviceInputSystem: js.Any = js.native
  
  /** "Slot" or index that device is referenced in */
  /* CompleteClass */
  override val deviceSlot: Double = js.native
  
  /** Type of device */
  /* CompleteClass */
  override val deviceType: typings.babylonjs.BABYLON.DeviceType = js.native
  
  /**
    * Get input for specific input
    * @param inputIndex index of specific input on device
    * @returns Input value from DeviceInputSystem
    */
  /* CompleteClass */
  override def getInput(inputIndex: DeviceInput[T]): Double = js.native
  
  /**
    * Observable to handle device input changes per device
    */
  /* CompleteClass */
  override val onInputChangedObservable: typings.babylonjs.BABYLON.Observable[InputIndex[T]] = js.native
}
