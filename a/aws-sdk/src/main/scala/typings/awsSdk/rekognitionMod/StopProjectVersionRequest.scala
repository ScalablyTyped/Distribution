package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopProjectVersionRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the model version that you want to delete. This operation requires permissions to perform the rekognition:StopProjectVersion action.
    */
  var ProjectVersionArn: typings.awsSdk.rekognitionMod.ProjectVersionArn = js.native
}

object StopProjectVersionRequest {
  @scala.inline
  def apply(ProjectVersionArn: ProjectVersionArn): StopProjectVersionRequest = {
    val __obj = js.Dynamic.literal(ProjectVersionArn = ProjectVersionArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StopProjectVersionRequest]
  }
}

