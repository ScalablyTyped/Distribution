package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Easing function with an elastic shape (see link below).
     * @see https://easings.net/#easeInElastic
     * @see http://doc.babylonjs.com/babylon101/animations#easing-functions
     */
@JSImport("babylonjs", "ElasticEase")
@js.native
class ElasticEase ()
  extends babylonjsLib.BABYLONNs.ElasticEase {
  /**
           * Instantiates an elastic easing function
           * @see https://easings.net/#easeInElastic
           * @param oscillations Defines the number of oscillations
           * @param springiness Defines the amplitude of the oscillations
           */
  def this(/** Defines the number of oscillations*/
  oscillations: scala.Double) = this()
  /**
           * Instantiates an elastic easing function
           * @see https://easings.net/#easeInElastic
           * @param oscillations Defines the number of oscillations
           * @param springiness Defines the amplitude of the oscillations
           */
  def this(/** Defines the number of oscillations*/
  oscillations: scala.Double, /** Defines the amplitude of the oscillations*/
  springiness: scala.Double) = this()
}

