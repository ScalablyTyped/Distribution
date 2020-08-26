package typings.awsSdk.codestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateProjectRequest extends js.Object {
  /**
    * The description of the project, if any.
    */
  var description: js.UndefOr[ProjectDescription] = js.native
  /**
    * The ID of the project you want to update.
    */
  var id: ProjectId = js.native
  /**
    * The name of the project you want to update.
    */
  var name: js.UndefOr[ProjectName] = js.native
}

object UpdateProjectRequest {
  @scala.inline
  def apply(id: ProjectId): UpdateProjectRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProjectRequest]
  }
  @scala.inline
  implicit class UpdateProjectRequestOps[Self <: UpdateProjectRequest] (val x: Self) extends AnyVal {
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
    def setId(value: ProjectId): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: ProjectDescription): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setName(value: ProjectName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

