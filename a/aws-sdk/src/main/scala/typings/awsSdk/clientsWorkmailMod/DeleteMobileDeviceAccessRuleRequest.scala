package typings.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMobileDeviceAccessRuleRequest extends StObject {
  
  /**
    * The identifier of the rule to be deleted.
    */
  var MobileDeviceAccessRuleId: typings.awsSdk.clientsWorkmailMod.MobileDeviceAccessRuleId
  
  /**
    * The WorkMail organization under which the rule will be deleted.
    */
  var OrganizationId: typings.awsSdk.clientsWorkmailMod.OrganizationId
}
object DeleteMobileDeviceAccessRuleRequest {
  
  inline def apply(MobileDeviceAccessRuleId: MobileDeviceAccessRuleId, OrganizationId: OrganizationId): DeleteMobileDeviceAccessRuleRequest = {
    val __obj = js.Dynamic.literal(MobileDeviceAccessRuleId = MobileDeviceAccessRuleId.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMobileDeviceAccessRuleRequest]
  }
  
  extension [Self <: DeleteMobileDeviceAccessRuleRequest](x: Self) {
    
    inline def setMobileDeviceAccessRuleId(value: MobileDeviceAccessRuleId): Self = StObject.set(x, "MobileDeviceAccessRuleId", value.asInstanceOf[js.Any])
    
    inline def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
  }
}
