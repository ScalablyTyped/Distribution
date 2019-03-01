package typings
package chanceLib.ChanceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateOptions extends js.Object {
  var american: js.UndefOr[scala.Boolean] = js.undefined
  var day: js.UndefOr[scala.Double] = js.undefined
  var max: js.UndefOr[stdLib.Date] = js.undefined
  var min: js.UndefOr[stdLib.Date] = js.undefined
  var month: js.UndefOr[scala.Double] = js.undefined
  var string: js.UndefOr[scala.Boolean] = js.undefined
  var year: js.UndefOr[scala.Double] = js.undefined
}

object DateOptions {
  @scala.inline
  def apply(
    american: js.UndefOr[scala.Boolean] = js.undefined,
    day: scala.Int | scala.Double = null,
    max: stdLib.Date = null,
    min: stdLib.Date = null,
    month: scala.Int | scala.Double = null,
    string: js.UndefOr[scala.Boolean] = js.undefined,
    year: scala.Int | scala.Double = null
  ): DateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(american)) __obj.updateDynamic("american")(american)
    if (day != null) __obj.updateDynamic("day")(day.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max)
    if (min != null) __obj.updateDynamic("min")(min)
    if (month != null) __obj.updateDynamic("month")(month.asInstanceOf[js.Any])
    if (!js.isUndefined(string)) __obj.updateDynamic("string")(string)
    if (year != null) __obj.updateDynamic("year")(year.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateOptions]
  }
}

