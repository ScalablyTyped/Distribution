package typings.bootstrapV3Datetimepicker

import org.scalablytyped.runtime.StringDictionary
import typings.bootstrapV3Datetimepicker.bootstrapV3DatetimepickerStrings.DateTimePicker
import typings.bootstrapV3Datetimepicker.bootstrapV3DatetimepickerStrings.auto
import typings.bootstrapV3Datetimepicker.bootstrapV3DatetimepickerStrings.bottom
import typings.bootstrapV3Datetimepicker.bootstrapV3DatetimepickerStrings.days
import typings.bootstrapV3Datetimepicker.bootstrapV3DatetimepickerStrings.decades
import typings.bootstrapV3Datetimepicker.bootstrapV3DatetimepickerStrings.default
import typings.bootstrapV3Datetimepicker.bootstrapV3DatetimepickerStrings.dpDotchange
import typings.bootstrapV3Datetimepicker.bootstrapV3DatetimepickerStrings.dpDotupdate
import typings.bootstrapV3Datetimepicker.bootstrapV3DatetimepickerStrings.left
import typings.bootstrapV3Datetimepicker.bootstrapV3DatetimepickerStrings.months
import typings.bootstrapV3Datetimepicker.bootstrapV3DatetimepickerStrings.right
import typings.bootstrapV3Datetimepicker.bootstrapV3DatetimepickerStrings.top
import typings.bootstrapV3Datetimepicker.bootstrapV3DatetimepickerStrings.years
import typings.bootstrapV3Datetimepicker.mod.global.JQuery
import typings.jquery.JQueryEventObject
import typings.moment.mod.Moment
import typings.moment.mod.MomentBuiltinFormat
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait ChangeEvent extends Event {
    
    /** Previous date. False if the previous date is null. */
    var oldDate: Moment | Boolean = js.native
  }
  
  @js.native
  trait Datetimepicker extends StObject {
    
    /**
      * JQuery plugin function.
      */
    def apply(): JQuery = js.native
    def apply(options: DatetimepickerOptions): JQuery = js.native
    
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    //// Below are the getters/setters for the properties of the 'options(): DatetimepickerOptions' ////
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    /** Returns the options.allowInputToggle option. */
    def allowInputToggle(): Boolean = js.native
    /** If true, the picker will show on textbox focus and icon click when used in a button group */
    def allowInputToggle(value: Boolean): Unit = js.native
    
    /** Returns the current options.calendarWeeks option configuration */
    def calendarWeeks(): Boolean = js.native
    /** Set if the week numbers will appear to the left on the days view */
    def calendarWeeks(value: Boolean): Unit = js.native
    
    /** Clears the datepicker by setting the value to null */
    def clear(): Unit = js.native
    
    /** Returns the options.collapse option configuration */
    def collapse(): Boolean = js.native
    /** If set to false the picker will display similar to sideBySide except vertical. */
    def collapse(value: Boolean): Unit = js.native
    
    /**
      * Takes string, Date, moment, null parameter and sets the components model current moment to it.
      * Passing a null value unsets the components model current moment.
      * Parsing of the newDate parameter is made using moment library with the options.format and options.useStrict components configuration.
      * Throws:
      * - TypeError - in case the newDate cannot be parsed
      *
      * Emits:
      * - dp.change - In case newDate is different from current moment
      */
    def date(): Unit = js.native
    def date(date: String): Unit = js.native
    def date(date: Moment): Unit = js.native
    def date(date: Date): Unit = js.native
    /** Returns the component's model current date, a moment object or null if not set. */
    @JSName("date")
    def date_Moment(): Moment = js.native
    
    /** Returns the options.dayViewHeaderFormat option. */
    def dayViewHeaderFormat(): String = js.native
    /** Used to customize the header of the day view. */
    def dayViewHeaderFormat(value: String): Unit = js.native
    
    /**
      * Returns the options.daysOfWeekDisabled configuration
      * IMPORTANT! Throws exception if not set explicitly https://github.com/Eonasdan/bootstrap-datetimepicker/issues/1459
      */
    def daysOfWeekDisabled(): js.Array[Double] = js.native
    /**
      * Takes an [ Number:0 to 6 ] and disallow the user to select weekdays that exist in this array.
      * This has lower priority over the options.minDate, options.maxDate, options.disabledDates and options.enabledDates configuration settings.
      * Emits:
      * - dp.change - if the currently selected moment falls in the values passed on the daysOfWeek parameter.
      * - dp.error - if the currently selected moment falls in the values passed on the daysOfWeek parameter.
      */
    def daysOfWeekDisabled(days: js.Array[Double]): Unit = js.native
    
    /** Returns a moment with the options.defaultDate option configuration or false if not set */
    def defaultDate(): Moment | Boolean = js.native
    /**
      * Will set the picker's inital date.
      * If a boolean:false value is passed the options.defaultDate parameter is cleared.
      * Throws:
      * - TypeError - if the provided date doesn't pass validation, including disabledDates, enabledDates, minDate, maxDate, and daysOfWeekDisabled
      * - TypeError - if the provided date cannot be parsed by momentjs
      */
    def defaultDate(date: String): Unit = js.native
    def defaultDate(date: Boolean): Unit = js.native
    def defaultDate(date: Moment): Unit = js.native
    def defaultDate(date: Date): Unit = js.native
    
    /**
      * Default options that will be used for all instances.
      * To change: `$.fn.datetimepicker.defaults`
      */
    var defaults: DatetimepickerOptions = js.native
    
    /** Destroys the widget and removes all attached event listeners */
    def destroy(): Unit = js.native
    
    /**
      * Disables the input element, the component is attached to, by adding a disabled="true" attribute to it. If the widget was visible before that call it is hidden.
      * Emits:
      * - dp.hide - if the widget was visible before that call
      */
    def disable(): Unit = js.native
    
    /**
      * Returns the options.disabledDates option.
      * NOTES: probably should be: disabledDates(): boolean | Array<moment.Moment>; see: DatetimepickerOptions
      */
    def disabledDates(): Boolean | js.Any = js.native
    def disabledDates(dates: js.Array[String | Date | Moment]): Unit = js.native
    /**
      * Takes an array of values and disallows the user to select those days.
      * Setting this takes precedence over options.minDate, options.maxDate configuration.
      * Also calling this function removes the configuration of options.enabledDates if such exist.
      * Note: These values are matched with Day granularity.
      */
    def disabledDates(dates: Boolean): Unit = js.native
    
    /**
      * Returns the options.disabledHours option.
      * NOTES: probably should be: disabledHours(): boolean | number[]; see: DatetimepickerOptions
      */
    def disabledHours(): Boolean | js.Any = js.native
    def disabledHours(value: js.Array[Double]): Unit = js.native
    /**
      * Must be in 24 hour format. Will disallow hour selections (much like disabledTimeIntervals) but will affect all days.
      * Like en/disabledDates, the en/disabledHours options are mutually exclusive and will reset one of the options back to false.
      */
    def disabledHours(value: Boolean): Unit = js.native
    
    /**
      * Returns the options.disabledTimeIntervals option, or... not exactly
      * IMPORTANT! Creates an object from the options.disabledTimeIntervals with the keys being numbers, the values being the moment arrays.
      * eg { "0": [<moment.Moment1>, <moment.Moment2>], "1": [...] }
      * https://github.com/Eonasdan/bootstrap-datetimepicker/issues/1498
      */
    def disabledTimeIntervals(): Boolean | js.Array[js.Array[Moment]] = js.native
    def disabledTimeIntervals(value: js.Array[js.Array[Moment]]): Unit = js.native
    /**
      * Disables time selection between the given moments
      * eg: [[moment({ h: 0 }), moment({ h: 8 })], [moment({ h: 18 }), moment({ h: 24 })]]
      */
    def disabledTimeIntervals(value: Boolean): Unit = js.native
    
    /** Enables the input element, the component is attached to, by removing disabled attribute from it. */
    def enable(): Unit = js.native
    
    /**
      * Returns the options.enabledDates option
      * NOTES: probably should be: enabledDates(): boolean | Array<moment.Moment>; see: DatetimepickerOptions
      */
    def enabledDates(): Boolean | js.Any = js.native
    def enabledDates(dates: js.Array[String | Date | Moment]): Unit = js.native
    /**
      * Takes an array of values and allows the user to select only from those days.
      * Setting this takes precedence over options.minDate, options.maxDate configuration.
      * Also calling this function removes the configuration of options.disabledDates if such exist.
      * Note: These values are matched with Day granularity.
      */
    def enabledDates(dates: Boolean): Unit = js.native
    
    /**
      * Returns the options.enabledHours option.
      * NOTES: probably should be: enabledHours(): boolean | number[]; see: DatetimepickerOptions
      */
    def enabledHours(): Boolean | js.Any = js.native
    def enabledHours(value: js.Array[Double]): Unit = js.native
    /**
      * Must be in 24 hour format. Will allow hour selections (much like enabledTimeIntervals) but will affect all days.
      * Like en/disabledDates, the en/disabledHours options are mutually exclusive and will reset one of the options back to false.
      */
    def enabledHours(value: Boolean): Unit = js.native
    
    /** Returns a boolean or array with the options.extraFormats option configuration */
    def extraFormats(): Boolean | (js.Array[String | MomentBuiltinFormat]) = js.native
    def extraFormats(formats: js.Array[String | MomentBuiltinFormat]): Unit = js.native
    /** Takes an array of valid input moment format options, or boolean:false */
    def extraFormats(formats: Boolean): Unit = js.native
    
    /** Returns the options.focusOnShow option. */
    def focusOnShow(): Boolean = js.native
    /** If false, the textbox will not be given focus when the picker is shown */
    def focusOnShow(value: Boolean): Unit = js.native
    
    /** Returns the component's options.format string */
    def format(): Boolean | String | MomentBuiltinFormat = js.native
    def format(format: String): Unit = js.native
    /**
      * Takes a moment.js format string and sets the components options.format.
      * This is used for displaying and also for parsing input strings either from the input element the component is attached to or the date() function.
      * The parameter can also be a boolean:false in which case the format is set to the locale's L LT.
      * Note: this is also used to determine if the TimePicker sub component will display the hours in 12 or 24 format. (if "a" or "h" exists in the passed string then a 12 hour mode is set)
      * Throws:
      * - TypeError - if format is boolean:true
      */
    def format(format: Boolean): Unit = js.native
    def format(format: MomentBuiltinFormat): Unit = js.native
    
    /**
      * Hides the widget
      * Emits:
      * - dp.hide - if the widget was visible before that call
      */
    def hide(): Unit = js.native
    
    /** Returns options.icons */
    def icons(): Icons = js.native
    /**
      * Takes an Object of strings.
      * Throws:
      * - TypeError - if icons parameter is not an Object
      */
    def icons(icons: Icons): Unit = js.native
    
    /** Returns the options.ignoreReadonly option. */
    def ignoreReadonly(): Boolean = js.native
    /** Set this to true to allow the picker to be used even if the input field is readonly. This will not bypass the disabled property */
    def ignoreReadonly(value: Boolean): Unit = js.native
    
    /** Returns the options.inline option. */
    def `inline`(): Boolean = js.native
    /** Used to customize the header of the day view. */
    def `inline`(value: Boolean): Unit = js.native
    
    /** Returns the options.keepInvalid option. */
    def keepInvalid(): Boolean = js.native
    /** If true, invalid dates will not be reverted to a previous selection or changed. */
    def keepInvalid(value: Boolean): Unit = js.native
    
    /** Returns a string variable with the currently set options.keyBinds option. */
    def keyBinds(): js.Any = js.native
    /**
      * Allows for several keyBinding functions to be specified for ease of access or accessibility. For defaults see {@link http://eonasdan.github.io/bootstrap-datetimepicker/Options/#keybinds}.
      */
    def keyBinds(value: js.Any): Unit = js.native
    
    /** Returns the currently set locale of the options.locale */
    def locale(): String = js.native
    /**
      * Takes a string of any valid moment locale e.g. de for German.
      * Throws:
      * - TypeError - if the locale is not loaded via a separate script or moment-with-locale
      */
    def locale(newLocale: String): Unit = js.native
    
    /** Returns the currently set moment of the options.maxDate or false if not set */
    def maxDate(): Moment | Boolean = js.native
    def maxDate(date: String): Unit = js.native
    def maxDate(date: Boolean): Unit = js.native
    /**
      * Takes a parameter and disallows the user to select a moment that is after that moment.
      * If a boolean:false value is passed options.maxDate is cleared and there is no restriction to the maximum moment the user can select.
      * Note: If the parameter is before the currently selected moment the currently selected moment changes to maxDate
      * Throws:
      * - TypeError - if the parameter cannot be parsed using the options.format and options.useStrict configuration settings
      * - TypeError - if the parameter is before options.minDate
      *
      * Emits:
      * - dp.change - if the new maxDate is after currently selected moment
      * - dp.error - if the new maxDate is after currently selected moment
      */
    def maxDate(date: Moment): Unit = js.native
    def maxDate(date: Date): Unit = js.native
    
    /** Returns the currently set moment of the options.minDate or false if not set */
    def minDate(): Moment | Boolean = js.native
    def minDate(date: String): Unit = js.native
    def minDate(date: Boolean): Unit = js.native
    /**
      * Takes a parameter and disallows the user to select a moment that is before that moment.
      * If a boolean:false value is passed the options.minDate parameter is cleared and there is no restriction to the miminum moment the user can select.
      * Note: If the parameter is after the currently selected moment the currently selected moment changes to minDate parameter
      * Throws:
      * - TypeError - if the parameter cannot be parsed using the options.format and options.useStrict configuration settings
      * - TypeError - if the parameter is after options.maxDate
      *
      * Emits:
      * - dp.change - if the new minDate is after currently selected moment
      * - dp.error - if the new minDate is after currently selected moment
      */
    def minDate(date: Moment): Unit = js.native
    def minDate(date: Date): Unit = js.native
    
    /**
      * Returns the components current options object.
      * Note that the changing the values of the returned object does not change the components actual configuration.
      */
    def options(): DatetimepickerOptions = js.native
    /** Takes an object variable with option key:value properties and configures the component. Use this to update multiple options on the component. */
    def options(options: DatetimepickerOptions): Unit = js.native
    
    /** Returns the options.parseInputDate option */
    def parseInputDate(): js.UndefOr[InputParser] = js.native
    /**
      * Allows custom input formatting For example: the user can enter "yesterday"" or "30 days ago".
      * {@link http://eonasdan.github.io/bootstrap-datetimepicker/Functions/#parseinputdate}
      */
    def parseInputDate(value: InputParser): Unit = js.native
    
    /**
      * Shows the widget
      * Emits:
      * - dp.show - if the widget was hidden before that call
      * - dp.change - if the widget is opened for the first time and the useCurrent is set to true or to a granularity value and the input element the component is attached to has an empty value
      */
    def show(): Unit = js.native
    
    /** Returns the options.showClear option. */
    def showClear(): Boolean = js.native
    /** Set if the clear date button will appear on the widget */
    def showClear(value: Boolean): Unit = js.native
    
    /** Returns the options.showClose option. */
    def showClose(): Boolean = js.native
    /** If true, an icon will be displayed on the toolbar that will hide the picker */
    def showClose(value: Boolean): Unit = js.native
    
    /** Returns the options.showTodayButton option. */
    def showTodayButton(): Boolean = js.native
    /** Set if the Today button will appear on the widget */
    def showTodayButton(value: Boolean): Unit = js.native
    
    /** Returns a boolean of the options.sideBySide. */
    def sideBySide(): Boolean = js.native
    /** If sideBySide is true and the time picker is used, both components will display side by side instead of collapsing. */
    def sideBySide(value: Boolean): Unit = js.native
    
    /** Returns a number with the options.stepping option configuration */
    def stepping(): Double = js.native
    /** This will be the amount the up/down arrows move the minute value with a time picker. */
    def stepping(step: Double): Unit = js.native
    
    /** Returns a string of options.timeZone */
    def timeZone(): String | Null = js.native
    def timeZone(timeZone: String): Unit = js.native
    /**
      * Takes a null or a string of a valid timezone.
      * Throws:
      * - TypeError - if tooltips parameter is not a string or null
      */
    @JSName("timeZone")
    def timeZone_Unit(): Unit = js.native
    
    /**
      * Shows or hides the widget
      * Emits:
      * - dp.hide - if the widget is hidden after the toggle call
      * - dp.show - if the widget is show after the toggle call
      * - dp.change - if the widget is opened for the first time and the input element is empty and options.useCurrent != false
      */
    def toggle(): Unit = js.native
    
    /** Returns the options.toolbarplacement option. */
    def toolbarPlacement(): String = js.native
    /**
      * Changes the placement of the toolbar where the today, clear, component switch icon are located.
      * See valid values at DatetimepickerOptions.toolbarplacement
      * Throws:
      * - TypeError - if the parameter is not a valid value
      */
    def toolbarPlacement(value: String): Unit = js.native
    
    /** Returns the options.tooltips option */
    def tooltips(): Tooltips = js.native
    /**
      * Sets the tooltips for icons.
      * Throws:
      * - TypeError - if tooltips parameter is not an Object
      */
    def tooltips(value: Tooltips): Unit = js.native
    
    /** Returns the options.useCurrent option configuration */
    def useCurrent(): Boolean | String = js.native
    def useCurrent(value: String): Unit = js.native
    /**
      * Takes a boolean or string.
      * If a boolean true is passed and the components model moment is not set (either through setDate or through a valid value on the input element the component is attached to)
      * then the first time the user opens the datetimepicker widget the value is initialized to the current moment of the action.
      * If a false boolean is passed then no initialization happens on the input element.
      * You can select the granularity on the initialized moment by passing one of the following strings ("year", "month", "day", "hour", "minute") in the variable.
      * If for example you pass "day" to the useCurrent function and the input field is empty the first time the user opens the datetimepicker widget the input text will be
      * initialized to the current datetime with day granularity (ie if currentTime = 2014-08-10 13:32:33 the input value will be initialized to 2014-08-10 00:00:00)
      * Note: If the options.defaultDate is set or the input element the component is attached to has already a value that takes precedence and the functionality of useCurrent is not triggered!
      */
    def useCurrent(value: Boolean): Unit = js.native
    
    /** Returns the options.useStrict */
    def useStrict(): Boolean = js.native
    /** If useStrict is true, momentjs parsing rules will be stricter when determining if a date is valid or not. */
    def useStrict(value: Boolean): Unit = js.native
    
    /** Returns the options.viewDate option. */
    def viewDate(): Boolean | Moment = js.native
    /** This will change the viewDate without changing or setting the selected date. */
    def viewDate(value: String): Unit = js.native
    def viewDate(value: Boolean): Unit = js.native
    def viewDate(value: Moment): Unit = js.native
    def viewDate(value: Date): Unit = js.native
    
    /** Returns the options.viewMode. */
    def viewMode(): String = js.native
    /**
      * Takes a string. See valid values at DatetimepickerOptions.viewMode
      * Throws:
      * - TypeError - if the parameter is not a string or not a valid value
      */
    def viewMode(value: String): Unit = js.native
    
    /** Returns a $(element) variable with the currently set options.widgetParent option. */
    def widgetParent(): String | JQuery | Null = js.native
    def widgetParent(widgetParent: String): Unit = js.native
    def widgetParent(widgetParent: JQuery): Unit = js.native
    /** Takes a string or $(element) value. */
    @JSName("widgetParent")
    def widgetParent_Unit(): Unit = js.native
    
    /** Returns the options.widgetPositioning object */
    def widgetPositioning(): WidgetPositioningOptions = js.native
    /**
      * WidgetPositioning defines where the dropdown with the widget will appear relative to the input element the component is attached to.
      * "auto" is the default value for both horizontal and vertical keys and it tries to automatically place the dropdown in a position that is visible to the user.
      * Usually you should not override those options unless you have a special need in your layout.
      */
    def widgetPositioning(value: WidgetPositioningOptions): Unit = js.native
  }
  
  @js.native
  trait DatetimepickerOptions extends StObject {
    
    /**
      * If true, the picker will show on textbox focus and icon click when used in a button group
      * @default: false
      */
    var allowInputToggle: js.UndefOr[Boolean] = js.native
    
    /**
      * Shows the week of the year to the left of first day of the week.
      * @default: false
      */
    var calendarWeeks: js.UndefOr[Boolean] = js.native
    
    /**
      * Using a Bootstraps collapse to switch between date/time pickers.
      * @default: true
      */
    var collapse: js.UndefOr[Boolean] = js.native
    
    /**
      * Changes the heading of the datepicker when in "days" view.
      * @default: "MMMM YYYY"
      */
    var dayViewHeaderFormat: js.UndefOr[String] = js.native
    
    /**
      * Disables the section of days of the week, e.g. weekends.
      * Accepts: array of numbers from 0-6
      * @default: false
      */
    var daysOfWeekDisabled: js.UndefOr[js.Array[Double] | Boolean] = js.native
    
    /**
      * Will cause the date picker to stay open after a blur event.
      * @default: false
      */
    var debug: js.UndefOr[Boolean] = js.native
    
    /**
      * Sets the picker default date/time. Overrides useCurrent
      * @default: false
      */
    var defaultDate: js.UndefOr[Boolean | Moment | Date | String] = js.native
    
    /**
      * Disables selection of dates in the array, e.g. holidays
      * @default: false
      * IMPORTANT! The getter returns an Object NOT an Array, with keys being the dates, values being true.
      * eg disabledDates = ["2010-10-10"]; -> disabledDated will be { "2010-01-01": true }
      * https://github.com/Eonasdan/bootstrap-datetimepicker/issues/1499
      */
    var disabledDates: js.UndefOr[Boolean | (js.Array[Moment | Date | String]) | js.Any] = js.native
    
    /**
      * Will allow or disallow hour selections (much like disabledTimeIntervals) but will affect all days
      * @default: false
      * IMPORTANT! The getter returns an Object NOT an Array, with keys being the hours, values being true.
      * eg disabledHours = [0, 1]; -> disabledHours will be { "0": true, "1": true }
      * https://github.com/Eonasdan/bootstrap-datetimepicker/issues/1499
      */
    var disabledHours: js.UndefOr[Boolean | js.Array[Double] | js.Any] = js.native
    
    /**
      * Disables time selection between the given moments
      * eg: [[moment({ h: 0 }), moment({ h: 8 })], [moment({ h: 18 }), moment({ h: 24 })]]
      * @default: false
      */
    var disabledTimeIntervals: js.UndefOr[Boolean | js.Array[js.Array[Moment]]] = js.native
    
    /**
      * Disables selection of dates NOT in the array, e.g. holidays
      * @default: false
      * IMPORTANT! The getter returns an Object NOT an Array, with keys being the dates, values being true.
      * eg enabledDates = ["2010-10-10"]; -> enabledDated will be { "2010-01-01": true }
      * https://github.com/Eonasdan/bootstrap-datetimepicker/issues/1499
      */
    var enabledDates: js.UndefOr[Boolean | (js.Array[Moment | Date | String]) | js.Any] = js.native
    
    /**
      * Will allow or disallow hour selections (much like disabledTimeIntervals) but will affect all days
      * @default: false
      * IMPORTANT! The getter returns an Object NOT an Array, with keys being the hours, values being true.
      * eg enabledHours = [0, 1]; -> enabledHours will be { "0": true, "1": true }
      * https://github.com/Eonasdan/bootstrap-datetimepicker/issues/1499
      */
    var enabledHours: js.UndefOr[Boolean | js.Array[Double]] = js.native
    
    /**
      * Allows for several input formats to be valid. See: https://github.com/Eonasdan/bootstrap-datetimepicker/pull/666
      * @default: false
      */
    var extraFormats: js.UndefOr[Boolean | (js.Array[String | MomentBuiltinFormat])] = js.native
    
    /**
      * If false, the textbox will not be given focus when the picker is shown
      * @default: true
      */
    var focusOnShow: js.UndefOr[Boolean] = js.native
    
    /**
      * See momentjs' docs for valid formats. Format also dictates what components are shown, e.g. MM/dd/YYYY will not display the time picker.
      * @default: false
      */
    var format: js.UndefOr[Boolean | String | MomentBuiltinFormat] = js.native
    
    /** Change the default icons for the pickers functions. */
    var icons: js.UndefOr[Icons] = js.native
    
    /**
      * Allow date picker show event to fire even when the associated input element has the readonly="readonly"property.
      * @default: false
      */
    var ignoreReadonly: js.UndefOr[Boolean] = js.native
    
    /**
      * Will display the picker inline without the need of a input field. This will also hide borders and shadows.
      * @default: false
      */
    var `inline`: js.UndefOr[Boolean] = js.native
    
    /**
      * Will cause the date picker to not revert or overwrite invalid dates.
      * @default: false
      */
    var keepInvalid: js.UndefOr[Boolean] = js.native
    
    /**
      * Will cause the date picker to stay open after selecting a date if no time components are being used.
      * @default: false
      */
    var keepOpen: js.UndefOr[Boolean] = js.native
    
    /**
      * Allows for custom events to fire on keyboard press.
      * eg: keybinds: {
      *         up: (widget) => console.log(widget),
      *         "control up": (widget) => console.log(widget)
      * }
      * The widget parameter is false, if the datepicker is closed.
      */
    var keyBinds: js.UndefOr[StringDictionary[js.Function1[/* widget */ Boolean | JQuery, Unit]]] = js.native
    
    /**
      * See momentjs for valid locales. You must include moment-with-locales.js or a local js file.
      * @default: moment.locale()
      */
    var locale: js.UndefOr[String] = js.native
    
    /**
      * Prevents date/time selections after this date.
      * maxDate will override defaultDate and useCurrent if either of these settings are the same day since both options are invalid according to the rules you've selected.
      * @default: false
      */
    var maxDate: js.UndefOr[Boolean | Moment | Date | String] = js.native
    
    /**
      * Prevents date/time selections before this date.
      * minDate will override defaultDate and useCurrent if either of these settings are the same day since both options are invalid according to the rules you've selected.
      * @default: false
      */
    var minDate: js.UndefOr[Boolean | Moment | Date | String] = js.native
    
    /**
      * Allows custom input formatting For example: the user can enter "yesterday"" or "30 days ago".
      * {@link http://eonasdan.github.io/bootstrap-datetimepicker/Functions/#parseinputdate}
      */
    var parseInputDate: js.UndefOr[InputParser] = js.native
    
    /**
      * Show the "Clear" button in the icon toolbar.
      * Clicking the "Clear" button will set the calendar to null.
      * @default: false
      */
    var showClear: js.UndefOr[Boolean] = js.native
    
    /**
      * Show the "Close" button in the icon toolbar.
      * Clicking the "Close" button will call hide()
      * @default: false
      */
    var showClose: js.UndefOr[Boolean] = js.native
    
    /**
      * Show the "Today" button in the icon toolbar.
      * Clicking the "Today" button will set the calendar view and set the date to now.
      * @default: false
      */
    var showTodayButton: js.UndefOr[Boolean] = js.native
    
    /**
      * Shows the picker side by side when using the time and date together.
      * @default: false
      */
    var sideBySide: js.UndefOr[Boolean] = js.native
    
    /**
      * Number of minutes the up/down arrow's will move the minutes value in the time picker
      * @default: 1
      */
    var stepping: js.UndefOr[Double] = js.native
    
    /**
      * Timezone to use, if moment-timezone is loaded. If null or empty string, ignore timezones.
      * @default: ""
      */
    var timeZone: js.UndefOr[String | Null] = js.native
    
    /**
      * Changes the placement of the icon toolbar.
      * @default: "default"
      */
    var toolbarPlacement: js.UndefOr[default | top | bottom] = js.native
    
    /** This will change the tooltips over each icon to a custom string */
    var tooltips: js.UndefOr[Tooltips] = js.native
    
    /**
      * On show, will set the picker to the current date/time
      * @default: true
      */
    var useCurrent: js.UndefOr[Boolean] = js.native
    
    /**
      * Defines if moment should use strict date parsing when considering a date to be valid
      * @default: false
      */
    var useStrict: js.UndefOr[Boolean] = js.native
    
    /**
      * This will change the viewDate without changing or setting the selected date.
      * @default: false
      */
    var viewDate: js.UndefOr[Boolean | Moment | Date | String] = js.native
    
    /**
      * The default view to display when the picker is shown.
      * Note: To limit the picker to selecting, for instance the year and month, use format: MM/YYYY
      * @default: "days"
      */
    var viewMode: js.UndefOr[decades | years | months | days] = js.native
    
    /**
      * On picker show, places the widget at the identifier (string) or jQuery object if the element has css position: "relative"
      * @default: null
      */
    var widgetParent: js.UndefOr[String | JQuery | Null] = js.native
    
    var widgetPositioning: js.UndefOr[WidgetPositioningOptions] = js.native
  }
  object DatetimepickerOptions {
    
    @scala.inline
    def apply(): DatetimepickerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DatetimepickerOptions]
    }
    
    @scala.inline
    implicit class DatetimepickerOptionsMutableBuilder[Self <: DatetimepickerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowInputToggle(value: Boolean): Self = StObject.set(x, "allowInputToggle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowInputToggleUndefined: Self = StObject.set(x, "allowInputToggle", js.undefined)
      
      @scala.inline
      def setCalendarWeeks(value: Boolean): Self = StObject.set(x, "calendarWeeks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCalendarWeeksUndefined: Self = StObject.set(x, "calendarWeeks", js.undefined)
      
      @scala.inline
      def setCollapse(value: Boolean): Self = StObject.set(x, "collapse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapseUndefined: Self = StObject.set(x, "collapse", js.undefined)
      
      @scala.inline
      def setDayViewHeaderFormat(value: String): Self = StObject.set(x, "dayViewHeaderFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayViewHeaderFormatUndefined: Self = StObject.set(x, "dayViewHeaderFormat", js.undefined)
      
      @scala.inline
      def setDaysOfWeekDisabled(value: js.Array[Double] | Boolean): Self = StObject.set(x, "daysOfWeekDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDaysOfWeekDisabledUndefined: Self = StObject.set(x, "daysOfWeekDisabled", js.undefined)
      
      @scala.inline
      def setDaysOfWeekDisabledVarargs(value: Double*): Self = StObject.set(x, "daysOfWeekDisabled", js.Array(value :_*))
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setDefaultDate(value: Boolean | Moment | Date | String): Self = StObject.set(x, "defaultDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultDateUndefined: Self = StObject.set(x, "defaultDate", js.undefined)
      
      @scala.inline
      def setDisabledDates(value: Boolean | (js.Array[Moment | Date | String]) | js.Any): Self = StObject.set(x, "disabledDates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledDatesUndefined: Self = StObject.set(x, "disabledDates", js.undefined)
      
      @scala.inline
      def setDisabledDatesVarargs(value: (Moment | Date | String)*): Self = StObject.set(x, "disabledDates", js.Array(value :_*))
      
      @scala.inline
      def setDisabledHours(value: Boolean | js.Array[Double] | js.Any): Self = StObject.set(x, "disabledHours", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledHoursUndefined: Self = StObject.set(x, "disabledHours", js.undefined)
      
      @scala.inline
      def setDisabledHoursVarargs(value: Double*): Self = StObject.set(x, "disabledHours", js.Array(value :_*))
      
      @scala.inline
      def setDisabledTimeIntervals(value: Boolean | js.Array[js.Array[Moment]]): Self = StObject.set(x, "disabledTimeIntervals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledTimeIntervalsUndefined: Self = StObject.set(x, "disabledTimeIntervals", js.undefined)
      
      @scala.inline
      def setDisabledTimeIntervalsVarargs(value: js.Array[Moment]*): Self = StObject.set(x, "disabledTimeIntervals", js.Array(value :_*))
      
      @scala.inline
      def setEnabledDates(value: Boolean | (js.Array[Moment | Date | String]) | js.Any): Self = StObject.set(x, "enabledDates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledDatesUndefined: Self = StObject.set(x, "enabledDates", js.undefined)
      
      @scala.inline
      def setEnabledDatesVarargs(value: (Moment | Date | String)*): Self = StObject.set(x, "enabledDates", js.Array(value :_*))
      
      @scala.inline
      def setEnabledHours(value: Boolean | js.Array[Double]): Self = StObject.set(x, "enabledHours", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledHoursUndefined: Self = StObject.set(x, "enabledHours", js.undefined)
      
      @scala.inline
      def setEnabledHoursVarargs(value: Double*): Self = StObject.set(x, "enabledHours", js.Array(value :_*))
      
      @scala.inline
      def setExtraFormats(value: Boolean | (js.Array[String | MomentBuiltinFormat])): Self = StObject.set(x, "extraFormats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraFormatsUndefined: Self = StObject.set(x, "extraFormats", js.undefined)
      
      @scala.inline
      def setExtraFormatsVarargs(value: (String | MomentBuiltinFormat)*): Self = StObject.set(x, "extraFormats", js.Array(value :_*))
      
      @scala.inline
      def setFocusOnShow(value: Boolean): Self = StObject.set(x, "focusOnShow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusOnShowUndefined: Self = StObject.set(x, "focusOnShow", js.undefined)
      
      @scala.inline
      def setFormat(value: Boolean | String | MomentBuiltinFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setIcons(value: Icons): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
      
      @scala.inline
      def setIgnoreReadonly(value: Boolean): Self = StObject.set(x, "ignoreReadonly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreReadonlyUndefined: Self = StObject.set(x, "ignoreReadonly", js.undefined)
      
      @scala.inline
      def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      @scala.inline
      def setKeepInvalid(value: Boolean): Self = StObject.set(x, "keepInvalid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepInvalidUndefined: Self = StObject.set(x, "keepInvalid", js.undefined)
      
      @scala.inline
      def setKeepOpen(value: Boolean): Self = StObject.set(x, "keepOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepOpenUndefined: Self = StObject.set(x, "keepOpen", js.undefined)
      
      @scala.inline
      def setKeyBinds(value: StringDictionary[js.Function1[/* widget */ Boolean | JQuery, Unit]]): Self = StObject.set(x, "keyBinds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyBindsUndefined: Self = StObject.set(x, "keyBinds", js.undefined)
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setMaxDate(value: Boolean | Moment | Date | String): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      @scala.inline
      def setMinDate(value: Boolean | Moment | Date | String): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      @scala.inline
      def setParseInputDate(value: /* input */ String | Date | Moment => Moment): Self = StObject.set(x, "parseInputDate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setParseInputDateUndefined: Self = StObject.set(x, "parseInputDate", js.undefined)
      
      @scala.inline
      def setShowClear(value: Boolean): Self = StObject.set(x, "showClear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowClearUndefined: Self = StObject.set(x, "showClear", js.undefined)
      
      @scala.inline
      def setShowClose(value: Boolean): Self = StObject.set(x, "showClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowCloseUndefined: Self = StObject.set(x, "showClose", js.undefined)
      
      @scala.inline
      def setShowTodayButton(value: Boolean): Self = StObject.set(x, "showTodayButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowTodayButtonUndefined: Self = StObject.set(x, "showTodayButton", js.undefined)
      
      @scala.inline
      def setSideBySide(value: Boolean): Self = StObject.set(x, "sideBySide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSideBySideUndefined: Self = StObject.set(x, "sideBySide", js.undefined)
      
      @scala.inline
      def setStepping(value: Double): Self = StObject.set(x, "stepping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSteppingUndefined: Self = StObject.set(x, "stepping", js.undefined)
      
      @scala.inline
      def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeZoneNull: Self = StObject.set(x, "timeZone", null)
      
      @scala.inline
      def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
      
      @scala.inline
      def setToolbarPlacement(value: default | top | bottom): Self = StObject.set(x, "toolbarPlacement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolbarPlacementUndefined: Self = StObject.set(x, "toolbarPlacement", js.undefined)
      
      @scala.inline
      def setTooltips(value: Tooltips): Self = StObject.set(x, "tooltips", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipsUndefined: Self = StObject.set(x, "tooltips", js.undefined)
      
      @scala.inline
      def setUseCurrent(value: Boolean): Self = StObject.set(x, "useCurrent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseCurrentUndefined: Self = StObject.set(x, "useCurrent", js.undefined)
      
      @scala.inline
      def setUseStrict(value: Boolean): Self = StObject.set(x, "useStrict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseStrictUndefined: Self = StObject.set(x, "useStrict", js.undefined)
      
      @scala.inline
      def setViewDate(value: Boolean | Moment | Date | String): Self = StObject.set(x, "viewDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewDateUndefined: Self = StObject.set(x, "viewDate", js.undefined)
      
      @scala.inline
      def setViewMode(value: decades | years | months | days): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewModeUndefined: Self = StObject.set(x, "viewMode", js.undefined)
      
      @scala.inline
      def setWidgetParent(value: String | JQuery): Self = StObject.set(x, "widgetParent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidgetParentNull: Self = StObject.set(x, "widgetParent", null)
      
      @scala.inline
      def setWidgetParentUndefined: Self = StObject.set(x, "widgetParent", js.undefined)
      
      @scala.inline
      def setWidgetPositioning(value: WidgetPositioningOptions): Self = StObject.set(x, "widgetPositioning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidgetPositioningUndefined: Self = StObject.set(x, "widgetPositioning", js.undefined)
    }
  }
  
  @js.native
  trait Event extends JQueryEventObject {
    
    var date: Moment = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.bootstrapV3Datetimepicker.bootstrapV3DatetimepickerStrings.dpDotshow
    - typings.bootstrapV3Datetimepicker.bootstrapV3DatetimepickerStrings.dpDothide
    - typings.bootstrapV3Datetimepicker.bootstrapV3DatetimepickerStrings.dpDoterror
  */
  trait EventName extends StObject
  object EventName {
    
    @scala.inline
    def dpDoterror: typings.bootstrapV3Datetimepicker.bootstrapV3DatetimepickerStrings.dpDoterror = "dp.error".asInstanceOf[typings.bootstrapV3Datetimepicker.bootstrapV3DatetimepickerStrings.dpDoterror]
    
    @scala.inline
    def dpDothide: typings.bootstrapV3Datetimepicker.bootstrapV3DatetimepickerStrings.dpDothide = "dp.hide".asInstanceOf[typings.bootstrapV3Datetimepicker.bootstrapV3DatetimepickerStrings.dpDothide]
    
    @scala.inline
    def dpDotshow: typings.bootstrapV3Datetimepicker.bootstrapV3DatetimepickerStrings.dpDotshow = "dp.show".asInstanceOf[typings.bootstrapV3Datetimepicker.bootstrapV3DatetimepickerStrings.dpDotshow]
  }
  
  @js.native
  trait Icons extends StObject {
    
    /** default: "glyphicon glyphicon-trash" */
    var clear: js.UndefOr[String] = js.native
    
    /** default: "glyphicon glyphicon-remove" */
    var close: js.UndefOr[String] = js.native
    
    /** default: "glyphicon glyphicon-calendar" */
    var date: js.UndefOr[String] = js.native
    
    /** default: "glyphicon glyphicon-time" */
    var down: js.UndefOr[String] = js.native
    
    /** default: "glyphicon glyphicon-chevron-left" */
    var next: js.UndefOr[String] = js.native
    
    /** default: "glyphicon glyphicon-screenshot" */
    var previous: js.UndefOr[String] = js.native
    
    /** default: "glyphicon glyphicon-chevron-right" */
    var time: js.UndefOr[String] = js.native
    
    /** default: "glyphicon glyphicon-chevron-down" */
    var today: js.UndefOr[String] = js.native
    
    /** default: "glyphicon glyphicon-chevron-up" */
    var up: js.UndefOr[String] = js.native
  }
  object Icons {
    
    @scala.inline
    def apply(): Icons = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Icons]
    }
    
    @scala.inline
    implicit class IconsMutableBuilder[Self <: Icons] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClear(value: String): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
      
      @scala.inline
      def setClose(value: String): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      @scala.inline
      def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      @scala.inline
      def setDown(value: String): Self = StObject.set(x, "down", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownUndefined: Self = StObject.set(x, "down", js.undefined)
      
      @scala.inline
      def setNext(value: String): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      @scala.inline
      def setPrevious(value: String): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
      
      @scala.inline
      def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
      
      @scala.inline
      def setToday(value: String): Self = StObject.set(x, "today", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTodayUndefined: Self = StObject.set(x, "today", js.undefined)
      
      @scala.inline
      def setUp(value: String): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpUndefined: Self = StObject.set(x, "up", js.undefined)
    }
  }
  
  type InputParser = js.Function1[/* input */ String | Date | Moment, Moment]
  
  @js.native
  trait Tooltips extends StObject {
    
    var clear: js.UndefOr[String] = js.native
    
    var close: js.UndefOr[String] = js.native
    
    var decrementHour: js.UndefOr[String] = js.native
    
    var decrementMinute: js.UndefOr[String] = js.native
    
    var decrementSecond: js.UndefOr[String] = js.native
    
    var incrementHour: js.UndefOr[String] = js.native
    
    var incrementMinute: js.UndefOr[String] = js.native
    
    var incrementSecond: js.UndefOr[String] = js.native
    
    var nextCentury: js.UndefOr[String] = js.native
    
    var nextDecade: js.UndefOr[String] = js.native
    
    var nextMonth: js.UndefOr[String] = js.native
    
    var nextYear: js.UndefOr[String] = js.native
    
    var pickHour: js.UndefOr[String] = js.native
    
    var pickMinute: js.UndefOr[String] = js.native
    
    var pickSecond: js.UndefOr[String] = js.native
    
    var prevCentury: js.UndefOr[String] = js.native
    
    var prevDecade: js.UndefOr[String] = js.native
    
    var prevMonth: js.UndefOr[String] = js.native
    
    var prevYear: js.UndefOr[String] = js.native
    
    var selectDecade: js.UndefOr[String] = js.native
    
    var selectMonth: js.UndefOr[String] = js.native
    
    var selectTime: js.UndefOr[String] = js.native
    
    var selectYear: js.UndefOr[String] = js.native
    
    var today: js.UndefOr[String] = js.native
    
    var togglePeriod: js.UndefOr[String] = js.native
  }
  object Tooltips {
    
    @scala.inline
    def apply(): Tooltips = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Tooltips]
    }
    
    @scala.inline
    implicit class TooltipsMutableBuilder[Self <: Tooltips] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClear(value: String): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
      
      @scala.inline
      def setClose(value: String): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      @scala.inline
      def setDecrementHour(value: String): Self = StObject.set(x, "decrementHour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecrementHourUndefined: Self = StObject.set(x, "decrementHour", js.undefined)
      
      @scala.inline
      def setDecrementMinute(value: String): Self = StObject.set(x, "decrementMinute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecrementMinuteUndefined: Self = StObject.set(x, "decrementMinute", js.undefined)
      
      @scala.inline
      def setDecrementSecond(value: String): Self = StObject.set(x, "decrementSecond", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecrementSecondUndefined: Self = StObject.set(x, "decrementSecond", js.undefined)
      
      @scala.inline
      def setIncrementHour(value: String): Self = StObject.set(x, "incrementHour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncrementHourUndefined: Self = StObject.set(x, "incrementHour", js.undefined)
      
      @scala.inline
      def setIncrementMinute(value: String): Self = StObject.set(x, "incrementMinute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncrementMinuteUndefined: Self = StObject.set(x, "incrementMinute", js.undefined)
      
      @scala.inline
      def setIncrementSecond(value: String): Self = StObject.set(x, "incrementSecond", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncrementSecondUndefined: Self = StObject.set(x, "incrementSecond", js.undefined)
      
      @scala.inline
      def setNextCentury(value: String): Self = StObject.set(x, "nextCentury", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextCenturyUndefined: Self = StObject.set(x, "nextCentury", js.undefined)
      
      @scala.inline
      def setNextDecade(value: String): Self = StObject.set(x, "nextDecade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextDecadeUndefined: Self = StObject.set(x, "nextDecade", js.undefined)
      
      @scala.inline
      def setNextMonth(value: String): Self = StObject.set(x, "nextMonth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextMonthUndefined: Self = StObject.set(x, "nextMonth", js.undefined)
      
      @scala.inline
      def setNextYear(value: String): Self = StObject.set(x, "nextYear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextYearUndefined: Self = StObject.set(x, "nextYear", js.undefined)
      
      @scala.inline
      def setPickHour(value: String): Self = StObject.set(x, "pickHour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickHourUndefined: Self = StObject.set(x, "pickHour", js.undefined)
      
      @scala.inline
      def setPickMinute(value: String): Self = StObject.set(x, "pickMinute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickMinuteUndefined: Self = StObject.set(x, "pickMinute", js.undefined)
      
      @scala.inline
      def setPickSecond(value: String): Self = StObject.set(x, "pickSecond", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickSecondUndefined: Self = StObject.set(x, "pickSecond", js.undefined)
      
      @scala.inline
      def setPrevCentury(value: String): Self = StObject.set(x, "prevCentury", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevCenturyUndefined: Self = StObject.set(x, "prevCentury", js.undefined)
      
      @scala.inline
      def setPrevDecade(value: String): Self = StObject.set(x, "prevDecade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevDecadeUndefined: Self = StObject.set(x, "prevDecade", js.undefined)
      
      @scala.inline
      def setPrevMonth(value: String): Self = StObject.set(x, "prevMonth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevMonthUndefined: Self = StObject.set(x, "prevMonth", js.undefined)
      
      @scala.inline
      def setPrevYear(value: String): Self = StObject.set(x, "prevYear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevYearUndefined: Self = StObject.set(x, "prevYear", js.undefined)
      
      @scala.inline
      def setSelectDecade(value: String): Self = StObject.set(x, "selectDecade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectDecadeUndefined: Self = StObject.set(x, "selectDecade", js.undefined)
      
      @scala.inline
      def setSelectMonth(value: String): Self = StObject.set(x, "selectMonth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectMonthUndefined: Self = StObject.set(x, "selectMonth", js.undefined)
      
      @scala.inline
      def setSelectTime(value: String): Self = StObject.set(x, "selectTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectTimeUndefined: Self = StObject.set(x, "selectTime", js.undefined)
      
      @scala.inline
      def setSelectYear(value: String): Self = StObject.set(x, "selectYear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectYearUndefined: Self = StObject.set(x, "selectYear", js.undefined)
      
      @scala.inline
      def setToday(value: String): Self = StObject.set(x, "today", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTodayUndefined: Self = StObject.set(x, "today", js.undefined)
      
      @scala.inline
      def setTogglePeriod(value: String): Self = StObject.set(x, "togglePeriod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTogglePeriodUndefined: Self = StObject.set(x, "togglePeriod", js.undefined)
    }
  }
  
  @js.native
  trait UpdateEvent extends JQueryEventObject {
    
    /** Change type as a momentjs format token. e.g. yyyy on year change */
    var change: String = js.native
    
    /** New viewDate. */
    var viewDate: Moment = js.native
  }
  
  @js.native
  trait WidgetPositioningOptions extends StObject {
    
    var horizontal: js.UndefOr[auto | left | right] = js.native
    
    var vertical: js.UndefOr[auto | top | bottom] = js.native
  }
  object WidgetPositioningOptions {
    
    @scala.inline
    def apply(): WidgetPositioningOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WidgetPositioningOptions]
    }
    
    @scala.inline
    implicit class WidgetPositioningOptionsMutableBuilder[Self <: WidgetPositioningOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHorizontal(value: auto | left | right): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      @scala.inline
      def setVertical(value: auto | top | bottom): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
  
  object global {
    
    @js.native
    trait JQuery extends StObject {
      
      @JSName("data")
      def data_DateTimePicker(key: DateTimePicker): Datetimepicker = js.native
      
      /**
        * JQuery plugin function.
        */
      def datetimepicker(): JQuery = js.native
      def datetimepicker(options: DatetimepickerOptions): JQuery = js.native
      @JSName("datetimepicker")
      var datetimepicker_Original: Datetimepicker = js.native
      
      def off(events: EventName): JQuery = js.native
      def off(events: EventName, handler: js.Function1[/* eventobject */ Event, _]): JQuery = js.native
      def off(
        events: EventName,
        selector: js.UndefOr[scala.Nothing],
        handler: js.Function1[/* eventobject */ Event, _]
      ): JQuery = js.native
      def off(events: EventName, selector: String): JQuery = js.native
      def off(events: EventName, selector: String, handler: js.Function1[/* eventobject */ Event, _]): JQuery = js.native
      @JSName("off")
      def off_dpchange(events: dpDotchange): JQuery = js.native
      @JSName("off")
      def off_dpchange(events: dpDotchange, handler: js.Function1[/* eventobject */ ChangeEvent, _]): JQuery = js.native
      @JSName("off")
      def off_dpchange(
        events: dpDotchange,
        selector: js.UndefOr[scala.Nothing],
        handler: js.Function1[/* eventobject */ ChangeEvent, _]
      ): JQuery = js.native
      @JSName("off")
      def off_dpchange(events: dpDotchange, selector: String): JQuery = js.native
      @JSName("off")
      def off_dpchange(events: dpDotchange, selector: String, handler: js.Function1[/* eventobject */ ChangeEvent, _]): JQuery = js.native
      @JSName("off")
      def off_dpupdate(events: dpDotupdate): JQuery = js.native
      @JSName("off")
      def off_dpupdate(events: dpDotupdate, handler: js.Function1[/* eventobject */ UpdateEvent, _]): JQuery = js.native
      @JSName("off")
      def off_dpupdate(
        events: dpDotupdate,
        selector: js.UndefOr[scala.Nothing],
        handler: js.Function1[/* eventobject */ UpdateEvent, _]
      ): JQuery = js.native
      @JSName("off")
      def off_dpupdate(events: dpDotupdate, selector: String): JQuery = js.native
      @JSName("off")
      def off_dpupdate(events: dpDotupdate, selector: String, handler: js.Function1[/* eventobject */ UpdateEvent, _]): JQuery = js.native
      
      def on(events: EventName, handler: js.Function1[/* eventObject */ Event, _]): JQuery = js.native
      def on(events: EventName, selector: String, data: js.Any): JQuery = js.native
      def on(
        events: EventName,
        selector: String,
        data: js.Any,
        handler: js.Function1[/* eventobject */ Event, _]
      ): JQuery = js.native
      def on(events: EventName, selector: String, handler: js.Function1[/* eventobject */ Event, _]): JQuery = js.native
      @JSName("on")
      def on_dpchange(events: dpDotchange, handler: js.Function1[/* eventObject */ ChangeEvent, _]): JQuery = js.native
      @JSName("on")
      def on_dpchange(events: dpDotchange, selector: String, data: js.Any): JQuery = js.native
      @JSName("on")
      def on_dpchange(
        events: dpDotchange,
        selector: String,
        data: js.Any,
        handler: js.Function1[/* eventobject */ ChangeEvent, _]
      ): JQuery = js.native
      @JSName("on")
      def on_dpchange(events: dpDotchange, selector: String, handler: js.Function1[/* eventobject */ ChangeEvent, _]): JQuery = js.native
      @JSName("on")
      def on_dpupdate(events: dpDotupdate, handler: js.Function1[/* eventObject */ UpdateEvent, _]): JQuery = js.native
      @JSName("on")
      def on_dpupdate(events: dpDotupdate, selector: String, data: js.Any): JQuery = js.native
      @JSName("on")
      def on_dpupdate(
        events: dpDotupdate,
        selector: String,
        data: js.Any,
        handler: js.Function1[/* eventobject */ UpdateEvent, _]
      ): JQuery = js.native
      @JSName("on")
      def on_dpupdate(events: dpDotupdate, selector: String, handler: js.Function1[/* eventobject */ UpdateEvent, _]): JQuery = js.native
    }
  }
}
