package typings.awsSdk.mobileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportProjectRequest extends js.Object {
  /**
    *  Unique project identifier. 
    */
  var projectId: ProjectId = js.native
}

object ExportProjectRequest {
  @scala.inline
  def apply(projectId: ProjectId): ExportProjectRequest = {
    val __obj = js.Dynamic.literal(projectId = projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportProjectRequest]
  }
  @scala.inline
  implicit class ExportProjectRequestOps[Self <: ExportProjectRequest] (val x: Self) extends AnyVal {
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
  }
  
}

