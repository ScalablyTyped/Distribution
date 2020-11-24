package typings.babylonjs.deviceEnumsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DeviceType extends js.Object
@JSImport("babylonjs/DeviceInput/InputDevices/deviceEnums", "DeviceType")
@js.native
object DeviceType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeviceType with Double] = js.native
  
  /** PS4 Dual Shock */
  @js.native
  sealed trait DualShock extends DeviceType
  /* 4 */ @js.native
  object DualShock extends TopLevel[DualShock with Double]
  
  /** Generic */
  @js.native
  sealed trait Generic extends DeviceType
  /* 0 */ @js.native
  object Generic extends TopLevel[Generic with Double]
  
  /** Keyboard */
  @js.native
  sealed trait Keyboard extends DeviceType
  /* 1 */ @js.native
  object Keyboard extends TopLevel[Keyboard with Double]
  
  /** Mouse */
  @js.native
  sealed trait Mouse extends DeviceType
  /* 2 */ @js.native
  object Mouse extends TopLevel[Mouse with Double]
  
  /** Switch Controller */
  @js.native
  sealed trait Switch extends DeviceType
  /* 6 */ @js.native
  object Switch extends TopLevel[Switch with Double]
  
  /** Touch Pointers */
  @js.native
  sealed trait Touch extends DeviceType
  /* 3 */ @js.native
  object Touch extends TopLevel[Touch with Double]
  
  /** Xbox */
  @js.native
  sealed trait Xbox extends DeviceType
  /* 5 */ @js.native
  object Xbox extends TopLevel[Xbox with Double]
}
