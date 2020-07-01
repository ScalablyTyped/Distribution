package typings.dateTime.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Custom date.
  		@default new Date()
  		*/
  var date: js.UndefOr[Date] = js.undefined
  /**
  		Show the date in the local time zone.
  		@default false
  		*/
  var local: js.UndefOr[Boolean] = js.undefined
  /**
  		Show the milliseconds in the date if any.
  		@default false
  		*/
  var showMilliseconds: js.UndefOr[Boolean] = js.undefined
  /**
  		Show the UTC time zone postfix.
  		@default false
  		*/
  var showTimeZone: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    date: Date = null,
    local: js.UndefOr[Boolean] = js.undefined,
    showMilliseconds: js.UndefOr[Boolean] = js.undefined,
    showTimeZone: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (!js.isUndefined(local)) __obj.updateDynamic("local")(local.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showMilliseconds)) __obj.updateDynamic("showMilliseconds")(showMilliseconds.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showTimeZone)) __obj.updateDynamic("showTimeZone")(showTimeZone.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

