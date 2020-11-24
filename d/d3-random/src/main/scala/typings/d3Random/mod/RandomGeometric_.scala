package typings.d3Random.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RandomGeometric_ extends RandomNumberGenerationSource {
  
  /**
    * Returns a function for generating numbers with a geometric distribution with success probability p.
    * The value p is in the range [0, 1].
    *
    * @param p Success probability
    */
  def apply(p: Double): js.Function0[Double] = js.native
}
