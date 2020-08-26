package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTestGridProjectRequest extends js.Object {
  /**
    * Human-readable description for the project.
    */
  var description: js.UndefOr[ResourceDescription] = js.native
  /**
    * Human-readable name for the project.
    */
  var name: js.UndefOr[ResourceName] = js.native
  /**
    * ARN of the project to update.
    */
  var projectArn: DeviceFarmArn = js.native
}

object UpdateTestGridProjectRequest {
  @scala.inline
  def apply(projectArn: DeviceFarmArn): UpdateTestGridProjectRequest = {
    val __obj = js.Dynamic.literal(projectArn = projectArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTestGridProjectRequest]
  }
  @scala.inline
  implicit class UpdateTestGridProjectRequestOps[Self <: UpdateTestGridProjectRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setProjectArn(value: DeviceFarmArn): Self = this.set("projectArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: ResourceDescription): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setName(value: ResourceName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

