package typings.d3Random.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RandomCauchy_ extends RandomNumberGenerationSource {
  
  /**
    * Returns a function for generating random numbers with a Cauchy distribution.
    * a and b have the same meanings and default values as in d3.randomWeibull.
    *
    * @param a Location parameter
    * @param b Scale parameter
    */
  def apply(): js.Function0[Double] = js.native
  def apply(a: js.UndefOr[scala.Nothing], b: Double): js.Function0[Double] = js.native
  def apply(a: Double): js.Function0[Double] = js.native
  def apply(a: Double, b: Double): js.Function0[Double] = js.native
}
