package typings.braintreeWeb.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientAnalyticsMetadata extends js.Object {
  var merchantAppId: String = js.native
  var sdkVersion: String = js.native
  var sessionId: String = js.native
}

object ClientAnalyticsMetadata {
  @scala.inline
  def apply(merchantAppId: String, sdkVersion: String, sessionId: String): ClientAnalyticsMetadata = {
    val __obj = js.Dynamic.literal(merchantAppId = merchantAppId.asInstanceOf[js.Any], sdkVersion = sdkVersion.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientAnalyticsMetadata]
  }
  @scala.inline
  implicit class ClientAnalyticsMetadataOps[Self <: ClientAnalyticsMetadata] (val x: Self) extends AnyVal {
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
    def setMerchantAppId(value: String): Self = this.set("merchantAppId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSdkVersion(value: String): Self = this.set("sdkVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setSessionId(value: String): Self = this.set("sessionId", value.asInstanceOf[js.Any])
  }
  
}

