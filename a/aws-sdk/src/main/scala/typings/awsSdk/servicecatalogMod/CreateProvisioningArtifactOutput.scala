package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateProvisioningArtifactOutput extends js.Object {
  /**
    * The URL of the CloudFormation template in Amazon S3, in JSON format.
    */
  var Info: js.UndefOr[ProvisioningArtifactInfo] = js.native
  /**
    * Information about the provisioning artifact.
    */
  var ProvisioningArtifactDetail: js.UndefOr[typings.awsSdk.servicecatalogMod.ProvisioningArtifactDetail] = js.native
  /**
    * The status of the current request.
    */
  var Status: js.UndefOr[typings.awsSdk.servicecatalogMod.Status] = js.native
}

object CreateProvisioningArtifactOutput {
  @scala.inline
  def apply(
    Info: ProvisioningArtifactInfo = null,
    ProvisioningArtifactDetail: ProvisioningArtifactDetail = null,
    Status: Status = null
  ): CreateProvisioningArtifactOutput = {
    val __obj = js.Dynamic.literal()
    if (Info != null) __obj.updateDynamic("Info")(Info.asInstanceOf[js.Any])
    if (ProvisioningArtifactDetail != null) __obj.updateDynamic("ProvisioningArtifactDetail")(ProvisioningArtifactDetail.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProvisioningArtifactOutput]
  }
}

