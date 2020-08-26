package typings.connectMongo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultOptions extends js.Object {
  /**
    * (Default: false)
    */
  var autoReconnect: js.UndefOr[Boolean] = js.native
  /**
    * Automatically remove expired sessions.
    * (Default: 'native')
    */
  var autoRemove: js.UndefOr[String] = js.native
  /**
    * (Default: 10)
    */
  var autoRemoveInterval: js.UndefOr[Double] = js.native
  /**
    * The colletion of the database you are connecting to.
    * (Default: sessions)
    */
  var collection: js.UndefOr[String] = js.native
  /**
    * Default: false
    */
  var hash: js.UndefOr[Boolean] = js.native
  /**
    * The hostname of the database you are connecting to.
    * (Default: '127.0.0.1')
    */
  var host: js.UndefOr[String] = js.native
  /**
    * The port number to connect to.
    * (Default: 27017)
    */
  var port: js.UndefOr[String] = js.native
  /**
    * Enables transparent crypto in accordance with OWASP session management recommendations.
    */
  var secret: js.UndefOr[String] = js.native
  /**
    * (Default: true)
    */
  var ssl: js.UndefOr[Boolean] = js.native
  /**
    * Serialize sessions using JSON.stringify and deserialize them with JSON.parse.
    * (Default: true)
    */
  var stringify: js.UndefOr[Boolean] = js.native
  /**
    * don't save session if unmodified
    */
  var touchAfter: js.UndefOr[Double] = js.native
  /**
    * Default: 14 days (60 * 60 * 24 * 14)
    */
  var ttl: js.UndefOr[Double] = js.native
  /**
    * (Default: 1)
    */
  var w: js.UndefOr[Double] = js.native
}

object DefaultOptions {
  @scala.inline
  def apply(): DefaultOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultOptions]
  }
  @scala.inline
  implicit class DefaultOptionsOps[Self <: DefaultOptions] (val x: Self) extends AnyVal {
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
    def setAutoReconnect(value: Boolean): Self = this.set("autoReconnect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoReconnect: Self = this.set("autoReconnect", js.undefined)
    @scala.inline
    def setAutoRemove(value: String): Self = this.set("autoRemove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoRemove: Self = this.set("autoRemove", js.undefined)
    @scala.inline
    def setAutoRemoveInterval(value: Double): Self = this.set("autoRemoveInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoRemoveInterval: Self = this.set("autoRemoveInterval", js.undefined)
    @scala.inline
    def setCollection(value: String): Self = this.set("collection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollection: Self = this.set("collection", js.undefined)
    @scala.inline
    def setHash(value: Boolean): Self = this.set("hash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHash: Self = this.set("hash", js.undefined)
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setPort(value: String): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setSecret(value: String): Self = this.set("secret", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecret: Self = this.set("secret", js.undefined)
    @scala.inline
    def setSsl(value: Boolean): Self = this.set("ssl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSsl: Self = this.set("ssl", js.undefined)
    @scala.inline
    def setStringify(value: Boolean): Self = this.set("stringify", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStringify: Self = this.set("stringify", js.undefined)
    @scala.inline
    def setTouchAfter(value: Double): Self = this.set("touchAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouchAfter: Self = this.set("touchAfter", js.undefined)
    @scala.inline
    def setTtl(value: Double): Self = this.set("ttl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTtl: Self = this.set("ttl", js.undefined)
    @scala.inline
    def setW(value: Double): Self = this.set("w", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteW: Self = this.set("w", js.undefined)
  }
  
}

