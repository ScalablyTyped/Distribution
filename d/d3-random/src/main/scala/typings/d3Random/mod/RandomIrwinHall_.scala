package typings.d3Random.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RandomIrwinHall_ extends RandomNumberGenerationSource {
  
  /**
    * Returns a function for generating random numbers with an Irwin–Hall distribution with n independent variables.
    * If the fractional part of n is non-zero, this is treated as adding d3.randomUniform() times that fractional part to the integral part.
    *
    * @param n Number of independent random variables to use.
    */
  def apply(n: Double): js.Function0[Double] = js.native
}
