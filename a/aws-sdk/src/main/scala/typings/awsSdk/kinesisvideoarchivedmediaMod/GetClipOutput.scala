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
  def apply(): GetClipOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetClipOutput]
  }
  @scala.inline
  implicit class GetClipOutputOps[Self <: GetClipOutput] (val x: Self) extends AnyVal {
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
    def setContentType(value: ContentType): Self = this.set("ContentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentType: Self = this.set("ContentType", js.undefined)
    @scala.inline
    def setPayload(value: Payload): Self = this.set("Payload", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayload: Self = this.set("Payload", js.undefined)
  }
  
}

