package typings.connectRedis.mod

import org.scalablytyped.runtime.Instantiable1
import typings.expressSession.mod.Store
import typings.ioredis.mod.Redis
import typings.redis.mod.RedisClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RedisStore
  extends Store
     with Instantiable1[/* options */ RedisStoreOptions, RedisStore] {
  
  var client: RedisClient | Redis = js.native
}
