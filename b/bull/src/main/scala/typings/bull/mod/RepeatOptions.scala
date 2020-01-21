package typings.bull.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepeatOptions extends js.Object {
  /**
    * End date when the repeat job should stop repeating
    */
  var endDate: js.UndefOr[Date | String | Double] = js.undefined
  /**
    * Number of times the job should repeat at max.
    */
  var limit: js.UndefOr[Double] = js.undefined
  /**
    * Timezone
    */
  var tz: js.UndefOr[String] = js.undefined
}

object RepeatOptions {
  @scala.inline
  def apply(endDate: Date | String | Double = null, limit: Int | Double = null, tz: String = null): RepeatOptions = {
    val __obj = js.Dynamic.literal()
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (tz != null) __obj.updateDynamic("tz")(tz.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepeatOptions]
  }
}

