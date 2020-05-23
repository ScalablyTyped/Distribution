package typings.babylonjs.BABYLON

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
  
}

