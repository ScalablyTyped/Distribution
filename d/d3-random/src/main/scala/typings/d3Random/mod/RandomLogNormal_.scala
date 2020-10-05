package typings.d3Random.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RandomLogNormal_ extends RandomNumberGenerationSource {
  /**
    * Returns a function for generating random numbers with a log-normal distribution. The expected value of the random variable’s natural logarithm is mu,
    * with the given standard deviation sigma. If mu is not specified, it defaults to 0; if sigma is not specified, it defaults to 1.
    *
    * @param mu Expected value, defaults to 0.
    * @param sigma Standard deviation, defaults to 1.
    */
  def apply(): js.Function0[Double] = js.native
  def apply(mu: js.UndefOr[scala.Nothing], sigma: Double): js.Function0[Double] = js.native
  def apply(mu: Double): js.Function0[Double] = js.native
  def apply(mu: Double, sigma: Double): js.Function0[Double] = js.native
}

