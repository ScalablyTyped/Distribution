package typings.blueprintjsDatetime.timePickerMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITimePickerState extends js.Object {
  var hourText: js.UndefOr[String] = js.undefined
  var isPm: js.UndefOr[Boolean] = js.undefined
  var millisecondText: js.UndefOr[String] = js.undefined
  var minuteText: js.UndefOr[String] = js.undefined
  var secondText: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[Date] = js.undefined
}

object ITimePickerState {
  @scala.inline
  def apply(
    hourText: String = null,
    isPm: js.UndefOr[Boolean] = js.undefined,
    millisecondText: String = null,
    minuteText: String = null,
    secondText: String = null,
    value: Date = null
  ): ITimePickerState = {
    val __obj = js.Dynamic.literal()
    if (hourText != null) __obj.updateDynamic("hourText")(hourText.asInstanceOf[js.Any])
    if (!js.isUndefined(isPm)) __obj.updateDynamic("isPm")(isPm.get.asInstanceOf[js.Any])
    if (millisecondText != null) __obj.updateDynamic("millisecondText")(millisecondText.asInstanceOf[js.Any])
    if (minuteText != null) __obj.updateDynamic("minuteText")(minuteText.asInstanceOf[js.Any])
    if (secondText != null) __obj.updateDynamic("secondText")(secondText.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITimePickerState]
  }
}

