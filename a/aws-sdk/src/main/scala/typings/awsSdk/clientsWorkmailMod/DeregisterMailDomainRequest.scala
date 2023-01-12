package typings.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeregisterMailDomainRequest extends StObject {
  
  /**
    * The domain to deregister in WorkMail and SES.
    */
  var DomainName: WorkMailDomainName
  
  /**
    * The WorkMail organization for which the domain will be deregistered.
    */
  var OrganizationId: typings.awsSdk.clientsWorkmailMod.OrganizationId
}
object DeregisterMailDomainRequest {
  
  inline def apply(DomainName: WorkMailDomainName, OrganizationId: OrganizationId): DeregisterMailDomainRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterMailDomainRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeregisterMailDomainRequest] (val x: Self) extends AnyVal {
    
    inline def setDomainName(value: WorkMailDomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
  }
}
