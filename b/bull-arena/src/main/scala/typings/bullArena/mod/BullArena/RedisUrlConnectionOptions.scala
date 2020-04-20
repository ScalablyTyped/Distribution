package typings.bullArena.mod.BullArena

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedisUrlConnectionOptions extends ConnectionOptions {
  var url: String
}

object RedisUrlConnectionOptions {
  @scala.inline
  def apply(url: String): RedisUrlConnectionOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedisUrlConnectionOptions]
  }
}

