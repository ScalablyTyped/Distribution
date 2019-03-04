package typings
package dayzedLib.dayzedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateObj extends js.Object {
  var date: stdLib.Date
  var nextMonth: scala.Boolean
  var prevMonth: scala.Boolean
  var selectable: scala.Boolean
  var selected: scala.Boolean
  var today: scala.Boolean
}

object DateObj {
  @scala.inline
  def apply(
    date: stdLib.Date,
    nextMonth: scala.Boolean,
    prevMonth: scala.Boolean,
    selectable: scala.Boolean,
    selected: scala.Boolean,
    today: scala.Boolean
  ): DateObj = {
    val __obj = js.Dynamic.literal(date = date, nextMonth = nextMonth, prevMonth = prevMonth, selectable = selectable, selected = selected, today = today)
  
    __obj.asInstanceOf[DateObj]
  }
}

