package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdminDisableProviderForUserRequest extends StObject {
  
  /**
    * The user to be disabled.
    */
  var User: ProviderUserIdentifierType
  
  /**
    * The user pool ID for the user pool.
    */
  var UserPoolId: StringType
}
object AdminDisableProviderForUserRequest {
  
  inline def apply(User: ProviderUserIdentifierType, UserPoolId: StringType): AdminDisableProviderForUserRequest = {
    val __obj = js.Dynamic.literal(User = User.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminDisableProviderForUserRequest]
  }
  
  extension [Self <: AdminDisableProviderForUserRequest](x: Self) {
    
    inline def setUser(value: ProviderUserIdentifierType): Self = StObject.set(x, "User", value.asInstanceOf[js.Any])
    
    inline def setUserPoolId(value: StringType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
  }
}
