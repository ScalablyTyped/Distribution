package typings.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDefaultMailDomainRequest extends StObject {
  
  /**
    * The domain name that will become the default domain.
    */
  var DomainName: WorkMailDomainName
  
  /**
    * The WorkMail organization for which to list domains.
    */
  var OrganizationId: typings.awsSdk.clientsWorkmailMod.OrganizationId
}
object UpdateDefaultMailDomainRequest {
  
  inline def apply(DomainName: WorkMailDomainName, OrganizationId: OrganizationId): UpdateDefaultMailDomainRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDefaultMailDomainRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateDefaultMailDomainRequest] (val x: Self) extends AnyVal {
    
    inline def setDomainName(value: WorkMailDomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
  }
}
