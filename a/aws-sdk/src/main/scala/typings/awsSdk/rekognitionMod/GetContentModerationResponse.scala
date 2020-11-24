package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetContentModerationResponse extends js.Object {
  
  /**
    * The current status of the unsafe content analysis job.
    */
  var JobStatus: js.UndefOr[VideoJobStatus] = js.native
  
  /**
    * The detected unsafe content labels and the time(s) they were detected.
    */
  var ModerationLabels: js.UndefOr[ContentModerationDetections] = js.native
  
  /**
    * Version number of the moderation detection model that was used to detect unsafe content.
    */
  var ModerationModelVersion: js.UndefOr[String] = js.native
  
  /**
    * If the response is truncated, Amazon Rekognition Video returns this token that you can use in the subsequent request to retrieve the next set of unsafe content labels. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * If the job fails, StatusMessage provides a descriptive error message.
    */
  var StatusMessage: js.UndefOr[typings.awsSdk.rekognitionMod.StatusMessage] = js.native
  
  /**
    * Information about a video that Amazon Rekognition analyzed. Videometadata is returned in every page of paginated responses from GetContentModeration. 
    */
  var VideoMetadata: js.UndefOr[typings.awsSdk.rekognitionMod.VideoMetadata] = js.native
}
object GetContentModerationResponse {
  
  @scala.inline
  def apply(): GetContentModerationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetContentModerationResponse]
  }
  
  @scala.inline
  implicit class GetContentModerationResponseOps[Self <: GetContentModerationResponse] (val x: Self) extends AnyVal {
    
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
    def setModerationLabelsVarargs(value: ContentModerationDetection*): Self = this.set("ModerationLabels", js.Array(value :_*))
    
    @scala.inline
    def setModerationLabels(value: ContentModerationDetections): Self = this.set("ModerationLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModerationLabels: Self = this.set("ModerationLabels", js.undefined)
    
    @scala.inline
    def setModerationModelVersion(value: String): Self = this.set("ModerationModelVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModerationModelVersion: Self = this.set("ModerationModelVersion", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setStatusMessage(value: StatusMessage): Self = this.set("StatusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusMessage: Self = this.set("StatusMessage", js.undefined)
    
    @scala.inline
    def setVideoMetadata(value: VideoMetadata): Self = this.set("VideoMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoMetadata: Self = this.set("VideoMetadata", js.undefined)
  }
}
