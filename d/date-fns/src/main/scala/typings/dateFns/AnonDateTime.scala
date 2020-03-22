package typings.dateFns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDateTime extends js.Object {
  def date(args: js.Any*): js.Any
  def dateTime(args: js.Any*): js.Any
  def time(args: js.Any*): js.Any
}

object AnonDateTime {
  @scala.inline
  def apply(
    date: /* repeated */ js.Any => js.Any,
    dateTime: /* repeated */ js.Any => js.Any,
    time: /* repeated */ js.Any => js.Any
  ): AnonDateTime = {
    val __obj = js.Dynamic.literal(date = js.Any.fromFunction1(date), dateTime = js.Any.fromFunction1(dateTime), time = js.Any.fromFunction1(time))
  
    __obj.asInstanceOf[AnonDateTime]
  }
}

