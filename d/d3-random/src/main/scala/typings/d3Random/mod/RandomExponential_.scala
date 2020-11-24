package typings.d3Random.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RandomExponential_ extends RandomNumberGenerationSource {
  
  /**
    * Returns a function for generating random numbers with an exponential distribution with the rate lambda;
    * equivalent to time between events in a Poisson process with a mean of 1 / lambda.
    *
    * @param lambda Expected time between events.
    */
  def apply(lambda: Double): js.Function0[Double] = js.native
}
