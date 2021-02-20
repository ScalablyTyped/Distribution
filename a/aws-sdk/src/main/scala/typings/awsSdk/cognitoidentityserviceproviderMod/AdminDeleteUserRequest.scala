package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdminDeleteUserRequest extends StObject {
  
  /**
    * The user pool ID for the user pool where you want to delete the user.
    */
  var UserPoolId: UserPoolIdType = js.native
  
  /**
    * The user name of the user you wish to delete.
    */
  var Username: UsernameType = js.native
}
object AdminDeleteUserRequest {
  
  @scala.inline
  def apply(UserPoolId: UserPoolIdType, Username: UsernameType): AdminDeleteUserRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminDeleteUserRequest]
  }
  
  @scala.inline
  implicit class AdminDeleteUserRequestMutableBuilder[Self <: AdminDeleteUserRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: UsernameType): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
  }
}
