package typings.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEmailMonitoringConfigurationRequest extends StObject {
  
  /**
    * The ID of the organization for which the email monitoring configuration is described.
    */
  var OrganizationId: typings.awsSdk.clientsWorkmailMod.OrganizationId
}
object DescribeEmailMonitoringConfigurationRequest {
  
  inline def apply(OrganizationId: OrganizationId): DescribeEmailMonitoringConfigurationRequest = {
    val __obj = js.Dynamic.literal(OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEmailMonitoringConfigurationRequest]
  }
  
  extension [Self <: DescribeEmailMonitoringConfigurationRequest](x: Self) {
    
    inline def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
  }
}
