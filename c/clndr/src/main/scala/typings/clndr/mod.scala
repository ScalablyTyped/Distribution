package typings.clndr

import typings.moment.mod.Moment
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  trait CalendarDay extends StObject {
    
    var classes: String
    
    var date: Moment
    
    var day: Double
    
    var events: js.Array[js.Any]
    
    var properties: CalendarDayProperties
  }
  object CalendarDay {
    
    inline def apply(
      classes: String,
      date: Moment,
      day: Double,
      events: js.Array[js.Any],
      properties: CalendarDayProperties
    ): CalendarDay = {
      val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], day = day.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
      __obj.asInstanceOf[CalendarDay]
    }
    
    extension [Self <: CalendarDay](x: Self) {
      
      inline def setClasses(value: String): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setDate(value: Moment): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      inline def setEvents(value: js.Array[js.Any]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsVarargs(value: js.Any*): Self = StObject.set(x, "events", js.Array(value :_*))
      
      inline def setProperties(value: CalendarDayProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    }
  }
  
  trait CalendarDayProperties extends StObject {
    
    var isAdjacentMonth: Boolean
    
    var isInactive: Boolean
    
    var isToday: Boolean
  }
  object CalendarDayProperties {
    
    inline def apply(isAdjacentMonth: Boolean, isInactive: Boolean, isToday: Boolean): CalendarDayProperties = {
      val __obj = js.Dynamic.literal(isAdjacentMonth = isAdjacentMonth.asInstanceOf[js.Any], isInactive = isInactive.asInstanceOf[js.Any], isToday = isToday.asInstanceOf[js.Any])
      __obj.asInstanceOf[CalendarDayProperties]
    }
    
    extension [Self <: CalendarDayProperties](x: Self) {
      
      inline def setIsAdjacentMonth(value: Boolean): Self = StObject.set(x, "isAdjacentMonth", value.asInstanceOf[js.Any])
      
      inline def setIsInactive(value: Boolean): Self = StObject.set(x, "isInactive", value.asInstanceOf[js.Any])
      
      inline def setIsToday(value: Boolean): Self = StObject.set(x, "isToday", value.asInstanceOf[js.Any])
    }
  }
  
  trait Classes extends StObject {
    
    var adjacentMonth: js.UndefOr[String] = js.undefined
    
    var event: js.UndefOr[String] = js.undefined
    
    var inactive: js.UndefOr[String] = js.undefined
    
    var lastMonth: js.UndefOr[String] = js.undefined
    
    var nextMonth: js.UndefOr[String] = js.undefined
    
    var past: js.UndefOr[String] = js.undefined
    
    var selected: js.UndefOr[String] = js.undefined
    
    var today: js.UndefOr[String] = js.undefined
  }
  object Classes {
    
    inline def apply(): Classes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Classes]
    }
    
    extension [Self <: Classes](x: Self) {
      
      inline def setAdjacentMonth(value: String): Self = StObject.set(x, "adjacentMonth", value.asInstanceOf[js.Any])
      
      inline def setAdjacentMonthUndefined: Self = StObject.set(x, "adjacentMonth", js.undefined)
      
      inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setInactive(value: String): Self = StObject.set(x, "inactive", value.asInstanceOf[js.Any])
      
      inline def setInactiveUndefined: Self = StObject.set(x, "inactive", js.undefined)
      
      inline def setLastMonth(value: String): Self = StObject.set(x, "lastMonth", value.asInstanceOf[js.Any])
      
      inline def setLastMonthUndefined: Self = StObject.set(x, "lastMonth", js.undefined)
      
      inline def setNextMonth(value: String): Self = StObject.set(x, "nextMonth", value.asInstanceOf[js.Any])
      
      inline def setNextMonthUndefined: Self = StObject.set(x, "nextMonth", js.undefined)
      
      inline def setPast(value: String): Self = StObject.set(x, "past", value.asInstanceOf[js.Any])
      
      inline def setPastUndefined: Self = StObject.set(x, "past", js.undefined)
      
      inline def setSelected(value: String): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setToday(value: String): Self = StObject.set(x, "today", value.asInstanceOf[js.Any])
      
      inline def setTodayUndefined: Self = StObject.set(x, "today", js.undefined)
    }
  }
  
  trait ClickEvents extends StObject {
    
    /**
      * Fired whenever a calendar box is clicked. Returns a 'target' object
      * containing the DOM element, any events, and the date as a moment.js
      * object.
      */
    var click: js.UndefOr[js.Function1[/* target */ Target, Unit]] = js.undefined
    
    /**
      * Fired when a user goes forward a period. Returns moment.js objects
      * for the updated start and end date.
      */
    var nextInterval: js.UndefOr[js.Function2[/* start */ Moment, /* end */ Moment, Unit]] = js.undefined
    
    /**
      * Fired when a user goes forward a month. Returns a moment.js object
      * set to the correct month.
      */
    var nextMonth: js.UndefOr[js.Function1[/* month */ Moment, Unit]] = js.undefined
    
    /**
      * Fired when the next year button is clicked. Returns a moment.js
      * object set to the correct month and year.
      */
    var nextYear: js.UndefOr[js.Function1[/* month */ Moment, Unit]] = js.undefined
    
    /**
      * Fired whenever the time period changes as configured in lengthOfTime.
      * Returns moment.js objects for the updated start and end date.
      */
    var onIntervalChange: js.UndefOr[js.Function2[/* start */ Moment, /* end */ Moment, Unit]] = js.undefined
    
    /**
      * Fires any time the month changes as a result of a click action.
      * Returns a moment.js object set to the correct month.
      */
    var onMonthChange: js.UndefOr[js.Function1[/* month */ Moment, Unit]] = js.undefined
    
    /**
      * Fires any time the year changes as a result of a click action. If
      * onMonthChange is also set, it is fired BEFORE onYearChange. Returns
      * a moment.js object set to the correct month and year.
      */
    var onYearChange: js.UndefOr[js.Function1[/* month */ Moment, Unit]] = js.undefined
    
    /**
      * Fired when a user goes back an interval. Returns moment.js objects for
      * the updated start and end date.
      */
    var previousInterval: js.UndefOr[js.Function2[/* start */ Moment, /* end */ Moment, Unit]] = js.undefined
    
    /**
      * Fired when a user goes back a month. Returns a moment.js object set
      * to the correct month.
      *
      */
    var previousMonth: js.UndefOr[js.Function1[/* month */ Moment, Unit]] = js.undefined
    
    /**
      * Fired when the previous year button is clicked. Returns a moment.js
      * object set to the correct month and year.
      */
    var previousYear: js.UndefOr[js.Function1[/* month */ Moment, Unit]] = js.undefined
    
    /**
      * Fired when a user goes to the current month and year. Returns a
      * moment.js object set to the correct month.
      */
    var today: js.UndefOr[js.Function1[/* month */ Moment, Unit]] = js.undefined
  }
  object ClickEvents {
    
    inline def apply(): ClickEvents = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClickEvents]
    }
    
    extension [Self <: ClickEvents](x: Self) {
      
      inline def setClick(value: /* target */ Target => Unit): Self = StObject.set(x, "click", js.Any.fromFunction1(value))
      
      inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
      
      inline def setNextInterval(value: (/* start */ Moment, /* end */ Moment) => Unit): Self = StObject.set(x, "nextInterval", js.Any.fromFunction2(value))
      
      inline def setNextIntervalUndefined: Self = StObject.set(x, "nextInterval", js.undefined)
      
      inline def setNextMonth(value: /* month */ Moment => Unit): Self = StObject.set(x, "nextMonth", js.Any.fromFunction1(value))
      
      inline def setNextMonthUndefined: Self = StObject.set(x, "nextMonth", js.undefined)
      
      inline def setNextYear(value: /* month */ Moment => Unit): Self = StObject.set(x, "nextYear", js.Any.fromFunction1(value))
      
      inline def setNextYearUndefined: Self = StObject.set(x, "nextYear", js.undefined)
      
      inline def setOnIntervalChange(value: (/* start */ Moment, /* end */ Moment) => Unit): Self = StObject.set(x, "onIntervalChange", js.Any.fromFunction2(value))
      
      inline def setOnIntervalChangeUndefined: Self = StObject.set(x, "onIntervalChange", js.undefined)
      
      inline def setOnMonthChange(value: /* month */ Moment => Unit): Self = StObject.set(x, "onMonthChange", js.Any.fromFunction1(value))
      
      inline def setOnMonthChangeUndefined: Self = StObject.set(x, "onMonthChange", js.undefined)
      
      inline def setOnYearChange(value: /* month */ Moment => Unit): Self = StObject.set(x, "onYearChange", js.Any.fromFunction1(value))
      
      inline def setOnYearChangeUndefined: Self = StObject.set(x, "onYearChange", js.undefined)
      
      inline def setPreviousInterval(value: (/* start */ Moment, /* end */ Moment) => Unit): Self = StObject.set(x, "previousInterval", js.Any.fromFunction2(value))
      
      inline def setPreviousIntervalUndefined: Self = StObject.set(x, "previousInterval", js.undefined)
      
      inline def setPreviousMonth(value: /* month */ Moment => Unit): Self = StObject.set(x, "previousMonth", js.Any.fromFunction1(value))
      
      inline def setPreviousMonthUndefined: Self = StObject.set(x, "previousMonth", js.undefined)
      
      inline def setPreviousYear(value: /* month */ Moment => Unit): Self = StObject.set(x, "previousYear", js.Any.fromFunction1(value))
      
      inline def setPreviousYearUndefined: Self = StObject.set(x, "previousYear", js.undefined)
      
      inline def setToday(value: /* month */ Moment => Unit): Self = StObject.set(x, "today", js.Any.fromFunction1(value))
      
      inline def setTodayUndefined: Self = StObject.set(x, "today", js.undefined)
    }
  }
  
  @js.native
  trait ClndrInstance extends StObject {
    
    /**
      * Add events. Note that this triggers a re-render of the calendar.
      */
    def addEvents(events: js.Array[js.Any]): this.type = js.native
    
    /**
      * Go to the previous month
      */
    def back(): this.type = js.native
    
    /**
      * Destroy the clndr instance. This will empty the DOM node containing the
      * calendar.
      */
    def destroy(): Unit = js.native
    
    /**
      * Go to the next month
      */
    def forward(): this.type = js.native
    
    /**
      * Go to the next year
      */
    def nextYear(): this.type = js.native
    
    /**
      * Get clndr options
      */
    var options: ClndrOptions = js.native
    
    /**
      * Go to the previous year
      */
    def previousYear(): this.type = js.native
    
    /**
      * Remove events.  All events for which the passed in function returns true will
      * be removed from the calendar. Note that this triggers a re-render of the
      * calendar.
      */
    def removeEvents(filter: js.Function1[/* event */ js.Any, Boolean]): this.type = js.native
    
    /**
      * Re-render of the calendar.
      */
    def render(): Unit = js.native
    
    /**
      * Change the events. Note that this triggers a re-render of the calendar.
      */
    def setEvents(events: js.Array[js.Any]): this.type = js.native
    
    def setMonth(month: String): this.type = js.native
    /**
      * Set the month using a number from 0-11 or a month name
      */
    def setMonth(month: Double): this.type = js.native
    
    /**
      * Set the year
      */
    def setYear(year: Double): this.type = js.native
    
    /**
      * Go to today
      */
    def today(): this.type = js.native
  }
  
  trait ClndrOptions extends StObject {
    
    /**
      * when days from adjacent months are clicked, switch the current month.
      * fires nextMonth/previousMonth/onMonthChange click callbacks. defaults to false.
      */
    var adjacentDaysChangeMonth: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Custom classes to avoid styling issues. pass in only the classnames that
      * you wish to override. These are the defaults.
      */
    var classes: js.UndefOr[Classes] = js.undefined
    
    /**
      * callbacks!
      */
    var clickEvents: js.UndefOr[ClickEvents] = js.undefined
    
    // If you want to prevent the user from navigating the calendar outside
    // of a certain date range (e.g. if you are making a datepicker), specify
    // either the startDate, endDate, or both in the constraints option. You
    // can change these while the calendar is on the page... See documentation
    // below for more on this!
    var constraints: js.UndefOr[Constraints] = js.undefined
    
    /**
      * if you're supplying an events array, dateParameter points to the field in your event object containing a date string. It's set to 'date' by default.
      */
    var dateParameter: js.UndefOr[String] = js.undefined
    
    /**
      * An array of day abbreviation labels. If you have moment.js set to a
      * different language, it will guess these for you! If for some reason that
      * doesn't work, use this...
      * WARNING: if you are dealing with i18n and multiple languages, you
      * probably don't want this! See the "Internationalization" section below
      * for more.
      */
    var daysOfTheWeek: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * A callback when the calendar is done rendering. This is a good place
      * to bind custom event handlers (also see the 'ready' option above).
      */
    var doneRendering: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** an array of event objects */
    var events: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    /**
      * Any other data variables you want access to in your template. This gets
      * passed into the template function.
      */
    var extras: js.UndefOr[js.Any] = js.undefined
    
    /**
      * Always make the calendar six rows tall (42 days) so that every month has
      * a consistent height. defaults to 'false'.
      */
    var forceSixRows: js.UndefOr[Boolean | Null] = js.undefined
    
    /**
      * Set this to true if you don't want `inactive` dates to be selectable.
      * This will only matter if you are using the `constraints` option.
      */
    var ignoreInactiveDaysInSelection: js.UndefOr[Boolean | Null] = js.undefined
    
    // CLNDR can render in any time interval!
    // You can specify if you want to render one or more months, or one ore more
    // days in the calendar, as well as the paging interval whenever forward or
    // back is triggered. If both months and days are null, CLNDR will default
    // to the standard monthly view.
    var lengthOfTime: js.UndefOr[LengthOfTime] = js.undefined
    
    /**
      * Optionally, you can pass a Moment instance to use instead of the global
      */
    var moment: js.UndefOr[Moment | Null] = js.undefined
    
    /**
      * CLNDR can accept events lasting more than one day! just pass in the
      * multiDayEvents option and specify what the start and end fields are
      * called within your event objects. See the example file for a working
      * instance of this.
      */
    var multiDayEvents: js.UndefOr[MultiDayEvents] = js.undefined
    
    /**
      * This is called only once after clndr has been initialized and rendered.
      * use this to bind custom event handlers that don't need to be re-attached
      * every time the month changes (most event handlers fall in this category).
      * Hint: this.element refers to the parent element that holds the clndr,
      * and is a great place to attach handlers that don't get tossed out every
      * time the clndr is re-rendered.
      */
    var ready: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * If you want to use a different templating language, here's your ticket.
      * Precompile your template (before you call clndr), pass the data from the
      * render function into your template, and return the result. The result
      * must be a string containing valid markup. The keyword 'this' is set to
      * the clndr instance in case you need access to any other properties.
      * More under 'Template Rendering Engine' below.
      */
    var render: js.UndefOr[js.Function1[/* data */ RenderData, Unit]] = js.undefined
    
    /**
      * Set this, if you want a date to be "selected" (see classes.selected)
      * after plugin init. Defualts to null, no initially selected date.
      */
    var selectedDate: js.UndefOr[js.Any] = js.undefined
    
    /**
      * show the numbers of days in months adjacent to the current month (and populate them with their events). defaults to true.
      */
    var showAdjacentMonths: js.UndefOr[Boolean] = js.undefined
    
    /**
      * determines which month to start with using either a date string or a moment object.
      */
    var startWithMonth: js.UndefOr[String | Moment] = js.undefined
    
    /**
      * the target classnames that CLNDR will look for to bind events. these are the defaults.
      */
    var targets: js.UndefOr[Targets] = js.undefined
    
    /**
      * the template: this could be stored in markup as a <script type="text/template"></script>
      * or pulled in as a string
      */
    var template: js.UndefOr[String] = js.undefined
    
    /**
      * Set this to true, if you want the plugin to track the last clicked day.
      * If trackSelectedDate is true, "selected" class will always be applied
      * only to the most recently clicked date; otherwise - selectedDate will
      * not change.
      */
    var trackSelectedDate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Use the 'touchstart' event instead of 'click'
      */
    var useTouchEvents: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Start the week off on Sunday (0), Monday (1), etc. Sunday is the default.
      * WARNING: if you are dealing with i18n and multiple languages, you
      * probably don't want this! See the "Internationalization" section below
      * for more.
      */
    var weekOffset: js.UndefOr[Double] = js.undefined
  }
  object ClndrOptions {
    
    inline def apply(): ClndrOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClndrOptions]
    }
    
    extension [Self <: ClndrOptions](x: Self) {
      
      inline def setAdjacentDaysChangeMonth(value: Boolean): Self = StObject.set(x, "adjacentDaysChangeMonth", value.asInstanceOf[js.Any])
      
      inline def setAdjacentDaysChangeMonthUndefined: Self = StObject.set(x, "adjacentDaysChangeMonth", js.undefined)
      
      inline def setClasses(value: Classes): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      inline def setClickEvents(value: ClickEvents): Self = StObject.set(x, "clickEvents", value.asInstanceOf[js.Any])
      
      inline def setClickEventsUndefined: Self = StObject.set(x, "clickEvents", js.undefined)
      
      inline def setConstraints(value: Constraints): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
      
      inline def setConstraintsUndefined: Self = StObject.set(x, "constraints", js.undefined)
      
      inline def setDateParameter(value: String): Self = StObject.set(x, "dateParameter", value.asInstanceOf[js.Any])
      
      inline def setDateParameterUndefined: Self = StObject.set(x, "dateParameter", js.undefined)
      
      inline def setDaysOfTheWeek(value: js.Array[String]): Self = StObject.set(x, "daysOfTheWeek", value.asInstanceOf[js.Any])
      
      inline def setDaysOfTheWeekUndefined: Self = StObject.set(x, "daysOfTheWeek", js.undefined)
      
      inline def setDaysOfTheWeekVarargs(value: String*): Self = StObject.set(x, "daysOfTheWeek", js.Array(value :_*))
      
      inline def setDoneRendering(value: () => Unit): Self = StObject.set(x, "doneRendering", js.Any.fromFunction0(value))
      
      inline def setDoneRenderingUndefined: Self = StObject.set(x, "doneRendering", js.undefined)
      
      inline def setEvents(value: js.Array[js.Any]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setEventsVarargs(value: js.Any*): Self = StObject.set(x, "events", js.Array(value :_*))
      
      inline def setExtras(value: js.Any): Self = StObject.set(x, "extras", value.asInstanceOf[js.Any])
      
      inline def setExtrasUndefined: Self = StObject.set(x, "extras", js.undefined)
      
      inline def setForceSixRows(value: Boolean): Self = StObject.set(x, "forceSixRows", value.asInstanceOf[js.Any])
      
      inline def setForceSixRowsNull: Self = StObject.set(x, "forceSixRows", null)
      
      inline def setForceSixRowsUndefined: Self = StObject.set(x, "forceSixRows", js.undefined)
      
      inline def setIgnoreInactiveDaysInSelection(value: Boolean): Self = StObject.set(x, "ignoreInactiveDaysInSelection", value.asInstanceOf[js.Any])
      
      inline def setIgnoreInactiveDaysInSelectionNull: Self = StObject.set(x, "ignoreInactiveDaysInSelection", null)
      
      inline def setIgnoreInactiveDaysInSelectionUndefined: Self = StObject.set(x, "ignoreInactiveDaysInSelection", js.undefined)
      
      inline def setLengthOfTime(value: LengthOfTime): Self = StObject.set(x, "lengthOfTime", value.asInstanceOf[js.Any])
      
      inline def setLengthOfTimeUndefined: Self = StObject.set(x, "lengthOfTime", js.undefined)
      
      inline def setMoment(value: Moment): Self = StObject.set(x, "moment", value.asInstanceOf[js.Any])
      
      inline def setMomentNull: Self = StObject.set(x, "moment", null)
      
      inline def setMomentUndefined: Self = StObject.set(x, "moment", js.undefined)
      
      inline def setMultiDayEvents(value: MultiDayEvents): Self = StObject.set(x, "multiDayEvents", value.asInstanceOf[js.Any])
      
      inline def setMultiDayEventsUndefined: Self = StObject.set(x, "multiDayEvents", js.undefined)
      
      inline def setReady(value: () => Unit): Self = StObject.set(x, "ready", js.Any.fromFunction0(value))
      
      inline def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
      
      inline def setRender(value: /* data */ RenderData => Unit): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      inline def setSelectedDate(value: js.Any): Self = StObject.set(x, "selectedDate", value.asInstanceOf[js.Any])
      
      inline def setSelectedDateUndefined: Self = StObject.set(x, "selectedDate", js.undefined)
      
      inline def setShowAdjacentMonths(value: Boolean): Self = StObject.set(x, "showAdjacentMonths", value.asInstanceOf[js.Any])
      
      inline def setShowAdjacentMonthsUndefined: Self = StObject.set(x, "showAdjacentMonths", js.undefined)
      
      inline def setStartWithMonth(value: String | Moment): Self = StObject.set(x, "startWithMonth", value.asInstanceOf[js.Any])
      
      inline def setStartWithMonthUndefined: Self = StObject.set(x, "startWithMonth", js.undefined)
      
      inline def setTargets(value: Targets): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
      
      inline def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      inline def setTrackSelectedDate(value: Boolean): Self = StObject.set(x, "trackSelectedDate", value.asInstanceOf[js.Any])
      
      inline def setTrackSelectedDateUndefined: Self = StObject.set(x, "trackSelectedDate", js.undefined)
      
      inline def setUseTouchEvents(value: Boolean): Self = StObject.set(x, "useTouchEvents", value.asInstanceOf[js.Any])
      
      inline def setUseTouchEventsUndefined: Self = StObject.set(x, "useTouchEvents", js.undefined)
      
      inline def setWeekOffset(value: Double): Self = StObject.set(x, "weekOffset", value.asInstanceOf[js.Any])
      
      inline def setWeekOffsetUndefined: Self = StObject.set(x, "weekOffset", js.undefined)
    }
  }
  
  trait Constraints extends StObject {
    
    var endDate: js.UndefOr[String] = js.undefined
    
    var startDate: js.UndefOr[String] = js.undefined
  }
  object Constraints {
    
    inline def apply(): Constraints = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Constraints]
    }
    
    extension [Self <: Constraints](x: Self) {
      
      inline def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
      
      inline def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    }
  }
  
  trait LengthOfTime extends StObject {
    
    /**
      * Set to an integer if you want to render one or more days, otherwise
      * leave this null. Setting this to 14 would render a 2-week calendar.
      *
      */
    var days: js.UndefOr[Double | Null] = js.undefined
    
    /**
      * This is the amount of months or days that will move forward/back when
      * paging the calendar. With days=14 and interval=7, you would have a
      * 2-week calendar that pages forward and backward 1 week at a time.
      */
    var interval: js.UndefOr[Double] = js.undefined
    
    /**
      * Set to an integer if you want to render one or more months, otherwise
      * leave this null
      */
    var months: js.UndefOr[Double | Null] = js.undefined
  }
  object LengthOfTime {
    
    inline def apply(): LengthOfTime = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LengthOfTime]
    }
    
    extension [Self <: LengthOfTime](x: Self) {
      
      inline def setDays(value: Double): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
      
      inline def setDaysNull: Self = StObject.set(x, "days", null)
      
      inline def setDaysUndefined: Self = StObject.set(x, "days", js.undefined)
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def setMonths(value: Double): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
      
      inline def setMonthsNull: Self = StObject.set(x, "months", null)
      
      inline def setMonthsUndefined: Self = StObject.set(x, "months", js.undefined)
    }
  }
  
  trait Month extends StObject {
    
    var days: js.Array[CalendarDay]
    
    var month: Moment
  }
  object Month {
    
    inline def apply(days: js.Array[CalendarDay], month: Moment): Month = {
      val __obj = js.Dynamic.literal(days = days.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any])
      __obj.asInstanceOf[Month]
    }
    
    extension [Self <: Month](x: Self) {
      
      inline def setDays(value: js.Array[CalendarDay]): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
      
      inline def setDaysVarargs(value: CalendarDay*): Self = StObject.set(x, "days", js.Array(value :_*))
      
      inline def setMonth(value: Moment): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    }
  }
  
  trait MultiDayEvents extends StObject {
    
    var endDate: js.UndefOr[String] = js.undefined
    
    /**
      * If you also have single day events with a different date field,
      * use the singleDay property and point it to the date field.
      */
    var singleDay: js.UndefOr[String] = js.undefined
    
    var startDate: js.UndefOr[String] = js.undefined
  }
  object MultiDayEvents {
    
    inline def apply(): MultiDayEvents = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MultiDayEvents]
    }
    
    extension [Self <: MultiDayEvents](x: Self) {
      
      inline def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
      
      inline def setSingleDay(value: String): Self = StObject.set(x, "singleDay", value.asInstanceOf[js.Any])
      
      inline def setSingleDayUndefined: Self = StObject.set(x, "singleDay", js.undefined)
      
      inline def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    }
  }
  
  trait RenderData extends StObject {
    
    var days: js.Array[CalendarDay]
    
    var daysOfTheWeek: js.Array[String]
    
    var eventsLastMonth: js.Array[js.Any]
    
    var eventsNextMonth: js.Array[js.Any]
    
    var eventsThisInterval: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var eventsThisMonth: js.Array[js.Any]
    
    var extras: js.UndefOr[js.Any] = js.undefined
    
    var intervalEnd: js.UndefOr[Moment] = js.undefined
    
    var intervalStart: js.UndefOr[Moment] = js.undefined
    
    var month: String
    
    var months: js.Array[Month]
    
    var numberOfRows: Double
    
    var year: Double
  }
  object RenderData {
    
    inline def apply(
      days: js.Array[CalendarDay],
      daysOfTheWeek: js.Array[String],
      eventsLastMonth: js.Array[js.Any],
      eventsNextMonth: js.Array[js.Any],
      eventsThisMonth: js.Array[js.Any],
      month: String,
      months: js.Array[Month],
      numberOfRows: Double,
      year: Double
    ): RenderData = {
      val __obj = js.Dynamic.literal(days = days.asInstanceOf[js.Any], daysOfTheWeek = daysOfTheWeek.asInstanceOf[js.Any], eventsLastMonth = eventsLastMonth.asInstanceOf[js.Any], eventsNextMonth = eventsNextMonth.asInstanceOf[js.Any], eventsThisMonth = eventsThisMonth.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], numberOfRows = numberOfRows.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderData]
    }
    
    extension [Self <: RenderData](x: Self) {
      
      inline def setDays(value: js.Array[CalendarDay]): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
      
      inline def setDaysOfTheWeek(value: js.Array[String]): Self = StObject.set(x, "daysOfTheWeek", value.asInstanceOf[js.Any])
      
      inline def setDaysOfTheWeekVarargs(value: String*): Self = StObject.set(x, "daysOfTheWeek", js.Array(value :_*))
      
      inline def setDaysVarargs(value: CalendarDay*): Self = StObject.set(x, "days", js.Array(value :_*))
      
      inline def setEventsLastMonth(value: js.Array[js.Any]): Self = StObject.set(x, "eventsLastMonth", value.asInstanceOf[js.Any])
      
      inline def setEventsLastMonthVarargs(value: js.Any*): Self = StObject.set(x, "eventsLastMonth", js.Array(value :_*))
      
      inline def setEventsNextMonth(value: js.Array[js.Any]): Self = StObject.set(x, "eventsNextMonth", value.asInstanceOf[js.Any])
      
      inline def setEventsNextMonthVarargs(value: js.Any*): Self = StObject.set(x, "eventsNextMonth", js.Array(value :_*))
      
      inline def setEventsThisInterval(value: js.Array[js.Any]): Self = StObject.set(x, "eventsThisInterval", value.asInstanceOf[js.Any])
      
      inline def setEventsThisIntervalUndefined: Self = StObject.set(x, "eventsThisInterval", js.undefined)
      
      inline def setEventsThisIntervalVarargs(value: js.Any*): Self = StObject.set(x, "eventsThisInterval", js.Array(value :_*))
      
      inline def setEventsThisMonth(value: js.Array[js.Any]): Self = StObject.set(x, "eventsThisMonth", value.asInstanceOf[js.Any])
      
      inline def setEventsThisMonthVarargs(value: js.Any*): Self = StObject.set(x, "eventsThisMonth", js.Array(value :_*))
      
      inline def setExtras(value: js.Any): Self = StObject.set(x, "extras", value.asInstanceOf[js.Any])
      
      inline def setExtrasUndefined: Self = StObject.set(x, "extras", js.undefined)
      
      inline def setIntervalEnd(value: Moment): Self = StObject.set(x, "intervalEnd", value.asInstanceOf[js.Any])
      
      inline def setIntervalEndUndefined: Self = StObject.set(x, "intervalEnd", js.undefined)
      
      inline def setIntervalStart(value: Moment): Self = StObject.set(x, "intervalStart", value.asInstanceOf[js.Any])
      
      inline def setIntervalStartUndefined: Self = StObject.set(x, "intervalStart", js.undefined)
      
      inline def setMonth(value: String): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def setMonths(value: js.Array[Month]): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
      
      inline def setMonthsVarargs(value: Month*): Self = StObject.set(x, "months", js.Array(value :_*))
      
      inline def setNumberOfRows(value: Double): Self = StObject.set(x, "numberOfRows", value.asInstanceOf[js.Any])
      
      inline def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    }
  }
  
  trait Target extends StObject {
    
    var date: Moment
    
    var element: Element
    
    var events: js.Array[js.Any]
  }
  object Target {
    
    inline def apply(date: Moment, element: Element, events: js.Array[js.Any]): Target = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any])
      __obj.asInstanceOf[Target]
    }
    
    extension [Self <: Target](x: Self) {
      
      inline def setDate(value: Moment): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setEvents(value: js.Array[js.Any]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsVarargs(value: js.Any*): Self = StObject.set(x, "events", js.Array(value :_*))
    }
  }
  
  trait Targets extends StObject {
    
    var day: js.UndefOr[String] = js.undefined
    
    var empty: js.UndefOr[String] = js.undefined
    
    var nextButton: js.UndefOr[String] = js.undefined
    
    var nextYearButton: js.UndefOr[String] = js.undefined
    
    var previousButton: js.UndefOr[String] = js.undefined
    
    var previousYearButton: js.UndefOr[String] = js.undefined
    
    var todayButton: js.UndefOr[String] = js.undefined
  }
  object Targets {
    
    inline def apply(): Targets = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Targets]
    }
    
    extension [Self <: Targets](x: Self) {
      
      inline def setDay(value: String): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      inline def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
      
      inline def setEmpty(value: String): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
      
      inline def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
      
      inline def setNextButton(value: String): Self = StObject.set(x, "nextButton", value.asInstanceOf[js.Any])
      
      inline def setNextButtonUndefined: Self = StObject.set(x, "nextButton", js.undefined)
      
      inline def setNextYearButton(value: String): Self = StObject.set(x, "nextYearButton", value.asInstanceOf[js.Any])
      
      inline def setNextYearButtonUndefined: Self = StObject.set(x, "nextYearButton", js.undefined)
      
      inline def setPreviousButton(value: String): Self = StObject.set(x, "previousButton", value.asInstanceOf[js.Any])
      
      inline def setPreviousButtonUndefined: Self = StObject.set(x, "previousButton", js.undefined)
      
      inline def setPreviousYearButton(value: String): Self = StObject.set(x, "previousYearButton", value.asInstanceOf[js.Any])
      
      inline def setPreviousYearButtonUndefined: Self = StObject.set(x, "previousYearButton", js.undefined)
      
      inline def setTodayButton(value: String): Self = StObject.set(x, "todayButton", value.asInstanceOf[js.Any])
      
      inline def setTodayButtonUndefined: Self = StObject.set(x, "todayButton", js.undefined)
    }
  }
  
  object global {
    
    @js.native
    trait JQuery extends StObject {
      
      def clndr(): ClndrInstance = js.native
      def clndr(options: ClndrOptions): ClndrInstance = js.native
    }
  }
}
