package typings.dateFns.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateTime extends js.Object {
  def date(args: js.Any*): js.Any
  def dateTime(args: js.Any*): js.Any
  def time(args: js.Any*): js.Any
}

object DateTime {
  @scala.inline
  def apply(
    date: /* repeated */ js.Any => js.Any,
    dateTime: /* repeated */ js.Any => js.Any,
    time: /* repeated */ js.Any => js.Any
  ): DateTime = {
    val __obj = js.Dynamic.literal(date = js.Any.fromFunction1(date), dateTime = js.Any.fromFunction1(dateTime), time = js.Any.fromFunction1(time))
    __obj.asInstanceOf[DateTime]
  }
}

