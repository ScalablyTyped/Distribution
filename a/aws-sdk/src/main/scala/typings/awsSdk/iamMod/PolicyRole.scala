package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolicyRole extends StObject {
  
  /**
    * The stable and unique string identifying the role. For more information about IDs, see IAM Identifiers in the IAM User Guide.
    */
  var RoleId: js.UndefOr[idType] = js.undefined
  
  /**
    * The name (friendly name, not ARN) identifying the role.
    */
  var RoleName: js.UndefOr[roleNameType] = js.undefined
}
object PolicyRole {
  
  @scala.inline
  def apply(): PolicyRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyRole]
  }
  
  @scala.inline
  implicit class PolicyRoleMutableBuilder[Self <: PolicyRole] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoleId(value: idType): Self = StObject.set(x, "RoleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleIdUndefined: Self = StObject.set(x, "RoleId", js.undefined)
    
    @scala.inline
    def setRoleName(value: roleNameType): Self = StObject.set(x, "RoleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleNameUndefined: Self = StObject.set(x, "RoleName", js.undefined)
  }
}
