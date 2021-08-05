package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartFaceSearchRequest extends StObject {
  
  /**
    * Idempotent token used to identify the start request. If you use the same token with multiple StartFaceSearch requests, the same JobId is returned. Use ClientRequestToken to prevent the same job from being accidently started more than once. 
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.rekognitionMod.ClientRequestToken] = js.undefined
  
  /**
    * ID of the collection that contains the faces you want to search for.
    */
  var CollectionId: typings.awsSdk.rekognitionMod.CollectionId
  
  /**
    * The minimum confidence in the person match to return. For example, don't return any matches where confidence in matches is less than 70%. The default value is 80%.
    */
  var FaceMatchThreshold: js.UndefOr[Percent] = js.undefined
  
  /**
    * An identifier you specify that's returned in the completion notification that's published to your Amazon Simple Notification Service topic. For example, you can use JobTag to group related jobs and identify them in the completion notification.
    */
  var JobTag: js.UndefOr[typings.awsSdk.rekognitionMod.JobTag] = js.undefined
  
  /**
    * The ARN of the Amazon SNS topic to which you want Amazon Rekognition Video to publish the completion status of the search. 
    */
  var NotificationChannel: js.UndefOr[typings.awsSdk.rekognitionMod.NotificationChannel] = js.undefined
  
  /**
    * The video you want to search. The video must be stored in an Amazon S3 bucket. 
    */
  var Video: typings.awsSdk.rekognitionMod.Video
}
object StartFaceSearchRequest {
  
  inline def apply(CollectionId: CollectionId, Video: Video): StartFaceSearchRequest = {
    val __obj = js.Dynamic.literal(CollectionId = CollectionId.asInstanceOf[js.Any], Video = Video.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartFaceSearchRequest]
  }
  
  extension [Self <: StartFaceSearchRequest](x: Self) {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setCollectionId(value: CollectionId): Self = StObject.set(x, "CollectionId", value.asInstanceOf[js.Any])
    
    inline def setFaceMatchThreshold(value: Percent): Self = StObject.set(x, "FaceMatchThreshold", value.asInstanceOf[js.Any])
    
    inline def setFaceMatchThresholdUndefined: Self = StObject.set(x, "FaceMatchThreshold", js.undefined)
    
    inline def setJobTag(value: JobTag): Self = StObject.set(x, "JobTag", value.asInstanceOf[js.Any])
    
    inline def setJobTagUndefined: Self = StObject.set(x, "JobTag", js.undefined)
    
    inline def setNotificationChannel(value: NotificationChannel): Self = StObject.set(x, "NotificationChannel", value.asInstanceOf[js.Any])
    
    inline def setNotificationChannelUndefined: Self = StObject.set(x, "NotificationChannel", js.undefined)
    
    inline def setVideo(value: Video): Self = StObject.set(x, "Video", value.asInstanceOf[js.Any])
  }
}
