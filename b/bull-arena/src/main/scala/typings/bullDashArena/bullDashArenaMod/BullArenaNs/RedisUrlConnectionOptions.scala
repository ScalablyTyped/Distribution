package typings.bullDashArena.bullDashArenaMod.BullArenaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedisUrlConnectionOptions extends ConnectionOptions {
  var url: String
}

object RedisUrlConnectionOptions {
  @scala.inline
  def apply(url: String): RedisUrlConnectionOptions = {
    val __obj = js.Dynamic.literal(url = url)
  
    __obj.asInstanceOf[RedisUrlConnectionOptions]
  }
}

