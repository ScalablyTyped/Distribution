package typings.awsSdk.resourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UngroupResourcesOutput extends js.Object {
  /**
    * The resources that failed to be removed from the group.
    */
  var Failed: js.UndefOr[FailedResourceList] = js.native
  /**
    * The ARNs of the resources that were successfully removed from the group.
    */
  var Succeeded: js.UndefOr[ResourceArnList] = js.native
}

object UngroupResourcesOutput {
  @scala.inline
  def apply(): UngroupResourcesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UngroupResourcesOutput]
  }
  @scala.inline
  implicit class UngroupResourcesOutputOps[Self <: UngroupResourcesOutput] (val x: Self) extends AnyVal {
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

