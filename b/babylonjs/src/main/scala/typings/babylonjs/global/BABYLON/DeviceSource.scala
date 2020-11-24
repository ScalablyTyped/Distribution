package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.DeviceSource")
@js.native
class DeviceSource[T /* <: typings.babylonjs.BABYLON.DeviceType */] protected ()
  extends typings.babylonjs.BABYLON.DeviceSource[T] {
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
}
