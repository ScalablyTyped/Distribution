package typings.d3DashRandom.d3DashRandomMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RandomUniform extends RandomNumberGenerationSource {
  /**
    * Returns a function for generating random numbers with a uniform distribution).
    * The minimum allowed value of a returned number is min, and the maximum is max.
    * If min is not specified, it defaults to 0; if max is not specified, it defaults to 1.
    *
    * @param min The minimum allowed value of a returned number, defaults to 0.
    * @param max The maximum allowed value of a returned number, defaults to 1.
    */
  def apply(): js.Function0[Double] = js.native
  def apply(min: Double): js.Function0[Double] = js.native
  def apply(min: Double, max: Double): js.Function0[Double] = js.native
}

@JSImport("d3-random", "randomUniform")
@js.native
object randomUniform extends TopLevel[RandomUniform]

