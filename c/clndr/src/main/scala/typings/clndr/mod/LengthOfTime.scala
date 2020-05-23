package typings.clndr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LengthOfTime extends js.Object {
  /**
    * Set to an integer if you want to render one or more days, otherwise
    * leave this null. Setting this to 14 would render a 2-week calendar.
    *
    */
  var days: js.UndefOr[Double | Null] = js.undefined
  /**
    * This is the amount of months or days that will move forward/back when
    * paging the calendar. With days=14 and interval=7, you would have a
    * 2-week calendar that pages forward and backward 1 week at a time.
    */
  var interval: js.UndefOr[Double] = js.undefined
  /**
    * Set to an integer if you want to render one or more months, otherwise
    * leave this null
    */
  var months: js.UndefOr[Double | Null] = js.undefined
}

object LengthOfTime {
  @scala.inline
  def apply(
    days: js.UndefOr[Null | Double] = js.undefined,
    interval: js.UndefOr[Double] = js.undefined,
    months: js.UndefOr[Null | Double] = js.undefined
  ): LengthOfTime = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(days)) __obj.updateDynamic("days")(days.asInstanceOf[js.Any])
    if (!js.isUndefined(interval)) __obj.updateDynamic("interval")(interval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(months)) __obj.updateDynamic("months")(months.asInstanceOf[js.Any])
    __obj.asInstanceOf[LengthOfTime]
  }
}

