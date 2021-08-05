package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdminDisableUserRequest extends StObject {
  
  /**
    * The user pool ID for the user pool where you want to disable the user.
    */
  var UserPoolId: UserPoolIdType
  
  /**
    * The user name of the user you wish to disable.
    */
  var Username: UsernameType
}
object AdminDisableUserRequest {
  
  inline def apply(UserPoolId: UserPoolIdType, Username: UsernameType): AdminDisableUserRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminDisableUserRequest]
  }
  
  extension [Self <: AdminDisableUserRequest](x: Self) {
    
    inline def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: UsernameType): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
  }
}
