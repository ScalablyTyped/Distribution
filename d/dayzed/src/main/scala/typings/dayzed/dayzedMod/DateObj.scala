package typings.dayzed.dayzedMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateObj extends js.Object {
  var date: Date
  var nextMonth: Boolean
  var prevMonth: Boolean
  var selectable: Boolean
  var selected: Boolean
  var today: Boolean
}

object DateObj {
  @scala.inline
  def apply(
    date: Date,
    nextMonth: Boolean,
    prevMonth: Boolean,
    selectable: Boolean,
    selected: Boolean,
    today: Boolean
  ): DateObj = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], nextMonth = nextMonth.asInstanceOf[js.Any], prevMonth = prevMonth.asInstanceOf[js.Any], selectable = selectable.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], today = today.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DateObj]
  }
}

