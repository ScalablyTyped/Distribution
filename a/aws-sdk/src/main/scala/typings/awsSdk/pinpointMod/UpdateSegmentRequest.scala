package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateSegmentRequest extends js.Object {
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string = js.native
  /**
    * The unique identifier for the segment.
    */
  var SegmentId: string = js.native
  var WriteSegmentRequest: typings.awsSdk.pinpointMod.WriteSegmentRequest = js.native
}

object UpdateSegmentRequest {
  @scala.inline
  def apply(ApplicationId: string, SegmentId: string, WriteSegmentRequest: WriteSegmentRequest): UpdateSegmentRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], SegmentId = SegmentId.asInstanceOf[js.Any], WriteSegmentRequest = WriteSegmentRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSegmentRequest]
  }
}

