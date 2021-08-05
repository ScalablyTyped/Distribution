package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetIdentityProviderByIdentifierRequest extends StObject {
  
  /**
    * The identity provider ID.
    */
  var IdpIdentifier: IdpIdentifierType
  
  /**
    * The user pool ID.
    */
  var UserPoolId: UserPoolIdType
}
object GetIdentityProviderByIdentifierRequest {
  
  inline def apply(IdpIdentifier: IdpIdentifierType, UserPoolId: UserPoolIdType): GetIdentityProviderByIdentifierRequest = {
    val __obj = js.Dynamic.literal(IdpIdentifier = IdpIdentifier.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIdentityProviderByIdentifierRequest]
  }
  
  extension [Self <: GetIdentityProviderByIdentifierRequest](x: Self) {
    
    inline def setIdpIdentifier(value: IdpIdentifierType): Self = StObject.set(x, "IdpIdentifier", value.asInstanceOf[js.Any])
    
    inline def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
  }
}
