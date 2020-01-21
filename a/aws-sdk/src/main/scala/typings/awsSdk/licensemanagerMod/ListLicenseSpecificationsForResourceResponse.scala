package typings.awsSdk.licensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListLicenseSpecificationsForResourceResponse extends js.Object {
  /**
    * License configurations associated with a resource.
    */
  var LicenseSpecifications: js.UndefOr[typings.awsSdk.licensemanagerMod.LicenseSpecifications] = js.native
  /**
    * Token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListLicenseSpecificationsForResourceResponse {
  @scala.inline
  def apply(LicenseSpecifications: LicenseSpecifications = null, NextToken: String = null): ListLicenseSpecificationsForResourceResponse = {
    val __obj = js.Dynamic.literal()
    if (LicenseSpecifications != null) __obj.updateDynamic("LicenseSpecifications")(LicenseSpecifications.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListLicenseSpecificationsForResourceResponse]
  }
}

