package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteProjectVersionRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the model version that you want to delete.
    */
  var ProjectVersionArn: typings.awsSdk.rekognitionMod.ProjectVersionArn = js.native
}

object DeleteProjectVersionRequest {
  @scala.inline
  def apply(ProjectVersionArn: ProjectVersionArn): DeleteProjectVersionRequest = {
    val __obj = js.Dynamic.literal(ProjectVersionArn = ProjectVersionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteProjectVersionRequest]
  }
  @scala.inline
  implicit class DeleteProjectVersionRequestOps[Self <: DeleteProjectVersionRequest] (val x: Self) extends AnyVal {
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
    def setProjectVersionArn(value: ProjectVersionArn): Self = this.set("ProjectVersionArn", value.asInstanceOf[js.Any])
  }
  
}

