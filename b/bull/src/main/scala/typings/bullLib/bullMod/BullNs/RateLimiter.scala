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

