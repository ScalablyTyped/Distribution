package typings.dayzed

import typings.dayzed.dayzedMod.Calendar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Calendars extends js.Object {
  var calendars: js.Array[Calendar]
  var offset: js.UndefOr[Double] = js.undefined
}

object Anon_Calendars {
  @scala.inline
  def apply(calendars: js.Array[Calendar], offset: Int | Double = null): Anon_Calendars = {
    val __obj = js.Dynamic.literal(calendars = calendars.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Calendars]
  }
}

