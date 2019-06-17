package typings
package baseuiLib.datepickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarProps extends js.Object {
  var autoFocusCalendar: js.UndefOr[scala.Boolean] = js.undefined
  var excludeDates: js.UndefOr[js.Array[stdLib.Date]] = js.undefined
  var filterDate: js.UndefOr[js.Function1[/* day */ stdLib.Date, scala.Boolean]] = js.undefined
  var highlightedDate: js.UndefOr[stdLib.Date] = js.undefined
  var includeDates: js.UndefOr[js.Array[stdLib.Date]] = js.undefined
  // see https://github.com/date-fns/date-fns/blob/master/src/locale/index.js.flow
  var locale: js.UndefOr[js.Any] = js.undefined
  var maxDate: js.UndefOr[stdLib.Date] = js.undefined
  var minDate: js.UndefOr[stdLib.Date] = js.undefined
  var monthsShown: js.UndefOr[scala.Double] = js.undefined
  var onChange: js.UndefOr[onChange] = js.undefined
  var onDayClick: js.UndefOr[js.Function1[/* args */ baseuiLib.Anon_DateEvent, _]] = js.undefined
  var onDayMouseLeave: js.UndefOr[js.Function1[/* args */ baseuiLib.Anon_DateEvent, _]] = js.undefined
  var onDayMouseOver: js.UndefOr[js.Function1[/* args */ baseuiLib.Anon_DateEvent, _]] = js.undefined
  var onMonthChange: js.UndefOr[js.Function1[/* args */ baseuiLib.Anon_Date_1680226493, _]] = js.undefined
  var onYearChange: js.UndefOr[js.Function1[/* args */ baseuiLib.Anon_Date_1680226493, _]] = js.undefined
  var overrides: js.UndefOr[DatepickerOverrides[js.Object]] = js.undefined
  var peekNextMonth: js.UndefOr[scala.Boolean] = js.undefined
  var quickSelect: js.UndefOr[scala.Boolean] = js.undefined
  var quickSelectOptions: js.UndefOr[js.Array[baseuiLib.Anon_BeginDate]] = js.undefined
  var range: js.UndefOr[scala.Boolean] = js.undefined
  var timeSelectEnd: js.UndefOr[scala.Boolean] = js.undefined
  var timeSelectStart: js.UndefOr[scala.Boolean] = js.undefined
  var trapTabbing: js.UndefOr[scala.Boolean] = js.undefined
  var value: js.UndefOr[stdLib.Date | js.Array[stdLib.Date]] = js.undefined
}

object CalendarProps {
  @scala.inline
  def apply(
    autoFocusCalendar: js.UndefOr[scala.Boolean] = js.undefined,
    excludeDates: js.Array[stdLib.Date] = null,
    filterDate: /* day */ stdLib.Date => scala.Boolean = null,
    highlightedDate: stdLib.Date = null,
    includeDates: js.Array[stdLib.Date] = null,
    locale: js.Any = null,
    maxDate: stdLib.Date = null,
    minDate: stdLib.Date = null,
    monthsShown: scala.Int | scala.Double = null,
    onChange: onChange = null,
    onDayClick: /* args */ baseuiLib.Anon_DateEvent => _ = null,
    onDayMouseLeave: /* args */ baseuiLib.Anon_DateEvent => _ = null,
    onDayMouseOver: /* args */ baseuiLib.Anon_DateEvent => _ = null,
    onMonthChange: /* args */ baseuiLib.Anon_Date_1680226493 => _ = null,
    onYearChange: /* args */ baseuiLib.Anon_Date_1680226493 => _ = null,
    overrides: DatepickerOverrides[js.Object] = null,
    peekNextMonth: js.UndefOr[scala.Boolean] = js.undefined,
    quickSelect: js.UndefOr[scala.Boolean] = js.undefined,
    quickSelectOptions: js.Array[baseuiLib.Anon_BeginDate] = null,
    range: js.UndefOr[scala.Boolean] = js.undefined,
    timeSelectEnd: js.UndefOr[scala.Boolean] = js.undefined,
    timeSelectStart: js.UndefOr[scala.Boolean] = js.undefined,
    trapTabbing: js.UndefOr[scala.Boolean] = js.undefined,
    value: stdLib.Date | js.Array[stdLib.Date] = null
  ): CalendarProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFocusCalendar)) __obj.updateDynamic("autoFocusCalendar")(autoFocusCalendar)
    if (excludeDates != null) __obj.updateDynamic("excludeDates")(excludeDates)
    if (filterDate != null) __obj.updateDynamic("filterDate")(js.Any.fromFunction1(filterDate))
    if (highlightedDate != null) __obj.updateDynamic("highlightedDate")(highlightedDate)
    if (includeDates != null) __obj.updateDynamic("includeDates")(includeDates)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate)
    if (minDate != null) __obj.updateDynamic("minDate")(minDate)
    if (monthsShown != null) __obj.updateDynamic("monthsShown")(monthsShown.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onDayClick != null) __obj.updateDynamic("onDayClick")(js.Any.fromFunction1(onDayClick))
    if (onDayMouseLeave != null) __obj.updateDynamic("onDayMouseLeave")(js.Any.fromFunction1(onDayMouseLeave))
    if (onDayMouseOver != null) __obj.updateDynamic("onDayMouseOver")(js.Any.fromFunction1(onDayMouseOver))
    if (onMonthChange != null) __obj.updateDynamic("onMonthChange")(js.Any.fromFunction1(onMonthChange))
    if (onYearChange != null) __obj.updateDynamic("onYearChange")(js.Any.fromFunction1(onYearChange))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    if (!js.isUndefined(peekNextMonth)) __obj.updateDynamic("peekNextMonth")(peekNextMonth)
    if (!js.isUndefined(quickSelect)) __obj.updateDynamic("quickSelect")(quickSelect)
    if (quickSelectOptions != null) __obj.updateDynamic("quickSelectOptions")(quickSelectOptions)
    if (!js.isUndefined(range)) __obj.updateDynamic("range")(range)
    if (!js.isUndefined(timeSelectEnd)) __obj.updateDynamic("timeSelectEnd")(timeSelectEnd)
    if (!js.isUndefined(timeSelectStart)) __obj.updateDynamic("timeSelectStart")(timeSelectStart)
    if (!js.isUndefined(trapTabbing)) __obj.updateDynamic("trapTabbing")(trapTabbing)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarProps]
  }
}

