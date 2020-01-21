package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopProjectVersionResponse extends js.Object {
  /**
    * The current status of the stop operation. 
    */
  var Status: js.UndefOr[ProjectVersionStatus] = js.native
}

object StopProjectVersionResponse {
  @scala.inline
  def apply(Status: ProjectVersionStatus = null): StopProjectVersionResponse = {
    val __obj = js.Dynamic.literal()
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopProjectVersionResponse]
  }
}

