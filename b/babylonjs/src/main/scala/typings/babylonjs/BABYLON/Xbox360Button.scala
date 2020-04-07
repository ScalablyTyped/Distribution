package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Xbox360Button extends js.Object

@JSGlobal("BABYLON.Xbox360Button")
@js.native
object Xbox360Button extends js.Object {
  /** A */
  @js.native
  sealed trait A extends Xbox360Button
  
  /** B */
  @js.native
  sealed trait B extends Xbox360Button
  
  /** Back */
  @js.native
  sealed trait Back extends Xbox360Button
  
  /** Left button */
  @js.native
  sealed trait LB extends Xbox360Button
  
  /** Left stick */
  @js.native
  sealed trait LeftStick extends Xbox360Button
  
  /** Right button */
  @js.native
  sealed trait RB extends Xbox360Button
  
  /** Right stick */
  @js.native
  sealed trait RightStick extends Xbox360Button
  
  /** Start */
  @js.native
  sealed trait Start extends Xbox360Button
  
  /** X */
  @js.native
  sealed trait X extends Xbox360Button
  
  /** Y */
  @js.native
  sealed trait Y extends Xbox360Button
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Xbox360Button with Double] = js.native
  /* 0 */ @js.native
  object A extends TopLevel[A with Double]
  
  /* 1 */ @js.native
  object B extends TopLevel[B with Double]
  
  /* 8 */ @js.native
  object Back extends TopLevel[Back with Double]
  
  /* 4 */ @js.native
  object LB extends TopLevel[LB with Double]
  
  /* 10 */ @js.native
  object LeftStick extends TopLevel[LeftStick with Double]
  
  /* 5 */ @js.native
  object RB extends TopLevel[RB with Double]
  
  /* 11 */ @js.native
  object RightStick extends TopLevel[RightStick with Double]
  
  /* 9 */ @js.native
  object Start extends TopLevel[Start with Double]
  
  /* 2 */ @js.native
  object X extends TopLevel[X with Double]
  
  /* 3 */ @js.native
  object Y extends TopLevel[Y with Double]
  
}

