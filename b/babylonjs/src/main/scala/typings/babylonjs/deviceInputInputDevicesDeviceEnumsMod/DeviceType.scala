package typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DeviceType extends StObject
@JSImport("babylonjs/DeviceInput/InputDevices/deviceEnums", "DeviceType")
@js.native
object DeviceType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeviceType & Double] = js.native
  
  /** PS5 DualSense */
  @js.native
  sealed trait DualSense
    extends StObject
       with DeviceType
  /* 7 */ val DualSense: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DeviceType.DualSense & Double = js.native
  
  /** PS4 Dual Shock */
  @js.native
  sealed trait DualShock
    extends StObject
       with DeviceType
  /* 4 */ val DualShock: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DeviceType.DualShock & Double = js.native
  
  /** Generic */
  @js.native
  sealed trait Generic
    extends StObject
       with DeviceType
  /* 0 */ val Generic: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DeviceType.Generic & Double = js.native
  
  /** Keyboard */
  @js.native
  sealed trait Keyboard
    extends StObject
       with DeviceType
  /* 1 */ val Keyboard: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DeviceType.Keyboard & Double = js.native
  
  /** Mouse */
  @js.native
  sealed trait Mouse
    extends StObject
       with DeviceType
  /* 2 */ val Mouse: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DeviceType.Mouse & Double = js.native
  
  /** Switch Controller */
  @js.native
  sealed trait Switch
    extends StObject
       with DeviceType
  /* 6 */ val Switch: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DeviceType.Switch & Double = js.native
  
  /** Touch Pointers */
  @js.native
  sealed trait Touch
    extends StObject
       with DeviceType
  /* 3 */ val Touch: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DeviceType.Touch & Double = js.native
  
  /** Xbox */
  @js.native
  sealed trait Xbox
    extends StObject
       with DeviceType
  /* 5 */ val Xbox: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DeviceType.Xbox & Double = js.native
}
