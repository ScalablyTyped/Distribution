package typings
package atBlueprintjsDatetimeLib.libEsmDateRangePickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDateRangePickerState extends js.Object {
  var hoverValue: js.UndefOr[atBlueprintjsDatetimeLib.libEsmCommonDateUtilsMod.DateRange] = js.undefined
  var leftView: js.UndefOr[atBlueprintjsDatetimeLib.libEsmCommonMonthAndYearMod.MonthAndYear] = js.undefined
  var rightView: js.UndefOr[atBlueprintjsDatetimeLib.libEsmCommonMonthAndYearMod.MonthAndYear] = js.undefined
  var time: js.UndefOr[atBlueprintjsDatetimeLib.libEsmCommonDateUtilsMod.DateRange] = js.undefined
  var value: js.UndefOr[atBlueprintjsDatetimeLib.libEsmCommonDateUtilsMod.DateRange] = js.undefined
}

object IDateRangePickerState {
  @scala.inline
  def apply(
    hoverValue: atBlueprintjsDatetimeLib.libEsmCommonDateUtilsMod.DateRange = null,
    leftView: atBlueprintjsDatetimeLib.libEsmCommonMonthAndYearMod.MonthAndYear = null,
    rightView: atBlueprintjsDatetimeLib.libEsmCommonMonthAndYearMod.MonthAndYear = null,
    time: atBlueprintjsDatetimeLib.libEsmCommonDateUtilsMod.DateRange = null,
    value: atBlueprintjsDatetimeLib.libEsmCommonDateUtilsMod.DateRange = null
  ): IDateRangePickerState = {
    val __obj = js.Dynamic.literal()
    if (hoverValue != null) __obj.updateDynamic("hoverValue")(hoverValue)
    if (leftView != null) __obj.updateDynamic("leftView")(leftView)
    if (rightView != null) __obj.updateDynamic("rightView")(rightView)
    if (time != null) __obj.updateDynamic("time")(time)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[IDateRangePickerState]
  }
}

