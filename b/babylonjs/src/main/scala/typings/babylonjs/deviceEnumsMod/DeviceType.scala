package typings.babylonjs.deviceEnumsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DeviceType extends StObject
@JSImport("babylonjs/DeviceInput/InputDevices/deviceEnums", "DeviceType")
@js.native
object DeviceType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeviceType with Double] = js.native
  
  /** PS4 Dual Shock */
  @js.native
  sealed trait DualShock extends DeviceType
  /* 4 */ val DualShock: typings.babylonjs.deviceEnumsMod.DeviceType.DualShock with Double = js.native
  
  /** Generic */
  @js.native
  sealed trait Generic extends DeviceType
  /* 0 */ val Generic: typings.babylonjs.deviceEnumsMod.DeviceType.Generic with Double = js.native
  
  /** Keyboard */
  @js.native
  sealed trait Keyboard extends DeviceType
  /* 1 */ val Keyboard: typings.babylonjs.deviceEnumsMod.DeviceType.Keyboard with Double = js.native
  
  /** Mouse */
  @js.native
  sealed trait Mouse extends DeviceType
  /* 2 */ val Mouse: typings.babylonjs.deviceEnumsMod.DeviceType.Mouse with Double = js.native
  
  /** Switch Controller */
  @js.native
  sealed trait Switch extends DeviceType
  /* 6 */ val Switch: typings.babylonjs.deviceEnumsMod.DeviceType.Switch with Double = js.native
  
  /** Touch Pointers */
  @js.native
  sealed trait Touch extends DeviceType
  /* 3 */ val Touch: typings.babylonjs.deviceEnumsMod.DeviceType.Touch with Double = js.native
  
  /** Xbox */
  @js.native
  sealed trait Xbox extends DeviceType
  /* 5 */ val Xbox: typings.babylonjs.deviceEnumsMod.DeviceType.Xbox with Double = js.native
}
