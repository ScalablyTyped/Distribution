package typings.blueprintjsDatetime.dateRangePickerMod

import typings.blueprintjsDatetime.dateUtilsMod.DateRange
import typings.blueprintjsDatetime.monthAndYearMod.MonthAndYear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDateRangePickerState extends js.Object {
  var hoverValue: js.UndefOr[DateRange] = js.undefined
  var leftView: js.UndefOr[MonthAndYear] = js.undefined
  var rightView: js.UndefOr[MonthAndYear] = js.undefined
  var selectedShortcutIndex: js.UndefOr[Double] = js.undefined
  var time: js.UndefOr[DateRange] = js.undefined
  var value: js.UndefOr[DateRange] = js.undefined
}

object IDateRangePickerState {
  @scala.inline
  def apply(
    hoverValue: DateRange = null,
    leftView: MonthAndYear = null,
    rightView: MonthAndYear = null,
    selectedShortcutIndex: Int | Double = null,
    time: DateRange = null,
    value: DateRange = null
  ): IDateRangePickerState = {
    val __obj = js.Dynamic.literal()
    if (hoverValue != null) __obj.updateDynamic("hoverValue")(hoverValue.asInstanceOf[js.Any])
    if (leftView != null) __obj.updateDynamic("leftView")(leftView.asInstanceOf[js.Any])
    if (rightView != null) __obj.updateDynamic("rightView")(rightView.asInstanceOf[js.Any])
    if (selectedShortcutIndex != null) __obj.updateDynamic("selectedShortcutIndex")(selectedShortcutIndex.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDateRangePickerState]
  }
}

