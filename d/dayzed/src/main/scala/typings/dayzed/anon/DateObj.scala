package typings.dayzed.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateObj extends js.Object {
  var dateObj: typings.dayzed.mod.DateObj
}

object DateObj {
  @scala.inline
  def apply(dateObj: typings.dayzed.mod.DateObj): DateObj = {
    val __obj = js.Dynamic.literal(dateObj = dateObj.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateObj]
  }
}

