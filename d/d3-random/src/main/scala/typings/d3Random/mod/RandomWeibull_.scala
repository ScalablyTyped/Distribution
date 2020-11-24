package typings.d3Random.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RandomWeibull_ extends RandomNumberGenerationSource {
  
  /**
    * Returns a function for generating random numbers with one of the generalized extreme value distributions, depending on k:
    * If k is positive, the Weibull distribution with shape parameter k
    * If k is zero, the Gumbel distribution
    * If k is negative, the Fréchet distribution with shape parameter −k
    * In all three cases, a is the location parameter and b is the scale parameter.
    * If a is not specified, it defaults to 0; if b is not specified, it defaults to 1.
    *
    * @param k Shape parameter
    * @param a Location parameter
    * @param b Scale parameter
    */
  def apply(k: Double): js.Function0[Double] = js.native
  def apply(k: Double, a: js.UndefOr[scala.Nothing], b: Double): js.Function0[Double] = js.native
  def apply(k: Double, a: Double): js.Function0[Double] = js.native
  def apply(k: Double, a: Double, b: Double): js.Function0[Double] = js.native
}
