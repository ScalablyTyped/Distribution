package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTextDetectionResponse extends js.Object {
  /**
    * Current status of the text detection job.
    */
  var JobStatus: js.UndefOr[VideoJobStatus] = js.native
  /**
    * If the response is truncated, Amazon Rekognition Video returns this token that you can use in the subsequent request to retrieve the next set of text.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * If the job fails, StatusMessage provides a descriptive error message.
    */
  var StatusMessage: js.UndefOr[typings.awsSdk.rekognitionMod.StatusMessage] = js.native
  /**
    * An array of text detected in the video. Each element contains the detected text, the time in milliseconds from the start of the video that the text was detected, and where it was detected on the screen.
    */
  var TextDetections: js.UndefOr[TextDetectionResults] = js.native
  /**
    * Version number of the text detection model that was used to detect text.
    */
  var TextModelVersion: js.UndefOr[String] = js.native
  var VideoMetadata: js.UndefOr[typings.awsSdk.rekognitionMod.VideoMetadata] = js.native
}

object GetTextDetectionResponse {
  @scala.inline
  def apply(): GetTextDetectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTextDetectionResponse]
  }
  @scala.inline
  implicit class GetTextDetectionResponseOps[Self <: GetTextDetectionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setJobStatus(value: VideoJobStatus): Self = this.set("JobStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobStatus: Self = this.set("JobStatus", js.undefined)
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setStatusMessage(value: StatusMessage): Self = this.set("StatusMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusMessage: Self = this.set("StatusMessage", js.undefined)
    @scala.inline
    def setTextDetectionsVarargs(value: TextDetectionResult*): Self = this.set("TextDetections", js.Array(value :_*))
    @scala.inline
    def setTextDetections(value: TextDetectionResults): Self = this.set("TextDetections", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextDetections: Self = this.set("TextDetections", js.undefined)
    @scala.inline
    def setTextModelVersion(value: String): Self = this.set("TextModelVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextModelVersion: Self = this.set("TextModelVersion", js.undefined)
    @scala.inline
    def setVideoMetadata(value: VideoMetadata): Self = this.set("VideoMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoMetadata: Self = this.set("VideoMetadata", js.undefined)
  }
  
}

