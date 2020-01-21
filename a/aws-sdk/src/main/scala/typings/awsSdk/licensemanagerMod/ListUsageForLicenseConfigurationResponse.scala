package typings.awsSdk.licensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListUsageForLicenseConfigurationResponse extends js.Object {
  /**
    * Information about the license configurations.
    */
  var LicenseConfigurationUsageList: js.UndefOr[typings.awsSdk.licensemanagerMod.LicenseConfigurationUsageList] = js.native
  /**
    * Token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListUsageForLicenseConfigurationResponse {
  @scala.inline
  def apply(LicenseConfigurationUsageList: LicenseConfigurationUsageList = null, NextToken: String = null): ListUsageForLicenseConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    if (LicenseConfigurationUsageList != null) __obj.updateDynamic("LicenseConfigurationUsageList")(LicenseConfigurationUsageList.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListUsageForLicenseConfigurationResponse]
  }
}

