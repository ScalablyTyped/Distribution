package typings.babylonjs.easingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Animations/easing", "ElasticEase")
@js.native
/**
  * Instantiates an elastic easing function
  * @see https://easings.net/#easeInElastic
  * @param oscillations Defines the number of oscillations
  * @param springiness Defines the amplitude of the oscillations
  */
class ElasticEase () extends EasingFunction {
  def this(/** Defines the number of oscillations*/
  oscillations: Double) = this()
  def this(
    /** Defines the number of oscillations*/
  oscillations: Double,
    /** Defines the amplitude of the oscillations*/
  springiness: Double
  ) = this()
  /** Defines the number of oscillations*/
  var oscillations: Double = js.native
  /** Defines the amplitude of the oscillations*/
  var springiness: Double = js.native
}

