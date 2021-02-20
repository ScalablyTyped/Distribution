package typings.awsSdk.codeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdatePackageVersionsStatusResult extends StObject {
  
  /**
    *  A list of SuccessfulPackageVersionInfo objects, one for each package version with a status that successfully updated. 
    */
  var failedVersions: js.UndefOr[PackageVersionErrorMap] = js.native
  
  /**
    *  A list of PackageVersionError objects, one for each package version with a status that failed to update. 
    */
  var successfulVersions: js.UndefOr[SuccessfulPackageVersionInfoMap] = js.native
}
object UpdatePackageVersionsStatusResult {
  
  @scala.inline
  def apply(): UpdatePackageVersionsStatusResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdatePackageVersionsStatusResult]
  }
  
  @scala.inline
  implicit class UpdatePackageVersionsStatusResultMutableBuilder[Self <: UpdatePackageVersionsStatusResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailedVersions(value: PackageVersionErrorMap): Self = StObject.set(x, "failedVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedVersionsUndefined: Self = StObject.set(x, "failedVersions", js.undefined)
    
    @scala.inline
    def setSuccessfulVersions(value: SuccessfulPackageVersionInfoMap): Self = StObject.set(x, "successfulVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessfulVersionsUndefined: Self = StObject.set(x, "successfulVersions", js.undefined)
  }
}
