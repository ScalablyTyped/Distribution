package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisposePackageVersionsResult extends js.Object {
  /**
    *  A PackageVersionError object that contains a map of errors codes for the disposed package versions that failed. The possible error codes are:     ALREADY_EXISTS     MISMATCHED_REVISION     MISMATCHED_STATUS     NOT_ALLOWED     NOT_FOUND     SKIPPED   
    */
  var failedVersions: js.UndefOr[PackageVersionErrorMap] = js.native
  /**
    *  A list of the package versions that were successfully disposed. 
    */
  var successfulVersions: js.UndefOr[SuccessfulPackageVersionInfoMap] = js.native
}

object DisposePackageVersionsResult {
  @scala.inline
  def apply(
    failedVersions: PackageVersionErrorMap = null,
    successfulVersions: SuccessfulPackageVersionInfoMap = null
  ): DisposePackageVersionsResult = {
    val __obj = js.Dynamic.literal()
    if (failedVersions != null) __obj.updateDynamic("failedVersions")(failedVersions.asInstanceOf[js.Any])
    if (successfulVersions != null) __obj.updateDynamic("successfulVersions")(successfulVersions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisposePackageVersionsResult]
  }
}

