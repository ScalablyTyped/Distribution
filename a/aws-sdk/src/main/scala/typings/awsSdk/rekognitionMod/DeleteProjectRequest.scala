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
}

