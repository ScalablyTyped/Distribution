package typings
package bullDashArenaLib.bullDashArenaMod.BullArenaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueOptions extends js.Object {
  var hostId: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
  var prefix: js.UndefOr[
    bullDashArenaLib.bullDashArenaLibStrings.bull | bullDashArenaLib.bullDashArenaLibStrings.bq | java.lang.String
  ] = js.undefined
  var `type`: js.UndefOr[
    bullDashArenaLib.bullDashArenaLibStrings.bull | bullDashArenaLib.bullDashArenaLibStrings.bee
  ] = js.undefined
}

object QueueOptions {
  @scala.inline
  def apply(
    name: java.lang.String,
    hostId: java.lang.String = null,
    prefix: bullDashArenaLib.bullDashArenaLibStrings.bull | bullDashArenaLib.bullDashArenaLibStrings.bq | java.lang.String = null,
    `type`: bullDashArenaLib.bullDashArenaLibStrings.bull | bullDashArenaLib.bullDashArenaLibStrings.bee = null
  ): QueueOptions = {
    val __obj = js.Dynamic.literal(name = name)
    if (hostId != null) __obj.updateDynamic("hostId")(hostId)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueOptions]
  }
}

