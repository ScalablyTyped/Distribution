package typings
package bullLib.bullMod.BullNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CronRepeatOptions extends RepeatOptions {
  /**
    * Cron pattern specifying when the job should execute
    */
  var cron: java.lang.String
  /**
    * Start date when the repeat job should start repeating (only with cron).
    */
  var startDate: js.UndefOr[stdLib.Date | java.lang.String | scala.Double] = js.undefined
}

object CronRepeatOptions {
  @scala.inline
  def apply(
    cron: java.lang.String,
    endDate: stdLib.Date | java.lang.String | scala.Double = null,
    limit: scala.Int | scala.Double = null,
    startDate: stdLib.Date | java.lang.String | scala.Double = null,
    tz: java.lang.String = null
  ): CronRepeatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cron")(cron)
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    if (tz != null) __obj.updateDynamic("tz")(tz)
    __obj.asInstanceOf[CronRepeatOptions]
  }
}

