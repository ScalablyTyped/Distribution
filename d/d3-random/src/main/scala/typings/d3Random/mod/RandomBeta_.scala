package typings.d3Random.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RandomBeta_ extends RandomNumberGenerationSource {
  
  /**
    * Returns a function for generating random numbers with a beta distribution with alpha and beta shape parameters, which must both be positive.
    *
    * @param alpha Shape parameter
    * @param beta Shape paramter
    */
  def apply(alpha: Double, beta: Double): js.Function0[Double] = js.native
}
