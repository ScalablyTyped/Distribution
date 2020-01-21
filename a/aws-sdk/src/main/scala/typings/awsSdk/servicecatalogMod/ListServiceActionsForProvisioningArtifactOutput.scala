package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListServiceActionsForProvisioningArtifactOutput extends js.Object {
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.native
  /**
    * An object containing information about the self-service actions associated with the provisioning artifact.
    */
  var ServiceActionSummaries: js.UndefOr[typings.awsSdk.servicecatalogMod.ServiceActionSummaries] = js.native
}

object ListServiceActionsForProvisioningArtifactOutput {
  @scala.inline
  def apply(NextPageToken: PageToken = null, ServiceActionSummaries: ServiceActionSummaries = null): ListServiceActionsForProvisioningArtifactOutput = {
    val __obj = js.Dynamic.literal()
    if (NextPageToken != null) __obj.updateDynamic("NextPageToken")(NextPageToken.asInstanceOf[js.Any])
    if (ServiceActionSummaries != null) __obj.updateDynamic("ServiceActionSummaries")(ServiceActionSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListServiceActionsForProvisioningArtifactOutput]
  }
}

