package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeletePackageVersionsResult extends js.Object {
  /**
    *  A PackageVersionError object that contains a map of errors codes for the deleted package that failed. The possible error codes are:     ALREADY_EXISTS     MISMATCHED_REVISION     MISMATCHED_STATUS     NOT_ALLOWED     NOT_FOUND     SKIPPED   
    */
  var failedVersions: js.UndefOr[PackageVersionErrorMap] = js.native
  /**
    *  A list of the package versions that were successfully deleted. 
    */
  var successfulVersions: js.UndefOr[SuccessfulPackageVersionInfoMap] = js.native
}

object DeletePackageVersionsResult {
  @scala.inline
  def apply(
    failedVersions: PackageVersionErrorMap = null,
    successfulVersions: SuccessfulPackageVersionInfoMap = null
  ): DeletePackageVersionsResult = {
    val __obj = js.Dynamic.literal()
    if (failedVersions != null) __obj.updateDynamic("failedVersions")(failedVersions.asInstanceOf[js.Any])
    if (successfulVersions != null) __obj.updateDynamic("successfulVersions")(successfulVersions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePackageVersionsResult]
  }
}

