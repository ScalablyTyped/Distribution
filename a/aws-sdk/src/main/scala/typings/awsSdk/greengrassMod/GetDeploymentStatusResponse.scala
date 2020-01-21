package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDeploymentStatusResponse extends js.Object {
  /**
    * The status of the deployment: ''InProgress'', ''Building'', ''Success'', or ''Failure''.
    */
  var DeploymentStatus: js.UndefOr[string] = js.native
  /**
    * The type of the deployment.
    */
  var DeploymentType: js.UndefOr[typings.awsSdk.greengrassMod.DeploymentType] = js.native
  /**
    * Error details
    */
  var ErrorDetails: js.UndefOr[typings.awsSdk.greengrassMod.ErrorDetails] = js.native
  /**
    * Error message
    */
  var ErrorMessage: js.UndefOr[string] = js.native
  /**
    * The time, in milliseconds since the epoch, when the deployment status was updated.
    */
  var UpdatedAt: js.UndefOr[string] = js.native
}

object GetDeploymentStatusResponse {
  @scala.inline
  def apply(
    DeploymentStatus: string = null,
    DeploymentType: DeploymentType = null,
    ErrorDetails: ErrorDetails = null,
    ErrorMessage: string = null,
    UpdatedAt: string = null
  ): GetDeploymentStatusResponse = {
    val __obj = js.Dynamic.literal()
    if (DeploymentStatus != null) __obj.updateDynamic("DeploymentStatus")(DeploymentStatus.asInstanceOf[js.Any])
    if (DeploymentType != null) __obj.updateDynamic("DeploymentType")(DeploymentType.asInstanceOf[js.Any])
    if (ErrorDetails != null) __obj.updateDynamic("ErrorDetails")(ErrorDetails.asInstanceOf[js.Any])
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage.asInstanceOf[js.Any])
    if (UpdatedAt != null) __obj.updateDynamic("UpdatedAt")(UpdatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeploymentStatusResponse]
  }
}

