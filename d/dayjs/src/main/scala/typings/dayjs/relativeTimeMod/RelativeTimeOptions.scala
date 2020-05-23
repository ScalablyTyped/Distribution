package typings.dayjs.relativeTimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelativeTimeOptions extends js.Object {
  var rounding: js.UndefOr[js.Function1[/* num */ Double, Double]] = js.undefined
  var thresholds: js.UndefOr[js.Array[RelativeTimeThreshold]] = js.undefined
}

object RelativeTimeOptions {
  @scala.inline
  def apply(rounding: /* num */ Double => Double = null, thresholds: js.Array[RelativeTimeThreshold] = null): RelativeTimeOptions = {
    val __obj = js.Dynamic.literal()
    if (rounding != null) __obj.updateDynamic("rounding")(js.Any.fromFunction1(rounding))
    if (thresholds != null) __obj.updateDynamic("thresholds")(thresholds.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelativeTimeOptions]
  }
}

