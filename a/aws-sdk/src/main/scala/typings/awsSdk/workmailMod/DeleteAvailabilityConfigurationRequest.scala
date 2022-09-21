package typings.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAvailabilityConfigurationRequest extends StObject {
  
  /**
    * The domain for which the AvailabilityConfiguration will be deleted.
    */
  var DomainName: typings.awsSdk.workmailMod.DomainName
  
  /**
    * The Amazon WorkMail organization for which the AvailabilityConfiguration will be deleted.
    */
  var OrganizationId: typings.awsSdk.workmailMod.OrganizationId
}
object DeleteAvailabilityConfigurationRequest {
  
  inline def apply(DomainName: DomainName, OrganizationId: OrganizationId): DeleteAvailabilityConfigurationRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAvailabilityConfigurationRequest]
  }
  
  extension [Self <: DeleteAvailabilityConfigurationRequest](x: Self) {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
  }
}
