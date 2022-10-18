package typings.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetImpersonationRoleResponse extends StObject {
  
  /**
    * The date when the impersonation role was created.
    */
  var DateCreated: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date when the impersonation role was last modified.
    */
  var DateModified: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The impersonation role description.
    */
  var Description: js.UndefOr[ImpersonationRoleDescription] = js.undefined
  
  /**
    * The impersonation role ID.
    */
  var ImpersonationRoleId: js.UndefOr[typings.awsSdk.clientsWorkmailMod.ImpersonationRoleId] = js.undefined
  
  /**
    * The impersonation role name.
    */
  var Name: js.UndefOr[ImpersonationRoleName] = js.undefined
  
  /**
    * The list of rules for the given impersonation role.
    */
  var Rules: js.UndefOr[ImpersonationRuleList] = js.undefined
  
  /**
    * The impersonation role type.
    */
  var Type: js.UndefOr[ImpersonationRoleType] = js.undefined
}
object GetImpersonationRoleResponse {
  
  inline def apply(): GetImpersonationRoleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetImpersonationRoleResponse]
  }
  
  extension [Self <: GetImpersonationRoleResponse](x: Self) {
    
    inline def setDateCreated(value: js.Date): Self = StObject.set(x, "DateCreated", value.asInstanceOf[js.Any])
    
    inline def setDateCreatedUndefined: Self = StObject.set(x, "DateCreated", js.undefined)
    
    inline def setDateModified(value: js.Date): Self = StObject.set(x, "DateModified", value.asInstanceOf[js.Any])
    
    inline def setDateModifiedUndefined: Self = StObject.set(x, "DateModified", js.undefined)
    
    inline def setDescription(value: ImpersonationRoleDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setImpersonationRoleId(value: ImpersonationRoleId): Self = StObject.set(x, "ImpersonationRoleId", value.asInstanceOf[js.Any])
    
    inline def setImpersonationRoleIdUndefined: Self = StObject.set(x, "ImpersonationRoleId", js.undefined)
    
    inline def setName(value: ImpersonationRoleName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setRules(value: ImpersonationRuleList): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "Rules", js.undefined)
    
    inline def setRulesVarargs(value: ImpersonationRule*): Self = StObject.set(x, "Rules", js.Array(value*))
    
    inline def setType(value: ImpersonationRoleType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
