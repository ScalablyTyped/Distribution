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
  def apply(
    failedVersions: PackageVersionErrorMap = null,
    successfulVersions: SuccessfulPackageVersionInfoMap = null
  ): UpdatePackageVersionsStatusResult = {
    val __obj = js.Dynamic.literal()
    if (failedVersions != null) __obj.updateDynamic("failedVersions")(failedVersions.asInstanceOf[js.Any])
    if (successfulVersions != null) __obj.updateDynamic("successfulVersions")(successfulVersions.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePackageVersionsStatusResult]
  }
}

