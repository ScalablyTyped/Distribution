package typings.awsSdk.licensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListUsageForLicenseConfigurationResponse extends StObject {
  
  /**
    * Information about the license configurations.
    */
  var LicenseConfigurationUsageList: js.UndefOr[typings.awsSdk.licensemanagerMod.LicenseConfigurationUsageList] = js.undefined
  
  /**
    * Token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListUsageForLicenseConfigurationResponse {
  
  inline def apply(): ListUsageForLicenseConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListUsageForLicenseConfigurationResponse]
  }
  
  extension [Self <: ListUsageForLicenseConfigurationResponse](x: Self) {
    
    inline def setLicenseConfigurationUsageList(value: LicenseConfigurationUsageList): Self = StObject.set(x, "LicenseConfigurationUsageList", value.asInstanceOf[js.Any])
    
    inline def setLicenseConfigurationUsageListUndefined: Self = StObject.set(x, "LicenseConfigurationUsageList", js.undefined)
    
    inline def setLicenseConfigurationUsageListVarargs(value: LicenseConfigurationUsage*): Self = StObject.set(x, "LicenseConfigurationUsageList", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
