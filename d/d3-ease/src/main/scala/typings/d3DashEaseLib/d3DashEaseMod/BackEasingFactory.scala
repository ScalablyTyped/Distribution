package typings
package d3DashEaseLib.d3DashEaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackEasingFactory extends js.Object {
  /**
       * Calculate eased time.
       * @param normalizedTime Normalized time typically in the range [0, 1]
       */
  def apply(normalizedTime: scala.Double): scala.Double = js.native
  /**
       * Returns a new back easing with the specified overshoot s.
       * The degree of overshoot is configurable; if not specified, it defaults to 1.70158.
       *
       * @param s Overshoot parameter
       */
  def overshoot(s: scala.Double): BackEasingFactory = js.native
}

