package typings
package atCkeditorCkeditor5DashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Priority extends js.Object {
  var priority: js.UndefOr[
    atCkeditorCkeditor5DashUtilsLib.atCkeditorCkeditor5DashUtilsMod.PriorityString | scala.Double
  ] = js.undefined
}

object Anon_Priority {
  @scala.inline
  def apply(
    priority: atCkeditorCkeditor5DashUtilsLib.atCkeditorCkeditor5DashUtilsMod.PriorityString | scala.Double = null
  ): Anon_Priority = {
    val __obj = js.Dynamic.literal()
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Priority]
  }
}

