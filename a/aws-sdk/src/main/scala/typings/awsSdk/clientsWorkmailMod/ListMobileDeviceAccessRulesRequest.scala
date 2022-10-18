package typings.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMobileDeviceAccessRulesRequest extends StObject {
  
  /**
    * The WorkMail organization for which to list the rules.
    */
  var OrganizationId: typings.awsSdk.clientsWorkmailMod.OrganizationId
}
object ListMobileDeviceAccessRulesRequest {
  
  inline def apply(OrganizationId: OrganizationId): ListMobileDeviceAccessRulesRequest = {
    val __obj = js.Dynamic.literal(OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMobileDeviceAccessRulesRequest]
  }
  
  extension [Self <: ListMobileDeviceAccessRulesRequest](x: Self) {
    
    inline def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
  }
}
