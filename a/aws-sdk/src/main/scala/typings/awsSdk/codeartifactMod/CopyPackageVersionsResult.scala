package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    failedVersions: PackageVersionErrorMap = null,
    successfulVersions: SuccessfulPackageVersionInfoMap = null
  ): CopyPackageVersionsResult = {
    val __obj = js.Dynamic.literal()
    if (failedVersions != null) __obj.updateDynamic("failedVersions")(failedVersions.asInstanceOf[js.Any])
    if (successfulVersions != null) __obj.updateDynamic("successfulVersions")(successfulVersions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyPackageVersionsResult]
  }
}

