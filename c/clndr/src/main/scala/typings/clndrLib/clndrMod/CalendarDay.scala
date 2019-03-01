package typings
package clndrLib.clndrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarDay extends js.Object {
  var classes: java.lang.String
  var date: momentLib.momentMod.momentNs.Moment
  var day: scala.Double
  var events: js.Array[_]
  var properties: CalendarDayProperties
}

object CalendarDay {
  @scala.inline
  def apply(
    classes: java.lang.String,
    date: momentLib.momentMod.momentNs.Moment,
    day: scala.Double,
    events: js.Array[_],
    properties: CalendarDayProperties
  ): CalendarDay = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("classes")(classes)
    __obj.updateDynamic("date")(date)
    __obj.updateDynamic("day")(day)
    __obj.updateDynamic("events")(events)
    __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[CalendarDay]
  }
}

