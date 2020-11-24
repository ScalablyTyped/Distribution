package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CopyPackageVersionsResult extends js.Object {
  
  /**
    *  A map of package versions that failed to copy and their error codes. The possible error codes are in the PackageVersionError data type. They are:     ALREADY_EXISTS     MISMATCHED_REVISION     MISMATCHED_STATUS     NOT_ALLOWED     NOT_FOUND     SKIPPED   
    */
  var failedVersions: js.UndefOr[PackageVersionErrorMap] = js.native
  
  /**
    *  A list of the package versions that were successfully copied to your repository. 
    */
  var successfulVersions: js.UndefOr[SuccessfulPackageVersionInfoMap] = js.native
}
object CopyPackageVersionsResult {
  
  @scala.inline
  def apply(): CopyPackageVersionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyPackageVersionsResult]
  }
  
  @scala.inline
  implicit class CopyPackageVersionsResultOps[Self <: CopyPackageVersionsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFailedVersions(value: PackageVersionErrorMap): Self = this.set("failedVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailedVersions: Self = this.set("failedVersions", js.undefined)
    
    @scala.inline
    def setSuccessfulVersions(value: SuccessfulPackageVersionInfoMap): Self = this.set("successfulVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuccessfulVersions: Self = this.set("successfulVersions", js.undefined)
  }
}
