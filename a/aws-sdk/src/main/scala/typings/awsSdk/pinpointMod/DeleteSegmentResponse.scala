package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteSegmentResponse extends js.Object {
  var SegmentResponse: typings.awsSdk.pinpointMod.SegmentResponse = js.native
}

object DeleteSegmentResponse {
  @scala.inline
  def apply(SegmentResponse: SegmentResponse): DeleteSegmentResponse = {
    val __obj = js.Dynamic.literal(SegmentResponse = SegmentResponse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteSegmentResponse]
  }
}

