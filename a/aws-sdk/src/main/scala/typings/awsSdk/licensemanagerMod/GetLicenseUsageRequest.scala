package typings.awsSdk.licensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLicenseUsageRequest extends StObject {
  
  /**
    * Amazon Resource Name (ARN) of the license.
    */
  var LicenseArn: Arn
}
object GetLicenseUsageRequest {
  
  inline def apply(LicenseArn: Arn): GetLicenseUsageRequest = {
    val __obj = js.Dynamic.literal(LicenseArn = LicenseArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLicenseUsageRequest]
  }
  
  extension [Self <: GetLicenseUsageRequest](x: Self) {
    
    inline def setLicenseArn(value: Arn): Self = StObject.set(x, "LicenseArn", value.asInstanceOf[js.Any])
  }
}
