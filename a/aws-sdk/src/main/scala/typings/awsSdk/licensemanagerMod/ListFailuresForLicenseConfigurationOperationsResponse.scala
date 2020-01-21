package typings.awsSdk.licensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListFailuresForLicenseConfigurationOperationsResponse extends js.Object {
  /**
    * License configuration operations that failed.
    */
  var LicenseOperationFailureList: js.UndefOr[typings.awsSdk.licensemanagerMod.LicenseOperationFailureList] = js.native
  /**
    * Token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListFailuresForLicenseConfigurationOperationsResponse {
  @scala.inline
  def apply(LicenseOperationFailureList: LicenseOperationFailureList = null, NextToken: String = null): ListFailuresForLicenseConfigurationOperationsResponse = {
    val __obj = js.Dynamic.literal()
    if (LicenseOperationFailureList != null) __obj.updateDynamic("LicenseOperationFailureList")(LicenseOperationFailureList.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFailuresForLicenseConfigurationOperationsResponse]
  }
}

