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
  @scala.inline
  implicit class GetSegmentVersionRequestOps[Self <: GetSegmentVersionRequest] (val x: Self) extends AnyVal {
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
    def setApplicationId(value: string): Self = this.set("ApplicationId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSegmentId(value: string): Self = this.set("SegmentId", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: string): Self = this.set("Version", value.asInstanceOf[js.Any])
  }
  
}

