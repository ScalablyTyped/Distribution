package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Easing function with a bouncing shape (see link below).
     * @see https://easings.net/#easeInBounce
     * @see http://doc.babylonjs.com/babylon101/animations#easing-functions
     */
@JSGlobal("BABYLON.BounceEase")
@js.native
class BounceEase () extends EasingFunction {
  /**
           * Instantiates a bounce easing
           * @see https://easings.net/#easeInBounce
           * @param bounces Defines the number of bounces
           * @param bounciness Defines the amplitude of the bounce
           */
  def this(/** Defines the number of bounces */
  bounces: scala.Double) = this()
  /**
           * Instantiates a bounce easing
           * @see https://easings.net/#easeInBounce
           * @param bounces Defines the number of bounces
           * @param bounciness Defines the amplitude of the bounce
           */
  def this(/** Defines the number of bounces */
  bounces: scala.Double, /** Defines the amplitude of the bounce */
  bounciness: scala.Double) = this()
  /** Defines the number of bounces */
  var bounces: scala.Double = js.native
  /** Defines the amplitude of the bounce */
  var bounciness: scala.Double = js.native
}

