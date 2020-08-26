package typings.awsSdk.cognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CognitoIdentityProvider extends js.Object {
  /**
    * The client ID for the Amazon Cognito user pool.
    */
  var ClientId: js.UndefOr[CognitoIdentityProviderClientId] = js.native
  /**
    * The provider name for an Amazon Cognito user pool. For example, cognito-idp.us-east-1.amazonaws.com/us-east-1_123456789.
    */
  var ProviderName: js.UndefOr[CognitoIdentityProviderName] = js.native
  /**
    * TRUE if server-side token validation is enabled for the identity provider’s token. Once you set ServerSideTokenCheck to TRUE for an identity pool, that identity pool will check with the integrated user pools to make sure that the user has not been globally signed out or deleted before the identity pool provides an OIDC token or AWS credentials for the user. If the user is signed out or deleted, the identity pool will return a 400 Not Authorized error.
    */
  var ServerSideTokenCheck: js.UndefOr[CognitoIdentityProviderTokenCheck] = js.native
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
    def setClientId(value: CognitoIdentityProviderClientId): Self = this.set("ClientId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientId: Self = this.set("ClientId", js.undefined)
    @scala.inline
    def setProviderName(value: CognitoIdentityProviderName): Self = this.set("ProviderName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProviderName: Self = this.set("ProviderName", js.undefined)
    @scala.inline
    def setServerSideTokenCheck(value: CognitoIdentityProviderTokenCheck): Self = this.set("ServerSideTokenCheck", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerSideTokenCheck: Self = this.set("ServerSideTokenCheck", js.undefined)
  }
  
}

