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
  
  @scala.inline
  def apply(ProviderName: ProviderNameType, UserPoolId: UserPoolIdType): DeleteIdentityProviderRequest = {
    val __obj = js.Dynamic.literal(ProviderName = ProviderName.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteIdentityProviderRequest]
  }
  
  @scala.inline
  implicit class DeleteIdentityProviderRequestMutableBuilder[Self <: DeleteIdentityProviderRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProviderName(value: ProviderNameType): Self = StObject.set(x, "ProviderName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
  }
}
