package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DualShockButton extends js.Object

@JSGlobal("BABYLON.DualShockButton")
@js.native
object DualShockButton extends js.Object {
  /** Circle */
  @js.native
  sealed trait Circle extends DualShockButton
  
  /** Cross */
  @js.native
  sealed trait Cross extends DualShockButton
  
  /** L1 */
  @js.native
  sealed trait L1 extends DualShockButton
  
  /** Left stick */
  @js.native
  sealed trait LeftStick extends DualShockButton
  
  /** Options */
  @js.native
  sealed trait Options extends DualShockButton
  
  /** R1 */
  @js.native
  sealed trait R1 extends DualShockButton
  
  /** Right stick */
  @js.native
  sealed trait RightStick extends DualShockButton
  
  /** Share */
  @js.native
  sealed trait Share extends DualShockButton
  
  /** Square */
  @js.native
  sealed trait Square extends DualShockButton
  
  /** Triangle */
  @js.native
  sealed trait Triangle extends DualShockButton
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DualShockButton with Double] = js.native
  /* 1 */ @js.native
  object Circle extends TopLevel[Circle with Double]
  
  /* 0 */ @js.native
  object Cross extends TopLevel[Cross with Double]
  
  /* 4 */ @js.native
  object L1 extends TopLevel[L1 with Double]
  
  /* 10 */ @js.native
  object LeftStick extends TopLevel[LeftStick with Double]
  
  /* 9 */ @js.native
  object Options extends TopLevel[Options with Double]
  
  /* 5 */ @js.native
  object R1 extends TopLevel[R1 with Double]
  
  /* 11 */ @js.native
  object RightStick extends TopLevel[RightStick with Double]
  
  /* 8 */ @js.native
  object Share extends TopLevel[Share with Double]
  
  /* 2 */ @js.native
  object Square extends TopLevel[Square with Double]
  
  /* 3 */ @js.native
  object Triangle extends TopLevel[Triangle with Double]
  
}

