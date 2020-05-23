package typings.connectMongo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultOptions extends js.Object {
  /**
    * (Default: false)
    */
  var autoReconnect: js.UndefOr[Boolean] = js.undefined
  /**
    * Automatically remove expired sessions.
    * (Default: 'native')
    */
  var autoRemove: js.UndefOr[String] = js.undefined
  /**
    * (Default: 10)
    */
  var autoRemoveInterval: js.UndefOr[Double] = js.undefined
  /**
    * The colletion of the database you are connecting to.
    * (Default: sessions)
    */
  var collection: js.UndefOr[String] = js.undefined
  /**
    * Default: false
    */
  var hash: js.UndefOr[Boolean] = js.undefined
  /**
    * The hostname of the database you are connecting to.
    * (Default: '127.0.0.1')
    */
  var host: js.UndefOr[String] = js.undefined
  /**
    * The port number to connect to.
    * (Default: 27017)
    */
  var port: js.UndefOr[String] = js.undefined
  /**
    * Enables transparent crypto in accordance with OWASP session management recommendations.
    */
  var secret: js.UndefOr[String] = js.undefined
  /**
    * (Default: true)
    */
  var ssl: js.UndefOr[Boolean] = js.undefined
  /**
    * Serialize sessions using JSON.stringify and deserialize them with JSON.parse.
    * (Default: true)
    */
  var stringify: js.UndefOr[Boolean] = js.undefined
  /**
    * don't save session if unmodified
    */
  var touchAfter: js.UndefOr[Double] = js.undefined
  /**
    * Default: 14 days (60 * 60 * 24 * 14)
    */
  var ttl: js.UndefOr[Double] = js.undefined
  /**
    * (Default: 1)
    */
  var w: js.UndefOr[Double] = js.undefined
}

object DefaultOptions {
  @scala.inline
  def apply(
    autoReconnect: js.UndefOr[Boolean] = js.undefined,
    autoRemove: String = null,
    autoRemoveInterval: js.UndefOr[Double] = js.undefined,
    collection: String = null,
    hash: js.UndefOr[Boolean] = js.undefined,
    host: String = null,
    port: String = null,
    secret: String = null,
    ssl: js.UndefOr[Boolean] = js.undefined,
    stringify: js.UndefOr[Boolean] = js.undefined,
    touchAfter: js.UndefOr[Double] = js.undefined,
    ttl: js.UndefOr[Double] = js.undefined,
    w: js.UndefOr[Double] = js.undefined
  ): DefaultOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoReconnect)) __obj.updateDynamic("autoReconnect")(autoReconnect.get.asInstanceOf[js.Any])
    if (autoRemove != null) __obj.updateDynamic("autoRemove")(autoRemove.asInstanceOf[js.Any])
    if (!js.isUndefined(autoRemoveInterval)) __obj.updateDynamic("autoRemoveInterval")(autoRemoveInterval.get.asInstanceOf[js.Any])
    if (collection != null) __obj.updateDynamic("collection")(collection.asInstanceOf[js.Any])
    if (!js.isUndefined(hash)) __obj.updateDynamic("hash")(hash.get.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (secret != null) __obj.updateDynamic("secret")(secret.asInstanceOf[js.Any])
    if (!js.isUndefined(ssl)) __obj.updateDynamic("ssl")(ssl.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stringify)) __obj.updateDynamic("stringify")(stringify.get.asInstanceOf[js.Any])
    if (!js.isUndefined(touchAfter)) __obj.updateDynamic("touchAfter")(touchAfter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ttl)) __obj.updateDynamic("ttl")(ttl.get.asInstanceOf[js.Any])
    if (!js.isUndefined(w)) __obj.updateDynamic("w")(w.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultOptions]
  }
}

