package typings.bootstrapDatepicker

import typings.bootstrapDatepicker.bootstrapDatepickerStrings.linked
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
  var beforeShowMonth: js.UndefOr[
    js.Function1[/* date */ Date, js.UndefOr[String | Boolean | DatepickerBeforeShowResponse]]
  ] = js.undefined
  var beforeShowYear: js.UndefOr[
    js.Function1[/* date */ Date, js.UndefOr[String | Boolean | DatepickerBeforeShowResponse]]
  ] = js.undefined
  var calendarWeeks: js.UndefOr[Boolean] = js.undefined
  var clearBtn: js.UndefOr[Boolean] = js.undefined
  var container: js.UndefOr[String] = js.undefined
  var datesDisabled: js.UndefOr[String | js.Array[String]] = js.undefined
  var daysOfWeekDisabled: js.UndefOr[String | js.Array[Double]] = js.undefined
  var daysOfWeekHighlighted: js.UndefOr[String | js.Array[Double]] = js.undefined
  var defaultViewDate: js.UndefOr[Date | String | DatepickerViewDate] = js.undefined
  var enableOnReadonly: js.UndefOr[Boolean] = js.undefined
  var endDate: js.UndefOr[Date | String] = js.undefined
  var forceParse: js.UndefOr[Boolean] = js.undefined
  var format: js.UndefOr[String | DatepickerCustomFormatOptions] = js.undefined
  var immediateUpdates: js.UndefOr[Boolean] = js.undefined
  var inputs: js.UndefOr[js.Array[_]] = js.undefined
  var keepEmptyValues: js.UndefOr[Boolean] = js.undefined
  var keyboardNavigation: js.UndefOr[Boolean] = js.undefined
  var language: js.UndefOr[String] = js.undefined
  var maxViewMode: js.UndefOr[DatepickerViewModes] = js.undefined
  var minViewMode: js.UndefOr[DatepickerViewModes] = js.undefined
  var multidate: js.UndefOr[Boolean | Double] = js.undefined
  var multidateSeparator: js.UndefOr[String] = js.undefined
  var orientation: js.UndefOr[DatepickerOrientations] = js.undefined
  var showOnFocus: js.UndefOr[Boolean] = js.undefined
  var showWeekDays: js.UndefOr[Boolean] = js.undefined
  var startDate: js.UndefOr[Date | String] = js.undefined
  var startView: js.UndefOr[DatepickerViewModes] = js.undefined
  var templates: js.UndefOr[js.Any] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var todayBtn: js.UndefOr[Boolean | linked] = js.undefined
  var todayHighlight: js.UndefOr[Boolean] = js.undefined
  var updateViewDate: js.UndefOr[Boolean] = js.undefined
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
    beforeShowMonth: /* date */ Date => js.UndefOr[String | Boolean | DatepickerBeforeShowResponse] = null,
    beforeShowYear: /* date */ Date => js.UndefOr[String | Boolean | DatepickerBeforeShowResponse] = null,
    calendarWeeks: js.UndefOr[Boolean] = js.undefined,
    clearBtn: js.UndefOr[Boolean] = js.undefined,
    container: String = null,
    datesDisabled: String | js.Array[String] = null,
    daysOfWeekDisabled: String | js.Array[Double] = null,
    daysOfWeekHighlighted: String | js.Array[Double] = null,
    defaultViewDate: Date | String | DatepickerViewDate = null,
    enableOnReadonly: js.UndefOr[Boolean] = js.undefined,
    endDate: Date | String = null,
    forceParse: js.UndefOr[Boolean] = js.undefined,
    format: String | DatepickerCustomFormatOptions = null,
    immediateUpdates: js.UndefOr[Boolean] = js.undefined,
    inputs: js.Array[_] = null,
    keepEmptyValues: js.UndefOr[Boolean] = js.undefined,
    keyboardNavigation: js.UndefOr[Boolean] = js.undefined,
    language: String = null,
    maxViewMode: DatepickerViewModes = null,
    minViewMode: DatepickerViewModes = null,
    multidate: Boolean | Double = null,
    multidateSeparator: String = null,
    orientation: DatepickerOrientations = null,
    showOnFocus: js.UndefOr[Boolean] = js.undefined,
    showWeekDays: js.UndefOr[Boolean] = js.undefined,
    startDate: Date | String = null,
    startView: DatepickerViewModes = null,
    templates: js.Any = null,
    title: String = null,
    todayBtn: Boolean | linked = null,
    todayHighlight: js.UndefOr[Boolean] = js.undefined,
    updateViewDate: js.UndefOr[Boolean] = js.undefined,
    weekStart: js.UndefOr[Double] = js.undefined,
    zIndexOffset: js.UndefOr[Double] = js.undefined
  ): DatepickerOptions = {
    val __obj = js.Dynamic.literal()
    if (assumeNearbyYear != null) __obj.updateDynamic("assumeNearbyYear")(assumeNearbyYear.asInstanceOf[js.Any])
    if (!js.isUndefined(autoclose)) __obj.updateDynamic("autoclose")(autoclose.get.asInstanceOf[js.Any])
    if (beforeShowCentury != null) __obj.updateDynamic("beforeShowCentury")(js.Any.fromFunction1(beforeShowCentury))
    if (beforeShowDay != null) __obj.updateDynamic("beforeShowDay")(js.Any.fromFunction1(beforeShowDay))
    if (beforeShowDecade != null) __obj.updateDynamic("beforeShowDecade")(js.Any.fromFunction1(beforeShowDecade))
    if (beforeShowMonth != null) __obj.updateDynamic("beforeShowMonth")(js.Any.fromFunction1(beforeShowMonth))
    if (beforeShowYear != null) __obj.updateDynamic("beforeShowYear")(js.Any.fromFunction1(beforeShowYear))
    if (!js.isUndefined(calendarWeeks)) __obj.updateDynamic("calendarWeeks")(calendarWeeks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(clearBtn)) __obj.updateDynamic("clearBtn")(clearBtn.get.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (datesDisabled != null) __obj.updateDynamic("datesDisabled")(datesDisabled.asInstanceOf[js.Any])
    if (daysOfWeekDisabled != null) __obj.updateDynamic("daysOfWeekDisabled")(daysOfWeekDisabled.asInstanceOf[js.Any])
    if (daysOfWeekHighlighted != null) __obj.updateDynamic("daysOfWeekHighlighted")(daysOfWeekHighlighted.asInstanceOf[js.Any])
    if (defaultViewDate != null) __obj.updateDynamic("defaultViewDate")(defaultViewDate.asInstanceOf[js.Any])
    if (!js.isUndefined(enableOnReadonly)) __obj.updateDynamic("enableOnReadonly")(enableOnReadonly.get.asInstanceOf[js.Any])
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (!js.isUndefined(forceParse)) __obj.updateDynamic("forceParse")(forceParse.get.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(immediateUpdates)) __obj.updateDynamic("immediateUpdates")(immediateUpdates.get.asInstanceOf[js.Any])
    if (inputs != null) __obj.updateDynamic("inputs")(inputs.asInstanceOf[js.Any])
    if (!js.isUndefined(keepEmptyValues)) __obj.updateDynamic("keepEmptyValues")(keepEmptyValues.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboardNavigation)) __obj.updateDynamic("keyboardNavigation")(keyboardNavigation.get.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (maxViewMode != null) __obj.updateDynamic("maxViewMode")(maxViewMode.asInstanceOf[js.Any])
    if (minViewMode != null) __obj.updateDynamic("minViewMode")(minViewMode.asInstanceOf[js.Any])
    if (multidate != null) __obj.updateDynamic("multidate")(multidate.asInstanceOf[js.Any])
    if (multidateSeparator != null) __obj.updateDynamic("multidateSeparator")(multidateSeparator.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (!js.isUndefined(showOnFocus)) __obj.updateDynamic("showOnFocus")(showOnFocus.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showWeekDays)) __obj.updateDynamic("showWeekDays")(showWeekDays.get.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    if (startView != null) __obj.updateDynamic("startView")(startView.asInstanceOf[js.Any])
    if (templates != null) __obj.updateDynamic("templates")(templates.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (todayBtn != null) __obj.updateDynamic("todayBtn")(todayBtn.asInstanceOf[js.Any])
    if (!js.isUndefined(todayHighlight)) __obj.updateDynamic("todayHighlight")(todayHighlight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(updateViewDate)) __obj.updateDynamic("updateViewDate")(updateViewDate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(weekStart)) __obj.updateDynamic("weekStart")(weekStart.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndexOffset)) __obj.updateDynamic("zIndexOffset")(zIndexOffset.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatepickerOptions]
  }
}

