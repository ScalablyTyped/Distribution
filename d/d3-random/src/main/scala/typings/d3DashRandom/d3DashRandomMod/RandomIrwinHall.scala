package typings.d3DashRandom.d3DashRandomMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RandomIrwinHall extends RandomNumberGenerationSource {
  /**
    * Returns a function for generating random numbers with an Irwin–Hall distribution with n independent variables.
    *
    * @param n Number of independent random variables to use.
    */
  def apply(n: Double): js.Function0[Double] = js.native
}

@JSImport("d3-random", "randomIrwinHall")
@js.native
object randomIrwinHall extends TopLevel[RandomIrwinHall]

