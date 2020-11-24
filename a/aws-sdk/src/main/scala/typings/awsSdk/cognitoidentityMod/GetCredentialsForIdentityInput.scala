package typings.awsSdk.cognitoidentityMod

import typings.awsSdk.cognitoIdentityCredentialsMod.CognitoIdentityCredentials.CognitoIdentityCredentialsInputs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCredentialsForIdentityInput extends CognitoIdentityCredentialsInputs {
  
  /**
    * The Amazon Resource Name (ARN) of the role to be assumed when multiple roles were received in the token from the identity provider. For example, a SAML-based identity provider. This parameter is optional for identity providers that do not support role customization.
    */
  var CustomRoleArn: js.UndefOr[ARNString] = js.native
  
  /**
    * A unique identifier in the format REGION:GUID.
    */
  var IdentityId: typings.awsSdk.cognitoidentityMod.IdentityId = js.native
  
  /**
    * A set of optional name-value pairs that map provider names to provider tokens. The name-value pair will follow the syntax "provider_name": "provider_user_identifier". Logins should not be specified when trying to get credentials for an unauthenticated identity. The Logins parameter is required when using identities associated with external identity providers such as FaceBook. For examples of Logins maps, see the code examples in the External Identity Providers section of the Amazon Cognito Developer Guide.
    */
  var Logins: js.UndefOr[LoginsMap] = js.native
}
object GetCredentialsForIdentityInput {
  
  @scala.inline
  def apply(IdentityId: IdentityId): GetCredentialsForIdentityInput = {
    val __obj = js.Dynamic.literal(IdentityId = IdentityId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCredentialsForIdentityInput]
  }
  
  @scala.inline
  implicit class GetCredentialsForIdentityInputOps[Self <: GetCredentialsForIdentityInput] (val x: Self) extends AnyVal {
    
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
    def setIdentityId(value: IdentityId): Self = this.set("IdentityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomRoleArn(value: ARNString): Self = this.set("CustomRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomRoleArn: Self = this.set("CustomRoleArn", js.undefined)
    
    @scala.inline
    def setLogins(value: LoginsMap): Self = this.set("Logins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogins: Self = this.set("Logins", js.undefined)
  }
}
