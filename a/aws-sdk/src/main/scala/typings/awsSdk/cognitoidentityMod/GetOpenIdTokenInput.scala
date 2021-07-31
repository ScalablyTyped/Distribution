package typings.awsSdk.cognitoidentityMod

import typings.awsSdk.cognitoIdentityCredentialsMod.CognitoIdentityCredentials.CognitoIdentityCredentialsInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOpenIdTokenInput
  extends StObject
     with CognitoIdentityCredentialsInputs {
  
  /**
    * A unique identifier in the format REGION:GUID.
    */
  var IdentityId: typings.awsSdk.cognitoidentityMod.IdentityId
  
  /**
    * A set of optional name-value pairs that map provider names to provider tokens. When using graph.facebook.com and www.amazon.com, supply the access_token returned from the provider's authflow. For accounts.google.com, an Amazon Cognito user pool provider, or any other OpenId Connect provider, always include the id_token.
    */
  var Logins: js.UndefOr[LoginsMap] = js.undefined
}
object GetOpenIdTokenInput {
  
  @scala.inline
  def apply(IdentityId: IdentityId): GetOpenIdTokenInput = {
    val __obj = js.Dynamic.literal(IdentityId = IdentityId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOpenIdTokenInput]
  }
  
  @scala.inline
  implicit class GetOpenIdTokenInputMutableBuilder[Self <: GetOpenIdTokenInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentityId(value: IdentityId): Self = StObject.set(x, "IdentityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogins(value: LoginsMap): Self = StObject.set(x, "Logins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoginsUndefined: Self = StObject.set(x, "Logins", js.undefined)
  }
}
