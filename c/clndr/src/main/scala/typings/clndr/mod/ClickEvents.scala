package typings.clndr.mod

import typings.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClickEvents extends js.Object {
  /**
    * Fired whenever a calendar box is clicked. Returns a 'target' object
    * containing the DOM element, any events, and the date as a moment.js
    * object.
    */
  var click: js.UndefOr[js.Function1[/* target */ Target, Unit]] = js.native
  /**
    * Fired when a user goes forward a period. Returns moment.js objects
    * for the updated start and end date.
    */
  var nextInterval: js.UndefOr[js.Function2[/* start */ Moment, /* end */ Moment, Unit]] = js.native
  /**
    * Fired when a user goes forward a month. Returns a moment.js object
    * set to the correct month.
    */
  var nextMonth: js.UndefOr[js.Function1[/* month */ Moment, Unit]] = js.native
  /**
    * Fired when the next year button is clicked. Returns a moment.js
    * object set to the correct month and year.
    */
  var nextYear: js.UndefOr[js.Function1[/* month */ Moment, Unit]] = js.native
  /**
    * Fired whenever the time period changes as configured in lengthOfTime.
    * Returns moment.js objects for the updated start and end date.
    */
  var onIntervalChange: js.UndefOr[js.Function2[/* start */ Moment, /* end */ Moment, Unit]] = js.native
  /**
    * Fires any time the month changes as a result of a click action.
    * Returns a moment.js object set to the correct month.
    */
  var onMonthChange: js.UndefOr[js.Function1[/* month */ Moment, Unit]] = js.native
  /**
    * Fires any time the year changes as a result of a click action. If
    * onMonthChange is also set, it is fired BEFORE onYearChange. Returns
    * a moment.js object set to the correct month and year.
    */
  var onYearChange: js.UndefOr[js.Function1[/* month */ Moment, Unit]] = js.native
  /**
    * Fired when a user goes back an interval. Returns moment.js objects for
    * the updated start and end date.
    */
  var previousInterval: js.UndefOr[js.Function2[/* start */ Moment, /* end */ Moment, Unit]] = js.native
  /**
    * Fired when a user goes back a month. Returns a moment.js object set
    * to the correct month.
    *
    */
  var previousMonth: js.UndefOr[js.Function1[/* month */ Moment, Unit]] = js.native
  /**
    * Fired when the previous year button is clicked. Returns a moment.js
    * object set to the correct month and year.
    */
  var previousYear: js.UndefOr[js.Function1[/* month */ Moment, Unit]] = js.native
  /**
    * Fired when a user goes to the current month and year. Returns a
    * moment.js object set to the correct month.
    */
  var today: js.UndefOr[js.Function1[/* month */ Moment, Unit]] = js.native
}

object ClickEvents {
  @scala.inline
  def apply(): ClickEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClickEvents]
  }
  @scala.inline
  implicit class ClickEventsOps[Self <: ClickEvents] (val x: Self) extends AnyVal {
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
    def setClick(value: /* target */ Target => Unit): Self = this.set("click", js.Any.fromFunction1(value))
    @scala.inline
    def deleteClick: Self = this.set("click", js.undefined)
    @scala.inline
    def setNextInterval(value: (/* start */ Moment, /* end */ Moment) => Unit): Self = this.set("nextInterval", js.Any.fromFunction2(value))
    @scala.inline
    def deleteNextInterval: Self = this.set("nextInterval", js.undefined)
    @scala.inline
    def setNextMonth(value: /* month */ Moment => Unit): Self = this.set("nextMonth", js.Any.fromFunction1(value))
    @scala.inline
    def deleteNextMonth: Self = this.set("nextMonth", js.undefined)
    @scala.inline
    def setNextYear(value: /* month */ Moment => Unit): Self = this.set("nextYear", js.Any.fromFunction1(value))
    @scala.inline
    def deleteNextYear: Self = this.set("nextYear", js.undefined)
    @scala.inline
    def setOnIntervalChange(value: (/* start */ Moment, /* end */ Moment) => Unit): Self = this.set("onIntervalChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnIntervalChange: Self = this.set("onIntervalChange", js.undefined)
    @scala.inline
    def setOnMonthChange(value: /* month */ Moment => Unit): Self = this.set("onMonthChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMonthChange: Self = this.set("onMonthChange", js.undefined)
    @scala.inline
    def setOnYearChange(value: /* month */ Moment => Unit): Self = this.set("onYearChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnYearChange: Self = this.set("onYearChange", js.undefined)
    @scala.inline
    def setPreviousInterval(value: (/* start */ Moment, /* end */ Moment) => Unit): Self = this.set("previousInterval", js.Any.fromFunction2(value))
    @scala.inline
    def deletePreviousInterval: Self = this.set("previousInterval", js.undefined)
    @scala.inline
    def setPreviousMonth(value: /* month */ Moment => Unit): Self = this.set("previousMonth", js.Any.fromFunction1(value))
    @scala.inline
    def deletePreviousMonth: Self = this.set("previousMonth", js.undefined)
    @scala.inline
    def setPreviousYear(value: /* month */ Moment => Unit): Self = this.set("previousYear", js.Any.fromFunction1(value))
    @scala.inline
    def deletePreviousYear: Self = this.set("previousYear", js.undefined)
    @scala.inline
    def setToday(value: /* month */ Moment => Unit): Self = this.set("today", js.Any.fromFunction1(value))
    @scala.inline
    def deleteToday: Self = this.set("today", js.undefined)
  }
  
}

