package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSegmentResponse extends js.Object {
  var SegmentResponse: typings.awsSdk.pinpointMod.SegmentResponse = js.native
}

object CreateSegmentResponse {
  @scala.inline
  def apply(SegmentResponse: SegmentResponse): CreateSegmentResponse = {
    val __obj = js.Dynamic.literal(SegmentResponse = SegmentResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSegmentResponse]
  }
}

