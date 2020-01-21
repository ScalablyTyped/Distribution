package typings.ckeditorCkeditor5Utils

import typings.ckeditorCkeditor5Utils.mod.PriorityString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPriority extends js.Object {
  var priority: js.UndefOr[PriorityString | Double] = js.undefined
}

object AnonPriority {
  @scala.inline
  def apply(priority: PriorityString | Double = null): AnonPriority = {
    val __obj = js.Dynamic.literal()
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPriority]
  }
}

