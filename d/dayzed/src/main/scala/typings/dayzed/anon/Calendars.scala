package typings.dayzed.anon

import typings.dayzed.mod.Calendar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Calendars extends js.Object {
  var calendars: js.Array[Calendar]
  var offset: js.UndefOr[Double] = js.undefined
}

object Calendars {
  @scala.inline
  def apply(calendars: js.Array[Calendar], offset: js.UndefOr[Double] = js.undefined): Calendars = {
    val __obj = js.Dynamic.literal(calendars = calendars.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Calendars]
  }
}

