package typings.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateImpersonationRoleRequest extends StObject {
  
  /**
    * The idempotency token for the client request.
    */
  var ClientToken: js.UndefOr[IdempotencyClientToken] = js.undefined
  
  /**
    * The description of the new impersonation role.
    */
  var Description: js.UndefOr[ImpersonationRoleDescription] = js.undefined
  
  /**
    * The name of the new impersonation role.
    */
  var Name: ImpersonationRoleName
  
  /**
    * The WorkMail organization to create the new impersonation role within.
    */
  var OrganizationId: typings.awsSdk.clientsWorkmailMod.OrganizationId
  
  /**
    * The list of rules for the impersonation role.
    */
  var Rules: ImpersonationRuleList
  
  /**
    * The impersonation role's type. The available impersonation role types are READ_ONLY or FULL_ACCESS.
    */
  var Type: ImpersonationRoleType
}
object CreateImpersonationRoleRequest {
  
  inline def apply(
    Name: ImpersonationRoleName,
    OrganizationId: OrganizationId,
    Rules: ImpersonationRuleList,
    Type: ImpersonationRoleType
  ): CreateImpersonationRoleRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any], Rules = Rules.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateImpersonationRoleRequest]
  }
  
  extension [Self <: CreateImpersonationRoleRequest](x: Self) {
    
    inline def setClientToken(value: IdempotencyClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setDescription(value: ImpersonationRoleDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: ImpersonationRoleName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
    
    inline def setRules(value: ImpersonationRuleList): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    inline def setRulesVarargs(value: ImpersonationRule*): Self = StObject.set(x, "Rules", js.Array(value*))
    
    inline def setType(value: ImpersonationRoleType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
