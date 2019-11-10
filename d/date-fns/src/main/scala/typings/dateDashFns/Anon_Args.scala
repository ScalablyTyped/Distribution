package typings.dateDashFns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args extends js.Object {
  def day(args: js.Any*): js.Any
  def dayPeriod(args: js.Any*): js.Any
  def era(args: js.Any*): js.Any
  def month(args: js.Any*): js.Any
  def ordinalNumber(args: js.Any*): js.Any
  def quarter(args: js.Any*): js.Any
}

object Anon_Args {
  @scala.inline
  def apply(
    day: /* repeated */ js.Any => js.Any,
    dayPeriod: /* repeated */ js.Any => js.Any,
    era: /* repeated */ js.Any => js.Any,
    month: /* repeated */ js.Any => js.Any,
    ordinalNumber: /* repeated */ js.Any => js.Any,
    quarter: /* repeated */ js.Any => js.Any
  ): Anon_Args = {
    val __obj = js.Dynamic.literal(day = js.Any.fromFunction1(day), dayPeriod = js.Any.fromFunction1(dayPeriod), era = js.Any.fromFunction1(era), month = js.Any.fromFunction1(month), ordinalNumber = js.Any.fromFunction1(ordinalNumber), quarter = js.Any.fromFunction1(quarter))
  
    __obj.asInstanceOf[Anon_Args]
  }
}

