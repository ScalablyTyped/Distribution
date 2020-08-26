package typings.awsSdk.mobileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateProjectRequest extends js.Object {
  /**
    *  ZIP or YAML file which contains project configuration to be updated. This should be the contents of the file downloaded from the URL provided in an export project operation. 
    */
  var contents: js.UndefOr[Contents] = js.native
  /**
    *  Unique project identifier. 
    */
  var projectId: ProjectId = js.native
}

object UpdateProjectRequest {
  @scala.inline
  def apply(projectId: ProjectId): UpdateProjectRequest = {
    val __obj = js.Dynamic.literal(projectId = projectId.asInstanceOf[js.Any])
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
    def setProjectId(value: ProjectId): Self = this.set("projectId", value.asInstanceOf[js.Any])
    @scala.inline
    def setContents(value: Contents): Self = this.set("contents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContents: Self = this.set("contents", js.undefined)
  }
  
}

