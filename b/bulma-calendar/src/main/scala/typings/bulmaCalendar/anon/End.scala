package typings.bulmaCalendar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait End extends js.Object {
  var end: js.UndefOr[typings.std.Date] = js.undefined
  var start: js.UndefOr[typings.std.Date] = js.undefined
}

object End {
  @scala.inline
  def apply(end: typings.std.Date = null, start: typings.std.Date = null): End = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[End]
  }
}

