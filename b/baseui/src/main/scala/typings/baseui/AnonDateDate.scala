package typings.baseui

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDateDate extends js.Object {
  var date: Date
}

object AnonDateDate {
  @scala.inline
  def apply(date: Date): AnonDateDate = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDateDate]
  }
}

