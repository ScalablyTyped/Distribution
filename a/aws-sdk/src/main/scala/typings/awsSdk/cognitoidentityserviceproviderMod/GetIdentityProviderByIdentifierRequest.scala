package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetIdentityProviderByIdentifierRequest extends StObject {
  
  /**
    * The identity provider ID.
    */
  var IdpIdentifier: IdpIdentifierType = js.native
  
  /**
    * The user pool ID.
    */
  var UserPoolId: UserPoolIdType = js.native
}
object GetIdentityProviderByIdentifierRequest {
  
  @scala.inline
  def apply(IdpIdentifier: IdpIdentifierType, UserPoolId: UserPoolIdType): GetIdentityProviderByIdentifierRequest = {
    val __obj = js.Dynamic.literal(IdpIdentifier = IdpIdentifier.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIdentityProviderByIdentifierRequest]
  }
  
  @scala.inline
  implicit class GetIdentityProviderByIdentifierRequestMutableBuilder[Self <: GetIdentityProviderByIdentifierRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdpIdentifier(value: IdpIdentifierType): Self = StObject.set(x, "IdpIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
  }
}
