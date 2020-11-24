package typings.d3Random.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RandomInt_ extends RandomNumberGenerationSource {
  
  /**
    * Returns a function for generating random integers with a uniform distribution.
    * The minimum allowed value of a returned number is ⌊min⌋ (inclusive), and the maximum is ⌊max - 1⌋ (inclusive)
    * Min defaults to 0.
    *
    * @param max The maximum allowed value of a returned number.
    */
  def apply(max: Double): js.Function0[Double] = js.native
  /**
    * Returns a function for generating random integers with a uniform distribution.
    * The minimum allowed value of a returned number is ⌊min⌋ (inclusive), and the maximum is ⌊max - 1⌋ (inclusive)
    *
    * @param min The minimum allowed value of a returned number.
    * @param max The maximum allowed value of a returned number.
    */
  // tslint:disable-next-line:unified-signatures
  def apply(min: Double, max: Double): js.Function0[Double] = js.native
}
