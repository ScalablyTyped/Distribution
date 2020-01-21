package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSegmentRequest extends js.Object {
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string = js.native
  var WriteSegmentRequest: typings.awsSdk.pinpointMod.WriteSegmentRequest = js.native
}

object CreateSegmentRequest {
  @scala.inline
  def apply(ApplicationId: string, WriteSegmentRequest: WriteSegmentRequest): CreateSegmentRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], WriteSegmentRequest = WriteSegmentRequest.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateSegmentRequest]
  }
}

