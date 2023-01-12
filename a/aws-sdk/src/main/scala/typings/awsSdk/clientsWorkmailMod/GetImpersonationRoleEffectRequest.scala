package typings.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetImpersonationRoleEffectRequest extends StObject {
  
  /**
    * The impersonation role ID to test.
    */
  var ImpersonationRoleId: typings.awsSdk.clientsWorkmailMod.ImpersonationRoleId
  
  /**
    * The WorkMail organization where the impersonation role is defined.
    */
  var OrganizationId: typings.awsSdk.clientsWorkmailMod.OrganizationId
  
  /**
    * The WorkMail organization user chosen to test the impersonation role. The following identity formats are available:   User ID: 12345678-1234-1234-1234-123456789012 or S-1-1-12-1234567890-123456789-123456789-1234    Email address: user@domain.tld    User name: user   
    */
  var TargetUser: EntityIdentifier
}
object GetImpersonationRoleEffectRequest {
  
  inline def apply(
    ImpersonationRoleId: ImpersonationRoleId,
    OrganizationId: OrganizationId,
    TargetUser: EntityIdentifier
  ): GetImpersonationRoleEffectRequest = {
    val __obj = js.Dynamic.literal(ImpersonationRoleId = ImpersonationRoleId.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any], TargetUser = TargetUser.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetImpersonationRoleEffectRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetImpersonationRoleEffectRequest] (val x: Self) extends AnyVal {
    
    inline def setImpersonationRoleId(value: ImpersonationRoleId): Self = StObject.set(x, "ImpersonationRoleId", value.asInstanceOf[js.Any])
    
    inline def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
    
    inline def setTargetUser(value: EntityIdentifier): Self = StObject.set(x, "TargetUser", value.asInstanceOf[js.Any])
  }
}
