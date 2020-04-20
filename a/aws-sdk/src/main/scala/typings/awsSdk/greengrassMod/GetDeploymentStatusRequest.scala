package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDeploymentStatusRequest extends js.Object {
  /**
    * The ID of the deployment.
    */
  var DeploymentId: string = js.native
  /**
    * The ID of the Greengrass group.
    */
  var GroupId: string = js.native
}

object GetDeploymentStatusRequest {
  @scala.inline
  def apply(DeploymentId: string, GroupId: string): GetDeploymentStatusRequest = {
    val __obj = js.Dynamic.literal(DeploymentId = DeploymentId.asInstanceOf[js.Any], GroupId = GroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeploymentStatusRequest]
  }
}

