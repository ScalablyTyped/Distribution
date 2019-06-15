package typings
package bullDashArenaLib.bullDashArenaMod.BullArenaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedisUrlConnectionOptions extends ConnectionOptions {
  var url: java.lang.String
}

object RedisUrlConnectionOptions {
  @scala.inline
  def apply(url: java.lang.String): RedisUrlConnectionOptions = {
    val __obj = js.Dynamic.literal(url = url)
  
    __obj.asInstanceOf[RedisUrlConnectionOptions]
  }
}

