package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateProjectRequest extends js.Object {
  /**
    * The name of the project to create.
    */
  var ProjectName: typings.awsSdk.rekognitionMod.ProjectName = js.native
}

object CreateProjectRequest {
  @scala.inline
  def apply(ProjectName: ProjectName): CreateProjectRequest = {
    val __obj = js.Dynamic.literal(ProjectName = ProjectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProjectRequest]
  }
  @scala.inline
  implicit class CreateProjectRequestOps[Self <: CreateProjectRequest] (val x: Self) extends AnyVal {
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
    def setProjectName(value: ProjectName): Self = this.set("ProjectName", value.asInstanceOf[js.Any])
  }
  
}

