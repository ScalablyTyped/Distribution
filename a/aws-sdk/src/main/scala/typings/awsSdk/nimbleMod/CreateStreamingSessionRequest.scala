package typings.awsSdk.nimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateStreamingSessionRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don’t specify a client token, the AWS SDK automatically generates a client token and uses it for the request to ensure idempotency.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The EC2 Instance type used for the streaming session.
    */
  var ec2InstanceType: js.UndefOr[StreamingInstanceType] = js.undefined
  
  /**
    * The launch profile ID.
    */
  var launchProfileId: js.UndefOr[String] = js.undefined
  
  /**
    * The user ID of the user that owns the streaming session. The user that owns the session will be logging into the session and interacting with the virtual workstation.
    */
  var ownedBy: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the streaming image.
    */
  var streamingImageId: js.UndefOr[StreamingImageId] = js.undefined
  
  /**
    * The studio ID. 
    */
  var studioId: String
  
  /**
    * A collection of labels, in the form of key:value pairs, that apply to this resource.
    */
  var tags: js.UndefOr[Tags] = js.undefined
}
object CreateStreamingSessionRequest {
  
  inline def apply(studioId: String): CreateStreamingSessionRequest = {
    val __obj = js.Dynamic.literal(studioId = studioId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStreamingSessionRequest]
  }
  
  extension [Self <: CreateStreamingSessionRequest](x: Self) {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setEc2InstanceType(value: StreamingInstanceType): Self = StObject.set(x, "ec2InstanceType", value.asInstanceOf[js.Any])
    
    inline def setEc2InstanceTypeUndefined: Self = StObject.set(x, "ec2InstanceType", js.undefined)
    
    inline def setLaunchProfileId(value: String): Self = StObject.set(x, "launchProfileId", value.asInstanceOf[js.Any])
    
    inline def setLaunchProfileIdUndefined: Self = StObject.set(x, "launchProfileId", js.undefined)
    
    inline def setOwnedBy(value: String): Self = StObject.set(x, "ownedBy", value.asInstanceOf[js.Any])
    
    inline def setOwnedByUndefined: Self = StObject.set(x, "ownedBy", js.undefined)
    
    inline def setStreamingImageId(value: StreamingImageId): Self = StObject.set(x, "streamingImageId", value.asInstanceOf[js.Any])
    
    inline def setStreamingImageIdUndefined: Self = StObject.set(x, "streamingImageId", js.undefined)
    
    inline def setStudioId(value: String): Self = StObject.set(x, "studioId", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
