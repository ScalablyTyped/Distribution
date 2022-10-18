package typings.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetImpersonationRoleRequest extends StObject {
  
  /**
    * The impersonation role ID to retrieve.
    */
  var ImpersonationRoleId: typings.awsSdk.clientsWorkmailMod.ImpersonationRoleId
  
  /**
    * The WorkMail organization from which to retrieve the impersonation role.
    */
  var OrganizationId: typings.awsSdk.clientsWorkmailMod.OrganizationId
}
object GetImpersonationRoleRequest {
  
  inline def apply(ImpersonationRoleId: ImpersonationRoleId, OrganizationId: OrganizationId): GetImpersonationRoleRequest = {
    val __obj = js.Dynamic.literal(ImpersonationRoleId = ImpersonationRoleId.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetImpersonationRoleRequest]
  }
  
  extension [Self <: GetImpersonationRoleRequest](x: Self) {
    
    inline def setImpersonationRoleId(value: ImpersonationRoleId): Self = StObject.set(x, "ImpersonationRoleId", value.asInstanceOf[js.Any])
    
    inline def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
  }
}
