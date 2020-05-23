package typings.ckeditorCkeditor5Core.anon

import typings.ckeditorCkeditor5Utils.mod.PriorityString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Priority extends js.Object {
  var priority: js.UndefOr[PriorityString | Double] = js.undefined
}

object Priority {
  @scala.inline
  def apply(priority: PriorityString | Double = null): Priority = {
    val __obj = js.Dynamic.literal()
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[Priority]
  }
}

