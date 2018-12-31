package typings
package d3DashEaseLib.d3DashEaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolynomialEasingFactory extends js.Object {
  /**
    * Calculate eased time.
    * @param normalizedTime Normalized time typically in the range [0, 1]
    */
  def apply(normalizedTime: scala.Double): scala.Double = js.native
  /**
    * Returns a new polynomial easing with the specified exponent e.
    * If the exponent is not specified, it defaults to 3, equivalent to cubic.
    *
    * @param e Exponent for polynomial easing.
    */
  def exponent(e: scala.Double): PolynomialEasingFactory = js.native
}

