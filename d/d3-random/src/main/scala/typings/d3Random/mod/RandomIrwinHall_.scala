package typings.d3Random.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RandomIrwinHall_ extends RandomNumberGenerationSource {
  /**
    * Returns a function for generating random numbers with an Irwin–Hall distribution with n independent variables.
    *
    * @param n Number of independent random variables to use.
    */
  def apply(n: Double): js.Function0[Double] = js.native
}

