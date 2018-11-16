package typings
package daterangepickerLib.daterangepickerMod.daterangepickerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options extends js.Object {
  /**
           * Normally, if you use the `ranges` option to specify pre-defined date ranges, calendars
           * for choosing a custom date range are not shown until the user clicks "Custom Range".
           * When this option is set to true, the calendars for choosing a custom date range are always shown instead.
           */
  var alwaysShowCalendars: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * CSS class string that will be added to the apply button
           */
  var applyButtonClasses: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Hide the apply and cancel buttons, and automatically apply a new date range as soon as two dates or a predefined range is selected.
           */
  var autoApply: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Indicates whether the date range picker should automatically update the value of an < input > element it's attached to at initialization and when the selected dates change.
           */
  var autoUpdateInput: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * CSS class names that will be added to all buttons in the picker
           */
  var buttonClasses: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
           * CSS class string that will be added to the cancel button
           */
  var cancelButtonClasses: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Whether the picker appears below (default) or above the HTML element it's attached to
           */
  var drops: js.UndefOr[
    daterangepickerLib.daterangepickerLibStrings.down | daterangepickerLib.daterangepickerLibStrings.up
  ] = js.undefined
  /**
           * The end of the initially selected date range
           */
  var endDate: js.UndefOr[DateOrString] = js.undefined
  /**
           * A function that is passed each date in the two calendars before they are displayed, and may return a string or array of CSS class names to apply to that date's calendar cell.
           */
  var isCustomDate: js.UndefOr[
    js.Function1[/* date */ DateOrString, js.UndefOr[java.lang.String | js.Array[java.lang.String]]]
  ] = js.undefined
  /**
           * A function that is passed each date in the two calendars before they are displayed, and may return true or false to indicate whether that date should be available for selection or not.
           */
  var isInvalidDate: js.UndefOr[
    js.Function2[/* startDate */ DateOrString, /* endDate */ js.UndefOr[DateOrString], scala.Boolean]
  ] = js.undefined
  /**
           * When enabled, the two calendars displayed will always be for two sequential months (i.e.
           * January and February), and both will be advanced when clicking the left or right arrows
           * above the calendars.When disabled, the two calendars can be individually advanced and
           * display any month/ year.
           */
  var linkedCalendars: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Allows you to provide localized strings for buttons and labels, customize the date display format, and change the first day of week for the calendars.
           */
  var locale: js.UndefOr[Locale] = js.undefined
  /**
           * The latest date a user may select
           */
  var maxDate: js.UndefOr[DateOrString] = js.undefined
  /**
           * The maximum span between the selected start and end dates. Can have any property you can add to a moment object (i.e. days, months)
           */
  var maxSpan: js.UndefOr[momentLib.momentMod.momentNs.MomentInput | momentLib.momentMod.momentNs.Duration] = js.undefined
  /**
           * The maximum year shown in the dropdowns when `showDropdowns` is set to true.
           */
  var maxYear: js.UndefOr[scala.Double] = js.undefined
  /**
           * The earliest date a user may select
           */
  var minDate: js.UndefOr[DateOrString] = js.undefined
  /**
           * The minimum year shown in the dropdowns when `showDropdowns` is set to true.
           */
  var minYear: js.UndefOr[scala.Double] = js.undefined
  /**
           * Whether the picker appears aligned to the left, to the right, or centered under the HTML element it's attached to
           */
  var opens: js.UndefOr[
    daterangepickerLib.daterangepickerLibStrings.left | daterangepickerLib.daterangepickerLibStrings.right | daterangepickerLib.daterangepickerLibStrings.center
  ] = js.undefined
  /**
           * jQuery selector of the parent element that the date range picker will be added to, if not provided this will be 'body'
           */
  var parentEl: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Set predefined date ranges the user can select from.Each key is the label for the range, and its value an array with two dates representing the bounds of the range.
           */
  var ranges: js.UndefOr[ScalablyTyped.runtime.StringDictionary[js.Tuple2[DateOrString, DateOrString]]] = js.undefined
  /**
           * Whether to show the 'Custom Range' label or just pre-defined ranges
           */
  var showCustomRangeLabel: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Show year and month select boxes above calendars to jump to a specific month and year
           */
  var showDropdowns: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Show ISO week numbers at the start of each week on the calendars
           */
  var showISOWeekNumbers: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Show localized week numbers at the start of each week on the calendars
           */
  var showWeekNumbers: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Show only a single calendar to choose one date, instead of a range picker with two calendars; the start and end dates provided to your callback will be the same single date chosen.
           */
  var singleDatePicker: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * The start of the initially selected date range
           */
  var startDate: js.UndefOr[DateOrString] = js.undefined
  /**
           * Allow selection of dates with times, not just dates
           */
  var timePicker: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Use 24- hour instead of 12- hour times, removing the AM/ PM selection.
           */
  var timePicker24Hour: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Increment of the minutes selection list for times (i.e. 30 to allow only selection of times ending in 0 or 30)
           */
  var timePickerIncrement: js.UndefOr[scala.Double] = js.undefined
  /**
           * Show seconds in the timePicker.
           */
  var timePickerSeconds: js.UndefOr[scala.Boolean] = js.undefined
}

