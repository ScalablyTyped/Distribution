package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDetectorVersionRequest extends js.Object {
  /**
    * The ID of the parent detector for the detector version to delete.
    */
  var detectorId: identifier = js.native
  /**
    * The ID of the detector version to delete.
    */
  var detectorVersionId: nonEmptyString = js.native
}

object DeleteDetectorVersionRequest {
  @scala.inline
  def apply(detectorId: identifier, detectorVersionId: nonEmptyString): DeleteDetectorVersionRequest = {
    val __obj = js.Dynamic.literal(detectorId = detectorId.asInstanceOf[js.Any], detectorVersionId = detectorVersionId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteDetectorVersionRequest]
  }
}

