package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrganizationDataSourceConfigurations extends StObject {
  
  /**
    * Describes whether S3 data event logs are enabled for new members of the organization.
    */
  var S3Logs: js.UndefOr[OrganizationS3LogsConfiguration] = js.undefined
}
object OrganizationDataSourceConfigurations {
  
  inline def apply(): OrganizationDataSourceConfigurations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrganizationDataSourceConfigurations]
  }
  
  extension [Self <: OrganizationDataSourceConfigurations](x: Self) {
    
    inline def setS3Logs(value: OrganizationS3LogsConfiguration): Self = StObject.set(x, "S3Logs", value.asInstanceOf[js.Any])
    
    inline def setS3LogsUndefined: Self = StObject.set(x, "S3Logs", js.undefined)
  }
}
