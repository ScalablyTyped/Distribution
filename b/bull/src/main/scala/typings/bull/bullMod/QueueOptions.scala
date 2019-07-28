package typings.bull.bullMod

import typings.bull.bullStrings.bclient
import typings.bull.bullStrings.client
import typings.bull.bullStrings.subscriber
import typings.ioredis.ioredisMod.Cluster
import typings.ioredis.ioredisMod.Redis
import typings.ioredis.ioredisMod.RedisOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  ] = js.undefined
  var defaultJobOptions: js.UndefOr[JobOptions] = js.undefined
  var limiter: js.UndefOr[RateLimiter] = js.undefined
  /**
    * Prefix to use for all redis keys
    */
  var prefix: js.UndefOr[String] = js.undefined
  /**
    * Options passed directly to the `ioredis` constructor
    */
  var redis: js.UndefOr[RedisOptions] = js.undefined
  var settings: js.UndefOr[AdvancedSettings] = js.undefined
}

object QueueOptions {
  @scala.inline
  def apply(
    createClient: (/* type */ client | subscriber | bclient, /* redisOpts */ js.UndefOr[RedisOptions]) => Redis | Cluster = null,
    defaultJobOptions: JobOptions = null,
    limiter: RateLimiter = null,
    prefix: String = null,
    redis: RedisOptions = null,
    settings: AdvancedSettings = null
  ): QueueOptions = {
    val __obj = js.Dynamic.literal()
    if (createClient != null) __obj.updateDynamic("createClient")(js.Any.fromFunction2(createClient))
    if (defaultJobOptions != null) __obj.updateDynamic("defaultJobOptions")(defaultJobOptions)
    if (limiter != null) __obj.updateDynamic("limiter")(limiter)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (redis != null) __obj.updateDynamic("redis")(redis)
    if (settings != null) __obj.updateDynamic("settings")(settings)
    __obj.asInstanceOf[QueueOptions]
  }
}

