package typings.connectMongo.mod

import typings.mongoose.mod.ConnectionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MongoUrlOptions extends DefaultOptions {
  var mongoOptions: js.UndefOr[ConnectionOptions] = js.undefined
  var url: String
}

object MongoUrlOptions {
  @scala.inline
  def apply(
    url: String,
    autoReconnect: js.UndefOr[Boolean] = js.undefined,
    autoRemove: String = null,
    autoRemoveInterval: js.UndefOr[Double] = js.undefined,
    collection: String = null,
    hash: js.UndefOr[Boolean] = js.undefined,
    host: String = null,
    mongoOptions: ConnectionOptions = null,
    port: String = null,
    secret: String = null,
    ssl: js.UndefOr[Boolean] = js.undefined,
    stringify: js.UndefOr[Boolean] = js.undefined,
    touchAfter: js.UndefOr[Double] = js.undefined,
    ttl: js.UndefOr[Double] = js.undefined,
    w: js.UndefOr[Double] = js.undefined
  ): MongoUrlOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (!js.isUndefined(autoReconnect)) __obj.updateDynamic("autoReconnect")(autoReconnect.get.asInstanceOf[js.Any])
    if (autoRemove != null) __obj.updateDynamic("autoRemove")(autoRemove.asInstanceOf[js.Any])
    if (!js.isUndefined(autoRemoveInterval)) __obj.updateDynamic("autoRemoveInterval")(autoRemoveInterval.get.asInstanceOf[js.Any])
    if (collection != null) __obj.updateDynamic("collection")(collection.asInstanceOf[js.Any])
    if (!js.isUndefined(hash)) __obj.updateDynamic("hash")(hash.get.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (mongoOptions != null) __obj.updateDynamic("mongoOptions")(mongoOptions.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (secret != null) __obj.updateDynamic("secret")(secret.asInstanceOf[js.Any])
    if (!js.isUndefined(ssl)) __obj.updateDynamic("ssl")(ssl.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stringify)) __obj.updateDynamic("stringify")(stringify.get.asInstanceOf[js.Any])
    if (!js.isUndefined(touchAfter)) __obj.updateDynamic("touchAfter")(touchAfter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ttl)) __obj.updateDynamic("ttl")(ttl.get.asInstanceOf[js.Any])
    if (!js.isUndefined(w)) __obj.updateDynamic("w")(w.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MongoUrlOptions]
  }
}

