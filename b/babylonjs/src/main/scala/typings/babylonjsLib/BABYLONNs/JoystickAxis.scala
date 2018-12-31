package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait JoystickAxis extends js.Object

/**
  * Defines the potential axis of a Joystick
  */
@JSGlobal("BABYLON.JoystickAxis")
@js.native
object JoystickAxis extends js.Object {
  /** X axis */
  @js.native
  sealed trait X
    extends babylonjsLib.BABYLONNs.JoystickAxis
  
  /** Y axis */
  @js.native
  sealed trait Y
    extends babylonjsLib.BABYLONNs.JoystickAxis
  
  /** Z axis */
  @js.native
  sealed trait Z
    extends babylonjsLib.BABYLONNs.JoystickAxis
  
  /* 0 */ val X: X with scala.Double = js.native
  /* 1 */ val Y: Y with scala.Double = js.native
  /* 2 */ val Z: Z with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[babylonjsLib.BABYLONNs.JoystickAxis with scala.Double] = js.native
}

