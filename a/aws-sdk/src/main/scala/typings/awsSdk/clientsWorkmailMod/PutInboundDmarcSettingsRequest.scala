package typings.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutInboundDmarcSettingsRequest extends StObject {
  
  /**
    * Enforces or suspends a policy after it's applied.
    */
  var Enforced: BooleanObject
  
  /**
    * The ID of the organization that you are applying the DMARC policy to.
    */
  var OrganizationId: typings.awsSdk.clientsWorkmailMod.OrganizationId
}
object PutInboundDmarcSettingsRequest {
  
  inline def apply(Enforced: BooleanObject, OrganizationId: OrganizationId): PutInboundDmarcSettingsRequest = {
    val __obj = js.Dynamic.literal(Enforced = Enforced.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutInboundDmarcSettingsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutInboundDmarcSettingsRequest] (val x: Self) extends AnyVal {
    
    inline def setEnforced(value: BooleanObject): Self = StObject.set(x, "Enforced", value.asInstanceOf[js.Any])
    
    inline def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
  }
}
