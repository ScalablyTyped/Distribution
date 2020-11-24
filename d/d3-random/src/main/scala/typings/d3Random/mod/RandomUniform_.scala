package typings.d3Random.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RandomUniform_ extends RandomNumberGenerationSource {
  
  /**
    * Returns a function for generating random numbers with a uniform distribution.
    * The minimum allowed value of a returned number is min (inclusive), and the maximum is max (exclusive).
    * Min defaults to 0; if max is not specified, it defaults to 1.
    *
    * @param max The maximum allowed value of a returned number, defaults to 1.
    */
  def apply(): js.Function0[Double] = js.native
  def apply(max: Double): js.Function0[Double] = js.native
  /**
    * Returns a function for generating random numbers with a uniform distribution.
    * The minimum allowed value of a returned number is min (inclusive), and the maximum is max (exclusive).
    *
    * @param min The minimum allowed value of a returned number.
    * @param max The maximum allowed value of a returned number.
    */
  // tslint:disable-next-line:unified-signatures
  def apply(min: Double, max: Double): js.Function0[Double] = js.native
}
