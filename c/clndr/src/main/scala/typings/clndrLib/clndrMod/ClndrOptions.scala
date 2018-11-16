package typings
package clndrLib.clndrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ClndrOptions extends js.Object {
  /**
       * when days from adjacent months are clicked, switch the current month.
       * fires nextMonth/previousMonth/onMonthChange click callbacks. defaults to false.
       */
  var adjacentDaysChangeMonth: js.UndefOr[scala.Boolean] = js.undefined
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
  var dateParameter: js.UndefOr[java.lang.String] = js.undefined
  /**
       * An array of day abbreviation labels. If you have moment.js set to a
       * different language, it will guess these for you! If for some reason that
       * doesn't work, use this...
       * WARNING: if you are dealing with i18n and multiple languages, you
       * probably don't want this! See the "Internationalization" section below
       * for more.
       */
  var daysOfTheWeek: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
       * A callback when the calendar is done rendering. This is a good place
       * to bind custom event handlers (also see the 'ready' option above).
       */
  var doneRendering: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** an array of event objects */
  var events: js.UndefOr[js.Array[_]] = js.undefined
  /**
       * Any other data variables you want access to in your template. This gets
       * passed into the template function.
       */
  var extras: js.UndefOr[js.Any] = js.undefined
  /**
       * Always make the calendar six rows tall (42 days) so that every month has
       * a consistent height. defaults to 'false'.
       */
  var forceSixRows: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
  /**
       * Set this to true if you don't want `inactive` dates to be selectable.
       * This will only matter if you are using the `constraints` option.
       */
  var ignoreInactiveDaysInSelection: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
  // CLNDR can render in any time interval!
  // You can specify if you want to render one or more months, or one ore more
  // days in the calendar, as well as the paging interval whenever forward or
  // back is triggered. If both months and days are null, CLNDR will default
  // to the standard monthly view.
  var lengthOfTime: js.UndefOr[LengthOfTime] = js.undefined
  /**
       * Optionally, you can pass a Moment instance to use instead of the global
       */
  var moment: js.UndefOr[momentLib.momentMod.momentNs.Moment | scala.Null] = js.undefined
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
  var ready: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
       * If you want to use a different templating language, here's your ticket.
       * Precompile your template (before you call clndr), pass the data from the
       * render function into your template, and return the result. The result
       * must be a string containing valid markup. The keyword 'this' is set to
       * the clndr instance in case you need access to any other properties.
       * More under 'Template Rendering Engine' below.
       */
  var render: js.UndefOr[js.Function1[/* data */ RenderData, scala.Unit]] = js.undefined
  /**
       * Set this, if you want a date to be "selected" (see classes.selected)
       * after plugin init. Defualts to null, no initially selected date.
       */
  var selectedDate: js.UndefOr[js.Any] = js.undefined
  /**
       * show the numbers of days in months adjacent to the current month (and populate them with their events). defaults to true.
       */
  var showAdjacentMonths: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * determines which month to start with using either a date string or a moment object.
       */
  var startWithMonth: js.UndefOr[java.lang.String | momentLib.momentMod.momentNs.Moment] = js.undefined
  /**
       * the target classnames that CLNDR will look for to bind events. these are the defaults.
       */
  var targets: js.UndefOr[Targets] = js.undefined
  /**
       * the template: this could be stored in markup as a <script type="text/template"></script>
       * or pulled in as a string
       */
  var template: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Set this to true, if you want the plugin to track the last clicked day.
       * If trackSelectedDate is true, "selected" class will always be applied
       * only to the most recently clicked date; otherwise - selectedDate will
       * not change.
       */
  var trackSelectedDate: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Use the 'touchstart' event instead of 'click'
       */
  var useTouchEvents: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Start the week off on Sunday (0), Monday (1), etc. Sunday is the default.
       * WARNING: if you are dealing with i18n and multiple languages, you
       * probably don't want this! See the "Internationalization" section below
       * for more.
       */
  var weekOffset: js.UndefOr[scala.Double] = js.undefined
}

