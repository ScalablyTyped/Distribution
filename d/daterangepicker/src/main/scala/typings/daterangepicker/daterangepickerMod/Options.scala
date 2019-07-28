package typings.daterangepicker.daterangepickerMod

import org.scalablytyped.runtime.StringDictionary
import typings.daterangepicker.daterangepickerStrings.center
import typings.daterangepicker.daterangepickerStrings.down
import typings.daterangepicker.daterangepickerStrings.left
import typings.daterangepicker.daterangepickerStrings.right
import typings.daterangepicker.daterangepickerStrings.up
import typings.moment.momentMod.Duration
import typings.moment.momentMod.MomentInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Normally, if you use the `ranges` option to specify pre-defined date ranges, calendars
    * for choosing a custom date range are not shown until the user clicks "Custom Range".
    * When this option is set to true, the calendars for choosing a custom date range are always shown instead.
    */
  var alwaysShowCalendars: js.UndefOr[Boolean] = js.undefined
  /**
    * CSS class string that will be added to the apply button
    */
  var applyButtonClasses: js.UndefOr[String] = js.undefined
  /**
    * Hide the apply and cancel buttons, and automatically apply a new date range as soon as two dates or a predefined range is selected.
    */
  var autoApply: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether the date range picker should automatically update the value of an < input > element it's attached to at initialization and when the selected dates change.
    */
  var autoUpdateInput: js.UndefOr[Boolean] = js.undefined
  /**
    * CSS class names that will be added to all buttons in the picker
    */
  var buttonClasses: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * CSS class string that will be added to the cancel button
    */
  var cancelButtonClasses: js.UndefOr[String] = js.undefined
  /**
    * Whether the picker appears below (default) or above the HTML element it's attached to
    */
  var drops: js.UndefOr[down | up] = js.undefined
  /**
    * The end of the initially selected date range
    */
  var endDate: js.UndefOr[DateOrString] = js.undefined
  /**
    * A function that is passed each date in the two calendars before they are displayed, and may return a string or array of CSS class names to apply to that date's calendar cell.
    */
  var isCustomDate: js.UndefOr[js.Function1[/* date */ DateOrString, js.UndefOr[String | js.Array[String]]]] = js.undefined
  /**
    * A function that is passed each date in the two calendars before they are displayed, and may return true or false to indicate whether that date should be available for selection or not.
    */
  var isInvalidDate: js.UndefOr[
    js.Function2[/* startDate */ DateOrString, /* endDate */ js.UndefOr[DateOrString], Boolean]
  ] = js.undefined
  /**
    * When enabled, the two calendars displayed will always be for two sequential months (i.e.
    * January and February), and both will be advanced when clicking the left or right arrows
    * above the calendars.When disabled, the two calendars can be individually advanced and
    * display any month/ year.
    */
  var linkedCalendars: js.UndefOr[Boolean] = js.undefined
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
  var maxSpan: js.UndefOr[MomentInput | Duration] = js.undefined
  /**
    * The maximum year shown in the dropdowns when `showDropdowns` is set to true.
    */
  var maxYear: js.UndefOr[Double] = js.undefined
  /**
    * The earliest date a user may select
    */
  var minDate: js.UndefOr[DateOrString] = js.undefined
  /**
    * The minimum year shown in the dropdowns when `showDropdowns` is set to true.
    */
  var minYear: js.UndefOr[Double] = js.undefined
  /**
    * Whether the picker appears aligned to the left, to the right, or centered under the HTML element it's attached to
    */
  var opens: js.UndefOr[left | right | center] = js.undefined
  /**
    * jQuery selector of the parent element that the date range picker will be added to, if not provided this will be 'body'
    */
  var parentEl: js.UndefOr[String] = js.undefined
  /**
    * Set predefined date ranges the user can select from.Each key is the label for the range, and its value an array with two dates representing the bounds of the range.
    */
  var ranges: js.UndefOr[StringDictionary[js.Tuple2[DateOrString, DateOrString]]] = js.undefined
  /**
    * Whether to show the 'Custom Range' label or just pre-defined ranges
    */
  var showCustomRangeLabel: js.UndefOr[Boolean] = js.undefined
  /**
    * Show year and month select boxes above calendars to jump to a specific month and year
    */
  var showDropdowns: js.UndefOr[Boolean] = js.undefined
  /**
    * Show ISO week numbers at the start of each week on the calendars
    */
  var showISOWeekNumbers: js.UndefOr[Boolean] = js.undefined
  /**
    * Show localized week numbers at the start of each week on the calendars
    */
  var showWeekNumbers: js.UndefOr[Boolean] = js.undefined
  /**
    * Show only a single calendar to choose one date, instead of a range picker with two calendars; the start and end dates provided to your callback will be the same single date chosen.
    */
  var singleDatePicker: js.UndefOr[Boolean] = js.undefined
  /**
    * The start of the initially selected date range
    */
  var startDate: js.UndefOr[DateOrString] = js.undefined
  /**
    * Allow selection of dates with times, not just dates
    */
  var timePicker: js.UndefOr[Boolean] = js.undefined
  /**
    * Use 24- hour instead of 12- hour times, removing the AM/ PM selection.
    */
  var timePicker24Hour: js.UndefOr[Boolean] = js.undefined
  /**
    * Increment of the minutes selection list for times (i.e. 30 to allow only selection of times ending in 0 or 30)
    */
  var timePickerIncrement: js.UndefOr[Double] = js.undefined
  /**
    * Show seconds in the timePicker.
    */
  var timePickerSeconds: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    alwaysShowCalendars: js.UndefOr[Boolean] = js.undefined,
    applyButtonClasses: String = null,
    autoApply: js.UndefOr[Boolean] = js.undefined,
    autoUpdateInput: js.UndefOr[Boolean] = js.undefined,
    buttonClasses: js.Array[String] = null,
    cancelButtonClasses: String = null,
    drops: down | up = null,
    endDate: DateOrString = null,
    isCustomDate: /* date */ DateOrString => js.UndefOr[String | js.Array[String]] = null,
    isInvalidDate: (/* startDate */ DateOrString, /* endDate */ js.UndefOr[DateOrString]) => Boolean = null,
    linkedCalendars: js.UndefOr[Boolean] = js.undefined,
    locale: Locale = null,
    maxDate: DateOrString = null,
    maxSpan: MomentInput | Duration = null,
    maxYear: Int | Double = null,
    minDate: DateOrString = null,
    minYear: Int | Double = null,
    opens: left | right | center = null,
    parentEl: String = null,
    ranges: StringDictionary[js.Tuple2[DateOrString, DateOrString]] = null,
    showCustomRangeLabel: js.UndefOr[Boolean] = js.undefined,
    showDropdowns: js.UndefOr[Boolean] = js.undefined,
    showISOWeekNumbers: js.UndefOr[Boolean] = js.undefined,
    showWeekNumbers: js.UndefOr[Boolean] = js.undefined,
    singleDatePicker: js.UndefOr[Boolean] = js.undefined,
    startDate: DateOrString = null,
    timePicker: js.UndefOr[Boolean] = js.undefined,
    timePicker24Hour: js.UndefOr[Boolean] = js.undefined,
    timePickerIncrement: Int | Double = null,
    timePickerSeconds: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alwaysShowCalendars)) __obj.updateDynamic("alwaysShowCalendars")(alwaysShowCalendars)
    if (applyButtonClasses != null) __obj.updateDynamic("applyButtonClasses")(applyButtonClasses)
    if (!js.isUndefined(autoApply)) __obj.updateDynamic("autoApply")(autoApply)
    if (!js.isUndefined(autoUpdateInput)) __obj.updateDynamic("autoUpdateInput")(autoUpdateInput)
    if (buttonClasses != null) __obj.updateDynamic("buttonClasses")(buttonClasses)
    if (cancelButtonClasses != null) __obj.updateDynamic("cancelButtonClasses")(cancelButtonClasses)
    if (drops != null) __obj.updateDynamic("drops")(drops.asInstanceOf[js.Any])
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (isCustomDate != null) __obj.updateDynamic("isCustomDate")(js.Any.fromFunction1(isCustomDate))
    if (isInvalidDate != null) __obj.updateDynamic("isInvalidDate")(js.Any.fromFunction2(isInvalidDate))
    if (!js.isUndefined(linkedCalendars)) __obj.updateDynamic("linkedCalendars")(linkedCalendars)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (maxSpan != null) __obj.updateDynamic("maxSpan")(maxSpan.asInstanceOf[js.Any])
    if (maxYear != null) __obj.updateDynamic("maxYear")(maxYear.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (minYear != null) __obj.updateDynamic("minYear")(minYear.asInstanceOf[js.Any])
    if (opens != null) __obj.updateDynamic("opens")(opens.asInstanceOf[js.Any])
    if (parentEl != null) __obj.updateDynamic("parentEl")(parentEl)
    if (ranges != null) __obj.updateDynamic("ranges")(ranges)
    if (!js.isUndefined(showCustomRangeLabel)) __obj.updateDynamic("showCustomRangeLabel")(showCustomRangeLabel)
    if (!js.isUndefined(showDropdowns)) __obj.updateDynamic("showDropdowns")(showDropdowns)
    if (!js.isUndefined(showISOWeekNumbers)) __obj.updateDynamic("showISOWeekNumbers")(showISOWeekNumbers)
    if (!js.isUndefined(showWeekNumbers)) __obj.updateDynamic("showWeekNumbers")(showWeekNumbers)
    if (!js.isUndefined(singleDatePicker)) __obj.updateDynamic("singleDatePicker")(singleDatePicker)
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    if (!js.isUndefined(timePicker)) __obj.updateDynamic("timePicker")(timePicker)
    if (!js.isUndefined(timePicker24Hour)) __obj.updateDynamic("timePicker24Hour")(timePicker24Hour)
    if (timePickerIncrement != null) __obj.updateDynamic("timePickerIncrement")(timePickerIncrement.asInstanceOf[js.Any])
    if (!js.isUndefined(timePickerSeconds)) __obj.updateDynamic("timePickerSeconds")(timePickerSeconds)
    __obj.asInstanceOf[Options]
  }
}

