package typings
package bootstrapDotV3DotDatetimepickerLib.bootstrapDotV3DotDatetimepickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Datetimepicker extends js.Object {
  /**
  	 * Default options that will be used for all instances.
  	 * To change: `$.fn.datetimepicker.defaults`
  	 */
  var defaults: DatetimepickerOptions = js.native
  /**
  	 * JQuery plugin function.
  	 */
  def apply(): bootstrapDotV3DotDatetimepickerLib.bootstrapDotV3DotDatetimepickerMod.Global.JQuery = js.native
  def apply(options: DatetimepickerOptions): bootstrapDotV3DotDatetimepickerLib.bootstrapDotV3DotDatetimepickerMod.Global.JQuery = js.native
  ////////////////////////////////////////////////////////////////////////////////////////////////////
  //// Below are the getters/setters for the properties of the 'options(): DatetimepickerOptions' ////
  ////////////////////////////////////////////////////////////////////////////////////////////////////
  /** Returns the options.allowInputToggle option. */
  def allowInputToggle(): scala.Boolean = js.native
  /** If true, the picker will show on textbox focus and icon click when used in a button group */
  def allowInputToggle(value: scala.Boolean): scala.Unit = js.native
  /** Returns the current options.calendarWeeks option configuration */
  def calendarWeeks(): scala.Boolean = js.native
  /** Set if the week numbers will appear to the left on the days view */
  def calendarWeeks(value: scala.Boolean): scala.Unit = js.native
  /** Clears the datepicker by setting the value to null */
  def clear(): scala.Unit = js.native
  /** Returns the options.collapse option configuration */
  def collapse(): scala.Boolean = js.native
  /** If set to false the picker will display similar to sideBySide except vertical. */
  def collapse(value: scala.Boolean): scala.Unit = js.native
  def date(): scala.Unit = js.native
  def date(date: java.lang.String): scala.Unit = js.native
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
  def date(date: momentLib.momentMod.Moment): scala.Unit = js.native
  def date(date: stdLib.Date): scala.Unit = js.native
  /** Returns the component's model current date, a moment object or null if not set. */
  @JSName("date")
  def date_Moment(): momentLib.momentMod.Moment = js.native
  /** Returns the options.dayViewHeaderFormat option. */
  def dayViewHeaderFormat(): java.lang.String = js.native
  /** Used to customize the header of the day view. */
  def dayViewHeaderFormat(value: java.lang.String): scala.Unit = js.native
  /**
  	 * Returns the options.daysOfWeekDisabled configuration
  	 * IMPORTANT! Throws exception if not set explicitly https://github.com/Eonasdan/bootstrap-datetimepicker/issues/1459
  	 */
  def daysOfWeekDisabled(): js.Array[scala.Double] = js.native
  /**
  	 * Takes an [ Number:0 to 6 ] and disallow the user to select weekdays that exist in this array.
  	 * This has lower priority over the options.minDate, options.maxDate, options.disabledDates and options.enabledDates configuration settings.
  	 * Emits:
  	 * - dp.change - if the currently selected moment falls in the values passed on the daysOfWeek parameter.
  	 * - dp.error - if the currently selected moment falls in the values passed on the daysOfWeek parameter.
  	 */
  def daysOfWeekDisabled(days: js.Array[scala.Double]): scala.Unit = js.native
  /** Returns a moment with the options.defaultDate option configuration or false if not set */
  def defaultDate(): momentLib.momentMod.Moment | scala.Boolean = js.native
  /**
  	 * Will set the picker's inital date.
  	 * If a boolean:false value is passed the options.defaultDate parameter is cleared.
  	 * Throws:
  	 * - TypeError - if the provided date doesn't pass validation, including disabledDates, enabledDates, minDate, maxDate, and daysOfWeekDisabled
  	 * - TypeError - if the provided date cannot be parsed by momentjs
  	 */
  def defaultDate(date: java.lang.String): scala.Unit = js.native
  def defaultDate(date: momentLib.momentMod.Moment): scala.Unit = js.native
  def defaultDate(date: scala.Boolean): scala.Unit = js.native
  def defaultDate(date: stdLib.Date): scala.Unit = js.native
  /** Destroys the widget and removes all attached event listeners */
  def destroy(): scala.Unit = js.native
  /**
  	 * Disables the input element, the component is attached to, by adding a disabled="true" attribute to it. If the widget was visible before that call it is hidden.
  	 * Emits:
  	 * - dp.hide - if the widget was visible before that call
  	 */
  def disable(): scala.Unit = js.native
  /**
  	 * Returns the options.disabledDates option.
  	 * NOTES: probably should be: disabledDates(): boolean | Array<moment.Moment>; see: DatetimepickerOptions
  	 */
  def disabledDates(): scala.Boolean | js.Any = js.native
  def disabledDates(dates: js.Array[java.lang.String | stdLib.Date | momentLib.momentMod.Moment]): scala.Unit = js.native
  /**
  	 * Takes an array of values and disallows the user to select those days.
  	 * Setting this takes precedence over options.minDate, options.maxDate configuration.
  	 * Also calling this function removes the configuration of options.enabledDates if such exist.
  	 * Note: These values are matched with Day granularity.
  	 */
  def disabledDates(dates: scala.Boolean): scala.Unit = js.native
  /**
  	 * Returns the options.disabledHours option.
  	 * NOTES: probably should be: disabledHours(): boolean | number[]; see: DatetimepickerOptions
  	 */
  def disabledHours(): scala.Boolean | js.Any = js.native
  def disabledHours(value: js.Array[scala.Double]): scala.Unit = js.native
  /**
  	 * Must be in 24 hour format. Will disallow hour selections (much like disabledTimeIntervals) but will affect all days.
  	 * Like en/disabledDates, the en/disabledHours options are mutually exclusive and will reset one of the options back to false.
  	 */
  def disabledHours(value: scala.Boolean): scala.Unit = js.native
  /**
  	 * Returns the options.disabledTimeIntervals option, or... not exactly
  	 * IMPORTANT! Creates an object from the options.disabledTimeIntervals with the keys being numbers, the values being the moment arrays.
  	 * eg { "0": [<moment.Moment1>, <moment.Moment2>], "1": [...] }
  	 * https://github.com/Eonasdan/bootstrap-datetimepicker/issues/1498
  	 */
  def disabledTimeIntervals(): scala.Boolean | js.Array[js.Array[momentLib.momentMod.Moment]] = js.native
  def disabledTimeIntervals(value: js.Array[js.Array[momentLib.momentMod.Moment]]): scala.Unit = js.native
  /**
  	 * Disables time selection between the given moments
  	 * eg: [[moment({ h: 0 }), moment({ h: 8 })], [moment({ h: 18 }), moment({ h: 24 })]]
  	 */
  def disabledTimeIntervals(value: scala.Boolean): scala.Unit = js.native
  /** Enables the input element, the component is attached to, by removing disabled attribute from it. */
  def enable(): scala.Unit = js.native
  /**
  	 * Returns the options.enabledDates option
  	 * NOTES: probably should be: enabledDates(): boolean | Array<moment.Moment>; see: DatetimepickerOptions
  	 */
  def enabledDates(): scala.Boolean | js.Any = js.native
  def enabledDates(dates: js.Array[java.lang.String | stdLib.Date | momentLib.momentMod.Moment]): scala.Unit = js.native
  /**
  	 * Takes an array of values and allows the user to select only from those days.
  	 * Setting this takes precedence over options.minDate, options.maxDate configuration.
  	 * Also calling this function removes the configuration of options.disabledDates if such exist.
  	 * Note: These values are matched with Day granularity.
  	 */
  def enabledDates(dates: scala.Boolean): scala.Unit = js.native
  /**
  	 * Returns the options.enabledHours option.
  	 * NOTES: probably should be: enabledHours(): boolean | number[]; see: DatetimepickerOptions
  	 */
  def enabledHours(): scala.Boolean | js.Any = js.native
  def enabledHours(value: js.Array[scala.Double]): scala.Unit = js.native
  /**
  	 * Must be in 24 hour format. Will allow hour selections (much like enabledTimeIntervals) but will affect all days.
  	 * Like en/disabledDates, the en/disabledHours options are mutually exclusive and will reset one of the options back to false.
  	 */
  def enabledHours(value: scala.Boolean): scala.Unit = js.native
  /** Returns a boolean or array with the options.extraFormats option configuration */
  def extraFormats(): scala.Boolean | (js.Array[java.lang.String | momentLib.momentMod.MomentBuiltinFormat]) = js.native
  def extraFormats(formats: js.Array[java.lang.String | momentLib.momentMod.MomentBuiltinFormat]): scala.Unit = js.native
  /** Takes an array of valid input moment format options, or boolean:false */
  def extraFormats(formats: scala.Boolean): scala.Unit = js.native
  /** Returns the options.focusOnShow option. */
  def focusOnShow(): scala.Boolean = js.native
  /** If false, the textbox will not be given focus when the picker is shown */
  def focusOnShow(value: scala.Boolean): scala.Unit = js.native
  /** Returns the component's options.format string */
  def format(): scala.Boolean | java.lang.String | momentLib.momentMod.MomentBuiltinFormat = js.native
  def format(format: java.lang.String): scala.Unit = js.native
  def format(format: momentLib.momentMod.MomentBuiltinFormat): scala.Unit = js.native
  /**
  	 * Takes a moment.js format string and sets the components options.format.
  	 * This is used for displaying and also for parsing input strings either from the input element the component is attached to or the date() function.
  	 * The parameter can also be a boolean:false in which case the format is set to the locale's L LT.
  	 * Note: this is also used to determine if the TimePicker sub component will display the hours in 12 or 24 format. (if "a" or "h" exists in the passed string then a 12 hour mode is set)
  	 * Throws:
  	 * - TypeError - if format is boolean:true
  	 */
  def format(format: scala.Boolean): scala.Unit = js.native
  /**
  	 * Hides the widget
  	 * Emits:
  	 * - dp.hide - if the widget was visible before that call
  	 */
  def hide(): scala.Unit = js.native
  /** Returns options.icons */
  def icons(): Icons = js.native
  /**
  	 * Takes an Object of strings.
  	 * Throws:
  	 * - TypeError - if icons parameter is not an Object
  	 */
  def icons(icons: Icons): scala.Unit = js.native
  /** Returns the options.ignoreReadonly option. */
  def ignoreReadonly(): scala.Boolean = js.native
  /** Set this to true to allow the picker to be used even if the input field is readonly. This will not bypass the disabled property */
  def ignoreReadonly(value: scala.Boolean): scala.Unit = js.native
  /** Returns the options.inline option. */
  def `inline`(): scala.Boolean = js.native
  /** Used to customize the header of the day view. */
  def `inline`(value: scala.Boolean): scala.Unit = js.native
  /** Returns the options.keepInvalid option. */
  def keepInvalid(): scala.Boolean = js.native
  /** If true, invalid dates will not be reverted to a previous selection or changed. */
  def keepInvalid(value: scala.Boolean): scala.Unit = js.native
  /** Returns a string variable with the currently set options.keyBinds option. */
  def keyBinds(): js.Any = js.native
  /**
  	 * Allows for several keyBinding functions to be specified for ease of access or accessibility. For defaults see {@link http://eonasdan.github.io/bootstrap-datetimepicker/Options/#keybinds}.
  	 */
  def keyBinds(value: js.Any): scala.Unit = js.native
  /** Returns the currently set locale of the options.locale */
  def locale(): java.lang.String = js.native
  /**
  	 * Takes a string of any valid moment locale e.g. de for German.
  	 * Throws:
  	 * - TypeError - if the locale is not loaded via a separate script or moment-with-locale
  	 */
  def locale(newLocale: java.lang.String): scala.Unit = js.native
  /** Returns the currently set moment of the options.maxDate or false if not set */
  def maxDate(): momentLib.momentMod.Moment | scala.Boolean = js.native
  def maxDate(date: java.lang.String): scala.Unit = js.native
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
  def maxDate(date: momentLib.momentMod.Moment): scala.Unit = js.native
  def maxDate(date: scala.Boolean): scala.Unit = js.native
  def maxDate(date: stdLib.Date): scala.Unit = js.native
  /** Returns the currently set moment of the options.minDate or false if not set */
  def minDate(): momentLib.momentMod.Moment | scala.Boolean = js.native
  def minDate(date: java.lang.String): scala.Unit = js.native
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
  def minDate(date: momentLib.momentMod.Moment): scala.Unit = js.native
  def minDate(date: scala.Boolean): scala.Unit = js.native
  def minDate(date: stdLib.Date): scala.Unit = js.native
  /**
  	 * Returns the components current options object.
  	 * Note that the changing the values of the returned object does not change the components actual configuration.
  	 */
  def options(): DatetimepickerOptions = js.native
  /** Takes an object variable with option key:value properties and configures the component. Use this to update multiple options on the component. */
  def options(options: DatetimepickerOptions): scala.Unit = js.native
  /** Returns the options.parseInputDate option */
  def parseInputDate(): js.UndefOr[InputParser] = js.native
  /**
  	 * Allows custom input formatting For example: the user can enter "yesterday"" or "30 days ago".
  	 * {@link http://eonasdan.github.io/bootstrap-datetimepicker/Functions/#parseinputdate}
  	 */
  def parseInputDate(value: InputParser): scala.Unit = js.native
  /**
  	 * Shows the widget
  	 * Emits:
  	 * - dp.show - if the widget was hidden before that call
  	 * - dp.change - if the widget is opened for the first time and the useCurrent is set to true or to a granularity value and the input element the component is attached to has an empty value
  	 */
  def show(): scala.Unit = js.native
  /** Returns the options.showClear option. */
  def showClear(): scala.Boolean = js.native
  /** Set if the clear date button will appear on the widget */
  def showClear(value: scala.Boolean): scala.Unit = js.native
  /** Returns the options.showClose option. */
  def showClose(): scala.Boolean = js.native
  /** If true, an icon will be displayed on the toolbar that will hide the picker */
  def showClose(value: scala.Boolean): scala.Unit = js.native
  /** Returns the options.showTodayButton option. */
  def showTodayButton(): scala.Boolean = js.native
  /** Set if the Today button will appear on the widget */
  def showTodayButton(value: scala.Boolean): scala.Unit = js.native
  /** Returns a boolean of the options.sideBySide. */
  def sideBySide(): scala.Boolean = js.native
  /** If sideBySide is true and the time picker is used, both components will display side by side instead of collapsing. */
  def sideBySide(value: scala.Boolean): scala.Unit = js.native
  /** Returns a number with the options.stepping option configuration */
  def stepping(): scala.Double = js.native
  /** This will be the amount the up/down arrows move the minute value with a time picker. */
  def stepping(step: scala.Double): scala.Unit = js.native
  /** Returns a string of options.timeZone */
  def timeZone(): java.lang.String | scala.Null = js.native
  /**
  	 * Takes a null or a string of a valid timezone.
  	 * Throws:
  	 * - TypeError - if tooltips parameter is not a string or null
  	 */
  def timeZone(timeZone: java.lang.String): scala.Unit = js.native
  @JSName("timeZone")
  def timeZone_Unit(): scala.Unit = js.native
  /**
  	 * Shows or hides the widget
  	 * Emits:
  	 * - dp.hide - if the widget is hidden after the toggle call
  	 * - dp.show - if the widget is show after the toggle call
  	 * - dp.change - if the widget is opened for the first time and the input element is empty and options.useCurrent != false
  	 */
  def toggle(): scala.Unit = js.native
  /** Returns the options.toolbarplacement option. */
  def toolbarPlacement(): java.lang.String = js.native
  /**
  	 * Changes the placement of the toolbar where the today, clear, component switch icon are located.
  	 * See valid values at DatetimepickerOptions.toolbarplacement
  	 * Throws:
  	 * - TypeError - if the parameter is not a valid value
  	 */
  def toolbarPlacement(value: java.lang.String): scala.Unit = js.native
  /** Returns the options.tooltips option */
  def tooltips(): Tooltips = js.native
  /**
  	 * Sets the tooltips for icons.
  	 * Throws:
  	 * - TypeError - if tooltips parameter is not an Object
  	 */
  def tooltips(value: Tooltips): scala.Unit = js.native
  /** Returns the options.useCurrent option configuration */
  def useCurrent(): scala.Boolean | java.lang.String = js.native
  def useCurrent(value: java.lang.String): scala.Unit = js.native
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
  def useCurrent(value: scala.Boolean): scala.Unit = js.native
  /** Returns the options.useStrict */
  def useStrict(): scala.Boolean = js.native
  /** If useStrict is true, momentjs parsing rules will be stricter when determining if a date is valid or not. */
  def useStrict(value: scala.Boolean): scala.Unit = js.native
  /** Returns the options.viewDate option. */
  def viewDate(): scala.Boolean | momentLib.momentMod.Moment = js.native
  /** This will change the viewDate without changing or setting the selected date. */
  def viewDate(value: java.lang.String): scala.Unit = js.native
  def viewDate(value: momentLib.momentMod.Moment): scala.Unit = js.native
  def viewDate(value: scala.Boolean): scala.Unit = js.native
  def viewDate(value: stdLib.Date): scala.Unit = js.native
  /** Returns the options.viewMode. */
  def viewMode(): java.lang.String = js.native
  /**
  	 * Takes a string. See valid values at DatetimepickerOptions.viewMode
  	 * Throws:
  	 * - TypeError - if the parameter is not a string or not a valid value
  	 */
  def viewMode(value: java.lang.String): scala.Unit = js.native
  /** Returns a $(element) variable with the currently set options.widgetParent option. */
  def widgetParent(): java.lang.String | bootstrapDotV3DotDatetimepickerLib.bootstrapDotV3DotDatetimepickerMod.Global.JQuery | scala.Null = js.native
  def widgetParent(widgetParent: bootstrapDotV3DotDatetimepickerLib.bootstrapDotV3DotDatetimepickerMod.Global.JQuery): scala.Unit = js.native
  /** Takes a string or $(element) value. */
  def widgetParent(widgetParent: java.lang.String): scala.Unit = js.native
  @JSName("widgetParent")
  def widgetParent_Unit(): scala.Unit = js.native
  /** Returns the options.widgetPositioning object */
  def widgetPositioning(): WidgetPositioningOptions = js.native
  /**
  	 * WidgetPositioning defines where the dropdown with the widget will appear relative to the input element the component is attached to.
  	 * "auto" is the default value for both horizontal and vertical keys and it tries to automatically place the dropdown in a position that is visible to the user.
  	 * Usually you should not override those options unless you have a special need in your layout.
  	 */
  def widgetPositioning(value: WidgetPositioningOptions): scala.Unit = js.native
}

