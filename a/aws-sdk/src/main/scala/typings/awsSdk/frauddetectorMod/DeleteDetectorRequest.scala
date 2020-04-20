package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDetectorRequest extends js.Object {
  /**
    * The ID of the detector to delete.
    */
  var detectorId: identifier = js.native
}

object DeleteDetectorRequest {
  @scala.inline
  def apply(detectorId: identifier): DeleteDetectorRequest = {
    val __obj = js.Dynamic.literal(detectorId = detectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDetectorRequest]
  }
}

