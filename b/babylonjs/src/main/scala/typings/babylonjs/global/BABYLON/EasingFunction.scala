package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.EasingFunction")
@js.native
class EasingFunction ()
  extends typings.babylonjs.BABYLON.EasingFunction {
  /* CompleteClass */
  override var _easingMode: js.Any = js.native
  /**
    * Given an input gradient between 0 and 1, this returns the corrseponding value
    * of the easing function.
    * The link below provides some of the most common examples of easing functions.
    * @see https://easings.net/
    * @param gradient Defines the value between 0 and 1 we want the easing value for
    * @returns the corresponding value on the curve defined by the easing function
    */
  /* CompleteClass */
  override def ease(gradient: Double): Double = js.native
  /**
    * @hidden
    */
  /* CompleteClass */
  override def easeInCore(gradient: Double): Double = js.native
  /**
    * Gets the current easing mode.
    * @returns the easing mode
    */
  /* CompleteClass */
  override def getEasingMode(): Double = js.native
  /**
    * Sets the easing mode of the current function.
    * @param easingMode Defines the willing mode (EASINGMODE_EASEIN, EASINGMODE_EASEOUT or EASINGMODE_EASEINOUT)
    */
  /* CompleteClass */
  override def setEasingMode(easingMode: Double): Unit = js.native
}

/* static members */
@JSGlobal("BABYLON.EasingFunction")
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

