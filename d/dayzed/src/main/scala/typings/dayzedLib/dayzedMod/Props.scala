package typings
package dayzedLib.dayzedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var children: js.UndefOr[RenderFn] = js.undefined
  var date: js.UndefOr[stdLib.Date] = js.undefined
  var firstDayOfWeek: js.UndefOr[
    dayzedLib.dayzedLibNumbers.`0` | dayzedLib.dayzedLibNumbers.`1` | dayzedLib.dayzedLibNumbers.`2` | dayzedLib.dayzedLibNumbers.`3` | dayzedLib.dayzedLibNumbers.`4` | dayzedLib.dayzedLibNumbers.`5` | dayzedLib.dayzedLibNumbers.`6`
  ] = js.undefined
  var maxDate: js.UndefOr[stdLib.Date] = js.undefined
  var minDate: js.UndefOr[stdLib.Date] = js.undefined
  var monthsToDisplay: js.UndefOr[scala.Double] = js.undefined
  var offset: js.UndefOr[scala.Double] = js.undefined
  var onOffsetChanged: js.UndefOr[js.Function1[/* offset */ scala.Double, scala.Unit]] = js.undefined
  var render: js.UndefOr[RenderFn] = js.undefined
  var selected: js.UndefOr[stdLib.Date | js.Array[stdLib.Date]] = js.undefined
  var showOutsideDays: js.UndefOr[scala.Boolean] = js.undefined
  def onDateSelected(selectedDate: DateObj): scala.Unit
}

object Props {
  @scala.inline
  def apply(
    onDateSelected: js.Function1[DateObj, scala.Unit],
    children: RenderFn = null,
    date: stdLib.Date = null,
    firstDayOfWeek: dayzedLib.dayzedLibNumbers.`0` | dayzedLib.dayzedLibNumbers.`1` | dayzedLib.dayzedLibNumbers.`2` | dayzedLib.dayzedLibNumbers.`3` | dayzedLib.dayzedLibNumbers.`4` | dayzedLib.dayzedLibNumbers.`5` | dayzedLib.dayzedLibNumbers.`6` = null,
    maxDate: stdLib.Date = null,
    minDate: stdLib.Date = null,
    monthsToDisplay: scala.Int | scala.Double = null,
    offset: scala.Int | scala.Double = null,
    onOffsetChanged: js.Function1[/* offset */ scala.Double, scala.Unit] = null,
    render: RenderFn = null,
    selected: stdLib.Date | js.Array[stdLib.Date] = null,
    showOutsideDays: js.UndefOr[scala.Boolean] = js.undefined
  ): Props = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onDateSelected")(onDateSelected)
    if (children != null) __obj.updateDynamic("children")(children)
    if (date != null) __obj.updateDynamic("date")(date)
    if (firstDayOfWeek != null) __obj.updateDynamic("firstDayOfWeek")(firstDayOfWeek.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate)
    if (minDate != null) __obj.updateDynamic("minDate")(minDate)
    if (monthsToDisplay != null) __obj.updateDynamic("monthsToDisplay")(monthsToDisplay.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (onOffsetChanged != null) __obj.updateDynamic("onOffsetChanged")(onOffsetChanged)
    if (render != null) __obj.updateDynamic("render")(render)
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (!js.isUndefined(showOutsideDays)) __obj.updateDynamic("showOutsideDays")(showOutsideDays)
    __obj.asInstanceOf[Props]
  }
}

