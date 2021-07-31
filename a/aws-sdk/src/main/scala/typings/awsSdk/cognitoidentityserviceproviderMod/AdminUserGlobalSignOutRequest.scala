package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdminUserGlobalSignOutRequest extends StObject {
  
  /**
    * The user pool ID.
    */
  var UserPoolId: UserPoolIdType
  
  /**
    * The user name.
    */
  var Username: UsernameType
}
object AdminUserGlobalSignOutRequest {
  
  @scala.inline
  def apply(UserPoolId: UserPoolIdType, Username: UsernameType): AdminUserGlobalSignOutRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminUserGlobalSignOutRequest]
  }
  
  @scala.inline
  implicit class AdminUserGlobalSignOutRequestMutableBuilder[Self <: AdminUserGlobalSignOutRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: UsernameType): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
  }
}
