package typings.bootstrapDashDatepicker

import typings.bootstrapDashDatepicker.bootstrapDashDatepickerStrings.linked
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * All options that take a “Date” can handle a Date object; a String
  * formatted according to the given format; or a timedelta relative
  * to today, eg “-1d”, “+6m +1y”, etc, where valid units are “d” (day),
  * “w” (week), “m” (month), and “y” (year).
  *
  * See online docs for more info:
  *  https://bootstrap-datepicker.readthedocs.io/en/latest/options.html
  */
trait DatepickerOptions extends js.Object {
  var assumeNearbyYear: js.UndefOr[Boolean | Double] = js.undefined
  var autoclose: js.UndefOr[Boolean] = js.undefined
  var beforeShowCentury: js.UndefOr[
    js.Function1[/* date */ Date, js.UndefOr[String | Boolean | DatepickerBeforeShowResponse]]
  ] = js.undefined
  var beforeShowDay: js.UndefOr[
    js.Function1[/* date */ Date, js.UndefOr[String | Boolean | DatepickerBeforeShowDayResponse]]
  ] = js.undefined
  var beforeShowDecade: js.UndefOr[
    js.Function1[/* date */ Date, js.UndefOr[String | Boolean | DatepickerBeforeShowResponse]]
  ] = js.undefined
  var beforeShowYear: js.UndefOr[
    js.Function1[/* date */ Date, js.UndefOr[String | Boolean | DatepickerBeforeShowResponse]]
  ] = js.undefined
  var calendarWeeks: js.UndefOr[Boolean] = js.undefined
  var clearBtn: js.UndefOr[Boolean] = js.undefined
  var container: js.UndefOr[String] = js.undefined
  var datesDisabled: js.UndefOr[String | js.Array[String]] = js.undefined
  var daysOfWeekDisabled: js.UndefOr[js.Array[Double]] = js.undefined
  var daysOfWeekHighlighted: js.UndefOr[String | js.Array[Double]] = js.undefined
  var defaultViewDate: js.UndefOr[Date | String | DatepickerViewDate] = js.undefined
  var enableOnReadonly: js.UndefOr[Boolean] = js.undefined
  var endDate: js.UndefOr[Date | String] = js.undefined
  var forceParse: js.UndefOr[Boolean] = js.undefined
  var format: js.UndefOr[String | DatepickerCustomFormatOptions] = js.undefined
  var immediateUpdates: js.UndefOr[Boolean] = js.undefined
  var inputs: js.UndefOr[js.Array[_]] = js.undefined
  var keyboardNavigation: js.UndefOr[Boolean] = js.undefined
  var language: js.UndefOr[String] = js.undefined
  var maxViewMode: js.UndefOr[DatepickerViewModes] = js.undefined
  var minViewMode: js.UndefOr[DatepickerViewModes] = js.undefined
  var multidate: js.UndefOr[Boolean | Double] = js.undefined
  var multidateSeparator: js.UndefOr[String] = js.undefined
  var orientation: js.UndefOr[DatepickerOrientations] = js.undefined
  var showOnFocus: js.UndefOr[Boolean] = js.undefined
  var startDate: js.UndefOr[Date | String] = js.undefined
  var startView: js.UndefOr[Double] = js.undefined
  var templates: js.UndefOr[js.Any] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var todayBtn: js.UndefOr[Boolean | linked] = js.undefined
  var todayHighlight: js.UndefOr[Boolean] = js.undefined
  var updateViewDate: js.UndefOr[Boolean] = js.undefined
  var viewMode: js.UndefOr[String] = js.undefined
  var weekStart: js.UndefOr[Double] = js.undefined
  var zIndexOffset: js.UndefOr[Double] = js.undefined
}

