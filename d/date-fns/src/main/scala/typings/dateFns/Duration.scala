package typings.dateFns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Duration extends js.Object {
  var days: js.UndefOr[Double] = js.undefined
  var hours: js.UndefOr[Double] = js.undefined
  var minutes: js.UndefOr[Double] = js.undefined
  var months: js.UndefOr[Double] = js.undefined
  var seconds: js.UndefOr[Double] = js.undefined
  var weeks: js.UndefOr[Double] = js.undefined
  var years: js.UndefOr[Double] = js.undefined
}

object Duration {
  @scala.inline
  def apply(
    days: js.UndefOr[Double] = js.undefined,
    hours: js.UndefOr[Double] = js.undefined,
    minutes: js.UndefOr[Double] = js.undefined,
    months: js.UndefOr[Double] = js.undefined,
    seconds: js.UndefOr[Double] = js.undefined,
    weeks: js.UndefOr[Double] = js.undefined,
    years: js.UndefOr[Double] = js.undefined
  ): Duration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(days)) __obj.updateDynamic("days")(days.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hours)) __obj.updateDynamic("hours")(hours.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minutes)) __obj.updateDynamic("minutes")(minutes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(months)) __obj.updateDynamic("months")(months.get.asInstanceOf[js.Any])
    if (!js.isUndefined(seconds)) __obj.updateDynamic("seconds")(seconds.get.asInstanceOf[js.Any])
    if (!js.isUndefined(weeks)) __obj.updateDynamic("weeks")(weeks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(years)) __obj.updateDynamic("years")(years.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Duration]
  }
}

