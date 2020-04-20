package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDetectorVersionMetadataRequest extends js.Object {
  /**
    * The description.
    */
  var description: typings.awsSdk.frauddetectorMod.description = js.native
  /**
    * The detector ID.
    */
  var detectorId: identifier = js.native
  /**
    * The detector version ID. 
    */
  var detectorVersionId: nonEmptyString = js.native
}

object UpdateDetectorVersionMetadataRequest {
  @scala.inline
  def apply(description: description, detectorId: identifier, detectorVersionId: nonEmptyString): UpdateDetectorVersionMetadataRequest = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], detectorId = detectorId.asInstanceOf[js.Any], detectorVersionId = detectorVersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDetectorVersionMetadataRequest]
  }
}

