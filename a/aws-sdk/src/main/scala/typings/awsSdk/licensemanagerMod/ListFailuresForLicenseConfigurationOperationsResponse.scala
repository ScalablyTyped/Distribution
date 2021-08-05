package typings.awsSdk.licensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFailuresForLicenseConfigurationOperationsResponse extends StObject {
  
  /**
    * License configuration operations that failed.
    */
  var LicenseOperationFailureList: js.UndefOr[typings.awsSdk.licensemanagerMod.LicenseOperationFailureList] = js.undefined
  
  /**
    * Token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListFailuresForLicenseConfigurationOperationsResponse {
  
  inline def apply(): ListFailuresForLicenseConfigurationOperationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFailuresForLicenseConfigurationOperationsResponse]
  }
  
  extension [Self <: ListFailuresForLicenseConfigurationOperationsResponse](x: Self) {
    
    inline def setLicenseOperationFailureList(value: LicenseOperationFailureList): Self = StObject.set(x, "LicenseOperationFailureList", value.asInstanceOf[js.Any])
    
    inline def setLicenseOperationFailureListUndefined: Self = StObject.set(x, "LicenseOperationFailureList", js.undefined)
    
    inline def setLicenseOperationFailureListVarargs(value: LicenseOperationFailure*): Self = StObject.set(x, "LicenseOperationFailureList", js.Array(value :_*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
