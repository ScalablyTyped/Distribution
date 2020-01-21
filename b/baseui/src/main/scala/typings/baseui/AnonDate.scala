package typings.baseui

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDate extends js.Object {
  var date: Date | js.Array[Date]
}

object AnonDate {
  @scala.inline
  def apply(date: Date | js.Array[Date]): AnonDate = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDate]
  }
}

