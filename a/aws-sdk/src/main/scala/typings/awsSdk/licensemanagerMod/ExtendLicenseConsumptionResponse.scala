package typings.awsSdk.licensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtendLicenseConsumptionResponse extends StObject {
  
  /**
    * Date and time at which the license consumption expires.
    */
  var Expiration: js.UndefOr[ISO8601DateTime] = js.undefined
  
  /**
    * License consumption token.
    */
  var LicenseConsumptionToken: js.UndefOr[String] = js.undefined
}
object ExtendLicenseConsumptionResponse {
  
  inline def apply(): ExtendLicenseConsumptionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtendLicenseConsumptionResponse]
  }
  
  extension [Self <: ExtendLicenseConsumptionResponse](x: Self) {
    
    inline def setExpiration(value: ISO8601DateTime): Self = StObject.set(x, "Expiration", value.asInstanceOf[js.Any])
    
    inline def setExpirationUndefined: Self = StObject.set(x, "Expiration", js.undefined)
    
    inline def setLicenseConsumptionToken(value: String): Self = StObject.set(x, "LicenseConsumptionToken", value.asInstanceOf[js.Any])
    
    inline def setLicenseConsumptionTokenUndefined: Self = StObject.set(x, "LicenseConsumptionToken", js.undefined)
  }
}
