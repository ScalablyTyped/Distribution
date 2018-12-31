package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Xbox360Button extends js.Object

/**
  * Defines supported buttons for XBox360 compatible gamepads
  */
@JSGlobal("BABYLON.Xbox360Button")
@js.native
object Xbox360Button extends js.Object {
  /** A */
  @js.native
  sealed trait A
    extends babylonjsLib.BABYLONNs.Xbox360Button
  
  /** B */
  @js.native
  sealed trait B
    extends babylonjsLib.BABYLONNs.Xbox360Button
  
  /** Back */
  @js.native
  sealed trait Back
    extends babylonjsLib.BABYLONNs.Xbox360Button
  
  /** Left button */
  @js.native
  sealed trait LB
    extends babylonjsLib.BABYLONNs.Xbox360Button
  
  /** Left stick */
  @js.native
  sealed trait LeftStick
    extends babylonjsLib.BABYLONNs.Xbox360Button
  
  /** Right button */
  @js.native
  sealed trait RB
    extends babylonjsLib.BABYLONNs.Xbox360Button
  
  /** Right stick */
  @js.native
  sealed trait RightStick
    extends babylonjsLib.BABYLONNs.Xbox360Button
  
  /** Start */
  @js.native
  sealed trait Start
    extends babylonjsLib.BABYLONNs.Xbox360Button
  
  /** X */
  @js.native
  sealed trait X
    extends babylonjsLib.BABYLONNs.Xbox360Button
  
  /** Y */
  @js.native
  sealed trait Y
    extends babylonjsLib.BABYLONNs.Xbox360Button
  
  /* 0 */ val A: A with scala.Double = js.native
  /* 1 */ val B: B with scala.Double = js.native
  /* 5 */ val Back: Back with scala.Double = js.native
  /* 6 */ val LB: LB with scala.Double = js.native
  /* 8 */ val LeftStick: LeftStick with scala.Double = js.native
  /* 7 */ val RB: RB with scala.Double = js.native
  /* 9 */ val RightStick: RightStick with scala.Double = js.native
  /* 4 */ val Start: Start with scala.Double = js.native
  /* 2 */ val X: X with scala.Double = js.native
  /* 3 */ val Y: Y with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[babylonjsLib.BABYLONNs.Xbox360Button with scala.Double] = js.native
}

