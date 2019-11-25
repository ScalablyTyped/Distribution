package typings.bullDashArena.bullDashArenaMod.BullArena

import typings.redis.redisMod.ClientOpts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.bullDashArena.bullDashArenaMod.BullArena.PortHostConnectionOptions
  - typings.bullDashArena.bullDashArenaMod.BullArena.RedisUrlConnectionOptions
  - typings.bullDashArena.bullDashArenaMod.BullArena.RedisClientConnectionOptions
*/
trait ConnectionOptions extends js.Object

object ConnectionOptions {
  @scala.inline
  def PortHostConnectionOptions(host: String, db: String = null, password: String = null, port: Int | Double = null): ConnectionOptions = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any])
    if (db != null) __obj.updateDynamic("db")(db.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
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

