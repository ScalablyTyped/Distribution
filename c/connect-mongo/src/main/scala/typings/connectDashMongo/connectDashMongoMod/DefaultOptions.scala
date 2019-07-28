package typings.connectDashMongo.connectDashMongoMod

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
  ): DefaultOptions = {
    val __obj = js.Dynamic.literal()
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
    __obj.asInstanceOf[DefaultOptions]
  }
}

