package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSegmentDetectionResponse extends StObject {
  
  /**
    * An array of objects. There can be multiple audio streams. Each AudioMetadata object contains metadata for a single audio stream. Audio information in an AudioMetadata objects includes the audio codec, the number of audio channels, the duration of the audio stream, and the sample rate. Audio metadata is returned in each page of information returned by GetSegmentDetection.
    */
  var AudioMetadata: js.UndefOr[AudioMetadataList] = js.undefined
  
  /**
    * Current status of the segment detection job.
    */
  var JobStatus: js.UndefOr[VideoJobStatus] = js.undefined
  
  /**
    * If the previous response was incomplete (because there are more labels to retrieve), Amazon Rekognition Video returns a pagination token in the response. You can use this pagination token to retrieve the next set of text.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * An array of segments detected in a video. The array is sorted by the segment types (TECHNICAL_CUE or SHOT) specified in the SegmentTypes input parameter of StartSegmentDetection. Within each segment type the array is sorted by timestamp values.
    */
  var Segments: js.UndefOr[SegmentDetections] = js.undefined
  
  /**
    * An array containing the segment types requested in the call to StartSegmentDetection. 
    */
  var SelectedSegmentTypes: js.UndefOr[SegmentTypesInfo] = js.undefined
  
  /**
    * If the job fails, StatusMessage provides a descriptive error message.
    */
  var StatusMessage: js.UndefOr[typings.awsSdk.rekognitionMod.StatusMessage] = js.undefined
  
  /**
    * Currently, Amazon Rekognition Video returns a single object in the VideoMetadata array. The object contains information about the video stream in the input file that Amazon Rekognition Video chose to analyze. The VideoMetadata object includes the video codec, video format and other information. Video metadata is returned in each page of information returned by GetSegmentDetection.
    */
  var VideoMetadata: js.UndefOr[VideoMetadataList] = js.undefined
}
object GetSegmentDetectionResponse {
  
  inline def apply(): GetSegmentDetectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSegmentDetectionResponse]
  }
  
  extension [Self <: GetSegmentDetectionResponse](x: Self) {
    
    inline def setAudioMetadata(value: AudioMetadataList): Self = StObject.set(x, "AudioMetadata", value.asInstanceOf[js.Any])
    
    inline def setAudioMetadataUndefined: Self = StObject.set(x, "AudioMetadata", js.undefined)
    
    inline def setAudioMetadataVarargs(value: AudioMetadata*): Self = StObject.set(x, "AudioMetadata", js.Array(value :_*))
    
    inline def setJobStatus(value: VideoJobStatus): Self = StObject.set(x, "JobStatus", value.asInstanceOf[js.Any])
    
    inline def setJobStatusUndefined: Self = StObject.set(x, "JobStatus", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSegments(value: SegmentDetections): Self = StObject.set(x, "Segments", value.asInstanceOf[js.Any])
    
    inline def setSegmentsUndefined: Self = StObject.set(x, "Segments", js.undefined)
    
    inline def setSegmentsVarargs(value: SegmentDetection*): Self = StObject.set(x, "Segments", js.Array(value :_*))
    
    inline def setSelectedSegmentTypes(value: SegmentTypesInfo): Self = StObject.set(x, "SelectedSegmentTypes", value.asInstanceOf[js.Any])
    
    inline def setSelectedSegmentTypesUndefined: Self = StObject.set(x, "SelectedSegmentTypes", js.undefined)
    
    inline def setSelectedSegmentTypesVarargs(value: SegmentTypeInfo*): Self = StObject.set(x, "SelectedSegmentTypes", js.Array(value :_*))
    
    inline def setStatusMessage(value: StatusMessage): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    inline def setVideoMetadata(value: VideoMetadataList): Self = StObject.set(x, "VideoMetadata", value.asInstanceOf[js.Any])
    
    inline def setVideoMetadataUndefined: Self = StObject.set(x, "VideoMetadata", js.undefined)
    
    inline def setVideoMetadataVarargs(value: VideoMetadata*): Self = StObject.set(x, "VideoMetadata", js.Array(value :_*))
  }
}
