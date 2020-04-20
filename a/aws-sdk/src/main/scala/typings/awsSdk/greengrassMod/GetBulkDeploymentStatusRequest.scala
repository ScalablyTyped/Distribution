package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBulkDeploymentStatusRequest extends js.Object {
  /**
    * The ID of the bulk deployment.
    */
  var BulkDeploymentId: string = js.native
}

object GetBulkDeploymentStatusRequest {
  @scala.inline
  def apply(BulkDeploymentId: string): GetBulkDeploymentStatusRequest = {
    val __obj = js.Dynamic.literal(BulkDeploymentId = BulkDeploymentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBulkDeploymentStatusRequest]
  }
}

