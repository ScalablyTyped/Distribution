package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteProjectResponse extends js.Object {
  /**
    * The current status of the delete project operation.
    */
  var Status: js.UndefOr[ProjectStatus] = js.native
}

object DeleteProjectResponse {
  @scala.inline
  def apply(Status: ProjectStatus = null): DeleteProjectResponse = {
    val __obj = js.Dynamic.literal()
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteProjectResponse]
  }
}

