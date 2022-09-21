package typings.awsSdk.licensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLicenseResponse extends StObject {
  
  /**
    * License details.
    */
  var License: js.UndefOr[typings.awsSdk.licensemanagerMod.License] = js.undefined
}
object GetLicenseResponse {
  
  inline def apply(): GetLicenseResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLicenseResponse]
  }
  
  extension [Self <: GetLicenseResponse](x: Self) {
    
    inline def setLicense(value: License): Self = StObject.set(x, "License", value.asInstanceOf[js.Any])
    
    inline def setLicenseUndefined: Self = StObject.set(x, "License", js.undefined)
  }
}
