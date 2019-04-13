package typings
package bullLib.bullMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepeatOptions extends js.Object {
  /**
    * End date when the repeat job should stop repeating
    */
  var endDate: js.UndefOr[stdLib.Date | java.lang.String | scala.Double] = js.undefined
  /**
    * Number of times the job should repeat at max.
    */
  var limit: js.UndefOr[scala.Double] = js.undefined
  /**
    * Timezone
    */
  var tz: js.UndefOr[java.lang.String] = js.undefined
}

object RepeatOptions {
  @scala.inline
  def apply(
    endDate: stdLib.Date | java.lang.String | scala.Double = null,
    limit: scala.Int | scala.Double = null,
    tz: java.lang.String = null
  ): RepeatOptions = {
    val __obj = js.Dynamic.literal()
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (tz != null) __obj.updateDynamic("tz")(tz)
    __obj.asInstanceOf[RepeatOptions]
  }
}

