package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrganizationDataSourceConfigurationsResult extends StObject {
  
  /**
    * Describes whether S3 data event logs are enabled as a data source.
    */
  var S3Logs: OrganizationS3LogsConfigurationResult
}
object OrganizationDataSourceConfigurationsResult {
  
  inline def apply(S3Logs: OrganizationS3LogsConfigurationResult): OrganizationDataSourceConfigurationsResult = {
    val __obj = js.Dynamic.literal(S3Logs = S3Logs.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationDataSourceConfigurationsResult]
  }
  
  extension [Self <: OrganizationDataSourceConfigurationsResult](x: Self) {
    
    inline def setS3Logs(value: OrganizationS3LogsConfigurationResult): Self = StObject.set(x, "S3Logs", value.asInstanceOf[js.Any])
  }
}
