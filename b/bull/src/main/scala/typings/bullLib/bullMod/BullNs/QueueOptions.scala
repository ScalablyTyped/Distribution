package typings
package bullLib.bullMod.BullNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueOptions extends js.Object {
  /**
    * When specified, the `Queue` will use this function to create new `ioredis` client connections.
    * This is useful if you want to re-use connections.
    */
  var createClient: js.UndefOr[
    js.Function2[
      /* type */ bullLib.bullLibStrings.client | bullLib.bullLibStrings.subscriber | bullLib.bullLibStrings.bclient, 
      /* redisOpts */ js.UndefOr[ioredisLib.ioredisMod.IORedisNs.RedisOptions], 
      ioredisLib.ioredisMod.IORedisNs.Redis
    ]
  ] = js.undefined
  var defaultJobOptions: js.UndefOr[JobOptions] = js.undefined
  var limiter: js.UndefOr[RateLimiter] = js.undefined
  /**
    * Prefix to use for all redis keys
    */
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Options passed directly to the `ioredis` constructor
    */
  var redis: js.UndefOr[ioredisLib.ioredisMod.IORedisNs.RedisOptions] = js.undefined
  var settings: js.UndefOr[AdvancedSettings] = js.undefined
}

object QueueOptions {
  @scala.inline
  def apply(
    createClient: (/* type */ bullLib.bullLibStrings.client | bullLib.bullLibStrings.subscriber | bullLib.bullLibStrings.bclient, /* redisOpts */ js.UndefOr[ioredisLib.ioredisMod.IORedisNs.RedisOptions]) => ioredisLib.ioredisMod.IORedisNs.Redis = null,
    defaultJobOptions: JobOptions = null,
    limiter: RateLimiter = null,
    prefix: java.lang.String = null,
    redis: ioredisLib.ioredisMod.IORedisNs.RedisOptions = null,
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

