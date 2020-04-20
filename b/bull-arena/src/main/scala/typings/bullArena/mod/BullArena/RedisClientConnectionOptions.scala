package typings.bullArena.mod.BullArena

import typings.redis.mod.ClientOpts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedisClientConnectionOptions extends ConnectionOptions {
  var redis: ClientOpts
}

object RedisClientConnectionOptions {
  @scala.inline
  def apply(redis: ClientOpts): RedisClientConnectionOptions = {
    val __obj = js.Dynamic.literal(redis = redis.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedisClientConnectionOptions]
  }
}

