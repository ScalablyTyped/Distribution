package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSegmentDetectionResponse extends js.Object {
  
  /**
    * An array of objects. There can be multiple audio streams. Each AudioMetadata object contains metadata for a single audio stream. Audio information in an AudioMetadata objects includes the audio codec, the number of audio channels, the duration of the audio stream, and the sample rate. Audio metadata is returned in each page of information returned by GetSegmentDetection.
    */
  var AudioMetadata: js.UndefOr[AudioMetadataList] = js.native
  
  /**
    * Current status of the segment detection job.
    */
  var JobStatus: js.UndefOr[VideoJobStatus] = js.native
  
  /**
    * If the previous response was incomplete (because there are more labels to retrieve), Amazon Rekognition Video returns a pagination token in the response. You can use this pagination token to retrieve the next set of text.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * An array of segments detected in a video. The array is sorted by the segment types (TECHNICAL_CUE or SHOT) specified in the SegmentTypes input parameter of StartSegmentDetection. Within each segment type the array is sorted by timestamp values.
    */
  var Segments: js.UndefOr[SegmentDetections] = js.native
  
  /**
    * An array containing the segment types requested in the call to StartSegmentDetection. 
    */
  var SelectedSegmentTypes: js.UndefOr[SegmentTypesInfo] = js.native
  
  /**
    * If the job fails, StatusMessage provides a descriptive error message.
    */
  var StatusMessage: js.UndefOr[typings.awsSdk.rekognitionMod.StatusMessage] = js.native
  
  /**
    * Currently, Amazon Rekognition Video returns a single object in the VideoMetadata array. The object contains information about the video stream in the input file that Amazon Rekognition Video chose to analyze. The VideoMetadata object includes the video codec, video format and other information. Video metadata is returned in each page of information returned by GetSegmentDetection.
    */
  var VideoMetadata: js.UndefOr[VideoMetadataList] = js.native
}
object GetSegmentDetectionResponse {
  
  @scala.inline
  def apply(): GetSegmentDetectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSegmentDetectionResponse]
  }
  
  @scala.inline
  implicit class GetSegmentDetectionResponseOps[Self <: GetSegmentDetectionResponse] (val x: Self) extends AnyVal {
    
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
    def setAudioMetadataVarargs(value: AudioMetadata*): Self = this.set("AudioMetadata", js.Array(value :_*))
    
    @scala.inline
    def setAudioMetadata(value: AudioMetadataList): Self = this.set("AudioMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudioMetadata: Self = this.set("AudioMetadata", js.undefined)
    
    @scala.inline
    def setJobStatus(value: VideoJobStatus): Self = this.set("JobStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobStatus: Self = this.set("JobStatus", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setSegmentsVarargs(value: SegmentDetection*): Self = this.set("Segments", js.Array(value :_*))
    
    @scala.inline
    def setSegments(value: SegmentDetections): Self = this.set("Segments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegments: Self = this.set("Segments", js.undefined)
    
    @scala.inline
    def setSelectedSegmentTypesVarargs(value: SegmentTypeInfo*): Self = this.set("SelectedSegmentTypes", js.Array(value :_*))
    
    @scala.inline
    def setSelectedSegmentTypes(value: SegmentTypesInfo): Self = this.set("SelectedSegmentTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedSegmentTypes: Self = this.set("SelectedSegmentTypes", js.undefined)
    
    @scala.inline
    def setStatusMessage(value: StatusMessage): Self = this.set("StatusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusMessage: Self = this.set("StatusMessage", js.undefined)
    
    @scala.inline
    def setVideoMetadataVarargs(value: VideoMetadata*): Self = this.set("VideoMetadata", js.Array(value :_*))
    
    @scala.inline
    def setVideoMetadata(value: VideoMetadataList): Self = this.set("VideoMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoMetadata: Self = this.set("VideoMetadata", js.undefined)
  }
}
