package typings
package d3DashRandomLib.d3DashRandomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RandomUniform extends RandomNumberGenerationSource {
  /**
       * Returns a function for generating random numbers with a uniform distribution).
       * The minimum allowed value of a returned number is min, and the maximum is max.
       * If min is not specified, it defaults to 0; if max is not specified, it defaults to 1.
       *
       * @param min The minimum allowed value of a returned number, defaults to 0.
       * @param max The maximum allowed value of a returned number, defaults to 1.
       */
  def apply(): js.Function0[scala.Double] = js.native
  /**
       * Returns a function for generating random numbers with a uniform distribution).
       * The minimum allowed value of a returned number is min, and the maximum is max.
       * If min is not specified, it defaults to 0; if max is not specified, it defaults to 1.
       *
       * @param min The minimum allowed value of a returned number, defaults to 0.
       * @param max The maximum allowed value of a returned number, defaults to 1.
       */
  def apply(min: scala.Double): js.Function0[scala.Double] = js.native
  /**
       * Returns a function for generating random numbers with a uniform distribution).
       * The minimum allowed value of a returned number is min, and the maximum is max.
       * If min is not specified, it defaults to 0; if max is not specified, it defaults to 1.
       *
       * @param min The minimum allowed value of a returned number, defaults to 0.
       * @param max The maximum allowed value of a returned number, defaults to 1.
       */
  def apply(min: scala.Double, max: scala.Double): js.Function0[scala.Double] = js.native
}

