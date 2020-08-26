package typings.awsSdk.licensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListFailuresForLicenseConfigurationOperationsRequest extends js.Object {
  /**
    * Amazon Resource Name of the license configuration.
    */
  var LicenseConfigurationArn: String = js.native
  /**
    * Maximum number of results to return in a single call.
    */
  var MaxResults: js.UndefOr[BoxInteger] = js.native
  /**
    * Token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListFailuresForLicenseConfigurationOperationsRequest {
  @scala.inline
  def apply(LicenseConfigurationArn: String): ListFailuresForLicenseConfigurationOperationsRequest = {
    val __obj = js.Dynamic.literal(LicenseConfigurationArn = LicenseConfigurationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFailuresForLicenseConfigurationOperationsRequest]
  }
  @scala.inline
  implicit class ListFailuresForLicenseConfigurationOperationsRequestOps[Self <: ListFailuresForLicenseConfigurationOperationsRequest] (val x: Self) extends AnyVal {
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
    def setLicenseConfigurationArn(value: String): Self = this.set("LicenseConfigurationArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxResults(value: BoxInteger): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

