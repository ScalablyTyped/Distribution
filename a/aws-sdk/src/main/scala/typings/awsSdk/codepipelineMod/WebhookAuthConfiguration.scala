package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebhookAuthConfiguration extends js.Object {
  /**
    * The property used to configure acceptance of webhooks in an IP address range. For IP, only the AllowedIPRange property must be set. This property must be set to a valid CIDR range.
    */
  var AllowedIPRange: js.UndefOr[WebhookAuthConfigurationAllowedIPRange] = js.native
  /**
    * The property used to configure GitHub authentication. For GITHUB_HMAC, only the SecretToken property must be set.
    */
  var SecretToken: js.UndefOr[WebhookAuthConfigurationSecretToken] = js.native
}

object WebhookAuthConfiguration {
  @scala.inline
  def apply(): WebhookAuthConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebhookAuthConfiguration]
  }
  @scala.inline
  implicit class WebhookAuthConfigurationOps[Self <: WebhookAuthConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllowedIPRange(value: WebhookAuthConfigurationAllowedIPRange): Self = this.set("AllowedIPRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowedIPRange: Self = this.set("AllowedIPRange", js.undefined)
    @scala.inline
    def setSecretToken(value: WebhookAuthConfigurationSecretToken): Self = this.set("SecretToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecretToken: Self = this.set("SecretToken", js.undefined)
  }
  
}

