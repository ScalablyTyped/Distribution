package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListProvisioningTemplateVersionsResponse extends js.Object {
  /**
    * A token to retrieve the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The list of fleet provisioning template versions.
    */
  var versions: js.UndefOr[ProvisioningTemplateVersionListing] = js.native
}

object ListProvisioningTemplateVersionsResponse {
  @scala.inline
  def apply(nextToken: NextToken = null, versions: ProvisioningTemplateVersionListing = null): ListProvisioningTemplateVersionsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (versions != null) __obj.updateDynamic("versions")(versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProvisioningTemplateVersionsResponse]
  }
}

