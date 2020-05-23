package typings.baseui.datepickerMod

import typings.baseui.anon.BeginDate
import typings.baseui.anon.DateDate
import typings.baseui.anon.DateEvent
import typings.baseui.baseuiStrings.horizontal
import typings.baseui.baseuiStrings.vertical
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarProps extends js.Object {
  var autoFocusCalendar: js.UndefOr[Boolean] = js.undefined
  var excludeDates: js.UndefOr[js.Array[Date]] = js.undefined
  var filterDate: js.UndefOr[js.Function1[/* day */ Date, Boolean]] = js.undefined
  var highlightedDate: js.UndefOr[Date] = js.undefined
  var includeDates: js.UndefOr[js.Array[Date]] = js.undefined
  // see https://github.com/date-fns/date-fns/blob/master/src/locale/index.js.flow
  var locale: js.UndefOr[js.Any] = js.undefined
  var maxDate: js.UndefOr[Date] = js.undefined
  var minDate: js.UndefOr[Date] = js.undefined
  var monthsShown: js.UndefOr[Double] = js.undefined
  var onChange: js.UndefOr[typings.baseui.datepickerMod.onChange] = js.undefined
  var onDayClick: js.UndefOr[js.Function1[/* args */ DateEvent, _]] = js.undefined
  var onDayMouseLeave: js.UndefOr[js.Function1[/* args */ DateEvent, _]] = js.undefined
  var onDayMouseOver: js.UndefOr[js.Function1[/* args */ DateEvent, _]] = js.undefined
  var onMonthChange: js.UndefOr[js.Function1[/* args */ DateDate, _]] = js.undefined
  var onYearChange: js.UndefOr[js.Function1[/* args */ DateDate, _]] = js.undefined
  var orientation: js.UndefOr[horizontal | vertical] = js.undefined
  var overrides: js.UndefOr[DatepickerOverrides[SharedStylePropsT]] = js.undefined
  var peekNextMonth: js.UndefOr[Boolean] = js.undefined
  var quickSelect: js.UndefOr[Boolean] = js.undefined
  var quickSelectOptions: js.UndefOr[js.Array[BeginDate]] = js.undefined
  var range: js.UndefOr[Boolean] = js.undefined
  var timeSelectEnd: js.UndefOr[Boolean] = js.undefined
  var timeSelectStart: js.UndefOr[Boolean] = js.undefined
  var trapTabbing: js.UndefOr[Boolean] = js.undefined
  var value: js.UndefOr[Date | js.Array[Date] | Null] = js.undefined
}

object CalendarProps {
  @scala.inline
  def apply(
    autoFocusCalendar: js.UndefOr[Boolean] = js.undefined,
    excludeDates: js.Array[Date] = null,
    filterDate: /* day */ Date => Boolean = null,
    highlightedDate: Date = null,
    includeDates: js.Array[Date] = null,
    locale: js.Any = null,
    maxDate: Date = null,
    minDate: Date = null,
    monthsShown: js.UndefOr[Double] = js.undefined,
    onChange: /* args */ typings.baseui.anon.Date => js.Any = null,
    onDayClick: /* args */ DateEvent => _ = null,
    onDayMouseLeave: /* args */ DateEvent => _ = null,
    onDayMouseOver: /* args */ DateEvent => _ = null,
    onMonthChange: /* args */ DateDate => _ = null,
    onYearChange: /* args */ DateDate => _ = null,
    orientation: horizontal | vertical = null,
    overrides: DatepickerOverrides[SharedStylePropsT] = null,
    peekNextMonth: js.UndefOr[Boolean] = js.undefined,
    quickSelect: js.UndefOr[Boolean] = js.undefined,
    quickSelectOptions: js.Array[BeginDate] = null,
    range: js.UndefOr[Boolean] = js.undefined,
    timeSelectEnd: js.UndefOr[Boolean] = js.undefined,
    timeSelectStart: js.UndefOr[Boolean] = js.undefined,
    trapTabbing: js.UndefOr[Boolean] = js.undefined,
    value: js.UndefOr[Null | Date | js.Array[Date]] = js.undefined
  ): CalendarProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFocusCalendar)) __obj.updateDynamic("autoFocusCalendar")(autoFocusCalendar.get.asInstanceOf[js.Any])
    if (excludeDates != null) __obj.updateDynamic("excludeDates")(excludeDates.asInstanceOf[js.Any])
    if (filterDate != null) __obj.updateDynamic("filterDate")(js.Any.fromFunction1(filterDate))
    if (highlightedDate != null) __obj.updateDynamic("highlightedDate")(highlightedDate.asInstanceOf[js.Any])
    if (includeDates != null) __obj.updateDynamic("includeDates")(includeDates.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (!js.isUndefined(monthsShown)) __obj.updateDynamic("monthsShown")(monthsShown.get.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onDayClick != null) __obj.updateDynamic("onDayClick")(js.Any.fromFunction1(onDayClick))
    if (onDayMouseLeave != null) __obj.updateDynamic("onDayMouseLeave")(js.Any.fromFunction1(onDayMouseLeave))
    if (onDayMouseOver != null) __obj.updateDynamic("onDayMouseOver")(js.Any.fromFunction1(onDayMouseOver))
    if (onMonthChange != null) __obj.updateDynamic("onMonthChange")(js.Any.fromFunction1(onMonthChange))
    if (onYearChange != null) __obj.updateDynamic("onYearChange")(js.Any.fromFunction1(onYearChange))
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(peekNextMonth)) __obj.updateDynamic("peekNextMonth")(peekNextMonth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(quickSelect)) __obj.updateDynamic("quickSelect")(quickSelect.get.asInstanceOf[js.Any])
    if (quickSelectOptions != null) __obj.updateDynamic("quickSelectOptions")(quickSelectOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(range)) __obj.updateDynamic("range")(range.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeSelectEnd)) __obj.updateDynamic("timeSelectEnd")(timeSelectEnd.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeSelectStart)) __obj.updateDynamic("timeSelectStart")(timeSelectStart.get.asInstanceOf[js.Any])
    if (!js.isUndefined(trapTabbing)) __obj.updateDynamic("trapTabbing")(trapTabbing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarProps]
  }
}

