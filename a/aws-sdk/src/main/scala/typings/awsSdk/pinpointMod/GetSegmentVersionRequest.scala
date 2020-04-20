package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSegmentVersionRequest extends js.Object {
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string = js.native
  /**
    * The unique identifier for the segment.
    */
  var SegmentId: string = js.native
  /**
    * The unique version number (Version property) for the campaign version.
    */
  var Version: string = js.native
}

object GetSegmentVersionRequest {
  @scala.inline
  def apply(ApplicationId: string, SegmentId: string, Version: string): GetSegmentVersionRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], SegmentId = SegmentId.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSegmentVersionRequest]
  }
}

