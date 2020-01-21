package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartProjectVersionResponse extends js.Object {
  /**
    * The current running status of the model. 
    */
  var Status: js.UndefOr[ProjectVersionStatus] = js.native
}

object StartProjectVersionResponse {
  @scala.inline
  def apply(Status: ProjectVersionStatus = null): StartProjectVersionResponse = {
    val __obj = js.Dynamic.literal()
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartProjectVersionResponse]
  }
}

