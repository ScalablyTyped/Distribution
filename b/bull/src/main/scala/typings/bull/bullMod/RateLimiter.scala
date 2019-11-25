package typings.bull.bullMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RateLimiter extends js.Object {
  /** When jobs get rate limited, they stay in the waiting queue and are not moved to the delayed queue */
  var bounceBack: js.UndefOr[Boolean] = js.undefined
  /** Per duration in milliseconds */
  var duration: Double
  /** Max numbers of jobs processed */
  var max: Double
}

object RateLimiter {
  @scala.inline
  def apply(duration: Double, max: Double, bounceBack: js.UndefOr[Boolean] = js.undefined): RateLimiter = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any])
    if (!js.isUndefined(bounceBack)) __obj.updateDynamic("bounceBack")(bounceBack.asInstanceOf[js.Any])
    __obj.asInstanceOf[RateLimiter]
  }
}

