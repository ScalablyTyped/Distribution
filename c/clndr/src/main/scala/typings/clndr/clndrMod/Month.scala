package typings.clndr.clndrMod

import typings.moment.momentMod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Month extends js.Object {
  var days: js.Array[CalendarDay]
  var month: Moment
}

object Month {
  @scala.inline
  def apply(days: js.Array[CalendarDay], month: Moment): Month = {
    val __obj = js.Dynamic.literal(days = days, month = month)
  
    __obj.asInstanceOf[Month]
  }
}

