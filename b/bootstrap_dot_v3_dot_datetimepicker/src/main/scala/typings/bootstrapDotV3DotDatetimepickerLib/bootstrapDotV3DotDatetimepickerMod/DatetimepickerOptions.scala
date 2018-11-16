package typings
package bootstrapDotV3DotDatetimepickerLib.bootstrapDotV3DotDatetimepickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DatetimepickerOptions extends js.Object {
  /**
  	 * If true, the picker will show on textbox focus and icon click when used in a button group
  	 * @default: false
  	 */
  var allowInputToggle: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Shows the week of the year to the left of first day of the week.
  	 * @default: false
  	 */
  var calendarWeeks: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Using a Bootstraps collapse to switch between date/time pickers.
  	 * @default: true
  	 */
  var collapse: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Changes the heading of the datepicker when in "days" view.
  	 * @default: "MMMM YYYY"
  	 */
  var dayViewHeaderFormat: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Disables the section of days of the week, e.g. weekends.
  	 * Accepts: array of numbers from 0-6
  	 * @default: false
  	 */
  var daysOfWeekDisabled: js.UndefOr[js.Array[scala.Double] | scala.Boolean] = js.undefined
  /**
  	 * Will cause the date picker to stay open after a blur event.
  	 * @default: false
  	 */
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Sets the picker default date/time. Overrides useCurrent
  	 * @default: false
  	 */
  var defaultDate: js.UndefOr[
    scala.Boolean | momentLib.momentMod.momentNs.Moment | stdLib.Date | java.lang.String
  ] = js.undefined
  /**
  	 * Disables selection of dates in the array, e.g. holidays
  	 * @default: false
  	 * IMPORTANT! The getter returns an Object NOT an Array, with keys being the dates, values being true.
  	 * eg disabledDates = ["2010-10-10"]; -> disabledDated will be { "2010-01-01": true }
  	 * https://github.com/Eonasdan/bootstrap-datetimepicker/issues/1499
  	 */
  var disabledDates: js.UndefOr[
    scala.Boolean | (js.Array[momentLib.momentMod.momentNs.Moment | stdLib.Date | java.lang.String]) | js.Any
  ] = js.undefined
  /**
  	 * Will allow or disallow hour selections (much like disabledTimeIntervals) but will affect all days
  	 * @default: false
  	 * IMPORTANT! The getter returns an Object NOT an Array, with keys being the hours, values being true.
  	 * eg disabledHours = [0, 1]; -> disabledHours will be { "0": true, "1": true }
  	 * https://github.com/Eonasdan/bootstrap-datetimepicker/issues/1499
  	 */
  var disabledHours: js.UndefOr[scala.Boolean | js.Array[scala.Double] | js.Any] = js.undefined
  /**
  	 * Disables time selection between the given moments
  	 * eg: [[moment({ h: 0 }), moment({ h: 8 })], [moment({ h: 18 }), moment({ h: 24 })]]
  	 * @default: false
  	 */
  var disabledTimeIntervals: js.UndefOr[scala.Boolean | js.Array[js.Array[momentLib.momentMod.momentNs.Moment]]] = js.undefined
  /**
  	 * Disables selection of dates NOT in the array, e.g. holidays
  	 * @default: false
  	 * IMPORTANT! The getter returns an Object NOT an Array, with keys being the dates, values being true.
  	 * eg enabledDates = ["2010-10-10"]; -> enabledDated will be { "2010-01-01": true }
  	 * https://github.com/Eonasdan/bootstrap-datetimepicker/issues/1499
  	 */
  var enabledDates: js.UndefOr[
    scala.Boolean | (js.Array[momentLib.momentMod.momentNs.Moment | stdLib.Date | java.lang.String]) | js.Any
  ] = js.undefined
  /**
  	 * Will allow or disallow hour selections (much like disabledTimeIntervals) but will affect all days
  	 * @default: false
  	 * IMPORTANT! The getter returns an Object NOT an Array, with keys being the hours, values being true.
  	 * eg enabledHours = [0, 1]; -> enabledHours will be { "0": true, "1": true }
  	 * https://github.com/Eonasdan/bootstrap-datetimepicker/issues/1499
  	 */
  var enabledHours: js.UndefOr[scala.Boolean | js.Array[scala.Double]] = js.undefined
  /**
  	 * Allows for several input formats to be valid. See: https://github.com/Eonasdan/bootstrap-datetimepicker/pull/666
  	 * @default: false
  	 */
  var extraFormats: js.UndefOr[
    scala.Boolean | (js.Array[java.lang.String | momentLib.momentMod.momentNs.MomentBuiltinFormat])
  ] = js.undefined
  /**
  	 * If false, the textbox will not be given focus when the picker is shown
  	 * @default: true
  	 */
  var focusOnShow: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * See momentjs' docs for valid formats. Format also dictates what components are shown, e.g. MM/dd/YYYY will not display the time picker.
  	 * @default: false
  	 */
  var format: js.UndefOr[
    scala.Boolean | java.lang.String | momentLib.momentMod.momentNs.MomentBuiltinFormat
  ] = js.undefined
  /** Change the default icons for the pickers functions. */
  var icons: js.UndefOr[Icons] = js.undefined
  /**
  	 * Allow date picker show event to fire even when the associated input element has the readonly="readonly"property.
  	 * @default: false
  	 */
  var ignoreReadonly: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Will display the picker inline without the need of a input field. This will also hide borders and shadows.
  	 * @default: false
  	 */
  var `inline`: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Will cause the date picker to not revert or overwrite invalid dates.
  	 * @default: false
  	 */
  var keepInvalid: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Will cause the date picker to stay open after selecting a date if no time components are being used.
  	 * @default: false
  	 */
  var keepOpen: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Allows for custom events to fire on keyboard press.
  	 * eg: keybinds: {
  	 * 		up: (widget) => console.log(widget),
  	 * 		"control up": (widget) => console.log(widget)
  	 * }
  	 * The widget parameter is false, if the datepicker is closed.
  	 */
  var keyBinds: js.UndefOr[
    ScalablyTyped.runtime.StringDictionary[
      js.Function1[
        /* widget */ scala.Boolean | bootstrapDotV3DotDatetimepickerLib.bootstrapDotV3DotDatetimepickerMod.Global.JQuery, 
        scala.Unit
      ]
    ]
  ] = js.undefined
  /**
  	 * See momentjs for valid locales. You must include moment-with-locales.js or a local js file.
  	 * @default: moment.locale()
  	 */
  var locale: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Prevents date/time selections after this date.
  	 * maxDate will override defaultDate and useCurrent if either of these settings are the same day since both options are invalid according to the rules you've selected.
  	 * @default: false
  	 */
  var maxDate: js.UndefOr[
    scala.Boolean | momentLib.momentMod.momentNs.Moment | stdLib.Date | java.lang.String
  ] = js.undefined
  /**
  	 * Prevents date/time selections before this date.
  	 * minDate will override defaultDate and useCurrent if either of these settings are the same day since both options are invalid according to the rules you've selected.
  	 * @default: false
  	 */
  var minDate: js.UndefOr[
    scala.Boolean | momentLib.momentMod.momentNs.Moment | stdLib.Date | java.lang.String
  ] = js.undefined
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
  var showClear: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Show the "Close" button in the icon toolbar.
  	 * Clicking the "Close" button will call hide()
  	 * @default: false
  	 */
  var showClose: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Show the "Today" button in the icon toolbar.
  	 * Clicking the "Today" button will set the calendar view and set the date to now.
  	 * @default: false
  	 */
  var showTodayButton: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Shows the picker side by side when using the time and date together.
  	 * @default: false
  	 */
  var sideBySide: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Number of minutes the up/down arrow's will move the minutes value in the time picker
  	 * @default: 1
  	 */
  var stepping: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Timezone to use, if moment-timezone is loaded. If null or empty string, ignore timezones.
  	 * @default: ""
  	 */
  var timeZone: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
  	 * Changes the placement of the icon toolbar.
  	 * @default: "default"
  	 */
  var toolbarPlacement: js.UndefOr[
    bootstrapDotV3DotDatetimepickerLib.bootstrapDotV3DotDatetimepickerLibStrings.default | bootstrapDotV3DotDatetimepickerLib.bootstrapDotV3DotDatetimepickerLibStrings.top | bootstrapDotV3DotDatetimepickerLib.bootstrapDotV3DotDatetimepickerLibStrings.bottom
  ] = js.undefined
  /** This will change the tooltips over each icon to a custom string */
  var tooltips: js.UndefOr[Tooltips] = js.undefined
  /**
  	 * On show, will set the picker to the current date/time
  	 * @default: true
  	 */
  var useCurrent: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Defines if moment should use strict date parsing when considering a date to be valid
  	 * @default: false
  	 */
  var useStrict: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * This will change the viewDate without changing or setting the selected date.
  	 * @default: false
  	 */
  var viewDate: js.UndefOr[
    scala.Boolean | momentLib.momentMod.momentNs.Moment | stdLib.Date | java.lang.String
  ] = js.undefined
  /**
  	 * The default view to display when the picker is shown.
  	 * Note: To limit the picker to selecting, for instance the year and month, use format: MM/YYYY
  	 * @default: "days"
  	 */
  var viewMode: js.UndefOr[
    bootstrapDotV3DotDatetimepickerLib.bootstrapDotV3DotDatetimepickerLibStrings.decades | bootstrapDotV3DotDatetimepickerLib.bootstrapDotV3DotDatetimepickerLibStrings.years | bootstrapDotV3DotDatetimepickerLib.bootstrapDotV3DotDatetimepickerLibStrings.months | bootstrapDotV3DotDatetimepickerLib.bootstrapDotV3DotDatetimepickerLibStrings.days
  ] = js.undefined
  /**
  	 * On picker show, places the widget at the identifier (string) or jQuery object if the element has css position: "relative"
  	 * @default: null
  	 */
  var widgetParent: js.UndefOr[
    java.lang.String | bootstrapDotV3DotDatetimepickerLib.bootstrapDotV3DotDatetimepickerMod.Global.JQuery | scala.Null
  ] = js.undefined
  var widgetPositioning: js.UndefOr[WidgetPositioningOptions] = js.undefined
}

