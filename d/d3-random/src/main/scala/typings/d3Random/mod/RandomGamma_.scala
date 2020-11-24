package typings.d3Random.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RandomGamma_ extends RandomNumberGenerationSource {
  
  /**
    * Returns a function for generating random numbers with a gamma distribution with k the shape parameter and theta the scale parameter.
    * The value k must be a positive value; if theta is not specified, it defaults to 1.
    *
    * @param k Shape parameter
    * @param theta Scale paramter
    */
  def apply(k: Double): js.Function0[Double] = js.native
  def apply(k: Double, theta: Double): js.Function0[Double] = js.native
}
