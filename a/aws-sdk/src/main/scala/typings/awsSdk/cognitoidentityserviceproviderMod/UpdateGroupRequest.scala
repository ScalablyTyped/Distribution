package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateGroupRequest extends js.Object {
  
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
  implicit class UpdateGroupRequestOps[Self <: UpdateGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGroupName(value: GroupNameType): Self = this.set("GroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPoolId(value: UserPoolIdType): Self = this.set("UserPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: DescriptionType): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setPrecedence(value: PrecedenceType): Self = this.set("Precedence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrecedence: Self = this.set("Precedence", js.undefined)
    
    @scala.inline
    def setRoleArn(value: ArnType): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleArn: Self = this.set("RoleArn", js.undefined)
  }
}
