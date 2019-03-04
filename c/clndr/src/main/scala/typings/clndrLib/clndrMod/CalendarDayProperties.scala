package typings
package clndrLib.clndrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarDayProperties extends js.Object {
  var isAdjacentMonth: scala.Boolean
  var isInactive: scala.Boolean
  var isToday: scala.Boolean
}

object CalendarDayProperties {
  @scala.inline
  def apply(isAdjacentMonth: scala.Boolean, isInactive: scala.Boolean, isToday: scala.Boolean): CalendarDayProperties = {
    val __obj = js.Dynamic.literal(isAdjacentMonth = isAdjacentMonth, isInactive = isInactive, isToday = isToday)
  
    __obj.asInstanceOf[CalendarDayProperties]
  }
}

