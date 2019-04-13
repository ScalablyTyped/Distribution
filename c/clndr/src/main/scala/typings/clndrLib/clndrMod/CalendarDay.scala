package typings
package clndrLib.clndrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarDay extends js.Object {
  var classes: java.lang.String
  var date: momentLib.momentMod.Moment
  var day: scala.Double
  var events: js.Array[_]
  var properties: CalendarDayProperties
}

object CalendarDay {
  @scala.inline
  def apply(
    classes: java.lang.String,
    date: momentLib.momentMod.Moment,
    day: scala.Double,
    events: js.Array[_],
    properties: CalendarDayProperties
  ): CalendarDay = {
    val __obj = js.Dynamic.literal(classes = classes, date = date, day = day, events = events, properties = properties)
  
    __obj.asInstanceOf[CalendarDay]
  }
}

