package typings.baseui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Date extends js.Object {
  var date: typings.std.Date | js.Array[typings.std.Date]
}

object Date {
  @scala.inline
  def apply(date: typings.std.Date | js.Array[typings.std.Date]): Date = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    __obj.asInstanceOf[Date]
  }
}

