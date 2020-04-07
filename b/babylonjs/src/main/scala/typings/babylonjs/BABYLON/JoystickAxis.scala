package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait JoystickAxis extends js.Object

@JSGlobal("BABYLON.JoystickAxis")
@js.native
object JoystickAxis extends js.Object {
  /** X axis */
  @js.native
  sealed trait X extends JoystickAxis
  
  /** Y axis */
  @js.native
  sealed trait Y extends JoystickAxis
  
  /** Z axis */
  @js.native
  sealed trait Z extends JoystickAxis
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[JoystickAxis with Double] = js.native
  /* 0 */ @js.native
  object X extends TopLevel[X with Double]
  
  /* 1 */ @js.native
  object Y extends TopLevel[Y with Double]
  
  /* 2 */ @js.native
  object Z extends TopLevel[Z with Double]
  
}

