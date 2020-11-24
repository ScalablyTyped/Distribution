package typings.clndr.mod

import typings.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClndrOptions extends js.Object {
  
  /**
    * when days from adjacent months are clicked, switch the current month.
    * fires nextMonth/previousMonth/onMonthChange click callbacks. defaults to false.
    */
  var adjacentDaysChangeMonth: js.UndefOr[Boolean] = js.native
  
  /**
    * Custom classes to avoid styling issues. pass in only the classnames that
    * you wish to override. These are the defaults.
    */
  var classes: js.UndefOr[Classes] = js.native
  
  /**
    * callbacks!
    */
  var clickEvents: js.UndefOr[ClickEvents] = js.native
  
  // If you want to prevent the user from navigating the calendar outside
  // of a certain date range (e.g. if you are making a datepicker), specify
  // either the startDate, endDate, or both in the constraints option. You
  // can change these while the calendar is on the page... See documentation
  // below for more on this!
  var constraints: js.UndefOr[Constraints] = js.native
  
  /**
    * if you're supplying an events array, dateParameter points to the field in your event object containing a date string. It's set to 'date' by default.
    */
  var dateParameter: js.UndefOr[String] = js.native
  
  /**
    * An array of day abbreviation labels. If you have moment.js set to a
    * different language, it will guess these for you! If for some reason that
    * doesn't work, use this...
    * WARNING: if you are dealing with i18n and multiple languages, you
    * probably don't want this! See the "Internationalization" section below
    * for more.
    */
  var daysOfTheWeek: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A callback when the calendar is done rendering. This is a good place
    * to bind custom event handlers (also see the 'ready' option above).
    */
  var doneRendering: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** an array of event objects */
  var events: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Any other data variables you want access to in your template. This gets
    * passed into the template function.
    */
  var extras: js.UndefOr[js.Any] = js.native
  
  /**
    * Always make the calendar six rows tall (42 days) so that every month has
    * a consistent height. defaults to 'false'.
    */
  var forceSixRows: js.UndefOr[Boolean | Null] = js.native
  
  /**
    * Set this to true if you don't want `inactive` dates to be selectable.
    * This will only matter if you are using the `constraints` option.
    */
  var ignoreInactiveDaysInSelection: js.UndefOr[Boolean | Null] = js.native
  
  // CLNDR can render in any time interval!
  // You can specify if you want to render one or more months, or one ore more
  // days in the calendar, as well as the paging interval whenever forward or
  // back is triggered. If both months and days are null, CLNDR will default
  // to the standard monthly view.
  var lengthOfTime: js.UndefOr[LengthOfTime] = js.native
  
  /**
    * Optionally, you can pass a Moment instance to use instead of the global
    */
  var moment: js.UndefOr[Moment | Null] = js.native
  
  /**
    * CLNDR can accept events lasting more than one day! just pass in the
    * multiDayEvents option and specify what the start and end fields are
    * called within your event objects. See the example file for a working
    * instance of this.
    */
  var multiDayEvents: js.UndefOr[MultiDayEvents] = js.native
  
  /**
    * This is called only once after clndr has been initialized and rendered.
    * use this to bind custom event handlers that don't need to be re-attached
    * every time the month changes (most event handlers fall in this category).
    * Hint: this.element refers to the parent element that holds the clndr,
    * and is a great place to attach handlers that don't get tossed out every
    * time the clndr is re-rendered.
    */
  var ready: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * If you want to use a different templating language, here's your ticket.
    * Precompile your template (before you call clndr), pass the data from the
    * render function into your template, and return the result. The result
    * must be a string containing valid markup. The keyword 'this' is set to
    * the clndr instance in case you need access to any other properties.
    * More under 'Template Rendering Engine' below.
    */
  var render: js.UndefOr[js.Function1[/* data */ RenderData, Unit]] = js.native
  
  /**
    * Set this, if you want a date to be "selected" (see classes.selected)
    * after plugin init. Defualts to null, no initially selected date.
    */
  var selectedDate: js.UndefOr[js.Any] = js.native
  
  /**
    * show the numbers of days in months adjacent to the current month (and populate them with their events). defaults to true.
    */
  var showAdjacentMonths: js.UndefOr[Boolean] = js.native
  
  /**
    * determines which month to start with using either a date string or a moment object.
    */
  var startWithMonth: js.UndefOr[String | Moment] = js.native
  
  /**
    * the target classnames that CLNDR will look for to bind events. these are the defaults.
    */
  var targets: js.UndefOr[Targets] = js.native
  
  /**
    * the template: this could be stored in markup as a <script type="text/template"></script>
    * or pulled in as a string
    */
  var template: js.UndefOr[String] = js.native
  
  /**
    * Set this to true, if you want the plugin to track the last clicked day.
    * If trackSelectedDate is true, "selected" class will always be applied
    * only to the most recently clicked date; otherwise - selectedDate will
    * not change.
    */
  var trackSelectedDate: js.UndefOr[Boolean] = js.native
  
  /**
    * Use the 'touchstart' event instead of 'click'
    */
  var useTouchEvents: js.UndefOr[Boolean] = js.native
  
  /**
    * Start the week off on Sunday (0), Monday (1), etc. Sunday is the default.
    * WARNING: if you are dealing with i18n and multiple languages, you
    * probably don't want this! See the "Internationalization" section below
    * for more.
    */
  var weekOffset: js.UndefOr[Double] = js.native
}
object ClndrOptions {
  
