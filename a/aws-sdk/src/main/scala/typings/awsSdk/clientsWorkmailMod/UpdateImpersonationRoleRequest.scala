package typings.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateImpersonationRoleRequest extends StObject {
  
  /**
    * The updated impersonation role description.
    */
  var Description: js.UndefOr[ImpersonationRoleDescription] = js.undefined
  
  /**
    * The ID of the impersonation role to update.
    */
  var ImpersonationRoleId: typings.awsSdk.clientsWorkmailMod.ImpersonationRoleId
  
  /**
    * The updated impersonation role name.
    */
  var Name: ImpersonationRoleName
  
  /**
    * The WorkMail organization that contains the impersonation role to update.
    */
  var OrganizationId: typings.awsSdk.clientsWorkmailMod.OrganizationId
  
  /**
    * The updated list of rules.
    */
  var Rules: ImpersonationRuleList
  
  /**
    * The updated impersonation role type.
    */
  var Type: ImpersonationRoleType
}
object UpdateImpersonationRoleRequest {
  
  inline def apply(
    ImpersonationRoleId: ImpersonationRoleId,
    Name: ImpersonationRoleName,
    OrganizationId: OrganizationId,
    Rules: ImpersonationRuleList,
    Type: ImpersonationRoleType
  ): UpdateImpersonationRoleRequest = {
    val __obj = js.Dynamic.literal(ImpersonationRoleId = ImpersonationRoleId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any], Rules = Rules.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateImpersonationRoleRequest]
  }
  
  extension [Self <: UpdateImpersonationRoleRequest](x: Self) {
    
    inline def setDescription(value: ImpersonationRoleDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setImpersonationRoleId(value: ImpersonationRoleId): Self = StObject.set(x, "ImpersonationRoleId", value.asInstanceOf[js.Any])
    
    inline def setName(value: ImpersonationRoleName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
    
    inline def setRules(value: ImpersonationRuleList): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    inline def setRulesVarargs(value: ImpersonationRule*): Self = StObject.set(x, "Rules", js.Array(value*))
    
    inline def setType(value: ImpersonationRoleType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
