package typings.awsSdkClientCognitoIdentityBrowser.typesCognitoIdentityProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CognitoIdentityProvider extends js.Object {
  
  /**
    * <p>The client ID for the Amazon Cognito Identity User Pool.</p>
    */
  var ClientId: js.UndefOr[String] = js.native
  
  /**
    * <p>The provider name for an Amazon Cognito Identity User Pool. For example, <code>cognito-idp.us-east-1.amazonaws.com/us-east-1_123456789</code>.</p>
    */
  var ProviderName: js.UndefOr[String] = js.native
  
  /**
    * <p>TRUE if server-side token validation is enabled for the identity provider’s token.</p>
    */
  var ServerSideTokenCheck: js.UndefOr[Boolean] = js.native
}
object CognitoIdentityProvider {
  
  @scala.inline
  def apply(): CognitoIdentityProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CognitoIdentityProvider]
  }
  
  @scala.inline
  implicit class CognitoIdentityProviderOps[Self <: CognitoIdentityProvider] (val x: Self) extends AnyVal {
    
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
    def setClientId(value: String): Self = this.set("ClientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientId: Self = this.set("ClientId", js.undefined)
    
    @scala.inline
    def setProviderName(value: String): Self = this.set("ProviderName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProviderName: Self = this.set("ProviderName", js.undefined)
    
    @scala.inline
    def setServerSideTokenCheck(value: Boolean): Self = this.set("ServerSideTokenCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerSideTokenCheck: Self = this.set("ServerSideTokenCheck", js.undefined)
  }
}
