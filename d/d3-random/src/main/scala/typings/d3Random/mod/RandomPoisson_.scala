package typings.d3Random.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RandomPoisson_ extends RandomNumberGenerationSource {
  
  /**
    * Returns a function for generating random numbers with a Poisson distribution with mean lambda.
    *
    * @param lambda Mean
    */
  def apply(lambda: Double): js.Function0[Double] = js.native
}
