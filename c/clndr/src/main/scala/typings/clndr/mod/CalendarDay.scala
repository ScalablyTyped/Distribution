package typings.clndr.mod

import typings.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalendarDay extends js.Object {
  
  var classes: String = js.native
  
  var date: Moment = js.native
  
  var day: Double = js.native
  
  var events: js.Array[_] = js.native
  
  var properties: CalendarDayProperties = js.native
}
object CalendarDay {
  
  @scala.inline
  def apply(classes: String, date: Moment, day: Double, events: js.Array[_], properties: CalendarDayProperties): CalendarDay = {
    val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], day = day.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarDay]
  }
  
  @scala.inline
  implicit class CalendarDayOps[Self <: CalendarDay] (val x: Self) extends AnyVal {
    
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
    def setClasses(value: String): Self = this.set("classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: Moment): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDay(value: Double): Self = this.set("day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsVarargs(value: js.Any*): Self = this.set("events", js.Array(value :_*))
    
    @scala.inline
    def setEvents(value: js.Array[_]): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: CalendarDayProperties): Self = this.set("properties", value.asInstanceOf[js.Any])
  }
}
