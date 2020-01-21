package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutDetectorRequest extends js.Object {
  /**
    * The description of the detector.
    */
  var description: js.UndefOr[typings.awsSdk.frauddetectorMod.description] = js.native
  /**
    * The detector ID. 
    */
  var detectorId: identifier = js.native
}

object PutDetectorRequest {
  @scala.inline
  def apply(detectorId: identifier, description: description = null): PutDetectorRequest = {
    val __obj = js.Dynamic.literal(detectorId = detectorId.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutDetectorRequest]
  }
}

