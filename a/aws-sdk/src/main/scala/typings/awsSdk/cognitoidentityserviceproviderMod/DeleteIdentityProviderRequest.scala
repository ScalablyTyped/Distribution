package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteIdentityProviderRequest extends StObject {
  
  /**
    * The identity provider name.
    */
  var ProviderName: ProviderNameType
  
  /**
    * The user pool ID.
    */
  var UserPoolId: UserPoolIdType
}
object DeleteIdentityProviderRequest {
  
  inline def apply(ProviderName: ProviderNameType, UserPoolId: UserPoolIdType): DeleteIdentityProviderRequest = {
    val __obj = js.Dynamic.literal(ProviderName = ProviderName.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteIdentityProviderRequest]
  }
  
  extension [Self <: DeleteIdentityProviderRequest](x: Self) {
    
    inline def setProviderName(value: ProviderNameType): Self = StObject.set(x, "ProviderName", value.asInstanceOf[js.Any])
    
    inline def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
  }
}
