package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateGroupRequest extends StObject {
  
  /**
    * A string containing the new description of the group.
    */
  var Description: js.UndefOr[DescriptionType] = js.undefined
  
  /**
    * The name of the group.
    */
  var GroupName: GroupNameType
  
  /**
    * The new precedence value for the group. For more information about this parameter, see CreateGroup.
    */
  var Precedence: js.UndefOr[PrecedenceType] = js.undefined
  
  /**
    * The new role Amazon Resource Name (ARN) for the group. This is used for setting the cognito:roles and cognito:preferred_role claims in the token.
    */
  var RoleArn: js.UndefOr[ArnType] = js.undefined
  
  /**
    * The user pool ID for the user pool.
    */
  var UserPoolId: UserPoolIdType
}
object UpdateGroupRequest {
  
  inline def apply(GroupName: GroupNameType, UserPoolId: UserPoolIdType): UpdateGroupRequest = {
    val __obj = js.Dynamic.literal(GroupName = GroupName.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGroupRequest]
  }
  
  extension [Self <: UpdateGroupRequest](x: Self) {
    
    inline def setDescription(value: DescriptionType): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setGroupName(value: GroupNameType): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    inline def setPrecedence(value: PrecedenceType): Self = StObject.set(x, "Precedence", value.asInstanceOf[js.Any])
    
    inline def setPrecedenceUndefined: Self = StObject.set(x, "Precedence", js.undefined)
    
    inline def setRoleArn(value: ArnType): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
  }
}
