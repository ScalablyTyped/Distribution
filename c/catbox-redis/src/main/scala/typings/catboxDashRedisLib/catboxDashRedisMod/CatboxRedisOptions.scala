package typings
package catboxDashRedisLib.catboxDashRedisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CatboxRedisOptions
  extends catboxLib.catboxMod.ClientOptions {
  /**
    * Raw client.
    */
  var client: js.UndefOr[ioredisLib.ioredisMod.Redis] = js.undefined
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

object CatboxRedisOptions {
  @scala.inline
  def apply(
    partition: java.lang.String,
    client: ioredisLib.ioredisMod.Redis = null,
    database: java.lang.String = null,
    host: java.lang.String = null,
    password: java.lang.String = null,
    port: scala.Int | scala.Double = null,
    sentinelName: java.lang.String = null,
    sentinels: js.Array[catboxDashRedisLib.Anon_Host] = null,
    socket: java.lang.String = null,
    url: java.lang.String = null
  ): CatboxRedisOptions = {
    val __obj = js.Dynamic.literal(partition = partition)
    if (client != null) __obj.updateDynamic("client")(client)
    if (database != null) __obj.updateDynamic("database")(database)
    if (host != null) __obj.updateDynamic("host")(host)
    if (password != null) __obj.updateDynamic("password")(password)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (sentinelName != null) __obj.updateDynamic("sentinelName")(sentinelName)
    if (sentinels != null) __obj.updateDynamic("sentinels")(sentinels)
    if (socket != null) __obj.updateDynamic("socket")(socket)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[CatboxRedisOptions]
  }
}

