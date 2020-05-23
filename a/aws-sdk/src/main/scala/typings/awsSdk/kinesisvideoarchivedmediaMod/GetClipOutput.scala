package typings.awsSdk.kinesisvideoarchivedmediaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetClipOutput extends js.Object {
  /**
    * The content type of the media in the requested clip.
    */
  var ContentType: js.UndefOr[typings.awsSdk.kinesisvideoarchivedmediaMod.ContentType] = js.native
  /**
    * Traditional MP4 file that contains the media clip from the specified video stream. The output will contain the first 100 MB or the first 200 fragments from the specified start timestamp. For more information, see Kinesis Video Streams Limits. 
    */
  var Payload: js.UndefOr[typings.awsSdk.kinesisvideoarchivedmediaMod.Payload] = js.native
}

object GetClipOutput {
  @scala.inline
  def apply(ContentType: ContentType = null, Payload: Payload = null): GetClipOutput = {
    val __obj = js.Dynamic.literal()
    if (ContentType != null) __obj.updateDynamic("ContentType")(ContentType.asInstanceOf[js.Any])
    if (Payload != null) __obj.updateDynamic("Payload")(Payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetClipOutput]
  }
}

