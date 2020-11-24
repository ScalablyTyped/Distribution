package typings.awsSdkCredentialProviderCognitoIdentity.cognitoProviderParametersMod

import typings.awsSdkClientCognitoIdentity.mod.CognitoIdentityClient
import typings.awsSdkCredentialProviderCognitoIdentity.loginsMod.Logins
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CognitoProviderParameters extends js.Object {
  
  /**
    * The SDK client with which the credential provider will contact the Amazon
    * Cognito service.
    */
  var client: CognitoIdentityClient = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the role to be assumed when multiple
    * roles were received in the token from the identity provider. For example,
    * a SAML-based identity provider. This parameter is optional for identity
    * providers that do not support role customization.
    */
  var customRoleArn: js.UndefOr[String] = js.native
  
  /**
    * A set of key-value pairs that map external identity provider names to
    * login tokens or functions that return promises for login tokens. The
    * latter should be used when login tokens must be periodically refreshed.
    *
    * Logins should not be specified when trying to get credentials for an
    * unauthenticated identity.
    */
  var logins: js.UndefOr[Logins] = js.native
}
object CognitoProviderParameters {
  
  @scala.inline
  def apply(client: CognitoIdentityClient): CognitoProviderParameters = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
    __obj.asInstanceOf[CognitoProviderParameters]
  }
  
  @scala.inline
  implicit class CognitoProviderParametersOps[Self <: CognitoProviderParameters] (val x: Self) extends AnyVal {
    
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
    def setClient(value: CognitoIdentityClient): Self = this.set("client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomRoleArn(value: String): Self = this.set("customRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomRoleArn: Self = this.set("customRoleArn", js.undefined)
    
    @scala.inline
    def setLogins(value: Logins): Self = this.set("logins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogins: Self = this.set("logins", js.undefined)
  }
}
