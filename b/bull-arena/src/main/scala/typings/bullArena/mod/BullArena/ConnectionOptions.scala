package typings.bullArena.mod.BullArena

import typings.redis.mod.ClientOpts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.bullArena.mod.BullArena.PortHostConnectionOptions
  - typings.bullArena.mod.BullArena.RedisUrlConnectionOptions
  - typings.bullArena.mod.BullArena.RedisClientConnectionOptions
*/
trait ConnectionOptions extends js.Object

object ConnectionOptions {
  @scala.inline
  def PortHostConnectionOptions(host: String): ConnectionOptions = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionOptions]
  }
  @scala.inline
  def RedisUrlConnectionOptions(url: String): ConnectionOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionOptions]
  }
  @scala.inline
  def RedisClientConnectionOptions(redis: ClientOpts): ConnectionOptions = {
    val __obj = js.Dynamic.literal(redis = redis.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionOptions]
  }
}

