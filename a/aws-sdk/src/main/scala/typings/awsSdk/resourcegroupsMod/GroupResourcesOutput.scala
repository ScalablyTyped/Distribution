package typings.awsSdk.resourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupResourcesOutput extends js.Object {
  /**
    * The ARNs of the resources that failed to be added to the group by this operation.
    */
  var Failed: js.UndefOr[FailedResourceList] = js.native
  /**
    * The ARNs of the resources that were successfully added to the group by this operation.
    */
  var Succeeded: js.UndefOr[ResourceArnList] = js.native
}

object GroupResourcesOutput {
  @scala.inline
  def apply(): GroupResourcesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupResourcesOutput]
  }
  @scala.inline
  implicit class GroupResourcesOutputOps[Self <: GroupResourcesOutput] (val x: Self) extends AnyVal {
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
    def setFailedVarargs(value: FailedResource*): Self = this.set("Failed", js.Array(value :_*))
    @scala.inline
    def setFailed(value: FailedResourceList): Self = this.set("Failed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailed: Self = this.set("Failed", js.undefined)
    @scala.inline
    def setSucceededVarargs(value: ResourceArn*): Self = this.set("Succeeded", js.Array(value :_*))
    @scala.inline
    def setSucceeded(value: ResourceArnList): Self = this.set("Succeeded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSucceeded: Self = this.set("Succeeded", js.undefined)
  }
  
}

