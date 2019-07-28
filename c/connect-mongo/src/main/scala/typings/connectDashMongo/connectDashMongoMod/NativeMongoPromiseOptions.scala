package typings.connectDashMongo.connectDashMongoMod

import typings.mongodb.mongodbMod.Db
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NativeMongoPromiseOptions extends DefaultOptions {
  var dbPromise: js.Promise[Db]
}

object NativeMongoPromiseOptions {
  @scala.inline
  def apply(
    dbPromise: js.Promise[Db],
    autoReconnect: js.UndefOr[Boolean] = js.undefined,
    autoRemove: String = null,
    autoRemoveInterval: Int | Double = null,
    collection: String = null,
    hash: js.UndefOr[Boolean] = js.undefined,
    host: String = null,
    port: String = null,
    ssl: js.UndefOr[Boolean] = js.undefined,
    stringify: js.UndefOr[Boolean] = js.undefined,
    touchAfter: Int | Double = null,
    ttl: Int | Double = null,
    w: Int | Double = null
  ): NativeMongoPromiseOptions = {
    val __obj = js.Dynamic.literal(dbPromise = dbPromise)
    if (!js.isUndefined(autoReconnect)) __obj.updateDynamic("autoReconnect")(autoReconnect)
    if (autoRemove != null) __obj.updateDynamic("autoRemove")(autoRemove)
    if (autoRemoveInterval != null) __obj.updateDynamic("autoRemoveInterval")(autoRemoveInterval.asInstanceOf[js.Any])
    if (collection != null) __obj.updateDynamic("collection")(collection)
    if (!js.isUndefined(hash)) __obj.updateDynamic("hash")(hash)
    if (host != null) __obj.updateDynamic("host")(host)
    if (port != null) __obj.updateDynamic("port")(port)
    if (!js.isUndefined(ssl)) __obj.updateDynamic("ssl")(ssl)
    if (!js.isUndefined(stringify)) __obj.updateDynamic("stringify")(stringify)
    if (touchAfter != null) __obj.updateDynamic("touchAfter")(touchAfter.asInstanceOf[js.Any])
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    if (w != null) __obj.updateDynamic("w")(w.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeMongoPromiseOptions]
  }
}

