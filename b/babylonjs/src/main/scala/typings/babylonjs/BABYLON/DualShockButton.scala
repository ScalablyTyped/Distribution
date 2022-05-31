package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DualShockButton extends StObject
@JSGlobal("BABYLON.DualShockButton")
@js.native
object DualShockButton extends StObject {
  
  /** Circle */
  @js.native
  sealed trait Circle
    extends StObject
       with DualShockButton
  
  /** Cross */
  @js.native
  sealed trait Cross
    extends StObject
       with DualShockButton
  
  /** L1 */
  @js.native
  sealed trait L1
    extends StObject
       with DualShockButton
  
  /** Left stick */
  @js.native
  sealed trait LeftStick
    extends StObject
       with DualShockButton
  
  /** Options */
  @js.native
  sealed trait Options
    extends StObject
       with DualShockButton
  
  /** R1 */
  @js.native
  sealed trait R1
    extends StObject
       with DualShockButton
  
  /** Right stick */
  @js.native
  sealed trait RightStick
    extends StObject
       with DualShockButton
  
  /** Share */
  @js.native
  sealed trait Share
    extends StObject
       with DualShockButton
  
  /** Square */
  @js.native
  sealed trait Square
    extends StObject
       with DualShockButton
  
  /** Triangle */
  @js.native
  sealed trait Triangle
    extends StObject
       with DualShockButton
}
