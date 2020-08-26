package typings.coinbase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientConstructOpts extends js.Object {
  /**
    * OAuth2 access token
    */
  var accessToken: js.UndefOr[String] = js.native
  /**
    * API key (obtain this from the coinbase website)
    */
  var apiKey: js.UndefOr[String] = js.native
  /**
    * API key secret (obtain this from the coinbase website)
    */
  var apiSecret: js.UndefOr[String] = js.native
  /**
    * API version in 'yyyy-mm-dd' format, see https://developers.coinbase.com/api/v2#changelog
    */
  var version: js.UndefOr[String] = js.native
}

object ClientConstructOpts {
  @scala.inline
  def apply(): ClientConstructOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientConstructOpts]
  }
  @scala.inline
  implicit class ClientConstructOptsOps[Self <: ClientConstructOpts] (val x: Self) extends AnyVal {
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
    def setAccessToken(value: String): Self = this.set("accessToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessToken: Self = this.set("accessToken", js.undefined)
    @scala.inline
    def setApiKey(value: String): Self = this.set("apiKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiKey: Self = this.set("apiKey", js.undefined)
    @scala.inline
    def setApiSecret(value: String): Self = this.set("apiSecret", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiSecret: Self = this.set("apiSecret", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

