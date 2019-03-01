package typings
package bootstrapDashDatepickerLib

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
  var assumeNearbyYear: js.UndefOr[scala.Boolean | scala.Double] = js.undefined
  var autoclose: js.UndefOr[scala.Boolean] = js.undefined
  var beforeShowCentury: js.UndefOr[
    js.Function1[
      /* date */ stdLib.Date, 
      js.UndefOr[java.lang.String | scala.Boolean | DatepickerBeforeShowResponse]
    ]
  ] = js.undefined
  var beforeShowDay: js.UndefOr[
    js.Function1[
      /* date */ stdLib.Date, 
      js.UndefOr[java.lang.String | scala.Boolean | DatepickerBeforeShowDayResponse]
    ]
  ] = js.undefined
  var beforeShowDecade: js.UndefOr[
    js.Function1[
      /* date */ stdLib.Date, 
      js.UndefOr[java.lang.String | scala.Boolean | DatepickerBeforeShowResponse]
    ]
  ] = js.undefined
  var beforeShowYear: js.UndefOr[
    js.Function1[
      /* date */ stdLib.Date, 
      js.UndefOr[java.lang.String | scala.Boolean | DatepickerBeforeShowResponse]
    ]
  ] = js.undefined
  var calendarWeeks: js.UndefOr[scala.Boolean] = js.undefined
  var clearBtn: js.UndefOr[scala.Boolean] = js.undefined
  var container: js.UndefOr[java.lang.String] = js.undefined
  var datesDisabled: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var daysOfWeekDisabled: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var daysOfWeekHighlighted: js.UndefOr[java.lang.String | js.Array[scala.Double]] = js.undefined
  var defaultViewDate: js.UndefOr[stdLib.Date | java.lang.String | DatepickerViewDate] = js.undefined
  var enableOnReadonly: js.UndefOr[scala.Boolean] = js.undefined
  var endDate: js.UndefOr[stdLib.Date | java.lang.String] = js.undefined
  var forceParse: js.UndefOr[scala.Boolean] = js.undefined
  var format: js.UndefOr[java.lang.String | DatepickerCustomFormatOptions] = js.undefined
  var immediateUpdates: js.UndefOr[scala.Boolean] = js.undefined
  var inputs: js.UndefOr[js.Array[_]] = js.undefined
  var keyboardNavigation: js.UndefOr[scala.Boolean] = js.undefined
  var language: js.UndefOr[java.lang.String] = js.undefined
  var maxViewMode: js.UndefOr[DatepickerViewModes] = js.undefined
  var minViewMode: js.UndefOr[DatepickerViewModes] = js.undefined
  var multidate: js.UndefOr[scala.Boolean | scala.Double] = js.undefined
  var multidateSeparator: js.UndefOr[java.lang.String] = js.undefined
  var orientation: js.UndefOr[DatepickerOrientations] = js.undefined
  var showOnFocus: js.UndefOr[scala.Boolean] = js.undefined
  var startDate: js.UndefOr[stdLib.Date | java.lang.String] = js.undefined
  var startView: js.UndefOr[scala.Double] = js.undefined
  var templates: js.UndefOr[js.Any] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var todayBtn: js.UndefOr[
    scala.Boolean | bootstrapDashDatepickerLib.bootstrapDashDatepickerLibStrings.linked
  ] = js.undefined
  var todayHighlight: js.UndefOr[scala.Boolean] = js.undefined
  var updateViewDate: js.UndefOr[scala.Boolean] = js.undefined
  var viewMode: js.UndefOr[java.lang.String] = js.undefined
  var weekStart: js.UndefOr[scala.Double] = js.undefined
  var zIndexOffset: js.UndefOr[scala.Double] = js.undefined
}

object DatepickerOptions {
  @scala.inline
  def apply(
    assumeNearbyYear: scala.Boolean | scala.Double = null,
    autoclose: js.UndefOr[scala.Boolean] = js.undefined,
    beforeShowCentury: js.Function1[
      /* date */ stdLib.Date, 
      js.UndefOr[java.lang.String | scala.Boolean | DatepickerBeforeShowResponse]
    ] = null,
    beforeShowDay: js.Function1[
      /* date */ stdLib.Date, 
      js.UndefOr[java.lang.String | scala.Boolean | DatepickerBeforeShowDayResponse]
    ] = null,
    beforeShowDecade: js.Function1[
      /* date */ stdLib.Date, 
      js.UndefOr[java.lang.String | scala.Boolean | DatepickerBeforeShowResponse]
    ] = null,
    beforeShowYear: js.Function1[
      /* date */ stdLib.Date, 
      js.UndefOr[java.lang.String | scala.Boolean | DatepickerBeforeShowResponse]
    ] = null,
    calendarWeeks: js.UndefOr[scala.Boolean] = js.undefined,
    clearBtn: js.UndefOr[scala.Boolean] = js.undefined,
    container: java.lang.String = null,
    datesDisabled: java.lang.String | js.Array[java.lang.String] = null,
    daysOfWeekDisabled: js.Array[scala.Double] = null,
    daysOfWeekHighlighted: java.lang.String | js.Array[scala.Double] = null,
    defaultViewDate: stdLib.Date | java.lang.String | DatepickerViewDate = null,
    enableOnReadonly: js.UndefOr[scala.Boolean] = js.undefined,
    endDate: stdLib.Date | java.lang.String = null,
    forceParse: js.UndefOr[scala.Boolean] = js.undefined,
    format: java.lang.String | DatepickerCustomFormatOptions = null,
    immediateUpdates: js.UndefOr[scala.Boolean] = js.undefined,
    inputs: js.Array[_] = null,
    keyboardNavigation: js.UndefOr[scala.Boolean] = js.undefined,
    language: java.lang.String = null,
    maxViewMode: DatepickerViewModes = null,
    minViewMode: DatepickerViewModes = null,
    multidate: scala.Boolean | scala.Double = null,
    multidateSeparator: java.lang.String = null,
    orientation: DatepickerOrientations = null,
    showOnFocus: js.UndefOr[scala.Boolean] = js.undefined,
    startDate: stdLib.Date | java.lang.String = null,
    startView: scala.Int | scala.Double = null,
    templates: js.Any = null,
    title: java.lang.String = null,
    todayBtn: scala.Boolean | bootstrapDashDatepickerLib.bootstrapDashDatepickerLibStrings.linked = null,
    todayHighlight: js.UndefOr[scala.Boolean] = js.undefined,
    updateViewDate: js.UndefOr[scala.Boolean] = js.undefined,
    viewMode: java.lang.String = null,
    weekStart: scala.Int | scala.Double = null,
    zIndexOffset: scala.Int | scala.Double = null
  ): DatepickerOptions = {
    val __obj = js.Dynamic.literal()
    if (assumeNearbyYear != null) __obj.updateDynamic("assumeNearbyYear")(assumeNearbyYear.asInstanceOf[js.Any])
    if (!js.isUndefined(autoclose)) __obj.updateDynamic("autoclose")(autoclose)
    if (beforeShowCentury != null) __obj.updateDynamic("beforeShowCentury")(beforeShowCentury)
    if (beforeShowDay != null) __obj.updateDynamic("beforeShowDay")(beforeShowDay)
    if (beforeShowDecade != null) __obj.updateDynamic("beforeShowDecade")(beforeShowDecade)
    if (beforeShowYear != null) __obj.updateDynamic("beforeShowYear")(beforeShowYear)
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

