package typings.dateFns.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateTime extends js.Object {
  
  def date(args: js.Any*): js.Any = js.native
  
  def dateTime(args: js.Any*): js.Any = js.native
  
  def time(args: js.Any*): js.Any = js.native
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
  implicit class DateTimeOps[Self <: DateTime] (val x: Self) extends AnyVal {
    
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
    def setDate(value: /* repeated */ js.Any => js.Any): Self = this.set("date", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDateTime(value: /* repeated */ js.Any => js.Any): Self = this.set("dateTime", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTime(value: /* repeated */ js.Any => js.Any): Self = this.set("time", js.Any.fromFunction1(value))
  }
}
