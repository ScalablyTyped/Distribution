package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListProvisioningArtifactsOutput extends js.Object {
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.native
  /**
    * Information about the provisioning artifacts.
    */
  var ProvisioningArtifactDetails: js.UndefOr[typings.awsSdk.servicecatalogMod.ProvisioningArtifactDetails] = js.native
}

object ListProvisioningArtifactsOutput {
  @scala.inline
  def apply(NextPageToken: PageToken = null, ProvisioningArtifactDetails: ProvisioningArtifactDetails = null): ListProvisioningArtifactsOutput = {
    val __obj = js.Dynamic.literal()
    if (NextPageToken != null) __obj.updateDynamic("NextPageToken")(NextPageToken.asInstanceOf[js.Any])
    if (ProvisioningArtifactDetails != null) __obj.updateDynamic("ProvisioningArtifactDetails")(ProvisioningArtifactDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProvisioningArtifactsOutput]
  }
}

