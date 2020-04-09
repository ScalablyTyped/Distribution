package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteProjectVersionResponse extends js.Object {
  /**
    * The status of the deletion operation.
    */
  var Status: js.UndefOr[ProjectVersionStatus] = js.native
}

object DeleteProjectVersionResponse {
  @scala.inline
  def apply(Status: ProjectVersionStatus = null): DeleteProjectVersionResponse = {
    val __obj = js.Dynamic.literal()
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteProjectVersionResponse]
  }
}

