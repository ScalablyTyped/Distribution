package typings
package bullDashArenaLib.bullDashArenaMod.BullArenaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedisClientConnectionOptions extends ConnectionOptions {
  var redis: redisLib.redisMod.ClientOpts
}

object RedisClientConnectionOptions {
  @scala.inline
  def apply(redis: redisLib.redisMod.ClientOpts): RedisClientConnectionOptions = {
    val __obj = js.Dynamic.literal(redis = redis)
  
    __obj.asInstanceOf[RedisClientConnectionOptions]
  }
}

