package typings.daterangepicker

import org.scalablytyped.runtime.StringDictionary
import typings.daterangepicker.anon.DefaultOptions
import typings.daterangepicker.anon.RequiredLocale
import typings.daterangepicker.daterangepickerBooleans.`false`
import typings.daterangepicker.daterangepickerStrings.auto
import typings.daterangepicker.daterangepickerStrings.center
import typings.daterangepicker.daterangepickerStrings.down
import typings.daterangepicker.daterangepickerStrings.left
import typings.daterangepicker.daterangepickerStrings.right
import typings.daterangepicker.daterangepickerStrings.up
import typings.daterangepicker.mod.global.JQuery
import typings.jquery.JQueryEventObject
import typings.moment.mod.DurationInputArg1
import typings.moment.mod.Moment
import typings.std.Array
import typings.std.Element
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("daterangepicker", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with typings.daterangepicker.mod.daterangepicker {
    def this(element: HTMLElement) = this()
    def this(element: HTMLElement, options: Options) = this()
    def this(element: HTMLElement, options: Unit, callback: DataRangePickerCallback) = this()
    def this(element: HTMLElement, options: Options, callback: DataRangePickerCallback) = this()
    
    /* CompleteClass */
    var container: JQuery = js.native
    
    /* CompleteClass */
    var endDate: Moment = js.native
    
    /* CompleteClass */
    override def remove(): Unit = js.native
    
    /* CompleteClass */
    override def setEndDate(date: DateOrString): Unit = js.native
    
    /* CompleteClass */
    override def setStartDate(date: DateOrString): Unit = js.native
    
    /* CompleteClass */
    var startDate: Moment = js.native
  }
  
  trait Calendar extends StObject {
    
    var calendar: Month
    
    var month: Moment
  }
  object Calendar {
    
    inline def apply(calendar: Month, month: Moment): Calendar = {
      val __obj = js.Dynamic.literal(calendar = calendar.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any])
      __obj.asInstanceOf[Calendar]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Calendar] (val x: Self) extends AnyVal {
      
      inline def setCalendar(value: Month): Self = StObject.set(x, "calendar", value.asInstanceOf[js.Any])
      
      inline def setMonth(value: Moment): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    }
  }
  
  type DataRangePickerCallback = js.Function3[/* start */ Moment, /* end */ Moment, /* label */ String | Null, Unit]
  
  type DateOrString = String | Moment | js.Date
  
  @js.native
  trait DateRangePicker_ extends StObject {
    
    var alwaysShowCalendars: Boolean = js.native
    
    var applyButtonClasses: String = js.native
    
    var autoApply: Boolean = js.native
    
    var autoUpdateInput: Boolean = js.native
    
    var buttonClasses: js.Array[String] = js.native
    
    var cancelButtonClasses: String = js.native
    
    var chosenLabel: js.UndefOr[String] = js.native
    
    var container: JQuery = js.native
    
    var drops: down | up = js.native
    
    var element: JQuery = js.native
    
    var endDate: Moment = js.native
    
    def isCustomDate(date: DateOrString): js.UndefOr[String | js.Array[String] | `false`] = js.native
    
    def isInvalidDate(startDate: DateOrString): Boolean = js.native
    def isInvalidDate(startDate: DateOrString, endDate: DateOrString): Boolean = js.native
    
    var isShowing: Boolean = js.native
    
    var leftCalendar: Calendar = js.native
    
    var linkedCalendars: Boolean = js.native
    
    var locale: RequiredLocale = js.native
    
    var maxDate: Moment = js.native
    
    var maxSpan: DurationInputArg1 | Boolean = js.native
    
    var maxYear: String | Double = js.native
    
    var minDate: Moment = js.native
    
    var minYear: String | Double = js.native
    
    var oldEndDate: Moment = js.native
    
    var oldStartDate: Moment = js.native
    
    var opens: left | right | center = js.native
    
    var parentEl: JQuery = js.native
    
    var previousRightTime: Moment = js.native
    
    var ranges: StringDictionary[js.Tuple2[DateOrString, DateOrString]] = js.native
    
    var rightCalendar: Calendar = js.native
    
    var showCustomRangeLabel: Boolean = js.native
    
    var showDropdowns: Boolean = js.native
    
    var showISOWeekNumbers: Boolean = js.native
    
    var showWeekNumbers: Boolean = js.native
    
    var singleDatePicker: Boolean = js.native
    
    var startDate: Moment = js.native
    
    var timePicker: Boolean = js.native
    
    var timePicker24Hour: Boolean = js.native
    
    var timePickerIncrement: Double = js.native
    
    var timePickerSeconds: Boolean = js.native
  }
  
  @js.native
  trait DatepickerEventObject
    extends StObject
       with JQueryEventObject {
    
    var date: js.Date = js.native
    
    def format(): String = js.native
    def format(format: String): String = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.daterangepicker.daterangepickerStrings.showDotdaterangepicker
    - typings.daterangepicker.daterangepickerStrings.hideDotdaterangepicker
    - typings.daterangepicker.daterangepickerStrings.showCalendarDotdaterangepicker
    - typings.daterangepicker.daterangepickerStrings.hideCalendarDotdaterangepicker
    - typings.daterangepicker.daterangepickerStrings.applyDotdaterangepicker
    - typings.daterangepicker.daterangepickerStrings.cancelDotdaterangepicker
  */
  trait DatepickerEvents extends StObject
  object DatepickerEvents {
    
    inline def applyDotdaterangepicker: typings.daterangepicker.daterangepickerStrings.applyDotdaterangepicker = "apply.daterangepicker".asInstanceOf[typings.daterangepicker.daterangepickerStrings.applyDotdaterangepicker]
    
    inline def cancelDotdaterangepicker: typings.daterangepicker.daterangepickerStrings.cancelDotdaterangepicker = "cancel.daterangepicker".asInstanceOf[typings.daterangepicker.daterangepickerStrings.cancelDotdaterangepicker]
    
    inline def hideCalendarDotdaterangepicker: typings.daterangepicker.daterangepickerStrings.hideCalendarDotdaterangepicker = "hideCalendar.daterangepicker".asInstanceOf[typings.daterangepicker.daterangepickerStrings.hideCalendarDotdaterangepicker]
    
    inline def hideDotdaterangepicker: typings.daterangepicker.daterangepickerStrings.hideDotdaterangepicker = "hide.daterangepicker".asInstanceOf[typings.daterangepicker.daterangepickerStrings.hideDotdaterangepicker]
    
    inline def showCalendarDotdaterangepicker: typings.daterangepicker.daterangepickerStrings.showCalendarDotdaterangepicker = "showCalendar.daterangepicker".asInstanceOf[typings.daterangepicker.daterangepickerStrings.showCalendarDotdaterangepicker]
    
    inline def showDotdaterangepicker: typings.daterangepicker.daterangepickerStrings.showDotdaterangepicker = "show.daterangepicker".asInstanceOf[typings.daterangepicker.daterangepickerStrings.showDotdaterangepicker]
  }
  
  trait Locale extends StObject {
    
    /**
      * Text for apply label.
      */
    var applyLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Text for cancel label.
      */
    var cancelLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Text for the custom range label.
      */
    var customRangeLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Weekday names displayed in the header of calendar.
      */
    var daysOfWeek: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The first day of the week (0-6, Sunday to Saturday).
      */
    var firstDay: js.UndefOr[Double] = js.undefined
    
    /**
      * Format of the date string. example: 'YYYY-MM-DD'
      */
    var format: js.UndefOr[String] = js.undefined
    
    /**
      * Text for fromLabel label.
      */
    var fromLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Month names used in the month select boxes.
      */
    var monthNames: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Separator between the startDate and endDate in the attached input element. Example: ' - '
      */
    var separator: js.UndefOr[String] = js.undefined
    
    /**
      * Text for toLabel label.
      */
    var toLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Text for the week label.
      */
    var weekLabel: js.UndefOr[String] = js.undefined
  }
  object Locale {
    
    inline def apply(): Locale = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Locale]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Locale] (val x: Self) extends AnyVal {
      
      inline def setApplyLabel(value: String): Self = StObject.set(x, "applyLabel", value.asInstanceOf[js.Any])
      
      inline def setApplyLabelUndefined: Self = StObject.set(x, "applyLabel", js.undefined)
      
      inline def setCancelLabel(value: String): Self = StObject.set(x, "cancelLabel", value.asInstanceOf[js.Any])
      
      inline def setCancelLabelUndefined: Self = StObject.set(x, "cancelLabel", js.undefined)
      
      inline def setCustomRangeLabel(value: String): Self = StObject.set(x, "customRangeLabel", value.asInstanceOf[js.Any])
      
      inline def setCustomRangeLabelUndefined: Self = StObject.set(x, "customRangeLabel", js.undefined)
      
      inline def setDaysOfWeek(value: js.Array[String]): Self = StObject.set(x, "daysOfWeek", value.asInstanceOf[js.Any])
      
      inline def setDaysOfWeekUndefined: Self = StObject.set(x, "daysOfWeek", js.undefined)
      
      inline def setDaysOfWeekVarargs(value: String*): Self = StObject.set(x, "daysOfWeek", js.Array(value*))
      
      inline def setFirstDay(value: Double): Self = StObject.set(x, "firstDay", value.asInstanceOf[js.Any])
      
      inline def setFirstDayUndefined: Self = StObject.set(x, "firstDay", js.undefined)
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setFromLabel(value: String): Self = StObject.set(x, "fromLabel", value.asInstanceOf[js.Any])
      
      inline def setFromLabelUndefined: Self = StObject.set(x, "fromLabel", js.undefined)
      
      inline def setMonthNames(value: js.Array[String]): Self = StObject.set(x, "monthNames", value.asInstanceOf[js.Any])
      
      inline def setMonthNamesUndefined: Self = StObject.set(x, "monthNames", js.undefined)
      
      inline def setMonthNamesVarargs(value: String*): Self = StObject.set(x, "monthNames", js.Array(value*))
      
      inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      inline def setToLabel(value: String): Self = StObject.set(x, "toLabel", value.asInstanceOf[js.Any])
      
      inline def setToLabelUndefined: Self = StObject.set(x, "toLabel", js.undefined)
      
      inline def setWeekLabel(value: String): Self = StObject.set(x, "weekLabel", value.asInstanceOf[js.Any])
      
      inline def setWeekLabelUndefined: Self = StObject.set(x, "weekLabel", js.undefined)
    }
  }
  
  @js.native
  trait Month
    extends StObject
       with Array[js.Array[Moment]] {
    
    var firstDay: Moment = js.native
    
    var lastDay: Moment = js.native
  }
  
  trait Options extends StObject {
    
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
    var drops: js.UndefOr[down | up | auto] = js.undefined
    
    /**
      * The end of the initially selected date range
      */
    var endDate: js.UndefOr[DateOrString] = js.undefined
    
    /**
      * A function that is passed each date in the two calendars before they are displayed, and may return a string or array of CSS class names to apply to that date's calendar cell.
      */
    var isCustomDate: js.UndefOr[
        js.Function1[/* date */ DateOrString, js.UndefOr[String | js.Array[String] | `false`]]
      ] = js.undefined
    
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
    var maxSpan: js.UndefOr[DurationInputArg1] = js.undefined
    
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
    var parentEl: js.UndefOr[Element | String] = js.undefined
    
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
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAlwaysShowCalendars(value: Boolean): Self = StObject.set(x, "alwaysShowCalendars", value.asInstanceOf[js.Any])
      
      inline def setAlwaysShowCalendarsUndefined: Self = StObject.set(x, "alwaysShowCalendars", js.undefined)
      
      inline def setApplyButtonClasses(value: String): Self = StObject.set(x, "applyButtonClasses", value.asInstanceOf[js.Any])
      
      inline def setApplyButtonClassesUndefined: Self = StObject.set(x, "applyButtonClasses", js.undefined)
      
      inline def setAutoApply(value: Boolean): Self = StObject.set(x, "autoApply", value.asInstanceOf[js.Any])
      
      inline def setAutoApplyUndefined: Self = StObject.set(x, "autoApply", js.undefined)
      
      inline def setAutoUpdateInput(value: Boolean): Self = StObject.set(x, "autoUpdateInput", value.asInstanceOf[js.Any])
      
      inline def setAutoUpdateInputUndefined: Self = StObject.set(x, "autoUpdateInput", js.undefined)
      
      inline def setButtonClasses(value: js.Array[String]): Self = StObject.set(x, "buttonClasses", value.asInstanceOf[js.Any])
      
      inline def setButtonClassesUndefined: Self = StObject.set(x, "buttonClasses", js.undefined)
      
      inline def setButtonClassesVarargs(value: String*): Self = StObject.set(x, "buttonClasses", js.Array(value*))
      
      inline def setCancelButtonClasses(value: String): Self = StObject.set(x, "cancelButtonClasses", value.asInstanceOf[js.Any])
      
      inline def setCancelButtonClassesUndefined: Self = StObject.set(x, "cancelButtonClasses", js.undefined)
      
      inline def setDrops(value: down | up | auto): Self = StObject.set(x, "drops", value.asInstanceOf[js.Any])
      
      inline def setDropsUndefined: Self = StObject.set(x, "drops", js.undefined)
      
      inline def setEndDate(value: DateOrString): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
      
      inline def setIsCustomDate(value: /* date */ DateOrString => js.UndefOr[String | js.Array[String] | `false`]): Self = StObject.set(x, "isCustomDate", js.Any.fromFunction1(value))
      
      inline def setIsCustomDateUndefined: Self = StObject.set(x, "isCustomDate", js.undefined)
      
      inline def setIsInvalidDate(value: (/* startDate */ DateOrString, /* endDate */ js.UndefOr[DateOrString]) => Boolean): Self = StObject.set(x, "isInvalidDate", js.Any.fromFunction2(value))
      
      inline def setIsInvalidDateUndefined: Self = StObject.set(x, "isInvalidDate", js.undefined)
      
      inline def setLinkedCalendars(value: Boolean): Self = StObject.set(x, "linkedCalendars", value.asInstanceOf[js.Any])
      
      inline def setLinkedCalendarsUndefined: Self = StObject.set(x, "linkedCalendars", js.undefined)
      
      inline def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMaxDate(value: DateOrString): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      inline def setMaxSpan(value: DurationInputArg1): Self = StObject.set(x, "maxSpan", value.asInstanceOf[js.Any])
      
      inline def setMaxSpanUndefined: Self = StObject.set(x, "maxSpan", js.undefined)
      
      inline def setMaxYear(value: Double): Self = StObject.set(x, "maxYear", value.asInstanceOf[js.Any])
      
      inline def setMaxYearUndefined: Self = StObject.set(x, "maxYear", js.undefined)
      
      inline def setMinDate(value: DateOrString): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      inline def setMinYear(value: Double): Self = StObject.set(x, "minYear", value.asInstanceOf[js.Any])
      
      inline def setMinYearUndefined: Self = StObject.set(x, "minYear", js.undefined)
      
      inline def setOpens(value: left | right | center): Self = StObject.set(x, "opens", value.asInstanceOf[js.Any])
      
      inline def setOpensUndefined: Self = StObject.set(x, "opens", js.undefined)
      
      inline def setParentEl(value: Element | String): Self = StObject.set(x, "parentEl", value.asInstanceOf[js.Any])
      
      inline def setParentElUndefined: Self = StObject.set(x, "parentEl", js.undefined)
      
      inline def setRanges(value: StringDictionary[js.Tuple2[DateOrString, DateOrString]]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
      
      inline def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
      
      inline def setShowCustomRangeLabel(value: Boolean): Self = StObject.set(x, "showCustomRangeLabel", value.asInstanceOf[js.Any])
      
      inline def setShowCustomRangeLabelUndefined: Self = StObject.set(x, "showCustomRangeLabel", js.undefined)
      
      inline def setShowDropdowns(value: Boolean): Self = StObject.set(x, "showDropdowns", value.asInstanceOf[js.Any])
      
      inline def setShowDropdownsUndefined: Self = StObject.set(x, "showDropdowns", js.undefined)
      
      inline def setShowISOWeekNumbers(value: Boolean): Self = StObject.set(x, "showISOWeekNumbers", value.asInstanceOf[js.Any])
      
      inline def setShowISOWeekNumbersUndefined: Self = StObject.set(x, "showISOWeekNumbers", js.undefined)
      
      inline def setShowWeekNumbers(value: Boolean): Self = StObject.set(x, "showWeekNumbers", value.asInstanceOf[js.Any])
      
      inline def setShowWeekNumbersUndefined: Self = StObject.set(x, "showWeekNumbers", js.undefined)
      
      inline def setSingleDatePicker(value: Boolean): Self = StObject.set(x, "singleDatePicker", value.asInstanceOf[js.Any])
      
      inline def setSingleDatePickerUndefined: Self = StObject.set(x, "singleDatePicker", js.undefined)
      
      inline def setStartDate(value: DateOrString): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
      
      inline def setTimePicker(value: Boolean): Self = StObject.set(x, "timePicker", value.asInstanceOf[js.Any])
      
      inline def setTimePicker24Hour(value: Boolean): Self = StObject.set(x, "timePicker24Hour", value.asInstanceOf[js.Any])
      
      inline def setTimePicker24HourUndefined: Self = StObject.set(x, "timePicker24Hour", js.undefined)
      
      inline def setTimePickerIncrement(value: Double): Self = StObject.set(x, "timePickerIncrement", value.asInstanceOf[js.Any])
      
      inline def setTimePickerIncrementUndefined: Self = StObject.set(x, "timePickerIncrement", js.undefined)
      
      inline def setTimePickerSeconds(value: Boolean): Self = StObject.set(x, "timePickerSeconds", value.asInstanceOf[js.Any])
      
      inline def setTimePickerSecondsUndefined: Self = StObject.set(x, "timePickerSeconds", js.undefined)
      
      inline def setTimePickerUndefined: Self = StObject.set(x, "timePicker", js.undefined)
    }
  }
  
  trait daterangepicker extends StObject {
    
    var container: JQuery
    
    var endDate: Moment
    
    def remove(): Unit
    
    def setEndDate(date: DateOrString): Unit
    
    def setStartDate(date: DateOrString): Unit
    
    var startDate: Moment
  }
  object daterangepicker {
    
    inline def apply(
      container: JQuery,
      endDate: Moment,
      remove: () => Unit,
      setEndDate: DateOrString => Unit,
      setStartDate: DateOrString => Unit,
      startDate: Moment
    ): typings.daterangepicker.mod.daterangepicker = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], endDate = endDate.asInstanceOf[js.Any], remove = js.Any.fromFunction0(remove), setEndDate = js.Any.fromFunction1(setEndDate), setStartDate = js.Any.fromFunction1(setStartDate), startDate = startDate.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.daterangepicker.mod.daterangepicker]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.daterangepicker.mod.daterangepicker] (val x: Self) extends AnyVal {
      
      inline def setContainer(value: JQuery): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setEndDate(value: Moment): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
      
      inline def setSetEndDate(value: DateOrString => Unit): Self = StObject.set(x, "setEndDate", js.Any.fromFunction1(value))
      
      inline def setSetStartDate(value: DateOrString => Unit): Self = StObject.set(x, "setStartDate", js.Any.fromFunction1(value))
      
      inline def setStartDate(value: Moment): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    }
  }
  
  object global {
    
    trait JQuery extends StObject {
      
      @JSName("data")
      def data_daterangepicker(key: typings.daterangepicker.daterangepickerStrings.daterangepicker): js.UndefOr[typings.daterangepicker.mod.daterangepicker]
      
      def daterangepicker(): this.type
      def daterangepicker(options: Unit, callback: DataRangePickerCallback): this.type
      def daterangepicker(options: Options): this.type
      def daterangepicker(options: Options, callback: DataRangePickerCallback): this.type
      @JSName("daterangepicker")
      var daterangepicker_Original: (js.Function2[
            /* options */ js.UndefOr[Options], 
            /* callback */ js.UndefOr[DataRangePickerCallback], 
            this.type
          ]) & DefaultOptions
      
      def on(
        events: DatepickerEvents,
        handler: js.Function2[/* event */ Event, /* picker */ DateRangePicker_, Unit]
      ): JQuery
    }
    object JQuery {
      
      inline def apply(
        data: typings.daterangepicker.daterangepickerStrings.daterangepicker => js.UndefOr[typings.daterangepicker.mod.daterangepicker],
        daterangepicker: (js.Function2[
              /* options */ js.UndefOr[Options], 
              /* callback */ js.UndefOr[DataRangePickerCallback], 
              JQuery
            ]) & DefaultOptions,
        on: (DatepickerEvents, js.Function2[/* event */ Event, /* picker */ DateRangePicker_, Unit]) => JQuery
      ): JQuery = {
        val __obj = js.Dynamic.literal(data = js.Any.fromFunction1(data), daterangepicker = daterangepicker.asInstanceOf[js.Any], on = js.Any.fromFunction2(on))
        __obj.asInstanceOf[JQuery]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: JQuery] (val x: Self) extends AnyVal {
        
        inline def setData(
          value: typings.daterangepicker.daterangepickerStrings.daterangepicker => js.UndefOr[typings.daterangepicker.mod.daterangepicker]
        ): Self = StObject.set(x, "data", js.Any.fromFunction1(value))
        
        inline def setDaterangepicker(
          value: (js.Function2[
                  /* options */ js.UndefOr[Options], 
                  /* callback */ js.UndefOr[DataRangePickerCallback], 
                  JQuery
                ]) & DefaultOptions
        ): Self = StObject.set(x, "daterangepicker", value.asInstanceOf[js.Any])
        
        inline def setOn(
          value: (DatepickerEvents, js.Function2[/* event */ Event, /* picker */ DateRangePicker_, Unit]) => JQuery
        ): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      }
    }
  }
}
