package typings.dayzed

import typings.dayzed.mod.DateObj
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDateObj extends js.Object {
  var dateObj: DateObj
}

object AnonDateObj {
  @scala.inline
  def apply(dateObj: DateObj): AnonDateObj = {
    val __obj = js.Dynamic.literal(dateObj = dateObj.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDateObj]
  }
}

