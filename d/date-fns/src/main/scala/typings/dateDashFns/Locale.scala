package typings.dateDashFns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Locale extends js.Object {
  var date: js.Function
  var dateTime: js.Function
  var formatDistance: js.Function
  var formatLong: js.Object
  var formatRelative: js.Function
  var localize: Anon_Day
  var `match`: Anon_Day
  var options: js.UndefOr[Anon_0] = js.undefined
  var time: js.Function
}

object Locale {
  @scala.inline
  def apply(
    date: js.Function,
    dateTime: js.Function,
    formatDistance: js.Function,
    formatLong: js.Object,
    formatRelative: js.Function,
    localize: Anon_Day,
    `match`: Anon_Day,
    time: js.Function,
    options: Anon_0 = null
  ): Locale = {
    val __obj = js.Dynamic.literal(date = date, dateTime = dateTime, formatDistance = formatDistance, formatLong = formatLong, formatRelative = formatRelative, localize = localize, time = time)
    __obj.updateDynamic("match")(`match`)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[Locale]
  }
}

