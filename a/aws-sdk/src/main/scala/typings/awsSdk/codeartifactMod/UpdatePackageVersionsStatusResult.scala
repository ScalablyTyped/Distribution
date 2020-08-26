package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdatePackageVersionsStatusResult extends js.Object {
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
  implicit class UpdatePackageVersionsStatusResultOps[Self <: UpdatePackageVersionsStatusResult] (val x: Self) extends AnyVal {
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

