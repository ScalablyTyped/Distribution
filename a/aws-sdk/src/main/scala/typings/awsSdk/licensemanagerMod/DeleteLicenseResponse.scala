package typings.awsSdk.licensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteLicenseResponse extends StObject {
  
  /**
    * Date when the license is deleted.
    */
  var DeletionDate: js.UndefOr[ISO8601DateTime] = js.undefined
  
  /**
    * License status.
    */
  var Status: js.UndefOr[LicenseDeletionStatus] = js.undefined
}
object DeleteLicenseResponse {
  
  inline def apply(): DeleteLicenseResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteLicenseResponse]
  }
  
  extension [Self <: DeleteLicenseResponse](x: Self) {
    
    inline def setDeletionDate(value: ISO8601DateTime): Self = StObject.set(x, "DeletionDate", value.asInstanceOf[js.Any])
    
    inline def setDeletionDateUndefined: Self = StObject.set(x, "DeletionDate", js.undefined)
    
    inline def setStatus(value: LicenseDeletionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
