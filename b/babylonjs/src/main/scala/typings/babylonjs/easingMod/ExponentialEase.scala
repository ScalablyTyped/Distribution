package typings.babylonjs.easingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Animations/easing", "ExponentialEase")
@js.native
/**
  * Instantiates an exponential easing function
  * @see https://easings.net/#easeInExpo
  * @param exponent Defines the exponent of the function
  */
class ExponentialEase () extends EasingFunction {
  def this(/** Defines the exponent of the function */
  exponent: Double) = this()
  /** Defines the exponent of the function */
  var exponent: Double = js.native
}

