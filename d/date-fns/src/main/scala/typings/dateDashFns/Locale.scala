package typings.dateDashFns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Locale extends js.Object {
  var formatLong: js.Object
  var localize: Anon_Args
  var `match`: Anon_Args
  var options: js.UndefOr[Anon_0] = js.undefined
  def date(args: js.Any*): js.Any
  def dateTime(args: js.Any*): js.Any
  def formatDistance(args: js.Any*): js.Any
  def formatRelative(args: js.Any*): js.Any
  def time(args: js.Any*): js.Any
}

object Locale {
  @scala.inline
  def apply(
    date: /* repeated */ js.Any => js.Any,
    dateTime: /* repeated */ js.Any => js.Any,
    formatDistance: /* repeated */ js.Any => js.Any,
    formatLong: js.Object,
    formatRelative: /* repeated */ js.Any => js.Any,
    localize: Anon_Args,
    `match`: Anon_Args,
    time: /* repeated */ js.Any => js.Any,
    options: Anon_0 = null
  ): Locale = {
    val __obj = js.Dynamic.literal(date = js.Any.fromFunction1(date), dateTime = js.Any.fromFunction1(dateTime), formatDistance = js.Any.fromFunction1(formatDistance), formatLong = formatLong.asInstanceOf[js.Any], formatRelative = js.Any.fromFunction1(formatRelative), localize = localize.asInstanceOf[js.Any], time = js.Any.fromFunction1(time))
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locale]
  }
}

