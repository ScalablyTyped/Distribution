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
    hours: js.UndefOr[Double] = js.undefined,
    meridian: String = null,
    minutes: js.UndefOr[Double] = js.undefined,
    seconds: js.UndefOr[Double] = js.undefined,
    value: String = null
  ): TimepickerTime = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hours)) __obj.updateDynamic("hours")(hours.get.asInstanceOf[js.Any])
    if (meridian != null) __obj.updateDynamic("meridian")(meridian.asInstanceOf[js.Any])
    if (!js.isUndefined(minutes)) __obj.updateDynamic("minutes")(minutes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(seconds)) __obj.updateDynamic("seconds")(seconds.get.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimepickerTime]
  }
}

