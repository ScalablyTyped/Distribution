package typings.awsSdk.licensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLicenseUsageResponse extends StObject {
  
  /**
    * License usage details.
    */
  var LicenseUsage: js.UndefOr[typings.awsSdk.licensemanagerMod.LicenseUsage] = js.undefined
}
object GetLicenseUsageResponse {
  
  inline def apply(): GetLicenseUsageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLicenseUsageResponse]
  }
  
  extension [Self <: GetLicenseUsageResponse](x: Self) {
    
    inline def setLicenseUsage(value: LicenseUsage): Self = StObject.set(x, "LicenseUsage", value.asInstanceOf[js.Any])
    
    inline def setLicenseUsageUndefined: Self = StObject.set(x, "LicenseUsage", js.undefined)
  }
}
