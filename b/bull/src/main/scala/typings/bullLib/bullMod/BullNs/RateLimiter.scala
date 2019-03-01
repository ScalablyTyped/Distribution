package typings
package bullLib.bullMod.BullNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RateLimiter extends js.Object {
  /** When jobs get rate limited, they stay in the waiting queue and are not moved to the delayed queue */
  var bounceBack: js.UndefOr[scala.Boolean] = js.undefined
  /** Per duration in milliseconds */
  var duration: scala.Double
  /** Max numbers of jobs processed */
  var max: scala.Double
}

object RateLimiter {
  @scala.inline
  def apply(duration: scala.Double, max: scala.Double, bounceBack: js.UndefOr[scala.Boolean] = js.undefined): RateLimiter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("max")(max)
    if (!js.isUndefined(bounceBack)) __obj.updateDynamic("bounceBack")(bounceBack)
    __obj.asInstanceOf[RateLimiter]
  }
}

