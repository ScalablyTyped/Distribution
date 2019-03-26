package typings
package atBlueprintjsDatetimeLib.libEsmTimePickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITimePickerState extends js.Object {
  var hourText: js.UndefOr[java.lang.String] = js.undefined
  var isPm: js.UndefOr[scala.Boolean] = js.undefined
  var millisecondText: js.UndefOr[java.lang.String] = js.undefined
  var minuteText: js.UndefOr[java.lang.String] = js.undefined
  var secondText: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[stdLib.Date] = js.undefined
}

object ITimePickerState {
  @scala.inline
  def apply(
    hourText: java.lang.String = null,
    isPm: js.UndefOr[scala.Boolean] = js.undefined,
    millisecondText: java.lang.String = null,
    minuteText: java.lang.String = null,
    secondText: java.lang.String = null,
    value: stdLib.Date = null
  ): ITimePickerState = {
    val __obj = js.Dynamic.literal()
    if (hourText != null) __obj.updateDynamic("hourText")(hourText)
    if (!js.isUndefined(isPm)) __obj.updateDynamic("isPm")(isPm)
    if (millisecondText != null) __obj.updateDynamic("millisecondText")(millisecondText)
    if (minuteText != null) __obj.updateDynamic("minuteText")(minuteText)
    if (secondText != null) __obj.updateDynamic("secondText")(secondText)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ITimePickerState]
  }
}

