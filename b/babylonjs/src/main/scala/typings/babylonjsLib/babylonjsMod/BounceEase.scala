package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Easing function with a bouncing shape (see link below).
     * @see https://easings.net/#easeInBounce
     * @see http://doc.babylonjs.com/babylon101/animations#easing-functions
     */
@JSImport("babylonjs", "BounceEase")
@js.native
class BounceEase ()
  extends babylonjsLib.BABYLONNs.BounceEase {
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
}

