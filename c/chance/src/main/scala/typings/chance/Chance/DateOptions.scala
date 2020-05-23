package typings.chance.Chance

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateOptions extends js.Object {
  var american: js.UndefOr[Boolean] = js.undefined
  var day: js.UndefOr[Double] = js.undefined
  var max: js.UndefOr[Date] = js.undefined
  var min: js.UndefOr[Date] = js.undefined
  var month: js.UndefOr[Double] = js.undefined
  var string: js.UndefOr[Boolean] = js.undefined
  var year: js.UndefOr[Double] = js.undefined
}

object DateOptions {
  @scala.inline
  def apply(
    american: js.UndefOr[Boolean] = js.undefined,
    day: js.UndefOr[Double] = js.undefined,
    max: Date = null,
    min: Date = null,
    month: js.UndefOr[Double] = js.undefined,
    string: js.UndefOr[Boolean] = js.undefined,
    year: js.UndefOr[Double] = js.undefined
  ): DateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(american)) __obj.updateDynamic("american")(american.get.asInstanceOf[js.Any])
    if (!js.isUndefined(day)) __obj.updateDynamic("day")(day.get.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (!js.isUndefined(month)) __obj.updateDynamic("month")(month.get.asInstanceOf[js.Any])
    if (!js.isUndefined(string)) __obj.updateDynamic("string")(string.get.asInstanceOf[js.Any])
    if (!js.isUndefined(year)) __obj.updateDynamic("year")(year.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateOptions]
  }
}

