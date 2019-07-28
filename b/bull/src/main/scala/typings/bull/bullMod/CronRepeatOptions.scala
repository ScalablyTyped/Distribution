package typings.bull.bullMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CronRepeatOptions extends RepeatOptions {
  /**
    * Cron pattern specifying when the job should execute
    */
  var cron: String
  /**
    * Start date when the repeat job should start repeating (only with cron).
    */
  var startDate: js.UndefOr[Date | String | Double] = js.undefined
}

object CronRepeatOptions {
  @scala.inline
  def apply(
    cron: String,
    endDate: Date | String | Double = null,
    limit: Int | Double = null,
    startDate: Date | String | Double = null,
    tz: String = null
  ): CronRepeatOptions = {
    val __obj = js.Dynamic.literal(cron = cron)
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    if (tz != null) __obj.updateDynamic("tz")(tz)
    __obj.asInstanceOf[CronRepeatOptions]
  }
}

