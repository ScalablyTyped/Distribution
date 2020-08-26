package typings.daterangepicker.mod

import org.scalablytyped.runtime.StringDictionary
import typings.daterangepicker.daterangepickerStrings.auto
import typings.daterangepicker.daterangepickerStrings.center
import typings.daterangepicker.daterangepickerStrings.down
import typings.daterangepicker.daterangepickerStrings.left
import typings.daterangepicker.daterangepickerStrings.right
import typings.daterangepicker.daterangepickerStrings.up
import typings.moment.mod.Duration_
import typings.moment.mod.MomentInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Normally, if you use the `ranges` option to specify pre-defined date ranges, calendars
    * for choosing a custom date range are not shown until the user clicks "Custom Range".
    * When this option is set to true, the calendars for choosing a custom date range are always shown instead.
    */
  var alwaysShowCalendars: js.UndefOr[Boolean] = js.native
  /**
    * CSS class string that will be added to the apply button
    */
  var applyButtonClasses: js.UndefOr[String] = js.native
  /**
    * Hide the apply and cancel buttons, and automatically apply a new date range as soon as two dates or a predefined range is selected.
    */
  var autoApply: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the date range picker should automatically update the value of an < input > element it's attached to at initialization and when the selected dates change.
    */
  var autoUpdateInput: js.UndefOr[Boolean] = js.native
  /**
    * CSS class names that will be added to all buttons in the picker
    */
  var buttonClasses: js.UndefOr[js.Array[String]] = js.native
  /**
    * CSS class string that will be added to the cancel button
    */
  var cancelButtonClasses: js.UndefOr[String] = js.native
  /**
    * Whether the picker appears below (default) or above the HTML element it's attached to
    */
  var drops: js.UndefOr[down | up | auto] = js.native
  /**
    * The end of the initially selected date range
    */
  var endDate: js.UndefOr[DateOrString] = js.native
  /**
    * A function that is passed each date in the two calendars before they are displayed, and may return a string or array of CSS class names to apply to that date's calendar cell.
    */
  var isCustomDate: js.UndefOr[js.Function1[/* date */ DateOrString, js.UndefOr[String | js.Array[String]]]] = js.native
  /**
    * A function that is passed each date in the two calendars before they are displayed, and may return true or false to indicate whether that date should be available for selection or not.
    */
  var isInvalidDate: js.UndefOr[
    js.Function2[/* startDate */ DateOrString, /* endDate */ js.UndefOr[DateOrString], Boolean]
  ] = js.native
  /**
    * When enabled, the two calendars displayed will always be for two sequential months (i.e.
    * January and February), and both will be advanced when clicking the left or right arrows
    * above the calendars.When disabled, the two calendars can be individually advanced and
    * display any month/ year.
    */
  var linkedCalendars: js.UndefOr[Boolean] = js.native
  /**
    * Allows you to provide localized strings for buttons and labels, customize the date display format, and change the first day of week for the calendars.
    */
  var locale: js.UndefOr[Locale] = js.native
  /**
    * The latest date a user may select
    */
  var maxDate: js.UndefOr[DateOrString] = js.native
  /**
    * The maximum span between the selected start and end dates. Can have any property you can add to a moment object (i.e. days, months)
    */
  var maxSpan: js.UndefOr[MomentInput | Duration_] = js.native
  /**
    * The maximum year shown in the dropdowns when `showDropdowns` is set to true.
    */
  var maxYear: js.UndefOr[Double] = js.native
  /**
    * The earliest date a user may select
    */
  var minDate: js.UndefOr[DateOrString] = js.native
  /**
    * The minimum year shown in the dropdowns when `showDropdowns` is set to true.
    */
  var minYear: js.UndefOr[Double] = js.native
  /**
    * Whether the picker appears aligned to the left, to the right, or centered under the HTML element it's attached to
    */
  var opens: js.UndefOr[left | right | center] = js.native
  /**
    * jQuery selector of the parent element that the date range picker will be added to, if not provided this will be 'body'
    */
  var parentEl: js.UndefOr[String] = js.native
  /**
    * Set predefined date ranges the user can select from.Each key is the label for the range, and its value an array with two dates representing the bounds of the range.
    */
  var ranges: js.UndefOr[StringDictionary[js.Tuple2[DateOrString, DateOrString]]] = js.native
  /**
    * Whether to show the 'Custom Range' label or just pre-defined ranges
    */
  var showCustomRangeLabel: js.UndefOr[Boolean] = js.native
  /**
    * Show year and month select boxes above calendars to jump to a specific month and year
    */
  var showDropdowns: js.UndefOr[Boolean] = js.native
  /**
    * Show ISO week numbers at the start of each week on the calendars
    */
  var showISOWeekNumbers: js.UndefOr[Boolean] = js.native
  /**
    * Show localized week numbers at the start of each week on the calendars
    */
  var showWeekNumbers: js.UndefOr[Boolean] = js.native
  /**
    * Show only a single calendar to choose one date, instead of a range picker with two calendars; the start and end dates provided to your callback will be the same single date chosen.
    */
  var singleDatePicker: js.UndefOr[Boolean] = js.native
  /**
    * The start of the initially selected date range
    */
  var startDate: js.UndefOr[DateOrString] = js.native
  /**
    * Allow selection of dates with times, not just dates
    */
  var timePicker: js.UndefOr[Boolean] = js.native
  /**
    * Use 24- hour instead of 12- hour times, removing the AM/ PM selection.
    */
  var timePicker24Hour: js.UndefOr[Boolean] = js.native
  /**
    * Increment of the minutes selection list for times (i.e. 30 to allow only selection of times ending in 0 or 30)
    */
  var timePickerIncrement: js.UndefOr[Double] = js.native
  /**
    * Show seconds in the timePicker.
    */
  var timePickerSeconds: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlwaysShowCalendars(value: Boolean): Self = this.set("alwaysShowCalendars", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlwaysShowCalendars: Self = this.set("alwaysShowCalendars", js.undefined)
    @scala.inline
    def setApplyButtonClasses(value: String): Self = this.set("applyButtonClasses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplyButtonClasses: Self = this.set("applyButtonClasses", js.undefined)
    @scala.inline
    def setAutoApply(value: Boolean): Self = this.set("autoApply", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoApply: Self = this.set("autoApply", js.undefined)
    @scala.inline
    def setAutoUpdateInput(value: Boolean): Self = this.set("autoUpdateInput", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoUpdateInput: Self = this.set("autoUpdateInput", js.undefined)
    @scala.inline
    def setButtonClassesVarargs(value: String*): Self = this.set("buttonClasses", js.Array(value :_*))
    @scala.inline
    def setButtonClasses(value: js.Array[String]): Self = this.set("buttonClasses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonClasses: Self = this.set("buttonClasses", js.undefined)
    @scala.inline
    def setCancelButtonClasses(value: String): Self = this.set("cancelButtonClasses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancelButtonClasses: Self = this.set("cancelButtonClasses", js.undefined)
    @scala.inline
    def setDrops(value: down | up | auto): Self = this.set("drops", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrops: Self = this.set("drops", js.undefined)
    @scala.inline
    def setEndDate(value: DateOrString): Self = this.set("endDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndDate: Self = this.set("endDate", js.undefined)
    @scala.inline
    def setIsCustomDate(value: /* date */ DateOrString => js.UndefOr[String | js.Array[String]]): Self = this.set("isCustomDate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIsCustomDate: Self = this.set("isCustomDate", js.undefined)
    @scala.inline
    def setIsInvalidDate(value: (/* startDate */ DateOrString, /* endDate */ js.UndefOr[DateOrString]) => Boolean): Self = this.set("isInvalidDate", js.Any.fromFunction2(value))
    @scala.inline
    def deleteIsInvalidDate: Self = this.set("isInvalidDate", js.undefined)
    @scala.inline
    def setLinkedCalendars(value: Boolean): Self = this.set("linkedCalendars", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkedCalendars: Self = this.set("linkedCalendars", js.undefined)
    @scala.inline
    def setLocale(value: Locale): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setMaxDate(value: DateOrString): Self = this.set("maxDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDate: Self = this.set("maxDate", js.undefined)
    @scala.inline
    def setMaxSpanVarargs(value: (Double | String)*): Self = this.set("maxSpan", js.Array(value :_*))
    @scala.inline
    def setMaxSpan(value: MomentInput | Duration_): Self = this.set("maxSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxSpan: Self = this.set("maxSpan", js.undefined)
    @scala.inline
    def setMaxYear(value: Double): Self = this.set("maxYear", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxYear: Self = this.set("maxYear", js.undefined)
    @scala.inline
    def setMinDate(value: DateOrString): Self = this.set("minDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinDate: Self = this.set("minDate", js.undefined)
    @scala.inline
    def setMinYear(value: Double): Self = this.set("minYear", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinYear: Self = this.set("minYear", js.undefined)
    @scala.inline
    def setOpens(value: left | right | center): Self = this.set("opens", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpens: Self = this.set("opens", js.undefined)
    @scala.inline
    def setParentEl(value: String): Self = this.set("parentEl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentEl: Self = this.set("parentEl", js.undefined)
    @scala.inline
    def setRanges(value: StringDictionary[js.Tuple2[DateOrString, DateOrString]]): Self = this.set("ranges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRanges: Self = this.set("ranges", js.undefined)
    @scala.inline
    def setShowCustomRangeLabel(value: Boolean): Self = this.set("showCustomRangeLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowCustomRangeLabel: Self = this.set("showCustomRangeLabel", js.undefined)
    @scala.inline
    def setShowDropdowns(value: Boolean): Self = this.set("showDropdowns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowDropdowns: Self = this.set("showDropdowns", js.undefined)
    @scala.inline
    def setShowISOWeekNumbers(value: Boolean): Self = this.set("showISOWeekNumbers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowISOWeekNumbers: Self = this.set("showISOWeekNumbers", js.undefined)
    @scala.inline
    def setShowWeekNumbers(value: Boolean): Self = this.set("showWeekNumbers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowWeekNumbers: Self = this.set("showWeekNumbers", js.undefined)
    @scala.inline
    def setSingleDatePicker(value: Boolean): Self = this.set("singleDatePicker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSingleDatePicker: Self = this.set("singleDatePicker", js.undefined)
    @scala.inline
    def setStartDate(value: DateOrString): Self = this.set("startDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartDate: Self = this.set("startDate", js.undefined)
    @scala.inline
    def setTimePicker(value: Boolean): Self = this.set("timePicker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimePicker: Self = this.set("timePicker", js.undefined)
    @scala.inline
    def setTimePicker24Hour(value: Boolean): Self = this.set("timePicker24Hour", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimePicker24Hour: Self = this.set("timePicker24Hour", js.undefined)
    @scala.inline
    def setTimePickerIncrement(value: Double): Self = this.set("timePickerIncrement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimePickerIncrement: Self = this.set("timePickerIncrement", js.undefined)
    @scala.inline
    def setTimePickerSeconds(value: Boolean): Self = this.set("timePickerSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimePickerSeconds: Self = this.set("timePickerSeconds", js.undefined)
  }
  
}

