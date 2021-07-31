package typings.dateFns.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateTime extends StObject {
  
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
  
  @scala.inline
  implicit class DateTimeMutableBuilder[Self <: DateTime] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "date", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDateTime(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "dateTime", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTime(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "time", js.Any.fromFunction1(value))
  }
}
