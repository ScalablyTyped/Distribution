package typings.ckeditorCkeditor5Utils

import typings.ckeditorCkeditor5Utils.mod.PriorityString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPriorityNumber extends js.Object {
  var priority: PriorityString | Double
}

object AnonPriorityNumber {
  @scala.inline
  def apply(priority: PriorityString | Double): AnonPriorityNumber = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPriorityNumber]
  }
}

