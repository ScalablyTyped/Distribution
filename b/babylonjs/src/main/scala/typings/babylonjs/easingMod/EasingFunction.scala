package typings.babylonjs.easingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Animations/easing", "EasingFunction")
@js.native
class EasingFunction () extends IEasingFunction {
  
  var _easingMode: js.Any = js.native
  
  /**
    * @hidden
    */
  def easeInCore(gradient: Double): Double = js.native
  
  /**
    * Gets the current easing mode.
    * @returns the easing mode
    */
  def getEasingMode(): Double = js.native
  
  /**
    * Sets the easing mode of the current function.
    * @param easingMode Defines the willing mode (EASINGMODE_EASEIN, EASINGMODE_EASEOUT or EASINGMODE_EASEINOUT)
    */
  def setEasingMode(easingMode: Double): Unit = js.native
}
/* static members */
@JSImport("babylonjs/Animations/easing", "EasingFunction")
@js.native
object EasingFunction extends js.Object {
  
  /**
    * Interpolation follows the mathematical formula associated with the easing function.
    */
  val EASINGMODE_EASEIN: Double = js.native
  
  /**
    * Interpolation uses EaseIn for the first half of the animation and EaseOut for the second half.
    */
  val EASINGMODE_EASEINOUT: Double = js.native
  
  /**
    * Interpolation follows 100% interpolation minus the output of the formula associated with the easing function.
    */
  val EASINGMODE_EASEOUT: Double = js.native
}
