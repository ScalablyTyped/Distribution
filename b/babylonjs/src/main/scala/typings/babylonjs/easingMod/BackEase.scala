package typings.babylonjs.easingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Animations/easing", "BackEase")
@js.native
/**
  * Instantiates a back ease easing
  * @see https://easings.net/#easeInBack
  * @param amplitude Defines the amplitude of the function
  */
class BackEase () extends EasingFunction {
  def this(/** Defines the amplitude of the function */
  amplitude: Double) = this()
  /** Defines the amplitude of the function */
  var amplitude: Double = js.native
}

