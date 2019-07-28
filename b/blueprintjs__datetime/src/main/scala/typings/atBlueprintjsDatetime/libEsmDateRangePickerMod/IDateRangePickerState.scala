package typings.atBlueprintjsDatetime.libEsmDateRangePickerMod

import typings.atBlueprintjsDatetime.libEsmCommonDateUtilsMod.DateRange
import typings.atBlueprintjsDatetime.libEsmCommonMonthAndYearMod.MonthAndYear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDateRangePickerState extends js.Object {
  var hoverValue: js.UndefOr[DateRange] = js.undefined
  var leftView: js.UndefOr[MonthAndYear] = js.undefined
  var rightView: js.UndefOr[MonthAndYear] = js.undefined
  var time: js.UndefOr[DateRange] = js.undefined
  var value: js.UndefOr[DateRange] = js.undefined
}

object IDateRangePickerState {
  @scala.inline
  def apply(
    hoverValue: DateRange = null,
    leftView: MonthAndYear = null,
    rightView: MonthAndYear = null,
    time: DateRange = null,
    value: DateRange = null
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

