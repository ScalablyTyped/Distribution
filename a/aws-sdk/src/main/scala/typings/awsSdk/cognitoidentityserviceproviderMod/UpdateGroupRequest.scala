package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateGroupRequest extends StObject {
  
  /**
    * A string containing the new description of the group.
    */
  var Description: js.UndefOr[DescriptionType] = js.native
  
  /**
    * The name of the group.
    */
  var GroupName: GroupNameType = js.native
  
  /**
    * The new precedence value for the group. For more information about this parameter, see CreateGroup.
    */
  var Precedence: js.UndefOr[PrecedenceType] = js.native
  
  /**
    * The new role ARN for the group. This is used for setting the cognito:roles and cognito:preferred_role claims in the token.
    */
  var RoleArn: js.UndefOr[ArnType] = js.native
  
  /**
    * The user pool ID for the user pool.
    */
  var UserPoolId: UserPoolIdType = js.native
}
object UpdateGroupRequest {
  
  @scala.inline
  def apply(GroupName: GroupNameType, UserPoolId: UserPoolIdType): UpdateGroupRequest = {
    val __obj = js.Dynamic.literal(GroupName = GroupName.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGroupRequest]
  }
  
  @scala.inline
  implicit class UpdateGroupRequestMutableBuilder[Self <: UpdateGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: DescriptionType): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setGroupName(value: GroupNameType): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrecedence(value: PrecedenceType): Self = StObject.set(x, "Precedence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrecedenceUndefined: Self = StObject.set(x, "Precedence", js.undefined)
    
    @scala.inline
    def setRoleArn(value: ArnType): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    @scala.inline
    def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
  }
}
