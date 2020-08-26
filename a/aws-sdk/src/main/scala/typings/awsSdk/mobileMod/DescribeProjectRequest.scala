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
  def apply(projectId: ProjectId): DescribeProjectRequest = {
    val __obj = js.Dynamic.literal(projectId = projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProjectRequest]
  }
  @scala.inline
  implicit class DescribeProjectRequestOps[Self <: DescribeProjectRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setProjectId(value: ProjectId): Self = this.set("projectId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSyncFromResources(value: Boolean): Self = this.set("syncFromResources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSyncFromResources: Self = this.set("syncFromResources", js.undefined)
  }
  
}

