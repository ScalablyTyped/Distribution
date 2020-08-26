package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSegmentVersionsResponse extends js.Object {
  var SegmentsResponse: typings.awsSdk.pinpointMod.SegmentsResponse = js.native
}

object GetSegmentVersionsResponse {
  @scala.inline
  def apply(SegmentsResponse: SegmentsResponse): GetSegmentVersionsResponse = {
    val __obj = js.Dynamic.literal(SegmentsResponse = SegmentsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSegmentVersionsResponse]
  }
  @scala.inline
  implicit class GetSegmentVersionsResponseOps[Self <: GetSegmentVersionsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSegmentsResponse(value: SegmentsResponse): Self = this.set("SegmentsResponse", value.asInstanceOf[js.Any])
  }
  
}

