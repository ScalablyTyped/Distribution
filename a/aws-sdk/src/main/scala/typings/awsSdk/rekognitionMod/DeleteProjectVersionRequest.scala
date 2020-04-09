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
}

