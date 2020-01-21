package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Deployment extends js.Object {
  /**
    * The time, in milliseconds since the epoch, when the deployment was created.
    */
  var CreatedAt: js.UndefOr[string] = js.native
  /**
    * The ARN of the deployment.
    */
  var DeploymentArn: js.UndefOr[string] = js.native
  /**
    * The ID of the deployment.
    */
  var DeploymentId: js.UndefOr[string] = js.native
  /**
    * The type of the deployment.
    */
  var DeploymentType: js.UndefOr[typings.awsSdk.greengrassMod.DeploymentType] = js.native
  /**
    * The ARN of the group for this deployment.
    */
  var GroupArn: js.UndefOr[string] = js.native
}

object Deployment {
  @scala.inline
  def apply(
    CreatedAt: string = null,
    DeploymentArn: string = null,
    DeploymentId: string = null,
    DeploymentType: DeploymentType = null,
    GroupArn: string = null
  ): Deployment = {
    val __obj = js.Dynamic.literal()
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt.asInstanceOf[js.Any])
    if (DeploymentArn != null) __obj.updateDynamic("DeploymentArn")(DeploymentArn.asInstanceOf[js.Any])
    if (DeploymentId != null) __obj.updateDynamic("DeploymentId")(DeploymentId.asInstanceOf[js.Any])
    if (DeploymentType != null) __obj.updateDynamic("DeploymentType")(DeploymentType.asInstanceOf[js.Any])
    if (GroupArn != null) __obj.updateDynamic("GroupArn")(GroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deployment]
  }
}

