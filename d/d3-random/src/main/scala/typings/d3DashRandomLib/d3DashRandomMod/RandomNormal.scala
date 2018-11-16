package typings
package d3DashRandomLib.d3DashRandomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RandomNormal extends RandomNumberGenerationSource {
  /**
       * Returns a function for generating random numbers with a normal (Gaussian) distribution.
       * The expected value of the generated numbers is mu, with the given standard deviation sigma.
       * If mu is not specified, it defaults to 0; if sigma is not specified, it defaults to 1.
       *
       * @param mu Expected value, defaults to 0.
       * @param sigma Standard deviation, defaults to 1.
       */
  def apply(): js.Function0[scala.Double] = js.native
  /**
       * Returns a function for generating random numbers with a normal (Gaussian) distribution.
       * The expected value of the generated numbers is mu, with the given standard deviation sigma.
       * If mu is not specified, it defaults to 0; if sigma is not specified, it defaults to 1.
       *
       * @param mu Expected value, defaults to 0.
       * @param sigma Standard deviation, defaults to 1.
       */
  def apply(mu: scala.Double): js.Function0[scala.Double] = js.native
  /**
       * Returns a function for generating random numbers with a normal (Gaussian) distribution.
       * The expected value of the generated numbers is mu, with the given standard deviation sigma.
       * If mu is not specified, it defaults to 0; if sigma is not specified, it defaults to 1.
       *
       * @param mu Expected value, defaults to 0.
       * @param sigma Standard deviation, defaults to 1.
       */
  def apply(mu: scala.Double, sigma: scala.Double): js.Function0[scala.Double] = js.native
}

