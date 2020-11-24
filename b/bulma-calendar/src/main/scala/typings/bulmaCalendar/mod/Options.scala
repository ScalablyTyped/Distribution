package typings.bulmaCalendar.mod

import typings.bulmaCalendar.bulmaCalendarStrings.`inline`
import typings.bulmaCalendar.bulmaCalendarStrings.bottom
import typings.bulmaCalendar.bulmaCalendarStrings.date
import typings.bulmaCalendar.bulmaCalendarStrings.datetime
import typings.bulmaCalendar.bulmaCalendarStrings.default
import typings.bulmaCalendar.bulmaCalendarStrings.dialog
import typings.bulmaCalendar.bulmaCalendarStrings.time
import typings.bulmaCalendar.bulmaCalendarStrings.top
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * Possibility to select same date as start and end date in range mode
    *
    * @default true
    */
  var allowSameDayRange: js.UndefOr[Boolean] = js.native
  
  /**
    * Cancel button label
    *
    * @default 'Cancel'
    */
  var cancelLabel: js.UndefOr[String] = js.native
  
  /**
    * Clear button label
    *
    * @default 'Clear'
    */
  var clearLabel: js.UndefOr[String] = js.native
  
  /**
    * Close picker on overlay click (only for dialog display style)
    *
    * @default true
    */
  var closeOnOverlayClick: js.UndefOr[Boolean] = js.native
  
  /**
    * Automatically close the datePicker when date selected (or range date selected) - not available
    * for inline display style. If set to False then a validate button will be displayed into the
    * footer section.
    *
    * @default true
    */
  var closeOnSelect: js.UndefOr[Boolean] = js.native
  
  /**
    * Picker dominant color
    *
    * @default 'primary'
    */
  var color: js.UndefOr[String] = js.native
  
  /**
    * Date format pattern
    *
    * @default 'MM/DD/YYYY'
    */
  var dateFormat: js.UndefOr[String] = js.native
  
  /**
    * List of disabled dates
    */
  var disabledDates: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * List of disabled week days
    */
  var disabledWeekDays: js.UndefOr[String | js.Array[_]] = js.native
  
  /**
    * Display mode
    *
    * @default 'default'
    */
  var displayMode: js.UndefOr[default | dialog | `inline`] = js.native
  
  /**
    * Enable/disable month switch
    *
    * @default true
    */
  var enableMonthSwitch: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable/disable year switch
    *
    * @default true
    */
  var enableYearSwitch: js.UndefOr[Boolean] = js.native
  
  /**
    * Pre-selected end date
    */
  var endDate: js.UndefOr[Date] = js.native
  
  /**
    * Pre-selected end time
    */
  var endTime: js.UndefOr[Date] = js.native
  
  /**
    * Header block position
    *
    * @default 'top'
    */
  var headerPosition: js.UndefOr[top | bottom] = js.native
  
  var icons: js.UndefOr[typings.bulmaCalendar.anon.Date] = js.native
  
  /**
    * Range capability (start and end date/time selection
    *
    * @default false
    */
  var isRange: js.UndefOr[Boolean] = js.native
  
  /**
    * From label
    */
  var labelFrom: js.UndefOr[String] = js.native
  
  /**
    * To label
    */
  var labelTo: js.UndefOr[String] = js.native
  
  /**
    * Display lang (from language supported by date-fns)
    *
    * @default navigator.language.substring(0, 2) || "en"
    */
  var lang: js.UndefOr[String] = js.native
  
  /**
    * Maximum date allowed
    */
  var maxDate: js.UndefOr[Date] = js.native
  
  /**
    * Minimum date allowed
    */
  var minDate: js.UndefOr[Date] = js.native
  
  /**
    * Steps for minutes selector
    *
    * @default 5
    */
  var minuteSteps: js.UndefOr[Double] = js.native
  
  /**
    * Now button label
    *
    * @default 'Now'
    */
  var nowLabel: js.UndefOr[String] = js.native
  
  /**
    * Callback to trigger once picker initiated
    */
  var onReady: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * @default 'auto'
    */
  var position: js.UndefOr[String] = js.native
  
  /**
    * Show/Hide buttons
    *
    * @default true
    */
  var showButtons: js.UndefOr[Boolean] = js.native
  
  /**
    * Show/Hide Clear Button
    *
    * @default true
    */
  var showClearButton: js.UndefOr[Boolean] = js.native
  
  /**
    * Show/Hide footer block
    *
    * @default true
    */
  var showFooter: js.UndefOr[Boolean] = js.native
  
  /**
    * Show/Hide header block (with current selection)
    *
    * @default true
    */
  var showHeader: js.UndefOr[Boolean] = js.native
  
  /**
    * Show/Hide Today Button
    *
    * @default true
    */
  var showTodayButton: js.UndefOr[Boolean] = js.native
  
  /**
    * Pre-selected start date
    */
  var startDate: js.UndefOr[Date] = js.native
  
  /**
    * Pre-selected start time
    */
  var startTime: js.UndefOr[Date] = js.native
  
  /**
    * Time format pattern
    *
    * @default 'HH:mm'
    */
  var timeFormat: js.UndefOr[String] = js.native
  
  /**
    * Today button label
    *
    * @default 'Today'
    */
  var todayLabel: js.UndefOr[String] = js.native
  
  /**
    * Automatically open datepicker when click into input element
    *
    * @default true
    */
  var toggleOnInputClick: js.UndefOr[Boolean] = js.native
  
  /**
    * Component type
    *
    * @default 'datetime'
    */
  var `type`: js.UndefOr[date | time | datetime] = js.native
  
  /**
    * Validate button label
    *
    * @default 'Validate'
    */
  var validateLabel: js.UndefOr[String] = js.native
  
  /**
    * Default weekstart day number
    *
    * @default 0 // sunday
    */
  var weekStart: js.UndefOr[Double] = js.native
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
    def setAllowSameDayRange(value: Boolean): Self = this.set("allowSameDayRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSameDayRange: Self = this.set("allowSameDayRange", js.undefined)
    
    @scala.inline
    def setCancelLabel(value: String): Self = this.set("cancelLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelLabel: Self = this.set("cancelLabel", js.undefined)
    
    @scala.inline
    def setClearLabel(value: String): Self = this.set("clearLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearLabel: Self = this.set("clearLabel", js.undefined)
    
    @scala.inline
    def setCloseOnOverlayClick(value: Boolean): Self = this.set("closeOnOverlayClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseOnOverlayClick: Self = this.set("closeOnOverlayClick", js.undefined)
    
    @scala.inline
    def setCloseOnSelect(value: Boolean): Self = this.set("closeOnSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseOnSelect: Self = this.set("closeOnSelect", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setDateFormat(value: String): Self = this.set("dateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateFormat: Self = this.set("dateFormat", js.undefined)
    
    @scala.inline
    def setDisabledDatesVarargs(value: js.Any*): Self = this.set("disabledDates", js.Array(value :_*))
    
    @scala.inline
    def setDisabledDates(value: js.Array[_]): Self = this.set("disabledDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabledDates: Self = this.set("disabledDates", js.undefined)
    
    @scala.inline
    def setDisabledWeekDaysVarargs(value: js.Any*): Self = this.set("disabledWeekDays", js.Array(value :_*))
    
    @scala.inline
    def setDisabledWeekDays(value: String | js.Array[_]): Self = this.set("disabledWeekDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabledWeekDays: Self = this.set("disabledWeekDays", js.undefined)
    
    @scala.inline
    def setDisplayMode(value: default | dialog | `inline`): Self = this.set("displayMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayMode: Self = this.set("displayMode", js.undefined)
    
    @scala.inline
    def setEnableMonthSwitch(value: Boolean): Self = this.set("enableMonthSwitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableMonthSwitch: Self = this.set("enableMonthSwitch", js.undefined)
    
    @scala.inline
    def setEnableYearSwitch(value: Boolean): Self = this.set("enableYearSwitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableYearSwitch: Self = this.set("enableYearSwitch", js.undefined)
    
    @scala.inline
    def setEndDate(value: Date): Self = this.set("endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndDate: Self = this.set("endDate", js.undefined)
    
    @scala.inline
    def setEndTime(value: Date): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setHeaderPosition(value: top | bottom): Self = this.set("headerPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderPosition: Self = this.set("headerPosition", js.undefined)
    
    @scala.inline
    def setIcons(value: typings.bulmaCalendar.anon.Date): Self = this.set("icons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcons: Self = this.set("icons", js.undefined)
    
    @scala.inline
    def setIsRange(value: Boolean): Self = this.set("isRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsRange: Self = this.set("isRange", js.undefined)
    
    @scala.inline
    def setLabelFrom(value: String): Self = this.set("labelFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelFrom: Self = this.set("labelFrom", js.undefined)
    
    @scala.inline
    def setLabelTo(value: String): Self = this.set("labelTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelTo: Self = this.set("labelTo", js.undefined)
    
    @scala.inline
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    
    @scala.inline
    def setMaxDate(value: Date): Self = this.set("maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDate: Self = this.set("maxDate", js.undefined)
    
    @scala.inline
    def setMinDate(value: Date): Self = this.set("minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinDate: Self = this.set("minDate", js.undefined)
    
    @scala.inline
    def setMinuteSteps(value: Double): Self = this.set("minuteSteps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinuteSteps: Self = this.set("minuteSteps", js.undefined)
    
    @scala.inline
    def setNowLabel(value: String): Self = this.set("nowLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNowLabel: Self = this.set("nowLabel", js.undefined)
    
    @scala.inline
    def setOnReady(value: () => Unit): Self = this.set("onReady", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnReady: Self = this.set("onReady", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setShowButtons(value: Boolean): Self = this.set("showButtons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowButtons: Self = this.set("showButtons", js.undefined)
    
    @scala.inline
    def setShowClearButton(value: Boolean): Self = this.set("showClearButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowClearButton: Self = this.set("showClearButton", js.undefined)
    
    @scala.inline
    def setShowFooter(value: Boolean): Self = this.set("showFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowFooter: Self = this.set("showFooter", js.undefined)
    
    @scala.inline
    def setShowHeader(value: Boolean): Self = this.set("showHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowHeader: Self = this.set("showHeader", js.undefined)
    
    @scala.inline
    def setShowTodayButton(value: Boolean): Self = this.set("showTodayButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowTodayButton: Self = this.set("showTodayButton", js.undefined)
    
    @scala.inline
    def setStartDate(value: Date): Self = this.set("startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartDate: Self = this.set("startDate", js.undefined)
    
    @scala.inline
    def setStartTime(value: Date): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    
    @scala.inline
    def setTimeFormat(value: String): Self = this.set("timeFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeFormat: Self = this.set("timeFormat", js.undefined)
    
    @scala.inline
    def setTodayLabel(value: String): Self = this.set("todayLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTodayLabel: Self = this.set("todayLabel", js.undefined)
    
    @scala.inline
    def setToggleOnInputClick(value: Boolean): Self = this.set("toggleOnInputClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToggleOnInputClick: Self = this.set("toggleOnInputClick", js.undefined)
    
    @scala.inline
    def setType(value: date | time | datetime): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setValidateLabel(value: String): Self = this.set("validateLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidateLabel: Self = this.set("validateLabel", js.undefined)
    
    @scala.inline
    def setWeekStart(value: Double): Self = this.set("weekStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeekStart: Self = this.set("weekStart", js.undefined)
  }
}
