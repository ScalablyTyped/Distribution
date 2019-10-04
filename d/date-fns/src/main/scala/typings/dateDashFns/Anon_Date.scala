package typings.dateDashFns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Date extends js.Object {
  var date: js.UndefOr[Double] = js.undefined
  var hours: js.UndefOr[Double] = js.undefined
  var milliseconds: js.UndefOr[Double] = js.undefined
  var minutes: js.UndefOr[Double] = js.undefined
  var month: js.UndefOr[Double] = js.undefined
  var seconds: js.UndefOr[Double] = js.undefined
  var year: js.UndefOr[Double] = js.undefined
}

object Anon_Date {
  @scala.inline
  def apply(
    date: Int | Double = null,
    hours: Int | Double = null,
    milliseconds: Int | Double = null,
    minutes: Int | Double = null,
    month: Int | Double = null,
    seconds: Int | Double = null,
    year: Int | Double = null
  ): Anon_Date = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (hours != null) __obj.updateDynamic("hours")(hours.asInstanceOf[js.Any])
    if (milliseconds != null) __obj.updateDynamic("milliseconds")(milliseconds.asInstanceOf[js.Any])
    if (minutes != null) __obj.updateDynamic("minutes")(minutes.asInstanceOf[js.Any])
    if (month != null) __obj.updateDynamic("month")(month.asInstanceOf[js.Any])
    if (seconds != null) __obj.updateDynamic("seconds")(seconds.asInstanceOf[js.Any])
    if (year != null) __obj.updateDynamic("year")(year.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Date]
  }
}

