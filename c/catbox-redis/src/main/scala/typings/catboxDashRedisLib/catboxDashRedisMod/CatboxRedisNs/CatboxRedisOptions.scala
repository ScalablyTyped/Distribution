package typings
package catboxDashRedisLib.catboxDashRedisMod.CatboxRedisNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CatboxRedisOptions
  extends catboxLib.catboxMod.ClientOptions {
  /**
           * Raw client.
           */
  var client: js.UndefOr[ioredisLib.ioredisMod.IORedisNs.Redis] = js.undefined
  /**
           * the Redis database.
           */
  var database: js.UndefOr[java.lang.String] = js.undefined
  /**
           * the Redis server hostname.
           * Defaults to '127.0.0.1'.
           */
  var host: js.UndefOr[java.lang.String] = js.undefined
  /**
           * the Redis authentication password when required.
           */
  var password: js.UndefOr[java.lang.String] = js.undefined
  /**
           * the Redis server port or unix domain socket path.
           * Defaults to 6379.
           */
  var port: js.UndefOr[scala.Double] = js.undefined
  /**
           * the name of the sentinel master.
           * (Only needed when sentinels is specified)
           */
  var sentinelName: js.UndefOr[java.lang.String] = js.undefined
  /**
           * an array of redis sentinel addresses to connect to.
           */
  var sentinels: js.UndefOr[js.Array[catboxDashRedisLib.Anon_Host]] = js.undefined
  /**
           * the unix socket string to connect to (if socket is provided, host and port are ignored)
           */
  var socket: js.UndefOr[java.lang.String] = js.undefined
  /**
           * the Redis server URL (if url is provided, host, port, and socket are ignored)
           */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

