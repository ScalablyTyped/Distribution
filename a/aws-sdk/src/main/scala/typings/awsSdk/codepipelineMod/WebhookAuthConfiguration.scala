package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebhookAuthConfiguration extends StObject {
  
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
  implicit class WebhookAuthConfigurationMutableBuilder[Self <: WebhookAuthConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedIPRange(value: WebhookAuthConfigurationAllowedIPRange): Self = StObject.set(x, "AllowedIPRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedIPRangeUndefined: Self = StObject.set(x, "AllowedIPRange", js.undefined)
    
    @scala.inline
    def setSecretToken(value: WebhookAuthConfigurationSecretToken): Self = StObject.set(x, "SecretToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretTokenUndefined: Self = StObject.set(x, "SecretToken", js.undefined)
  }
}
