package typings.babylonjs.legacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "DeviceSource")
@js.native
class DeviceSource[T /* <: typings.babylonjs.deviceEnumsMod.DeviceType */] protected ()
  extends typings.babylonjs.indexMod.DeviceSource[T] {
  /**
    * Default Constructor
    * @param deviceInputSystem Reference to DeviceInputSystem
    * @param deviceType Type of device
    * @param deviceSlot "Slot" or index that device is referenced in
    */
  def this(
    deviceInputSystem: typings.babylonjs.deviceInputSystemMod.DeviceInputSystem,
    /** Type of device */
  deviceType: typings.babylonjs.deviceEnumsMod.DeviceType
  ) = this()
  def this(
    deviceInputSystem: typings.babylonjs.deviceInputSystemMod.DeviceInputSystem,
    /** Type of device */
  deviceType: typings.babylonjs.deviceEnumsMod.DeviceType,
    /** "Slot" or index that device is referenced in */
  deviceSlot: Double
  ) = this()
}
