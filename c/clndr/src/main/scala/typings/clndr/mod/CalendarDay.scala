package typings.clndr.mod

import typings.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarDay extends js.Object {
  var classes: String
  var date: Moment
  var day: Double
  var events: js.Array[_]
  var properties: CalendarDayProperties
}

object CalendarDay {
  @scala.inline
  def apply(classes: String, date: Moment, day: Double, events: js.Array[_], properties: CalendarDayProperties): CalendarDay = {
    val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], day = day.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CalendarDay]
  }
}

