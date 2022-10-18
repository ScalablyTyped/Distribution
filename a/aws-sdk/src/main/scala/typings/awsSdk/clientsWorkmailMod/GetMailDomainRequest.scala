package typings.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMailDomainRequest extends StObject {
  
  /**
    * The domain from which you want to retrieve details.
    */
  var DomainName: WorkMailDomainName
  
  /**
    * The WorkMail organization for which the domain is retrieved.
    */
  var OrganizationId: typings.awsSdk.clientsWorkmailMod.OrganizationId
}
object GetMailDomainRequest {
  
  inline def apply(DomainName: WorkMailDomainName, OrganizationId: OrganizationId): GetMailDomainRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMailDomainRequest]
  }
  
  extension [Self <: GetMailDomainRequest](x: Self) {
    
    inline def setDomainName(value: WorkMailDomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
  }
}
