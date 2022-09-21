package typings.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEmailMonitoringConfigurationRequest extends StObject {
  
  /**
    * The ID of the organization from which the email monitoring configuration is deleted.
    */
  var OrganizationId: typings.awsSdk.workmailMod.OrganizationId
}
object DeleteEmailMonitoringConfigurationRequest {
  
  inline def apply(OrganizationId: OrganizationId): DeleteEmailMonitoringConfigurationRequest = {
    val __obj = js.Dynamic.literal(OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEmailMonitoringConfigurationRequest]
  }
  
  extension [Self <: DeleteEmailMonitoringConfigurationRequest](x: Self) {
    
    inline def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
  }
}
