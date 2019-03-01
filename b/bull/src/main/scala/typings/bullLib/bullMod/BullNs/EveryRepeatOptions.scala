package typings
package bullLib.bullMod.BullNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EveryRepeatOptions extends RepeatOptions {
  /**
    * Repeat every millis (cron setting cannot be used together with this setting.)
    */
  var every: scala.Double
}

object EveryRepeatOptions {
  @scala.inline
  def apply(
    every: scala.Double,
    endDate: stdLib.Date | java.lang.String | scala.Double = null,
    limit: scala.Int | scala.Double = null,
    tz: java.lang.String = null
  ): EveryRepeatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("every")(every)
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (tz != null) __obj.updateDynamic("tz")(tz)
    __obj.asInstanceOf[EveryRepeatOptions]
  }
}

