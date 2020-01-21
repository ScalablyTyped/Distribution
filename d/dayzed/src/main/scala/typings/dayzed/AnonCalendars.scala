package typings.dayzed

import typings.dayzed.mod.Calendar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCalendars extends js.Object {
  var calendars: js.Array[Calendar]
  var offset: js.UndefOr[Double] = js.undefined
}

object AnonCalendars {
  @scala.inline
  def apply(calendars: js.Array[Calendar], offset: Int | Double = null): AnonCalendars = {
    val __obj = js.Dynamic.literal(calendars = calendars.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCalendars]
  }
}

