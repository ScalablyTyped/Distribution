package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSegmentsResponse extends js.Object {
  var SegmentsResponse: typings.awsSdk.pinpointMod.SegmentsResponse = js.native
}

object GetSegmentsResponse {
  @scala.inline
  def apply(SegmentsResponse: SegmentsResponse): GetSegmentsResponse = {
    val __obj = js.Dynamic.literal(SegmentsResponse = SegmentsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSegmentsResponse]
  }
}

