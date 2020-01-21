package typings.bullArena.mod.BullArena

import typings.bullArena.bullArenaStrings.bee
import typings.bullArena.bullArenaStrings.bq
import typings.bullArena.bullArenaStrings.bull
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueOptions extends js.Object {
  var hostId: js.UndefOr[String] = js.undefined
  var name: String
  var prefix: js.UndefOr[bull | bq | String] = js.undefined
  var `type`: js.UndefOr[bull | bee] = js.undefined
}

object QueueOptions {
  @scala.inline
  def apply(name: String, hostId: String = null, prefix: bull | bq | String = null, `type`: bull | bee = null): QueueOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (hostId != null) __obj.updateDynamic("hostId")(hostId.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueOptions]
  }
}

