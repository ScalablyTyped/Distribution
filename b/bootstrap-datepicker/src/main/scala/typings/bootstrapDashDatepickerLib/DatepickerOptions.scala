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

