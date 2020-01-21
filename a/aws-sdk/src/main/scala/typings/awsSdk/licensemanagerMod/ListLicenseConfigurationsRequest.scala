package typings.awsSdk.licensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListLicenseConfigurationsRequest extends js.Object {
  /**
    * Filters to scope the results. The following filters and logical operators are supported:    licenseCountingType - The dimension on which licenses are counted (vCPU). Logical operators are EQUALS | NOT_EQUALS.    enforceLicenseCount - A Boolean value that indicates whether hard license enforcement is used. Logical operators are EQUALS | NOT_EQUALS.    usagelimitExceeded - A Boolean value that indicates whether the available licenses have been exceeded. Logical operators are EQUALS | NOT_EQUALS.  
    */
  var Filters: js.UndefOr[typings.awsSdk.licensemanagerMod.Filters] = js.native
  /**
    * Amazon Resource Names (ARN) of the license configurations.
    */
  var LicenseConfigurationArns: js.UndefOr[StringList] = js.native
  /**
    * Maximum number of results to return in a single call.
    */
  var MaxResults: js.UndefOr[BoxInteger] = js.native
  /**
    * Token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListLicenseConfigurationsRequest {
  @scala.inline
  def apply(
    Filters: Filters = null,
    LicenseConfigurationArns: StringList = null,
    MaxResults: Int | Double = null,
    NextToken: String = null
  ): ListLicenseConfigurationsRequest = {
    val __obj = js.Dynamic.literal()
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (LicenseConfigurationArns != null) __obj.updateDynamic("LicenseConfigurationArns")(LicenseConfigurationArns.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListLicenseConfigurationsRequest]
  }
}

