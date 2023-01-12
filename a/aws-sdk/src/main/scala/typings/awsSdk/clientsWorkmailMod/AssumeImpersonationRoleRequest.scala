package typings.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssumeImpersonationRoleRequest extends StObject {
  
  /**
    * The impersonation role ID to assume.
    */
  var ImpersonationRoleId: typings.awsSdk.clientsWorkmailMod.ImpersonationRoleId
  
  /**
    * The WorkMail organization under which the impersonation role will be assumed.
    */
  var OrganizationId: typings.awsSdk.clientsWorkmailMod.OrganizationId
}
object AssumeImpersonationRoleRequest {
  
  inline def apply(ImpersonationRoleId: ImpersonationRoleId, OrganizationId: OrganizationId): AssumeImpersonationRoleRequest = {
    val __obj = js.Dynamic.literal(ImpersonationRoleId = ImpersonationRoleId.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssumeImpersonationRoleRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssumeImpersonationRoleRequest] (val x: Self) extends AnyVal {
    
    inline def setImpersonationRoleId(value: ImpersonationRoleId): Self = StObject.set(x, "ImpersonationRoleId", value.asInstanceOf[js.Any])
    
    inline def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
  }
}
