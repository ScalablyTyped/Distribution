package typings.clndr.mod

import typings.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClickEvents extends js.Object {
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
  @scala.inline
  def apply(
    click: /* target */ Target => Unit = null,
    nextInterval: (/* start */ Moment, /* end */ Moment) => Unit = null,
    nextMonth: /* month */ Moment => Unit = null,
    nextYear: /* month */ Moment => Unit = null,
    onIntervalChange: (/* start */ Moment, /* end */ Moment) => Unit = null,
    onMonthChange: /* month */ Moment => Unit = null,
    onYearChange: /* month */ Moment => Unit = null,
    previousInterval: (/* start */ Moment, /* end */ Moment) => Unit = null,
    previousMonth: /* month */ Moment => Unit = null,
    previousYear: /* month */ Moment => Unit = null,
    today: /* month */ Moment => Unit = null
  ): ClickEvents = {
    val __obj = js.Dynamic.literal()
    if (click != null) __obj.updateDynamic("click")(js.Any.fromFunction1(click))
    if (nextInterval != null) __obj.updateDynamic("nextInterval")(js.Any.fromFunction2(nextInterval))
    if (nextMonth != null) __obj.updateDynamic("nextMonth")(js.Any.fromFunction1(nextMonth))
    if (nextYear != null) __obj.updateDynamic("nextYear")(js.Any.fromFunction1(nextYear))
    if (onIntervalChange != null) __obj.updateDynamic("onIntervalChange")(js.Any.fromFunction2(onIntervalChange))
    if (onMonthChange != null) __obj.updateDynamic("onMonthChange")(js.Any.fromFunction1(onMonthChange))
    if (onYearChange != null) __obj.updateDynamic("onYearChange")(js.Any.fromFunction1(onYearChange))
    if (previousInterval != null) __obj.updateDynamic("previousInterval")(js.Any.fromFunction2(previousInterval))
    if (previousMonth != null) __obj.updateDynamic("previousMonth")(js.Any.fromFunction1(previousMonth))
    if (previousYear != null) __obj.updateDynamic("previousYear")(js.Any.fromFunction1(previousYear))
    if (today != null) __obj.updateDynamic("today")(js.Any.fromFunction1(today))
    __obj.asInstanceOf[ClickEvents]
  }
}

