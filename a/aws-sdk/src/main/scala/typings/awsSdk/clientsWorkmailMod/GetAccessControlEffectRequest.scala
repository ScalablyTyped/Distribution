package typings.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAccessControlEffectRequest extends StObject {
  
  /**
    * The access protocol action. Valid values include ActiveSync, AutoDiscover, EWS, IMAP, SMTP, WindowsOutlook, and WebMail.
    */
  var Action: AccessControlRuleAction
  
  /**
    * The impersonation role ID.
    */
  var ImpersonationRoleId: js.UndefOr[typings.awsSdk.clientsWorkmailMod.ImpersonationRoleId] = js.undefined
  
  /**
    * The IPv4 address.
    */
  var IpAddress: typings.awsSdk.clientsWorkmailMod.IpAddress
  
  /**
    * The identifier for the organization.
    */
  var OrganizationId: typings.awsSdk.clientsWorkmailMod.OrganizationId
  
  /**
    * The user ID.
    */
  var UserId: js.UndefOr[WorkMailIdentifier] = js.undefined
}
object GetAccessControlEffectRequest {
  
  inline def apply(Action: AccessControlRuleAction, IpAddress: IpAddress, OrganizationId: OrganizationId): GetAccessControlEffectRequest = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], IpAddress = IpAddress.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAccessControlEffectRequest]
  }
  
  extension [Self <: GetAccessControlEffectRequest](x: Self) {
    
    inline def setAction(value: AccessControlRuleAction): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setImpersonationRoleId(value: ImpersonationRoleId): Self = StObject.set(x, "ImpersonationRoleId", value.asInstanceOf[js.Any])
    
    inline def setImpersonationRoleIdUndefined: Self = StObject.set(x, "ImpersonationRoleId", js.undefined)
    
    inline def setIpAddress(value: IpAddress): Self = StObject.set(x, "IpAddress", value.asInstanceOf[js.Any])
    
    inline def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
    
    inline def setUserId(value: WorkMailIdentifier): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "UserId", js.undefined)
  }
}
