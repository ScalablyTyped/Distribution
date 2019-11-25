package typings.dayzed.dayzedMod

import typings.dayzed.dayzedNumbers.`0`
import typings.dayzed.dayzedNumbers.`1`
import typings.dayzed.dayzedNumbers.`2`
import typings.dayzed.dayzedNumbers.`3`
import typings.dayzed.dayzedNumbers.`4`
import typings.dayzed.dayzedNumbers.`5`
import typings.dayzed.dayzedNumbers.`6`
import typings.react.reactMod.ReactNode
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var children: js.UndefOr[RenderFn] = js.undefined
  var date: js.UndefOr[Date] = js.undefined
  var firstDayOfWeek: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6`] = js.undefined
  var maxDate: js.UndefOr[Date] = js.undefined
  var minDate: js.UndefOr[Date] = js.undefined
  var monthsToDisplay: js.UndefOr[Double] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var onOffsetChanged: js.UndefOr[js.Function1[/* offset */ Double, Unit]] = js.undefined
  var render: js.UndefOr[RenderFn] = js.undefined
  var selected: js.UndefOr[Date | js.Array[Date]] = js.undefined
  var showOutsideDays: js.UndefOr[Boolean] = js.undefined
  def onDateSelected(selectedDate: DateObj): Unit
}

object Props {
  @scala.inline
  def apply(
    onDateSelected: DateObj => Unit,
    children: /* renderProps */ RenderProps => ReactNode = null,
    date: Date = null,
    firstDayOfWeek: `0` | `1` | `2` | `3` | `4` | `5` | `6` = null,
    maxDate: Date = null,
    minDate: Date = null,
    monthsToDisplay: Int | Double = null,
    offset: Int | Double = null,
    onOffsetChanged: /* offset */ Double => Unit = null,
    render: /* renderProps */ RenderProps => ReactNode = null,
    selected: Date | js.Array[Date] = null,
    showOutsideDays: js.UndefOr[Boolean] = js.undefined
  ): Props = {
    val __obj = js.Dynamic.literal(onDateSelected = js.Any.fromFunction1(onDateSelected))
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1(children))
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (firstDayOfWeek != null) __obj.updateDynamic("firstDayOfWeek")(firstDayOfWeek.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (monthsToDisplay != null) __obj.updateDynamic("monthsToDisplay")(monthsToDisplay.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (onOffsetChanged != null) __obj.updateDynamic("onOffsetChanged")(js.Any.fromFunction1(onOffsetChanged))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (!js.isUndefined(showOutsideDays)) __obj.updateDynamic("showOutsideDays")(showOutsideDays.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

