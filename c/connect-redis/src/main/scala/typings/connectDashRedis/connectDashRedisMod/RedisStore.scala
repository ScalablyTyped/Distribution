package typings.connectDashRedis.connectDashRedisMod

import org.scalablytyped.runtime.Instantiable1
import typings.expressDashSession.expressDashSessionMod.Store
import typings.redis.redisMod.RedisClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RedisStore
  extends Store
     with Instantiable1[/* options */ RedisStoreOptions, RedisStore] {
  var client: RedisClient = js.native
}

