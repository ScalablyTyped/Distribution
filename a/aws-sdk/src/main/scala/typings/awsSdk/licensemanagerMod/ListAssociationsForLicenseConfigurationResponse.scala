package typings.awsSdk.licensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAssociationsForLicenseConfigurationResponse extends js.Object {
  /**
    * Information about the associations for the license configuration.
    */
  var LicenseConfigurationAssociations: js.UndefOr[typings.awsSdk.licensemanagerMod.LicenseConfigurationAssociations] = js.native
  /**
    * Token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListAssociationsForLicenseConfigurationResponse {
  @scala.inline
  def apply(
    LicenseConfigurationAssociations: LicenseConfigurationAssociations = null,
    NextToken: String = null
  ): ListAssociationsForLicenseConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    if (LicenseConfigurationAssociations != null) __obj.updateDynamic("LicenseConfigurationAssociations")(LicenseConfigurationAssociations.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAssociationsForLicenseConfigurationResponse]
  }
}

