package typings
package d3DashRandomLib.d3DashRandomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RandomExponential extends RandomNumberGenerationSource {
  /**
       * Returns a function for generating random numbers with an exponential distribution with the rate lambda;
       * equivalent to time between events in a Poisson process with a mean of 1 / lambda.
       *
       * @param lambda Expected time between events.
       */
  def apply(lambda: scala.Double): js.Function0[scala.Double] = js.native
}

