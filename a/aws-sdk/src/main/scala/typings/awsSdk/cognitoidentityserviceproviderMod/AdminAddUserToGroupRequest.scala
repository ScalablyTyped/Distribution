package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdminAddUserToGroupRequest extends StObject {
  
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
object AdminAddUserToGroupRequest {
  
  inline def apply(GroupName: GroupNameType, UserPoolId: UserPoolIdType, Username: UsernameType): AdminAddUserToGroupRequest = {
    val __obj = js.Dynamic.literal(GroupName = GroupName.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminAddUserToGroupRequest]
  }
  
  extension [Self <: AdminAddUserToGroupRequest](x: Self) {
    
    inline def setGroupName(value: GroupNameType): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    inline def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: UsernameType): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
  }
}