object DatepickerOptions {
  @scala.inline
  def apply(
    assumeNearbyYear: Boolean | Double = null,
    autoclose: js.UndefOr[Boolean] = js.undefined,
    beforeShowCentury: /* date */ Date => js.UndefOr[String | Boolean | DatepickerBeforeShowResponse] = null,
    beforeShowDay: /* date */ Date => js.UndefOr[String | Boolean | DatepickerBeforeShowDayResponse] = null,
    beforeShowDecade: /* date */ Date => js.UndefOr[String | Boolean | DatepickerBeforeShowResponse] = null,
    beforeShowYear: /* date */ Date => js.UndefOr[String | Boolean | DatepickerBeforeShowResponse] = null,
    calendarWeeks: js.UndefOr[Boolean] = js.undefined,
    clearBtn: js.UndefOr[Boolean] = js.undefined,
    container: String = null,
    datesDisabled: String | js.Array[String] = null,
    daysOfWeekDisabled: js.Array[Double] = null,
    daysOfWeekHighlighted: String | js.Array[Double] = null,
    defaultViewDate: Date | String | DatepickerViewDate = null,
    enableOnReadonly: js.UndefOr[Boolean] = js.undefined,
    endDate: Date | String = null,
    forceParse: js.UndefOr[Boolean] = js.undefined,
    format: String | DatepickerCustomFormatOptions = null,
    immediateUpdates: js.UndefOr[Boolean] = js.undefined,
    inputs: js.Array[_] = null,
    keyboardNavigation: js.UndefOr[Boolean] = js.undefined,
    language: String = null,
    maxViewMode: DatepickerViewModes = null,
    minViewMode: DatepickerViewModes = null,
    multidate: Boolean | Double = null,
    multidateSeparator: String = null,
    orientation: DatepickerOrientations = null,
    showOnFocus: js.UndefOr[Boolean] = js.undefined,
    startDate: Date | String = null,
    startView: Int | Double = null,
    templates: js.Any = null,
    title: String = null,
    todayBtn: Boolean | linked = null,
    todayHighlight: js.UndefOr[Boolean] = js.undefined,
    updateViewDate: js.UndefOr[Boolean] = js.undefined,
    viewMode: String = null,
    weekStart: Int | Double = null,
    zIndexOffset: Int | Double = null
  ): DatepickerOptions = {
    val __obj = js.Dynamic.literal()
    if (assumeNearbyYear != null) __obj.updateDynamic("assumeNearbyYear")(assumeNearbyYear.asInstanceOf[js.Any])
    if (!js.isUndefined(autoclose)) __obj.updateDynamic("autoclose")(autoclose)
    if (beforeShowCentury != null) __obj.updateDynamic("beforeShowCentury")(js.Any.fromFunction1(beforeShowCentury))
    if (beforeShowDay != null) __obj.updateDynamic("beforeShowDay")(js.Any.fromFunction1(beforeShowDay))
    if (beforeShowDecade != null) __obj.updateDynamic("beforeShowDecade")(js.Any.fromFunction1(beforeShowDecade))
    if (beforeShowYear != null) __obj.updateDynamic("beforeShowYear")(js.Any.fromFunction1(beforeShowYear))
    if (!js.isUndefined(calendarWeeks)) __obj.updateDynamic("calendarWeeks")(calendarWeeks)
    if (!js.isUndefined(clearBtn)) __obj.updateDynamic("clearBtn")(clearBtn)
    if (container != null) __obj.updateDynamic("container")(container)
    if (datesDisabled != null) __obj.updateDynamic("datesDisabled")(datesDisabled.asInstanceOf[js.Any])
    if (daysOfWeekDisabled != null) __obj.updateDynamic("daysOfWeekDisabled")(daysOfWeekDisabled)
    if (daysOfWeekHighlighted != null) __obj.updateDynamic("daysOfWeekHighlighted")(daysOfWeekHighlighted.asInstanceOf[js.Any])
    if (defaultViewDate != null) __obj.updateDynamic("defaultViewDate")(defaultViewDate.asInstanceOf[js.Any])
    if (!js.isUndefined(enableOnReadonly)) __obj.updateDynamic("enableOnReadonly")(enableOnReadonly)
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (!js.isUndefined(forceParse)) __obj.updateDynamic("forceParse")(forceParse)
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(immediateUpdates)) __obj.updateDynamic("immediateUpdates")(immediateUpdates)
    if (inputs != null) __obj.updateDynamic("inputs")(inputs)
    if (!js.isUndefined(keyboardNavigation)) __obj.updateDynamic("keyboardNavigation")(keyboardNavigation)
    if (language != null) __obj.updateDynamic("language")(language)
    if (maxViewMode != null) __obj.updateDynamic("maxViewMode")(maxViewMode)
    if (minViewMode != null) __obj.updateDynamic("minViewMode")(minViewMode)
    if (multidate != null) __obj.updateDynamic("multidate")(multidate.asInstanceOf[js.Any])
    if (multidateSeparator != null) __obj.updateDynamic("multidateSeparator")(multidateSeparator)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation)
    if (!js.isUndefined(showOnFocus)) __obj.updateDynamic("showOnFocus")(showOnFocus)
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    if (startView != null) __obj.updateDynamic("startView")(startView.asInstanceOf[js.Any])
    if (templates != null) __obj.updateDynamic("templates")(templates)
    if (title != null) __obj.updateDynamic("title")(title)
    if (todayBtn != null) __obj.updateDynamic("todayBtn")(todayBtn.asInstanceOf[js.Any])
    if (!js.isUndefined(todayHighlight)) __obj.updateDynamic("todayHighlight")(todayHighlight)
    if (!js.isUndefined(updateViewDate)) __obj.updateDynamic("updateViewDate")(updateViewDate)
    if (viewMode != null) __obj.updateDynamic("viewMode")(viewMode)
    if (weekStart != null) __obj.updateDynamic("weekStart")(weekStart.asInstanceOf[js.Any])
    if (zIndexOffset != null) __obj.updateDynamic("zIndexOffset")(zIndexOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatepickerOptions]
  }
}

