package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeletePublishingDestinationRequest extends js.Object {
  /**
    * The ID of the publishing destination to delete.
    */
  var DestinationId: String = js.native
  /**
    * The unique ID of the detector associated with the publishing destination to delete.
    */
  var DetectorId: typings.awsSdk.guarddutyMod.DetectorId = js.native
}

object DeletePublishingDestinationRequest {
  @scala.inline
  def apply(DestinationId: String, DetectorId: DetectorId): DeletePublishingDestinationRequest = {
    val __obj = js.Dynamic.literal(DestinationId = DestinationId.asInstanceOf[js.Any], DetectorId = DetectorId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeletePublishingDestinationRequest]
  }
}

