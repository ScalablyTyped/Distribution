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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("date")(date)
    __obj.updateDynamic("nextMonth")(nextMonth)
    __obj.updateDynamic("prevMonth")(prevMonth)
    __obj.updateDynamic("selectable")(selectable)
    __obj.updateDynamic("selected")(selected)
    __obj.updateDynamic("today")(today)
    __obj.asInstanceOf[DateObj]
  }
}

