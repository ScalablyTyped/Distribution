package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribePublishingDestinationRequest extends js.Object {
  /**
    * The ID of the publishing destination to retrieve.
    */
  var DestinationId: String = js.native
  /**
    * The unique ID of the detector associated with the publishing destination to retrieve.
    */
  var DetectorId: typings.awsSdk.guarddutyMod.DetectorId = js.native
}

object DescribePublishingDestinationRequest {
  @scala.inline
  def apply(DestinationId: String, DetectorId: DetectorId): DescribePublishingDestinationRequest = {
    val __obj = js.Dynamic.literal(DestinationId = DestinationId.asInstanceOf[js.Any], DetectorId = DetectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePublishingDestinationRequest]
  }
}

