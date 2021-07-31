package typings.bulmaCalendar

import typings.bulmaCalendar.anon.End
import typings.bulmaCalendar.anon.EndDate
import typings.bulmaCalendar.bulmaCalendarStrings.`inline`
import typings.bulmaCalendar.bulmaCalendarStrings.bottom
import typings.bulmaCalendar.bulmaCalendarStrings.date
import typings.bulmaCalendar.bulmaCalendarStrings.datetime
import typings.bulmaCalendar.bulmaCalendarStrings.default
import typings.bulmaCalendar.bulmaCalendarStrings.dialog
import typings.bulmaCalendar.bulmaCalendarStrings.time
import typings.bulmaCalendar.bulmaCalendarStrings.top
import typings.std.Date
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bulma-calendar", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with typings.bulmaCalendar.mod.bulmaCalendar {
    // Constructors
    def this(selector: String) = this()
    def this(selector: HTMLElement) = this()
    def this(selector: String, options: Options) = this()
    def this(selector: HTMLElement, options: Options) = this()
  }
  @JSImport("bulma-calendar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def attach(): js.Array[typings.bulmaCalendar.mod.bulmaCalendar] = ^.asInstanceOf[js.Dynamic].applyDynamic("attach")().asInstanceOf[js.Array[typings.bulmaCalendar.mod.bulmaCalendar]]
  @scala.inline
  def attach(selector: String): js.Array[typings.bulmaCalendar.mod.bulmaCalendar] = ^.asInstanceOf[js.Dynamic].applyDynamic("attach")(selector.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.bulmaCalendar.mod.bulmaCalendar]]
  @scala.inline
  def attach(selector: String, options: Options): js.Array[typings.bulmaCalendar.mod.bulmaCalendar] = (^.asInstanceOf[js.Dynamic].applyDynamic("attach")(selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.bulmaCalendar.mod.bulmaCalendar]]
  @scala.inline
  def attach(selector: Unit, options: Options): js.Array[typings.bulmaCalendar.mod.bulmaCalendar] = (^.asInstanceOf[js.Dynamic].applyDynamic("attach")(selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.bulmaCalendar.mod.bulmaCalendar]]
  @scala.inline
  def attach(selector: HTMLElement): js.Array[typings.bulmaCalendar.mod.bulmaCalendar] = ^.asInstanceOf[js.Dynamic].applyDynamic("attach")(selector.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.bulmaCalendar.mod.bulmaCalendar]]
  @scala.inline
  def attach(selector: HTMLElement, options: Options): js.Array[typings.bulmaCalendar.mod.bulmaCalendar] = (^.asInstanceOf[js.Dynamic].applyDynamic("attach")(selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.bulmaCalendar.mod.bulmaCalendar]]
  
  trait Event[T /* <: EventType */] extends StObject {
    
    var data: typings.bulmaCalendar.mod.bulmaCalendar
    
    var timeStamp: Double
    
    var `type`: T
  }
  object Event {
    
    @scala.inline
    def apply[T /* <: EventType */](data: typings.bulmaCalendar.mod.bulmaCalendar, timeStamp: Double, `type`: T): Event[T] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Event[T]]
    }
    
    @scala.inline
    implicit class EventMutableBuilder[Self <: Event[?], T /* <: EventType */] (val x: Self & Event[T]) extends AnyVal {
      
      @scala.inline
      def setData(value: typings.bulmaCalendar.mod.bulmaCalendar): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.bulmaCalendar.bulmaCalendarStrings.show
    - typings.bulmaCalendar.bulmaCalendarStrings.hide
    - typings.bulmaCalendar.bulmaCalendarStrings.select
    - typings.bulmaCalendar.bulmaCalendarStrings.selectColonstart
  */
  trait EventType extends StObject
  object EventType {
    
    @scala.inline
    def hide: typings.bulmaCalendar.bulmaCalendarStrings.hide = "hide".asInstanceOf[typings.bulmaCalendar.bulmaCalendarStrings.hide]
    
    @scala.inline
    def select: typings.bulmaCalendar.bulmaCalendarStrings.select = "select".asInstanceOf[typings.bulmaCalendar.bulmaCalendarStrings.select]
    
    @scala.inline
    def selectColonstart: typings.bulmaCalendar.bulmaCalendarStrings.selectColonstart = "select:start".asInstanceOf[typings.bulmaCalendar.bulmaCalendarStrings.selectColonstart]
    
    @scala.inline
    def show: typings.bulmaCalendar.bulmaCalendarStrings.show = "show".asInstanceOf[typings.bulmaCalendar.bulmaCalendarStrings.show]
  }
  
  trait Options extends StObject {
    
    /**
      * Possibility to select same date as start and end date in range mode
      *
      * @default true
      */
    var allowSameDayRange: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Cancel button label
      *
      * @default 'Cancel'
      */
    var cancelLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Clear button label
      *
      * @default 'Clear'
      */
    var clearLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Close picker on overlay click (only for dialog display style)
      *
      * @default true
      */
    var closeOnOverlayClick: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Automatically close the datePicker when date selected (or range date selected) - not available
      * for inline display style. If set to False then a validate button will be displayed into the
      * footer section.
      *
      * @default true
      */
    var closeOnSelect: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Picker dominant color
      *
      * @default 'primary'
      */
    var color: js.UndefOr[String] = js.undefined
    
    /**
      * Date format pattern
      *
      * @default 'MM/DD/YYYY'
      */
    var dateFormat: js.UndefOr[String] = js.undefined
    
    /**
      * List of disabled dates
      */
    var disabledDates: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    /**
      * List of disabled week days
      */
    var disabledWeekDays: js.UndefOr[String | js.Array[js.Any]] = js.undefined
    
    /**
      * Display mode
      *
      * @default 'default'
      */
    var displayMode: js.UndefOr[default | dialog | `inline`] = js.undefined
    
    /**
      * Enable/disable month switch
      *
      * @default true
      */
    var enableMonthSwitch: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enable/disable year switch
      *
      * @default true
      */
    var enableYearSwitch: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Pre-selected end date
      */
    var endDate: js.UndefOr[Date] = js.undefined
    
    /**
      * Pre-selected end time
      */
    var endTime: js.UndefOr[Date] = js.undefined
    
    /**
      * Header block position
      *
      * @default 'top'
      */
    var headerPosition: js.UndefOr[top | bottom] = js.undefined
    
    var icons: js.UndefOr[typings.bulmaCalendar.anon.Date] = js.undefined
    
    /**
      * Range capability (start and end date/time selection
      *
      * @default false
      */
    var isRange: js.UndefOr[Boolean] = js.undefined
    
    /**
      * From label
      */
    var labelFrom: js.UndefOr[String] = js.undefined
    
    /**
      * To label
      */
    var labelTo: js.UndefOr[String] = js.undefined
    
    /**
      * Display lang (from language supported by date-fns)
      *
      * @default navigator.language.substring(0, 2) || "en"
      */
    var lang: js.UndefOr[String] = js.undefined
    
    /**
      * Maximum date allowed
      */
    var maxDate: js.UndefOr[Date] = js.undefined
    
    /**
      * Minimum date allowed
      */
    var minDate: js.UndefOr[Date] = js.undefined
    
    /**
      * Steps for minutes selector
      *
      * @default 5
      */
    var minuteSteps: js.UndefOr[Double] = js.undefined
    
    /**
      * Now button label
      *
      * @default 'Now'
      */
    var nowLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Callback to trigger once picker initiated
      */
    var onReady: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * @default 'auto'
      */
    var position: js.UndefOr[String] = js.undefined
    
    /**
      * Show/Hide buttons
      *
      * @default true
      */
    var showButtons: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Show/Hide Clear Button
      *
      * @default true
      */
    var showClearButton: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Show/Hide footer block
      *
      * @default true
      */
    var showFooter: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Show/Hide header block (with current selection)
      *
      * @default true
      */
    var showHeader: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Show/Hide Today Button
      *
      * @default true
      */
    var showTodayButton: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Pre-selected start date
      */
    var startDate: js.UndefOr[Date] = js.undefined
    
    /**
      * Pre-selected start time
      */
    var startTime: js.UndefOr[Date] = js.undefined
    
    /**
      * Time format pattern
      *
      * @default 'HH:mm'
      */
    var timeFormat: js.UndefOr[String] = js.undefined
    
    /**
      * Today button label
      *
      * @default 'Today'
      */
    var todayLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Automatically open datepicker when click into input element
      *
      * @default true
      */
    var toggleOnInputClick: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Component type
      *
      * @default 'datetime'
      */
    var `type`: js.UndefOr[date | time | datetime] = js.undefined
    
    /**
      * Validate button label
      *
      * @default 'Validate'
      */
    var validateLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Default weekstart day number
      *
      * @default 0 // sunday
      */
    var weekStart: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowSameDayRange(value: Boolean): Self = StObject.set(x, "allowSameDayRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowSameDayRangeUndefined: Self = StObject.set(x, "allowSameDayRange", js.undefined)
      
      @scala.inline
      def setCancelLabel(value: String): Self = StObject.set(x, "cancelLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelLabelUndefined: Self = StObject.set(x, "cancelLabel", js.undefined)
      
      @scala.inline
      def setClearLabel(value: String): Self = StObject.set(x, "clearLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearLabelUndefined: Self = StObject.set(x, "clearLabel", js.undefined)
      
      @scala.inline
      def setCloseOnOverlayClick(value: Boolean): Self = StObject.set(x, "closeOnOverlayClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseOnOverlayClickUndefined: Self = StObject.set(x, "closeOnOverlayClick", js.undefined)
      
      @scala.inline
      def setCloseOnSelect(value: Boolean): Self = StObject.set(x, "closeOnSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseOnSelectUndefined: Self = StObject.set(x, "closeOnSelect", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
      
      @scala.inline
      def setDisabledDates(value: js.Array[js.Any]): Self = StObject.set(x, "disabledDates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledDatesUndefined: Self = StObject.set(x, "disabledDates", js.undefined)
      
      @scala.inline
      def setDisabledDatesVarargs(value: js.Any*): Self = StObject.set(x, "disabledDates", js.Array(value :_*))
      
      @scala.inline
      def setDisabledWeekDays(value: String | js.Array[js.Any]): Self = StObject.set(x, "disabledWeekDays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledWeekDaysUndefined: Self = StObject.set(x, "disabledWeekDays", js.undefined)
      
      @scala.inline
      def setDisabledWeekDaysVarargs(value: js.Any*): Self = StObject.set(x, "disabledWeekDays", js.Array(value :_*))
      
      @scala.inline
      def setDisplayMode(value: default | dialog | `inline`): Self = StObject.set(x, "displayMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayModeUndefined: Self = StObject.set(x, "displayMode", js.undefined)
      
      @scala.inline
      def setEnableMonthSwitch(value: Boolean): Self = StObject.set(x, "enableMonthSwitch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableMonthSwitchUndefined: Self = StObject.set(x, "enableMonthSwitch", js.undefined)
      
      @scala.inline
      def setEnableYearSwitch(value: Boolean): Self = StObject.set(x, "enableYearSwitch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableYearSwitchUndefined: Self = StObject.set(x, "enableYearSwitch", js.undefined)
      
      @scala.inline
      def setEndDate(value: Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
      
      @scala.inline
      def setEndTime(value: Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
      
      @scala.inline
      def setHeaderPosition(value: top | bottom): Self = StObject.set(x, "headerPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderPositionUndefined: Self = StObject.set(x, "headerPosition", js.undefined)
      
      @scala.inline
      def setIcons(value: typings.bulmaCalendar.anon.Date): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
      
      @scala.inline
      def setIsRange(value: Boolean): Self = StObject.set(x, "isRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsRangeUndefined: Self = StObject.set(x, "isRange", js.undefined)
      
      @scala.inline
      def setLabelFrom(value: String): Self = StObject.set(x, "labelFrom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFromUndefined: Self = StObject.set(x, "labelFrom", js.undefined)
      
      @scala.inline
      def setLabelTo(value: String): Self = StObject.set(x, "labelTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelToUndefined: Self = StObject.set(x, "labelTo", js.undefined)
      
      @scala.inline
      def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      @scala.inline
      def setMaxDate(value: Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      @scala.inline
      def setMinDate(value: Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      @scala.inline
      def setMinuteSteps(value: Double): Self = StObject.set(x, "minuteSteps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinuteStepsUndefined: Self = StObject.set(x, "minuteSteps", js.undefined)
      
      @scala.inline
      def setNowLabel(value: String): Self = StObject.set(x, "nowLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNowLabelUndefined: Self = StObject.set(x, "nowLabel", js.undefined)
      
      @scala.inline
      def setOnReady(value: () => Unit): Self = StObject.set(x, "onReady", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
      
      @scala.inline
      def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setShowButtons(value: Boolean): Self = StObject.set(x, "showButtons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowButtonsUndefined: Self = StObject.set(x, "showButtons", js.undefined)
      
      @scala.inline
      def setShowClearButton(value: Boolean): Self = StObject.set(x, "showClearButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowClearButtonUndefined: Self = StObject.set(x, "showClearButton", js.undefined)
      
      @scala.inline
      def setShowFooter(value: Boolean): Self = StObject.set(x, "showFooter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowFooterUndefined: Self = StObject.set(x, "showFooter", js.undefined)
      
      @scala.inline
      def setShowHeader(value: Boolean): Self = StObject.set(x, "showHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowHeaderUndefined: Self = StObject.set(x, "showHeader", js.undefined)
      
      @scala.inline
      def setShowTodayButton(value: Boolean): Self = StObject.set(x, "showTodayButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowTodayButtonUndefined: Self = StObject.set(x, "showTodayButton", js.undefined)
      
      @scala.inline
      def setStartDate(value: Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
      
      @scala.inline
      def setStartTime(value: Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
      
      @scala.inline
      def setTimeFormat(value: String): Self = StObject.set(x, "timeFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeFormatUndefined: Self = StObject.set(x, "timeFormat", js.undefined)
      
      @scala.inline
      def setTodayLabel(value: String): Self = StObject.set(x, "todayLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTodayLabelUndefined: Self = StObject.set(x, "todayLabel", js.undefined)
      
      @scala.inline
      def setToggleOnInputClick(value: Boolean): Self = StObject.set(x, "toggleOnInputClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToggleOnInputClickUndefined: Self = StObject.set(x, "toggleOnInputClick", js.undefined)
      
      @scala.inline
      def setType(value: date | time | datetime): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValidateLabel(value: String): Self = StObject.set(x, "validateLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateLabelUndefined: Self = StObject.set(x, "validateLabel", js.undefined)
      
      @scala.inline
      def setWeekStart(value: Double): Self = StObject.set(x, "weekStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeekStartUndefined: Self = StObject.set(x, "weekStart", js.undefined)
    }
  }
  
  @js.native
  trait bulmaCalendar extends StObject {
    
    /**
      * Clear date selection (startDate and endDate are set to undefined)
      */
    def clear(): Unit = js.native
    
    /**
      * Get selected date
      */
    def date: End = js.native
    
    /**
      * Get date format pattern
      */
    def dateFormat: String = js.native
    /**
      * Set date format pattern
      */
    def dateFormat_=(dateFormat: String): Unit = js.native
    
    /**
      * Set date
      */
    def date_=(date: End): Unit = js.native
    
    def emit(name: EventType, data: typings.bulmaCalendar.mod.bulmaCalendar): Unit = js.native
    def emit(name: EventType, data: typings.bulmaCalendar.mod.bulmaCalendar, silent: Boolean): Unit = js.native
    
    /**
      * Get selected end date
      */
    def endDate: Date = js.native
    /**
      * Set end date
      */
    def endDate_=(endDate: Date): Unit = js.native
    
    /**
      * Get selected end time
      */
    def endTime: Date = js.native
    /**
      * Set end time
      */
    def endTime_=(endTime: Date): Unit = js.native
    
    /**
      * Close date picker (not available with "inline" display style)
      */
    def hide(): Unit = js.native
    
    // Getters
    /**
      * Get component instance ID
      */
    def id: js.Any = js.native
    
    /**
      * Check if date picker is open or not
      *
      * @returns True if date picker is open else False
      */
    def isOpen(): Boolean = js.native
    
    /**
      * Check if current instance is a range date picker
      *
      * @returns True if the instance is a range date picker
      */
    def isRange(): Boolean = js.native
    
    /**
      * Get active lang
      */
    def lang: String = js.native
    /**
      * Set component lang
      */
    def lang_=(lang: String): Unit = js.native
    
    // Custom EventEmitter implementation
    def listenerCount(eventName: EventType): Unit = js.native
    
    /**
      * Get max possible date
      */
    def maxDate: Date = js.native
    /**
      * Set max possible date
      */
    def maxDate_=(maxDate: Date): Unit = js.native
    
    def middleware[T /* <: EventType */](eventName: T, fn: js.Function1[/* event */ Event[T], Unit]): Unit = js.native
    
    /**
      * Get min possible date
      */
    def minDate: Date = js.native
    /**
      * Set min possible date
      */
    def minDate_=(minDate: Date): Unit = js.native
    
    def on[T /* <: EventType */](name: T, callback: js.Function1[/* event */ Event[T], Unit]): Unit = js.native
    def on[T /* <: EventType */](name: T, callback: js.Function1[/* event */ Event[T], Unit], once: Boolean): Unit = js.native
    
    def once[T /* <: EventType */](name: T, callback: js.Function1[/* event */ Event[T], Unit]): Unit = js.native
    
    /**
      * Force calendar refresh
      */
    def refresh(): Unit = js.native
    
    def removeListeners(eventName: EventType): Unit = js.native
    def removeListeners(eventName: EventType, middleware: Boolean): Unit = js.native
    
    def removeMiddleware(eventName: EventType): Unit = js.native
    
    /**
      * Force to set calendar data into UI inputs
      */
    def save(): Unit = js.native
    
    // Methods
    /**
      * Open date picker (not available with "inline" display style)
      */
    def show(): Unit = js.native
    
    /**
      * Get selected start date
      */
    def startDate: Date = js.native
    /**
      * Se start date
      */
    def startDate_=(startDate: Date): Unit = js.native
    
    /**
      * Get selected start time
      */
    def startTime: Date = js.native
    /**
      * Set start time
      */
    def startTime_=(startTime: Date): Unit = js.native
    
    /**
      * Get selected time
      */
    def time: Date = js.native
    
    /**
      * Get time format pattern
      */
    def timeFormat: String = js.native
    /**
      * Set time format pattern
      */
    def timeFormat_=(timeFormat: String): Unit = js.native
    
    /**
      * Set time
      */
    def time_=(time: Date): Unit = js.native
    
    /**
      * Get the date picker value as formatted string if no parameter else set the passed value
      *
      * @param value Formatted date value if no parameter passed else null
      *
      * @returns Date picker selected date (if not range calendar then endDate is undefined)
      */
    def value(): EndDate = js.native
    def value(value: String): EndDate = js.native
  }
}
