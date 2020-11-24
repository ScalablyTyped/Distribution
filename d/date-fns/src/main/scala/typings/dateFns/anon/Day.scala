package typings.dateFns.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Day extends js.Object {
  
  def day(args: js.Any*): js.Any = js.native
  
  def dayPeriod(args: js.Any*): js.Any = js.native
  
  def era(args: js.Any*): js.Any = js.native
  
  def month(args: js.Any*): js.Any = js.native
  
  def ordinalNumber(args: js.Any*): js.Any = js.native
  
  def quarter(args: js.Any*): js.Any = js.native
}
object Day {
  
  @scala.inline
  def apply(
    day: /* repeated */ js.Any => js.Any,
    dayPeriod: /* repeated */ js.Any => js.Any,
    era: /* repeated */ js.Any => js.Any,
    month: /* repeated */ js.Any => js.Any,
    ordinalNumber: /* repeated */ js.Any => js.Any,
    quarter: /* repeated */ js.Any => js.Any
  ): Day = {
    val __obj = js.Dynamic.literal(day = js.Any.fromFunction1(day), dayPeriod = js.Any.fromFunction1(dayPeriod), era = js.Any.fromFunction1(era), month = js.Any.fromFunction1(month), ordinalNumber = js.Any.fromFunction1(ordinalNumber), quarter = js.Any.fromFunction1(quarter))
    __obj.asInstanceOf[Day]
  }
  
  @scala.inline
  implicit class DayOps[Self <: Day] (val x: Self) extends AnyVal {
    
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
    def setDay(value: /* repeated */ js.Any => js.Any): Self = this.set("day", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDayPeriod(value: /* repeated */ js.Any => js.Any): Self = this.set("dayPeriod", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEra(value: /* repeated */ js.Any => js.Any): Self = this.set("era", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMonth(value: /* repeated */ js.Any => js.Any): Self = this.set("month", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOrdinalNumber(value: /* repeated */ js.Any => js.Any): Self = this.set("ordinalNumber", js.Any.fromFunction1(value))
    
    @scala.inline
    def setQuarter(value: /* repeated */ js.Any => js.Any): Self = this.set("quarter", js.Any.fromFunction1(value))
  }
}
