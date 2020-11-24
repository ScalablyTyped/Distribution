package typings.d3Random.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RandomBernoulli_ extends RandomNumberGenerationSource {
  
  /**
    * Returns a function for generating either 1 or 0 according to a Bernoulli distribution with 1 being returned with success probability p and 0 with failure probability q = 1 - p.
    * The value p is in the range [0, 1].
    *
    * @param p p
    */
  def apply(p: Double): js.Function0[Double] = js.native
}