  @scala.inline
  def apply(): ClndrOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClndrOptions]
  }
  
  @scala.inline
  implicit class ClndrOptionsOps[Self <: ClndrOptions] (val x: Self) extends AnyVal {
    
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
    def setAdjacentDaysChangeMonth(value: Boolean): Self = this.set("adjacentDaysChangeMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdjacentDaysChangeMonth: Self = this.set("adjacentDaysChangeMonth", js.undefined)
    
    @scala.inline
    def setClasses(value: Classes): Self = this.set("classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClasses: Self = this.set("classes", js.undefined)
    
    @scala.inline
    def setClickEvents(value: ClickEvents): Self = this.set("clickEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClickEvents: Self = this.set("clickEvents", js.undefined)
    
    @scala.inline
    def setConstraints(value: Constraints): Self = this.set("constraints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConstraints: Self = this.set("constraints", js.undefined)
    
    @scala.inline
    def setDateParameter(value: String): Self = this.set("dateParameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateParameter: Self = this.set("dateParameter", js.undefined)
    
    @scala.inline
    def setDaysOfTheWeekVarargs(value: String*): Self = this.set("daysOfTheWeek", js.Array(value :_*))
    
    @scala.inline
    def setDaysOfTheWeek(value: js.Array[String]): Self = this.set("daysOfTheWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDaysOfTheWeek: Self = this.set("daysOfTheWeek", js.undefined)
    
    @scala.inline
    def setDoneRendering(value: () => Unit): Self = this.set("doneRendering", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDoneRendering: Self = this.set("doneRendering", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: js.Any*): Self = this.set("events", js.Array(value :_*))
    
    @scala.inline
    def setEvents(value: js.Array[_]): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    
    @scala.inline
    def setExtras(value: js.Any): Self = this.set("extras", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtras: Self = this.set("extras", js.undefined)
    
    @scala.inline
    def setForceSixRows(value: Boolean): Self = this.set("forceSixRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceSixRows: Self = this.set("forceSixRows", js.undefined)
    
    @scala.inline
    def setForceSixRowsNull: Self = this.set("forceSixRows", null)
    
    @scala.inline
    def setIgnoreInactiveDaysInSelection(value: Boolean): Self = this.set("ignoreInactiveDaysInSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreInactiveDaysInSelection: Self = this.set("ignoreInactiveDaysInSelection", js.undefined)
    
    @scala.inline
    def setIgnoreInactiveDaysInSelectionNull: Self = this.set("ignoreInactiveDaysInSelection", null)
    
    @scala.inline
    def setLengthOfTime(value: LengthOfTime): Self = this.set("lengthOfTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLengthOfTime: Self = this.set("lengthOfTime", js.undefined)
    
    @scala.inline
    def setMoment(value: Moment): Self = this.set("moment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMoment: Self = this.set("moment", js.undefined)
    
    @scala.inline
    def setMomentNull: Self = this.set("moment", null)
    
    @scala.inline
    def setMultiDayEvents(value: MultiDayEvents): Self = this.set("multiDayEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiDayEvents: Self = this.set("multiDayEvents", js.undefined)
    
    @scala.inline
    def setReady(value: () => Unit): Self = this.set("ready", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteReady: Self = this.set("ready", js.undefined)
    
    @scala.inline
    def setRender(value: /* data */ RenderData => Unit): Self = this.set("render", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
    
    @scala.inline
    def setSelectedDate(value: js.Any): Self = this.set("selectedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedDate: Self = this.set("selectedDate", js.undefined)
    
    @scala.inline
    def setShowAdjacentMonths(value: Boolean): Self = this.set("showAdjacentMonths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowAdjacentMonths: Self = this.set("showAdjacentMonths", js.undefined)
    
    @scala.inline
    def setStartWithMonth(value: String | Moment): Self = this.set("startWithMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartWithMonth: Self = this.set("startWithMonth", js.undefined)
    
    @scala.inline
    def setTargets(value: Targets): Self = this.set("targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargets: Self = this.set("targets", js.undefined)
    
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    
    @scala.inline
    def setTrackSelectedDate(value: Boolean): Self = this.set("trackSelectedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackSelectedDate: Self = this.set("trackSelectedDate", js.undefined)
    
    @scala.inline
    def setUseTouchEvents(value: Boolean): Self = this.set("useTouchEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseTouchEvents: Self = this.set("useTouchEvents", js.undefined)
    
    @scala.inline
    def setWeekOffset(value: Double): Self = this.set("weekOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeekOffset: Self = this.set("weekOffset", js.undefined)
  }
}
