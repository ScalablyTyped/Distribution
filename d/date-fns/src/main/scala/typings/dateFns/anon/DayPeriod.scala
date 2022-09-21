package typings.dateFns.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DayPeriod extends StObject {
  
  def day(args: Any*): Any
  
  def dayPeriod(args: Any*): Any
  
  def era(args: Any*): Any
  
  def month(args: Any*): Any
  
  def ordinalNumber(args: Any*): Any
  
  def quarter(args: Any*): Any
}
object DayPeriod {
  
  inline def apply(
    day: /* repeated */ Any => Any,
    dayPeriod: /* repeated */ Any => Any,
    era: /* repeated */ Any => Any,
    month: /* repeated */ Any => Any,
    ordinalNumber: /* repeated */ Any => Any,
    quarter: /* repeated */ Any => Any
  ): DayPeriod = {
    val __obj = js.Dynamic.literal(day = js.Any.fromFunction1(day), dayPeriod = js.Any.fromFunction1(dayPeriod), era = js.Any.fromFunction1(era), month = js.Any.fromFunction1(month), ordinalNumber = js.Any.fromFunction1(ordinalNumber), quarter = js.Any.fromFunction1(quarter))
    __obj.asInstanceOf[DayPeriod]
  }
  
  extension [Self <: DayPeriod](x: Self) {
    
    inline def setDay(value: /* repeated */ Any => Any): Self = StObject.set(x, "day", js.Any.fromFunction1(value))
    
    inline def setDayPeriod(value: /* repeated */ Any => Any): Self = StObject.set(x, "dayPeriod", js.Any.fromFunction1(value))
    
    inline def setEra(value: /* repeated */ Any => Any): Self = StObject.set(x, "era", js.Any.fromFunction1(value))
    
    inline def setMonth(value: /* repeated */ Any => Any): Self = StObject.set(x, "month", js.Any.fromFunction1(value))
    
    inline def setOrdinalNumber(value: /* repeated */ Any => Any): Self = StObject.set(x, "ordinalNumber", js.Any.fromFunction1(value))
    
    inline def setQuarter(value: /* repeated */ Any => Any): Self = StObject.set(x, "quarter", js.Any.fromFunction1(value))
  }
}
