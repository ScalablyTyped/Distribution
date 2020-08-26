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
  @scala.inline
  implicit class DescribePublishingDestinationRequestOps[Self <: DescribePublishingDestinationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDestinationId(value: String): Self = this.set("DestinationId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDetectorId(value: DetectorId): Self = this.set("DetectorId", value.asInstanceOf[js.Any])
  }
  
}

