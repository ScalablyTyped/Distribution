package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteProjectRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the project that you want to delete.
    */
  var ProjectArn: typings.awsSdk.rekognitionMod.ProjectArn = js.native
}

object DeleteProjectRequest {
  @scala.inline
  def apply(ProjectArn: ProjectArn): DeleteProjectRequest = {
    val __obj = js.Dynamic.literal(ProjectArn = ProjectArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteProjectRequest]
  }
  @scala.inline
  implicit class DeleteProjectRequestOps[Self <: DeleteProjectRequest] (val x: Self) extends AnyVal {
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
    def setProjectArn(value: ProjectArn): Self = this.set("ProjectArn", value.asInstanceOf[js.Any])
  }
  
}

