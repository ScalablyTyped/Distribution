package typings.awsSdk.codeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePackageVersionsResult extends StObject {
  
  /**
    *  A PackageVersionError object that contains a map of errors codes for the deleted package that failed. The possible error codes are:     ALREADY_EXISTS     MISMATCHED_REVISION     MISMATCHED_STATUS     NOT_ALLOWED     NOT_FOUND     SKIPPED   
    */
  var failedVersions: js.UndefOr[PackageVersionErrorMap] = js.undefined
  
  /**
    *  A list of the package versions that were successfully deleted. The status of every successful version will be Deleted. 
    */
  var successfulVersions: js.UndefOr[SuccessfulPackageVersionInfoMap] = js.undefined
}
object DeletePackageVersionsResult {
  
  inline def apply(): DeletePackageVersionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeletePackageVersionsResult]
  }
  
  extension [Self <: DeletePackageVersionsResult](x: Self) {
    
    inline def setFailedVersions(value: PackageVersionErrorMap): Self = StObject.set(x, "failedVersions", value.asInstanceOf[js.Any])
    
    inline def setFailedVersionsUndefined: Self = StObject.set(x, "failedVersions", js.undefined)
    
    inline def setSuccessfulVersions(value: SuccessfulPackageVersionInfoMap): Self = StObject.set(x, "successfulVersions", value.asInstanceOf[js.Any])
    
    inline def setSuccessfulVersionsUndefined: Self = StObject.set(x, "successfulVersions", js.undefined)
  }
}
