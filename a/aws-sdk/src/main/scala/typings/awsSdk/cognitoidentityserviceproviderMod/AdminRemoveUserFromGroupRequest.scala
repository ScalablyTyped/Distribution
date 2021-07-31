package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdminRemoveUserFromGroupRequest extends StObject {
  
  /**
    * The group name.
    */
  var GroupName: GroupNameType
  
  /**
    * The user pool ID for the user pool.
    */
  var UserPoolId: UserPoolIdType
  
  /**
    * The username for the user.
    */
  var Username: UsernameType
}
object AdminRemoveUserFromGroupRequest {
  
  @scala.inline
  def apply(GroupName: GroupNameType, UserPoolId: UserPoolIdType, Username: UsernameType): AdminRemoveUserFromGroupRequest = {
    val __obj = js.Dynamic.literal(GroupName = GroupName.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminRemoveUserFromGroupRequest]
  }
  
  @scala.inline
  implicit class AdminRemoveUserFromGroupRequestMutableBuilder[Self <: AdminRemoveUserFromGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupName(value: GroupNameType): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: UsernameType): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
  }
}
