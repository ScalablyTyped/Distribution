package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDetectorVersionRequest extends js.Object {
  /**
    * The detector ID.
    */
  var detectorId: identifier = js.native
  /**
    * The detector version ID.
    */
  var detectorVersionId: nonEmptyString = js.native
}

object GetDetectorVersionRequest {
  @scala.inline
  def apply(detectorId: identifier, detectorVersionId: nonEmptyString): GetDetectorVersionRequest = {
    val __obj = js.Dynamic.literal(detectorId = detectorId.asInstanceOf[js.Any], detectorVersionId = detectorVersionId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetDetectorVersionRequest]
  }
}

