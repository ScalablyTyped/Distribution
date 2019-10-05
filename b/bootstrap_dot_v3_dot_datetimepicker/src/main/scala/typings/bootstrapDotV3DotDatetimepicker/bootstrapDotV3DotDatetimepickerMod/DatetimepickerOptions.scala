package typings.bootstrapDotV3DotDatetimepicker.bootstrapDotV3DotDatetimepickerMod

import org.scalablytyped.runtime.StringDictionary
import typings.bootstrapDotV3DotDatetimepicker.bootstrapDotV3DotDatetimepickerMod.Global.JQuery
import typings.bootstrapDotV3DotDatetimepicker.bootstrapDotV3DotDatetimepickerStrings.bottom
import typings.bootstrapDotV3DotDatetimepicker.bootstrapDotV3DotDatetimepickerStrings.days
import typings.bootstrapDotV3DotDatetimepicker.bootstrapDotV3DotDatetimepickerStrings.decades
import typings.bootstrapDotV3DotDatetimepicker.bootstrapDotV3DotDatetimepickerStrings.default
import typings.bootstrapDotV3DotDatetimepicker.bootstrapDotV3DotDatetimepickerStrings.months
import typings.bootstrapDotV3DotDatetimepicker.bootstrapDotV3DotDatetimepickerStrings.top
import typings.bootstrapDotV3DotDatetimepicker.bootstrapDotV3DotDatetimepickerStrings.years
import typings.moment.momentMod.Moment
import typings.moment.momentMod.MomentBuiltinFormat
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatetimepickerOptions extends js.Object {
  /**
  	 * If true, the picker will show on textbox focus and icon click when used in a button group
  	 * @default: false
  	 */
  var allowInputToggle: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Shows the week of the year to the left of first day of the week.
  	 * @default: false
  	 */
  var calendarWeeks: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Using a Bootstraps collapse to switch between date/time pickers.
  	 * @default: true
  	 */
  var collapse: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Changes the heading of the datepicker when in "days" view.
  	 * @default: "MMMM YYYY"
  	 */
  var dayViewHeaderFormat: js.UndefOr[String] = js.undefined
  /**
  	 * Disables the section of days of the week, e.g. weekends.
  	 * Accepts: array of numbers from 0-6
  	 * @default: false
  	 */
  var daysOfWeekDisabled: js.UndefOr[js.Array[Double] | Boolean] = js.undefined
  /**
  	 * Will cause the date picker to stay open after a blur event.
  	 * @default: false
  	 */
  var debug: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Sets the picker default date/time. Overrides useCurrent
  	 * @default: false
  	 */
  var defaultDate: js.UndefOr[Boolean | Moment | Date | String] = js.undefined
  /**
  	 * Disables selection of dates in the array, e.g. holidays
  	 * @default: false
  	 * IMPORTANT! The getter returns an Object NOT an Array, with keys being the dates, values being true.
  	 * eg disabledDates = ["2010-10-10"]; -> disabledDated will be { "2010-01-01": true }
  	 * https://github.com/Eonasdan/bootstrap-datetimepicker/issues/1499
  	 */
  var disabledDates: js.UndefOr[Boolean | (js.Array[Moment | Date | String]) | js.Any] = js.undefined
  /**
  	 * Will allow or disallow hour selections (much like disabledTimeIntervals) but will affect all days
  	 * @default: false
  	 * IMPORTANT! The getter returns an Object NOT an Array, with keys being the hours, values being true.
  	 * eg disabledHours = [0, 1]; -> disabledHours will be { "0": true, "1": true }
  	 * https://github.com/Eonasdan/bootstrap-datetimepicker/issues/1499
  	 */
  var disabledHours: js.UndefOr[Boolean | js.Array[Double] | js.Any] = js.undefined
  /**
  	 * Disables time selection between the given moments
  	 * eg: [[moment({ h: 0 }), moment({ h: 8 })], [moment({ h: 18 }), moment({ h: 24 })]]
  	 * @default: false
  	 */
  var disabledTimeIntervals: js.UndefOr[Boolean | js.Array[js.Array[Moment]]] = js.undefined
  /**
  	 * Disables selection of dates NOT in the array, e.g. holidays
  	 * @default: false
  	 * IMPORTANT! The getter returns an Object NOT an Array, with keys being the dates, values being true.
  	 * eg enabledDates = ["2010-10-10"]; -> enabledDated will be { "2010-01-01": true }
  	 * https://github.com/Eonasdan/bootstrap-datetimepicker/issues/1499
  	 */
  var enabledDates: js.UndefOr[Boolean | (js.Array[Moment | Date | String]) | js.Any] = js.undefined
  /**
  	 * Will allow or disallow hour selections (much like disabledTimeIntervals) but will affect all days
  	 * @default: false
  	 * IMPORTANT! The getter returns an Object NOT an Array, with keys being the hours, values being true.
  	 * eg enabledHours = [0, 1]; -> enabledHours will be { "0": true, "1": true }
  	 * https://github.com/Eonasdan/bootstrap-datetimepicker/issues/1499
  	 */
  var enabledHours: js.UndefOr[Boolean | js.Array[Double]] = js.undefined
  /**
  	 * Allows for several input formats to be valid. See: https://github.com/Eonasdan/bootstrap-datetimepicker/pull/666
  	 * @default: false
  	 */
  var extraFormats: js.UndefOr[Boolean | (js.Array[String | MomentBuiltinFormat])] = js.undefined
  /**
  	 * If false, the textbox will not be given focus when the picker is shown
  	 * @default: true
  	 */
  var focusOnShow: js.UndefOr[Boolean] = js.undefined
  /**
  	 * See momentjs' docs for valid formats. Format also dictates what components are shown, e.g. MM/dd/YYYY will not display the time picker.
  	 * @default: false
  	 */
  var format: js.UndefOr[Boolean | String | MomentBuiltinFormat] = js.undefined
  /** Change the default icons for the pickers functions. */
  var icons: js.UndefOr[Icons] = js.undefined
  /**
  	 * Allow date picker show event to fire even when the associated input element has the readonly="readonly"property.
  	 * @default: false
  	 */
  var ignoreReadonly: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Will display the picker inline without the need of a input field. This will also hide borders and shadows.
  	 * @default: false
  	 */
  var `inline`: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Will cause the date picker to not revert or overwrite invalid dates.
  	 * @default: false
  	 */
  var keepInvalid: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Will cause the date picker to stay open after selecting a date if no time components are being used.
  	 * @default: false
  	 */
  var keepOpen: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Allows for custom events to fire on keyboard press.
  	 * eg: keybinds: {
  	 * 		up: (widget) => console.log(widget),
  	 * 		"control up": (widget) => console.log(widget)
  	 * }
  	 * The widget parameter is false, if the datepicker is closed.
  	 */
  var keyBinds: js.UndefOr[StringDictionary[js.Function1[/* widget */ Boolean | JQuery, Unit]]] = js.undefined
  /**
  	 * See momentjs for valid locales. You must include moment-with-locales.js or a local js file.
  	 * @default: moment.locale()
  	 */
  var locale: js.UndefOr[String] = js.undefined
  /**
  	 * Prevents date/time selections after this date.
  	 * maxDate will override defaultDate and useCurrent if either of these settings are the same day since both options are invalid according to the rules you've selected.
  	 * @default: false
  	 */
  var maxDate: js.UndefOr[Boolean | Moment | Date | String] = js.undefined
  /**
  	 * Prevents date/time selections before this date.
  	 * minDate will override defaultDate and useCurrent if either of these settings are the same day since both options are invalid according to the rules you've selected.
  	 * @default: false
  	 */
  var minDate: js.UndefOr[Boolean | Moment | Date | String] = js.undefined
  /**
  	 * Allows custom input formatting For example: the user can enter "yesterday"" or "30 days ago".
  	 * {@link http://eonasdan.github.io/bootstrap-datetimepicker/Functions/#parseinputdate}
  	 */
  var parseInputDate: js.UndefOr[InputParser] = js.undefined
  /**
  	 * Show the "Clear" button in the icon toolbar.
  	 * Clicking the "Clear" button will set the calendar to null.
  	 * @default: false
  	 */
  var showClear: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Show the "Close" button in the icon toolbar.
  	 * Clicking the "Close" button will call hide()
  	 * @default: false
  	 */
  var showClose: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Show the "Today" button in the icon toolbar.
  	 * Clicking the "Today" button will set the calendar view and set the date to now.
  	 * @default: false
  	 */
  var showTodayButton: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Shows the picker side by side when using the time and date together.
  	 * @default: false
  	 */
  var sideBySide: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Number of minutes the up/down arrow's will move the minutes value in the time picker
  	 * @default: 1
  	 */
  var stepping: js.UndefOr[Double] = js.undefined
  /**
  	 * Timezone to use, if moment-timezone is loaded. If null or empty string, ignore timezones.
  	 * @default: ""
  	 */
  var timeZone: js.UndefOr[String | Null] = js.undefined
  /**
  	 * Changes the placement of the icon toolbar.
  	 * @default: "default"
  	 */
  var toolbarPlacement: js.UndefOr[default | top | bottom] = js.undefined
  /** This will change the tooltips over each icon to a custom string */
  var tooltips: js.UndefOr[Tooltips] = js.undefined
  /**
  	 * On show, will set the picker to the current date/time
  	 * @default: true
  	 */
  var useCurrent: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Defines if moment should use strict date parsing when considering a date to be valid
  	 * @default: false
  	 */
  var useStrict: js.UndefOr[Boolean] = js.undefined
  /**
  	 * This will change the viewDate without changing or setting the selected date.
  	 * @default: false
  	 */
  var viewDate: js.UndefOr[Boolean | Moment | Date | String] = js.undefined
  /**
  	 * The default view to display when the picker is shown.
  	 * Note: To limit the picker to selecting, for instance the year and month, use format: MM/YYYY
  	 * @default: "days"
  	 */
  var viewMode: js.UndefOr[decades | years | months | days] = js.undefined
  /**
  	 * On picker show, places the widget at the identifier (string) or jQuery object if the element has css position: "relative"
  	 * @default: null
  	 */
  var widgetParent: js.UndefOr[String | JQuery | Null] = js.undefined
  var widgetPositioning: js.UndefOr[WidgetPositioningOptions] = js.undefined
}

