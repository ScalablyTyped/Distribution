package typings.bull.mod

import typings.bull.bullStrings.bclient
import typings.bull.bullStrings.client
import typings.bull.bullStrings.subscriber
import typings.ioredis.mod.Cluster
import typings.ioredis.mod.Redis
import typings.ioredis.mod.RedisOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueueOptions extends js.Object {
  
  /**
    * When specified, the `Queue` will use this function to create new `ioredis` client connections.
    * This is useful if you want to re-use connections or connect to a Redis cluster.
    */
  var createClient: js.UndefOr[
    js.Function2[
      /* type */ client | subscriber | bclient, 
      /* redisOpts */ js.UndefOr[RedisOptions], 
      Redis | Cluster
    ]
  ] = js.native
  
  var defaultJobOptions: js.UndefOr[JobOptions] = js.native
  
  var limiter: js.UndefOr[RateLimiter] = js.native
  
  /**
    * Prefix to use for all redis keys
    */
  var prefix: js.UndefOr[String] = js.native
  
  /**
    * Options passed directly to the `ioredis` constructor
    */
  var redis: js.UndefOr[RedisOptions | String] = js.native
  
  var settings: js.UndefOr[AdvancedSettings] = js.native
}
object QueueOptions {
  
  @scala.inline
  def apply(): QueueOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueueOptions]
  }
  
  @scala.inline
  implicit class QueueOptionsOps[Self <: QueueOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreateClient(
      value: (/* type */ client | subscriber | bclient, /* redisOpts */ js.UndefOr[RedisOptions]) => Redis | Cluster
    ): Self = this.set("createClient", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCreateClient: Self = this.set("createClient", js.undefined)
    
    @scala.inline
    def setDefaultJobOptions(value: JobOptions): Self = this.set("defaultJobOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultJobOptions: Self = this.set("defaultJobOptions", js.undefined)
    
    @scala.inline
    def setLimiter(value: RateLimiter): Self = this.set("limiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimiter: Self = this.set("limiter", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    
    @scala.inline
    def setRedis(value: RedisOptions | String): Self = this.set("redis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedis: Self = this.set("redis", js.undefined)
    
    @scala.inline
    def setSettings(value: AdvancedSettings): Self = this.set("settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSettings: Self = this.set("settings", js.undefined)
  }
}
