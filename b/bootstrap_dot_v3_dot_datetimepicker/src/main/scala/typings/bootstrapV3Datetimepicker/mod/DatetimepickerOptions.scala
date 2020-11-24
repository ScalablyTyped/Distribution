package typings.bootstrapV3Datetimepicker.mod

import org.scalablytyped.runtime.StringDictionary
import typings.bootstrapV3Datetimepicker.bootstrapV3DatetimepickerStrings.bottom
import typings.bootstrapV3Datetimepicker.bootstrapV3DatetimepickerStrings.days
import typings.bootstrapV3Datetimepicker.bootstrapV3DatetimepickerStrings.decades
import typings.bootstrapV3Datetimepicker.bootstrapV3DatetimepickerStrings.default
import typings.bootstrapV3Datetimepicker.bootstrapV3DatetimepickerStrings.months
import typings.bootstrapV3Datetimepicker.bootstrapV3DatetimepickerStrings.top
import typings.bootstrapV3Datetimepicker.bootstrapV3DatetimepickerStrings.years
import typings.bootstrapV3Datetimepicker.mod.global.JQuery
import typings.moment.mod.Moment
import typings.moment.mod.MomentBuiltinFormat
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatetimepickerOptions extends js.Object {
  
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
  implicit class DatetimepickerOptionsOps[Self <: DatetimepickerOptions] (val x: Self) extends AnyVal {
    
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
    def setAllowInputToggle(value: Boolean): Self = this.set("allowInputToggle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowInputToggle: Self = this.set("allowInputToggle", js.undefined)
    
    @scala.inline
    def setCalendarWeeks(value: Boolean): Self = this.set("calendarWeeks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalendarWeeks: Self = this.set("calendarWeeks", js.undefined)
    
    @scala.inline
    def setCollapse(value: Boolean): Self = this.set("collapse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapse: Self = this.set("collapse", js.undefined)
    
    @scala.inline
    def setDayViewHeaderFormat(value: String): Self = this.set("dayViewHeaderFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayViewHeaderFormat: Self = this.set("dayViewHeaderFormat", js.undefined)
    
    @scala.inline
    def setDaysOfWeekDisabledVarargs(value: Double*): Self = this.set("daysOfWeekDisabled", js.Array(value :_*))
    
    @scala.inline
    def setDaysOfWeekDisabled(value: js.Array[Double] | Boolean): Self = this.set("daysOfWeekDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDaysOfWeekDisabled: Self = this.set("daysOfWeekDisabled", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setDefaultDate(value: Boolean | Moment | Date | String): Self = this.set("defaultDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultDate: Self = this.set("defaultDate", js.undefined)
    
    @scala.inline
    def setDisabledDatesVarargs(value: (Moment | Date | String)*): Self = this.set("disabledDates", js.Array(value :_*))
    
    @scala.inline
    def setDisabledDates(value: Boolean | (js.Array[Moment | Date | String]) | js.Any): Self = this.set("disabledDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabledDates: Self = this.set("disabledDates", js.undefined)
    
    @scala.inline
    def setDisabledHoursVarargs(value: Double*): Self = this.set("disabledHours", js.Array(value :_*))
    
    @scala.inline
    def setDisabledHours(value: Boolean | js.Array[Double] | js.Any): Self = this.set("disabledHours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabledHours: Self = this.set("disabledHours", js.undefined)
    
    @scala.inline
    def setDisabledTimeIntervalsVarargs(value: js.Array[Moment]*): Self = this.set("disabledTimeIntervals", js.Array(value :_*))
    
    @scala.inline
    def setDisabledTimeIntervals(value: Boolean | js.Array[js.Array[Moment]]): Self = this.set("disabledTimeIntervals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabledTimeIntervals: Self = this.set("disabledTimeIntervals", js.undefined)
    
    @scala.inline
    def setEnabledDatesVarargs(value: (Moment | Date | String)*): Self = this.set("enabledDates", js.Array(value :_*))
    
    @scala.inline
    def setEnabledDates(value: Boolean | (js.Array[Moment | Date | String]) | js.Any): Self = this.set("enabledDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabledDates: Self = this.set("enabledDates", js.undefined)
    
    @scala.inline
    def setEnabledHoursVarargs(value: Double*): Self = this.set("enabledHours", js.Array(value :_*))
    
    @scala.inline
    def setEnabledHours(value: Boolean | js.Array[Double]): Self = this.set("enabledHours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabledHours: Self = this.set("enabledHours", js.undefined)
    
    @scala.inline
    def setExtraFormatsVarargs(value: (String | MomentBuiltinFormat)*): Self = this.set("extraFormats", js.Array(value :_*))
    
    @scala.inline
    def setExtraFormats(value: Boolean | (js.Array[String | MomentBuiltinFormat])): Self = this.set("extraFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtraFormats: Self = this.set("extraFormats", js.undefined)
    
    @scala.inline
    def setFocusOnShow(value: Boolean): Self = this.set("focusOnShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusOnShow: Self = this.set("focusOnShow", js.undefined)
    
    @scala.inline
    def setFormat(value: Boolean | String | MomentBuiltinFormat): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setIcons(value: Icons): Self = this.set("icons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcons: Self = this.set("icons", js.undefined)
    
    @scala.inline
    def setIgnoreReadonly(value: Boolean): Self = this.set("ignoreReadonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreReadonly: Self = this.set("ignoreReadonly", js.undefined)
    
    @scala.inline
    def setInline(value: Boolean): Self = this.set("inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInline: Self = this.set("inline", js.undefined)
    
    @scala.inline
    def setKeepInvalid(value: Boolean): Self = this.set("keepInvalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepInvalid: Self = this.set("keepInvalid", js.undefined)
    
    @scala.inline
    def setKeepOpen(value: Boolean): Self = this.set("keepOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepOpen: Self = this.set("keepOpen", js.undefined)
    
    @scala.inline
    def setKeyBinds(value: StringDictionary[js.Function1[/* widget */ Boolean | JQuery, Unit]]): Self = this.set("keyBinds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyBinds: Self = this.set("keyBinds", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setMaxDate(value: Boolean | Moment | Date | String): Self = this.set("maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDate: Self = this.set("maxDate", js.undefined)
    
    @scala.inline
    def setMinDate(value: Boolean | Moment | Date | String): Self = this.set("minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinDate: Self = this.set("minDate", js.undefined)
    
    @scala.inline
    def setParseInputDate(value: /* input */ String | Date | Moment => Moment): Self = this.set("parseInputDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteParseInputDate: Self = this.set("parseInputDate", js.undefined)
    
    @scala.inline
    def setShowClear(value: Boolean): Self = this.set("showClear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowClear: Self = this.set("showClear", js.undefined)
    
    @scala.inline
    def setShowClose(value: Boolean): Self = this.set("showClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowClose: Self = this.set("showClose", js.undefined)
    
    @scala.inline
    def setShowTodayButton(value: Boolean): Self = this.set("showTodayButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowTodayButton: Self = this.set("showTodayButton", js.undefined)
    
    @scala.inline
    def setSideBySide(value: Boolean): Self = this.set("sideBySide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSideBySide: Self = this.set("sideBySide", js.undefined)
    
    @scala.inline
    def setStepping(value: Double): Self = this.set("stepping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStepping: Self = this.set("stepping", js.undefined)
    
    @scala.inline
    def setTimeZone(value: String): Self = this.set("timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeZone: Self = this.set("timeZone", js.undefined)
    
    @scala.inline
    def setTimeZoneNull: Self = this.set("timeZone", null)
    
    @scala.inline
    def setToolbarPlacement(value: default | top | bottom): Self = this.set("toolbarPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolbarPlacement: Self = this.set("toolbarPlacement", js.undefined)
    
    @scala.inline
    def setTooltips(value: Tooltips): Self = this.set("tooltips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltips: Self = this.set("tooltips", js.undefined)
    
    @scala.inline
    def setUseCurrent(value: Boolean): Self = this.set("useCurrent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseCurrent: Self = this.set("useCurrent", js.undefined)
    
    @scala.inline
    def setUseStrict(value: Boolean): Self = this.set("useStrict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseStrict: Self = this.set("useStrict", js.undefined)
    
    @scala.inline
    def setViewDate(value: Boolean | Moment | Date | String): Self = this.set("viewDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewDate: Self = this.set("viewDate", js.undefined)
    
    @scala.inline
    def setViewMode(value: decades | years | months | days): Self = this.set("viewMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewMode: Self = this.set("viewMode", js.undefined)
    
    @scala.inline
    def setWidgetParent(value: String | JQuery): Self = this.set("widgetParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidgetParent: Self = this.set("widgetParent", js.undefined)
    
    @scala.inline
    def setWidgetParentNull: Self = this.set("widgetParent", null)
    
    @scala.inline
    def setWidgetPositioning(value: WidgetPositioningOptions): Self = this.set("widgetPositioning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidgetPositioning: Self = this.set("widgetPositioning", js.undefined)
  }
}
