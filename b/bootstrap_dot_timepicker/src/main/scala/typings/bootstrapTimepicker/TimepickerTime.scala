package typings.bootstrapTimepicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimepickerTime extends js.Object {
  var hours: js.UndefOr[Double] = js.undefined
  var meridian: js.UndefOr[String] = js.undefined
  var minutes: js.UndefOr[Double] = js.undefined
  var seconds: js.UndefOr[Double] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object TimepickerTime {
  @scala.inline
  def apply(
    hours: Int | Double = null,
    meridian: String = null,
    minutes: Int | Double = null,
    seconds: Int | Double = null,
    value: String = null
  ): TimepickerTime = {
    val __obj = js.Dynamic.literal()
    if (hours != null) __obj.updateDynamic("hours")(hours.asInstanceOf[js.Any])
    if (meridian != null) __obj.updateDynamic("meridian")(meridian.asInstanceOf[js.Any])
    if (minutes != null) __obj.updateDynamic("minutes")(minutes.asInstanceOf[js.Any])
    if (seconds != null) __obj.updateDynamic("seconds")(seconds.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimepickerTime]
  }
}

