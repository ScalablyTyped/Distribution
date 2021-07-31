package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetGroupRequest extends StObject {
  
  /**
    * The name of the group.
    */
  var GroupName: GroupNameType
  
  /**
    * The user pool ID for the user pool.
    */
  var UserPoolId: UserPoolIdType
}
object GetGroupRequest {
  
  @scala.inline
  def apply(GroupName: GroupNameType, UserPoolId: UserPoolIdType): GetGroupRequest = {
    val __obj = js.Dynamic.literal(GroupName = GroupName.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGroupRequest]
  }
  
  @scala.inline
  implicit class GetGroupRequestMutableBuilder[Self <: GetGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupName(value: GroupNameType): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
  }
}
