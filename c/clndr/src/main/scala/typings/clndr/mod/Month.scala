package typings.clndr.mod

import typings.moment.mod.Moment
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
    val __obj = js.Dynamic.literal(days = days.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any])
    __obj.asInstanceOf[Month]
  }
}

