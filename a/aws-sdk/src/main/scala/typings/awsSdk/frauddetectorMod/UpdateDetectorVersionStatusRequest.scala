package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDetectorVersionStatusRequest extends js.Object {
  /**
    * The detector ID. 
    */
  var detectorId: identifier = js.native
  /**
    * The detector version ID. 
    */
  var detectorVersionId: nonEmptyString = js.native
  /**
    * The new status.
    */
  var status: DetectorVersionStatus = js.native
}

object UpdateDetectorVersionStatusRequest {
  @scala.inline
  def apply(detectorId: identifier, detectorVersionId: nonEmptyString, status: DetectorVersionStatus): UpdateDetectorVersionStatusRequest = {
    val __obj = js.Dynamic.literal(detectorId = detectorId.asInstanceOf[js.Any], detectorVersionId = detectorVersionId.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDetectorVersionStatusRequest]
  }
}

