package typings.awsSdk.kinesisvideoarchivedmediaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMediaForFragmentListOutput extends js.Object {
  /**
    * The content type of the requested media.
    */
  var ContentType: js.UndefOr[typings.awsSdk.kinesisvideoarchivedmediaMod.ContentType] = js.native
  /**
    * The payload that Kinesis Video Streams returns is a sequence of chunks from the specified stream. For information about the chunks, see PutMedia. The chunks that Kinesis Video Streams returns in the GetMediaForFragmentList call also include the following additional Matroska (MKV) tags:    AWS_KINESISVIDEO_FRAGMENT_NUMBER - Fragment number returned in the chunk.   AWS_KINESISVIDEO_SERVER_SIDE_TIMESTAMP - Server-side timestamp of the fragment.   AWS_KINESISVIDEO_PRODUCER_SIDE_TIMESTAMP - Producer-side timestamp of the fragment.   The following tags will be included if an exception occurs:   AWS_KINESISVIDEO_FRAGMENT_NUMBER - The number of the fragment that threw the exception   AWS_KINESISVIDEO_EXCEPTION_ERROR_CODE - The integer code of the exception   AWS_KINESISVIDEO_EXCEPTION_MESSAGE - A text description of the exception  
    */
  var Payload: js.UndefOr[typings.awsSdk.kinesisvideoarchivedmediaMod.Payload] = js.native
}

object GetMediaForFragmentListOutput {
  @scala.inline
  def apply(): GetMediaForFragmentListOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMediaForFragmentListOutput]
  }
  @scala.inline
  implicit class GetMediaForFragmentListOutputOps[Self <: GetMediaForFragmentListOutput] (val x: Self) extends AnyVal {
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

