package typings
package bootstrapDotTimepickerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimepickerTime extends js.Object {
  var hours: js.UndefOr[scala.Double] = js.undefined
  var meridian: js.UndefOr[java.lang.String] = js.undefined
  var minutes: js.UndefOr[scala.Double] = js.undefined
  var seconds: js.UndefOr[scala.Double] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object TimepickerTime {
  @scala.inline
  def apply(
    hours: scala.Int | scala.Double = null,
    meridian: java.lang.String = null,
    minutes: scala.Int | scala.Double = null,
    seconds: scala.Int | scala.Double = null,
    value: java.lang.String = null
  ): TimepickerTime = {
    val __obj = js.Dynamic.literal()
    if (hours != null) __obj.updateDynamic("hours")(hours.asInstanceOf[js.Any])
    if (meridian != null) __obj.updateDynamic("meridian")(meridian)
    if (minutes != null) __obj.updateDynamic("minutes")(minutes.asInstanceOf[js.Any])
    if (seconds != null) __obj.updateDynamic("seconds")(seconds.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[TimepickerTime]
  }
}

