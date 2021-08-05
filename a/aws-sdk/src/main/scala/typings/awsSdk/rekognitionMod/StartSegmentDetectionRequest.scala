package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartSegmentDetectionRequest extends StObject {
  
  /**
    * Idempotent token used to identify the start request. If you use the same token with multiple StartSegmentDetection requests, the same JobId is returned. Use ClientRequestToken to prevent the same job from being accidently started more than once. 
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.rekognitionMod.ClientRequestToken] = js.undefined
  
  /**
    * Filters for technical cue or shot detection.
    */
  var Filters: js.UndefOr[StartSegmentDetectionFilters] = js.undefined
  
  /**
    * An identifier you specify that's returned in the completion notification that's published to your Amazon Simple Notification Service topic. For example, you can use JobTag to group related jobs and identify them in the completion notification.
    */
  var JobTag: js.UndefOr[typings.awsSdk.rekognitionMod.JobTag] = js.undefined
  
  /**
    * The ARN of the Amazon SNS topic to which you want Amazon Rekognition Video to publish the completion status of the segment detection operation.
    */
  var NotificationChannel: js.UndefOr[typings.awsSdk.rekognitionMod.NotificationChannel] = js.undefined
  
  /**
    * An array of segment types to detect in the video. Valid values are TECHNICAL_CUE and SHOT.
    */
  var SegmentTypes: typings.awsSdk.rekognitionMod.SegmentTypes
  
  var Video: typings.awsSdk.rekognitionMod.Video
}
object StartSegmentDetectionRequest {
  
  inline def apply(SegmentTypes: SegmentTypes, Video: Video): StartSegmentDetectionRequest = {
    val __obj = js.Dynamic.literal(SegmentTypes = SegmentTypes.asInstanceOf[js.Any], Video = Video.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartSegmentDetectionRequest]
  }
  
  extension [Self <: StartSegmentDetectionRequest](x: Self) {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setFilters(value: StartSegmentDetectionFilters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setJobTag(value: JobTag): Self = StObject.set(x, "JobTag", value.asInstanceOf[js.Any])
    
    inline def setJobTagUndefined: Self = StObject.set(x, "JobTag", js.undefined)
    
    inline def setNotificationChannel(value: NotificationChannel): Self = StObject.set(x, "NotificationChannel", value.asInstanceOf[js.Any])
    
    inline def setNotificationChannelUndefined: Self = StObject.set(x, "NotificationChannel", js.undefined)
    
    inline def setSegmentTypes(value: SegmentTypes): Self = StObject.set(x, "SegmentTypes", value.asInstanceOf[js.Any])
    
    inline def setSegmentTypesVarargs(value: SegmentType*): Self = StObject.set(x, "SegmentTypes", js.Array(value :_*))
    
    inline def setVideo(value: Video): Self = StObject.set(x, "Video", value.asInstanceOf[js.Any])
  }
}