object DatetimepickerOptions {
  @scala.inline
  def apply(
    allowInputToggle: js.UndefOr[Boolean] = js.undefined,
    calendarWeeks: js.UndefOr[Boolean] = js.undefined,
    collapse: js.UndefOr[Boolean] = js.undefined,
    dayViewHeaderFormat: String = null,
    daysOfWeekDisabled: js.Array[Double] | Boolean = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    defaultDate: Boolean | Moment | Date | String = null,
    disabledDates: Boolean | (js.Array[Moment | Date | String]) | js.Any = null,
    disabledHours: Boolean | js.Array[Double] | js.Any = null,
    disabledTimeIntervals: Boolean | js.Array[js.Array[Moment]] = null,
    enabledDates: Boolean | (js.Array[Moment | Date | String]) | js.Any = null,
    enabledHours: Boolean | js.Array[Double] = null,
    extraFormats: Boolean | (js.Array[String | MomentBuiltinFormat]) = null,
    focusOnShow: js.UndefOr[Boolean] = js.undefined,
    format: Boolean | String | MomentBuiltinFormat = null,
    icons: Icons = null,
    ignoreReadonly: js.UndefOr[Boolean] = js.undefined,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    keepInvalid: js.UndefOr[Boolean] = js.undefined,
    keepOpen: js.UndefOr[Boolean] = js.undefined,
    keyBinds: StringDictionary[js.Function1[/* widget */ Boolean | JQuery, Unit]] = null,
    locale: String = null,
    maxDate: Boolean | Moment | Date | String = null,
    minDate: Boolean | Moment | Date | String = null,
    parseInputDate: /* input */ String | Date | Moment => Moment = null,
    showClear: js.UndefOr[Boolean] = js.undefined,
    showClose: js.UndefOr[Boolean] = js.undefined,
    showTodayButton: js.UndefOr[Boolean] = js.undefined,
    sideBySide: js.UndefOr[Boolean] = js.undefined,
    stepping: Int | Double = null,
    timeZone: String = null,
    toolbarPlacement: default | top | bottom = null,
    tooltips: Tooltips = null,
    useCurrent: js.UndefOr[Boolean] = js.undefined,
    useStrict: js.UndefOr[Boolean] = js.undefined,
    viewDate: Boolean | Moment | Date | String = null,
    viewMode: decades | years | months | days = null,
    widgetParent: String | JQuery = null,
    widgetPositioning: WidgetPositioningOptions = null
  ): DatetimepickerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowInputToggle)) __obj.updateDynamic("allowInputToggle")(allowInputToggle)
    if (!js.isUndefined(calendarWeeks)) __obj.updateDynamic("calendarWeeks")(calendarWeeks)
    if (!js.isUndefined(collapse)) __obj.updateDynamic("collapse")(collapse)
    if (dayViewHeaderFormat != null) __obj.updateDynamic("dayViewHeaderFormat")(dayViewHeaderFormat)
    if (daysOfWeekDisabled != null) __obj.updateDynamic("daysOfWeekDisabled")(daysOfWeekDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (defaultDate != null) __obj.updateDynamic("defaultDate")(defaultDate.asInstanceOf[js.Any])
    if (disabledDates != null) __obj.updateDynamic("disabledDates")(disabledDates.asInstanceOf[js.Any])
    if (disabledHours != null) __obj.updateDynamic("disabledHours")(disabledHours.asInstanceOf[js.Any])
    if (disabledTimeIntervals != null) __obj.updateDynamic("disabledTimeIntervals")(disabledTimeIntervals.asInstanceOf[js.Any])
    if (enabledDates != null) __obj.updateDynamic("enabledDates")(enabledDates.asInstanceOf[js.Any])
    if (enabledHours != null) __obj.updateDynamic("enabledHours")(enabledHours.asInstanceOf[js.Any])
    if (extraFormats != null) __obj.updateDynamic("extraFormats")(extraFormats.asInstanceOf[js.Any])
    if (!js.isUndefined(focusOnShow)) __obj.updateDynamic("focusOnShow")(focusOnShow)
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons)
    if (!js.isUndefined(ignoreReadonly)) __obj.updateDynamic("ignoreReadonly")(ignoreReadonly)
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`)
    if (!js.isUndefined(keepInvalid)) __obj.updateDynamic("keepInvalid")(keepInvalid)
    if (!js.isUndefined(keepOpen)) __obj.updateDynamic("keepOpen")(keepOpen)
    if (keyBinds != null) __obj.updateDynamic("keyBinds")(keyBinds)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (parseInputDate != null) __obj.updateDynamic("parseInputDate")(js.Any.fromFunction1(parseInputDate))
    if (!js.isUndefined(showClear)) __obj.updateDynamic("showClear")(showClear)
    if (!js.isUndefined(showClose)) __obj.updateDynamic("showClose")(showClose)
    if (!js.isUndefined(showTodayButton)) __obj.updateDynamic("showTodayButton")(showTodayButton)
    if (!js.isUndefined(sideBySide)) __obj.updateDynamic("sideBySide")(sideBySide)
    if (stepping != null) __obj.updateDynamic("stepping")(stepping.asInstanceOf[js.Any])
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone)
    if (toolbarPlacement != null) __obj.updateDynamic("toolbarPlacement")(toolbarPlacement.asInstanceOf[js.Any])
    if (tooltips != null) __obj.updateDynamic("tooltips")(tooltips)
    if (!js.isUndefined(useCurrent)) __obj.updateDynamic("useCurrent")(useCurrent)
    if (!js.isUndefined(useStrict)) __obj.updateDynamic("useStrict")(useStrict)
    if (viewDate != null) __obj.updateDynamic("viewDate")(viewDate.asInstanceOf[js.Any])
    if (viewMode != null) __obj.updateDynamic("viewMode")(viewMode.asInstanceOf[js.Any])
    if (widgetParent != null) __obj.updateDynamic("widgetParent")(widgetParent.asInstanceOf[js.Any])
    if (widgetPositioning != null) __obj.updateDynamic("widgetPositioning")(widgetPositioning)
    __obj.asInstanceOf[DatetimepickerOptions]
  }
}

