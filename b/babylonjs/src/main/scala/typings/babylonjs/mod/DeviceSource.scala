package typings.babylonjs.mod

import typings.babylonjs.inputInterfacesMod.IDeviceInputSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "DeviceSource")
@js.native
open class DeviceSource[T /* <: typings.babylonjs.deviceEnumsMod.DeviceType */] protected ()
  extends typings.babylonjs.legacyMod.DeviceSource[T] {
  /**
    * Default Constructor
    * @param deviceInputSystem - Reference to DeviceInputSystem
    * @param deviceType - Type of device
    * @param deviceSlot - "Slot" or index that device is referenced in
    */
  def this(deviceInputSystem: IDeviceInputSystem, /** Type of device */
  deviceType: T) = this()
  def this(
    deviceInputSystem: IDeviceInputSystem,
    /** Type of device */
  deviceType: T,
    /** "Slot" or index that device is referenced in */
  deviceSlot: Double
  ) = this()
}
