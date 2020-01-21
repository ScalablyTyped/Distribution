package typings.awsSdk.mobileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeProjectRequest extends js.Object {
  /**
    *  Unique project identifier. 
    */
  var projectId: ProjectId = js.native
  /**
    *  If set to true, causes AWS Mobile Hub to synchronize information from other services, e.g., update state of AWS CloudFormation stacks in the AWS Mobile Hub project. 
    */
  var syncFromResources: js.UndefOr[Boolean] = js.native
}

object DescribeProjectRequest {
  @scala.inline
  def apply(projectId: ProjectId, syncFromResources: js.UndefOr[scala.Boolean] = js.undefined): DescribeProjectRequest = {
    val __obj = js.Dynamic.literal(projectId = projectId.asInstanceOf[js.Any])
    if (!js.isUndefined(syncFromResources)) __obj.updateDynamic("syncFromResources")(syncFromResources.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProjectRequest]
  }
}

