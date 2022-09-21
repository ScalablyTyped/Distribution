package typings.awsSdk.licensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtendLicenseConsumptionRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request. Provides an error response if you do not have the required permissions.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * License consumption token.
    */
  var LicenseConsumptionToken: String
}
object ExtendLicenseConsumptionRequest {
  
  inline def apply(LicenseConsumptionToken: String): ExtendLicenseConsumptionRequest = {
    val __obj = js.Dynamic.literal(LicenseConsumptionToken = LicenseConsumptionToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendLicenseConsumptionRequest]
  }
  
  extension [Self <: ExtendLicenseConsumptionRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setLicenseConsumptionToken(value: String): Self = StObject.set(x, "LicenseConsumptionToken", value.asInstanceOf[js.Any])
  }
}
