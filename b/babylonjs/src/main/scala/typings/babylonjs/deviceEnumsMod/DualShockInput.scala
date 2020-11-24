package typings.babylonjs.deviceEnumsMod

import org.scalablytyped.runtime.TopLevel
import typings.babylonjs.deviceTypesMod._DeviceInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DualShockInput
  extends _DeviceInput[js.Any]
@JSImport("babylonjs/DeviceInput/InputDevices/deviceEnums", "DualShockInput")
@js.native
object DualShockInput extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DualShockInput with Double] = js.native
  
  /** Circle */
  @js.native
  sealed trait Circle extends DualShockInput
  /* 1 */ @js.native
  object Circle extends TopLevel[Circle with Double]
  
  /** Cross */
  @js.native
  sealed trait Cross extends DualShockInput
  /* 0 */ @js.native
  object Cross extends TopLevel[Cross with Double]
  
  /** DPadDown */
  @js.native
  sealed trait DPadDown extends DualShockInput
  /* 13 */ @js.native
  object DPadDown extends TopLevel[DPadDown with Double]
  
  /** DPadLeft */
  @js.native
  sealed trait DPadLeft extends DualShockInput
  /* 14 */ @js.native
  object DPadLeft extends TopLevel[DPadLeft with Double]
  
  /** DRight */
  @js.native
  sealed trait DPadRight extends DualShockInput
  /* 15 */ @js.native
  object DPadRight extends TopLevel[DPadRight with Double]
  
  /** DPadUp */
  @js.native
  sealed trait DPadUp extends DualShockInput
  /* 12 */ @js.native
  object DPadUp extends TopLevel[DPadUp with Double]
  
  /** Home */
  @js.native
  sealed trait Home extends DualShockInput
  /* 16 */ @js.native
  object Home extends TopLevel[Home with Double]
  
  /** L1 */
  @js.native
  sealed trait L1 extends DualShockInput
  /* 4 */ @js.native
  object L1 extends TopLevel[L1 with Double]
  
  /** L2 */
  @js.native
  sealed trait L2 extends DualShockInput
  /* 6 */ @js.native
  object L2 extends TopLevel[L2 with Double]
  
  /** L3 */
  @js.native
  sealed trait L3 extends DualShockInput
  /* 10 */ @js.native
  object L3 extends TopLevel[L3 with Double]
  
  /** LStickXAxis */
  @js.native
  sealed trait LStickXAxis extends DualShockInput
  /* 18 */ @js.native
  object LStickXAxis extends TopLevel[LStickXAxis with Double]
  
  /** LStickYAxis */
  @js.native
  sealed trait LStickYAxis extends DualShockInput
  /* 19 */ @js.native
  object LStickYAxis extends TopLevel[LStickYAxis with Double]
  
  /** Options */
  @js.native
  sealed trait Options extends DualShockInput
  /* 9 */ @js.native
  object Options extends TopLevel[Options with Double]
  
  /** R1 */
  @js.native
  sealed trait R1 extends DualShockInput
  /* 5 */ @js.native
  object R1 extends TopLevel[R1 with Double]
  
  /** R2 */
  @js.native
  sealed trait R2 extends DualShockInput
  /* 7 */ @js.native
  object R2 extends TopLevel[R2 with Double]
  
  /** R3 */
  @js.native
  sealed trait R3 extends DualShockInput
  /* 11 */ @js.native
  object R3 extends TopLevel[R3 with Double]
  
  /** RStickXAxis */
  @js.native
  sealed trait RStickXAxis extends DualShockInput
  /* 20 */ @js.native
  object RStickXAxis extends TopLevel[RStickXAxis with Double]
  
  /** RStickYAxis */
  @js.native
  sealed trait RStickYAxis extends DualShockInput
  /* 21 */ @js.native
  object RStickYAxis extends TopLevel[RStickYAxis with Double]
  
  /** Share */
  @js.native
  sealed trait Share extends DualShockInput
  /* 8 */ @js.native
  object Share extends TopLevel[Share with Double]
  
  /** Square */
  @js.native
  sealed trait Square extends DualShockInput
  /* 2 */ @js.native
  object Square extends TopLevel[Square with Double]
  
  /** TouchPad */
  @js.native
  sealed trait TouchPad extends DualShockInput
  /* 17 */ @js.native
  object TouchPad extends TopLevel[TouchPad with Double]
  
  /** Triangle */
  @js.native
  sealed trait Triangle extends DualShockInput
  /* 3 */ @js.native
  object Triangle extends TopLevel[Triangle with Double]
}
