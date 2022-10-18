package typings.babylonjs.legacyLegacyMod

import typings.babylonjs.deviceInputInputInterfacesMod.IDeviceInputSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "DeviceSource")
@js.native
open class DeviceSource[T /* <: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DeviceType */] protected ()
  extends typings.babylonjs.indexMod.DeviceSource[T] {
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
