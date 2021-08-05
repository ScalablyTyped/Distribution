package typings.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAccessControlRulesRequest extends StObject {
  
  /**
    * The identifier for the organization.
    */
  var OrganizationId: typings.awsSdk.workmailMod.OrganizationId
}
object ListAccessControlRulesRequest {
  
  inline def apply(OrganizationId: OrganizationId): ListAccessControlRulesRequest = {
    val __obj = js.Dynamic.literal(OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAccessControlRulesRequest]
  }
  
  extension [Self <: ListAccessControlRulesRequest](x: Self) {
    
    inline def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
  }
}
