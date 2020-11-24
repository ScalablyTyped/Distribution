package typings.d3Random.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RandomPareto_ extends RandomNumberGenerationSource {
  
  /**
    * Returns a function for generating random numbers with a Pareto distribution with the shape alpha.
    * The value alpha must be a positive value.
    *
    * @param alpha alpha
    */
  def apply(alpha: Double): js.Function0[Double] = js.native
}
