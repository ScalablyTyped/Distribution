package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BulkDeploymentResult extends js.Object {
  /**
    * The time, in ISO format, when the deployment was created.
    */
  var CreatedAt: js.UndefOr[string] = js.native
  /**
    * The ARN of the group deployment.
    */
  var DeploymentArn: js.UndefOr[string] = js.native
  /**
    * The ID of the group deployment.
    */
  var DeploymentId: js.UndefOr[string] = js.native
  /**
    * The current status of the group deployment: ''InProgress'', ''Building'', ''Success'', or ''Failure''.
    */
  var DeploymentStatus: js.UndefOr[string] = js.native
  /**
    * The type of the deployment.
    */
  var DeploymentType: js.UndefOr[typings.awsSdk.greengrassMod.DeploymentType] = js.native
  /**
    * Details about the error.
    */
  var ErrorDetails: js.UndefOr[typings.awsSdk.greengrassMod.ErrorDetails] = js.native
  /**
    * The error message for a failed deployment
    */
  var ErrorMessage: js.UndefOr[string] = js.native
  /**
    * The ARN of the Greengrass group.
    */
  var GroupArn: js.UndefOr[string] = js.native
}

object BulkDeploymentResult {
  @scala.inline
  def apply(
    CreatedAt: string = null,
    DeploymentArn: string = null,
    DeploymentId: string = null,
    DeploymentStatus: string = null,
    DeploymentType: DeploymentType = null,
    ErrorDetails: ErrorDetails = null,
    ErrorMessage: string = null,
    GroupArn: string = null
  ): BulkDeploymentResult = {
    val __obj = js.Dynamic.literal()
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt.asInstanceOf[js.Any])
    if (DeploymentArn != null) __obj.updateDynamic("DeploymentArn")(DeploymentArn.asInstanceOf[js.Any])
    if (DeploymentId != null) __obj.updateDynamic("DeploymentId")(DeploymentId.asInstanceOf[js.Any])
    if (DeploymentStatus != null) __obj.updateDynamic("DeploymentStatus")(DeploymentStatus.asInstanceOf[js.Any])
    if (DeploymentType != null) __obj.updateDynamic("DeploymentType")(DeploymentType.asInstanceOf[js.Any])
    if (ErrorDetails != null) __obj.updateDynamic("ErrorDetails")(ErrorDetails.asInstanceOf[js.Any])
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage.asInstanceOf[js.Any])
    if (GroupArn != null) __obj.updateDynamic("GroupArn")(GroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkDeploymentResult]
  }
}

