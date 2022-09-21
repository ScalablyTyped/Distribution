package typings.dateFns.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateTime extends StObject {
  
  def date(args: Any*): Any
  
  def dateTime(args: Any*): Any
  
  def time(args: Any*): Any
}
object DateTime {
  
  inline def apply(
    date: /* repeated */ Any => Any,
    dateTime: /* repeated */ Any => Any,
    time: /* repeated */ Any => Any
  ): DateTime = {
    val __obj = js.Dynamic.literal(date = js.Any.fromFunction1(date), dateTime = js.Any.fromFunction1(dateTime), time = js.Any.fromFunction1(time))
    __obj.asInstanceOf[DateTime]
  }
  
  extension [Self <: DateTime](x: Self) {
    
    inline def setDate(value: /* repeated */ Any => Any): Self = StObject.set(x, "date", js.Any.fromFunction1(value))
    
    inline def setDateTime(value: /* repeated */ Any => Any): Self = StObject.set(x, "dateTime", js.Any.fromFunction1(value))
    
    inline def setTime(value: /* repeated */ Any => Any): Self = StObject.set(x, "time", js.Any.fromFunction1(value))
  }
}
