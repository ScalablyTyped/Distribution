package typings.babylonjs.virtualJoystickMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait JoystickAxis extends js.Object
@JSImport("babylonjs/Misc/virtualJoystick", "JoystickAxis")
@js.native
object JoystickAxis extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[JoystickAxis with Double] = js.native
  
  /** X axis */
  @js.native
  sealed trait X extends JoystickAxis
  /* 0 */ @js.native
  object X extends TopLevel[X with Double]
  
  /** Y axis */
  @js.native
  sealed trait Y extends JoystickAxis
  /* 1 */ @js.native
  object Y extends TopLevel[Y with Double]
  
  /** Z axis */
  @js.native
  sealed trait Z extends JoystickAxis
  /* 2 */ @js.native
  object Z extends TopLevel[Z with Double]
}
