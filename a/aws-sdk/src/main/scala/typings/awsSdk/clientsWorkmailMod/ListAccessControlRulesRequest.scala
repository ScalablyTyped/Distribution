package typings.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAccessControlRulesRequest extends StObject {
  
  /**
    * The identifier for the organization.
    */
  var OrganizationId: typings.awsSdk.clientsWorkmailMod.OrganizationId
}
object ListAccessControlRulesRequest {
  
  inline def apply(OrganizationId: OrganizationId): ListAccessControlRulesRequest = {
    val __obj = js.Dynamic.literal(OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAccessControlRulesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAccessControlRulesRequest] (val x: Self) extends AnyVal {
    
    inline def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
  }
}
