package typings.atCkeditorCkeditor5DashCore

import typings.atCkeditorCkeditor5DashUtils.atCkeditorCkeditor5DashUtilsMod.PriorityString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Priority extends js.Object {
  var priority: js.UndefOr[PriorityString | Double] = js.undefined
}

object Anon_Priority {
  @scala.inline
  def apply(priority: PriorityString | Double = null): Anon_Priority = {
    val __obj = js.Dynamic.literal()
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Priority]
  }
}

