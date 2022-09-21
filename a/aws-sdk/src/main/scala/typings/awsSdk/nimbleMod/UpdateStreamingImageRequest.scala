package typings.awsSdk.nimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateStreamingImageRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don’t specify a client token, the AWS SDK automatically generates a client token and uses it for the request to ensure idempotency.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The description.
    */
  var description: js.UndefOr[StreamingImageDescription] = js.undefined
  
  /**
    * The name for the streaming image.
    */
  var name: js.UndefOr[StreamingImageName] = js.undefined
  
  /**
    * The streaming image ID.
    */
  var streamingImageId: String
  
  /**
    * The studio ID. 
    */
  var studioId: String
}
object UpdateStreamingImageRequest {
  
  inline def apply(streamingImageId: String, studioId: String): UpdateStreamingImageRequest = {
    val __obj = js.Dynamic.literal(streamingImageId = streamingImageId.asInstanceOf[js.Any], studioId = studioId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateStreamingImageRequest]
  }
  
  extension [Self <: UpdateStreamingImageRequest](x: Self) {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setDescription(value: StreamingImageDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: StreamingImageName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStreamingImageId(value: String): Self = StObject.set(x, "streamingImageId", value.asInstanceOf[js.Any])
    
    inline def setStudioId(value: String): Self = StObject.set(x, "studioId", value.asInstanceOf[js.Any])
  }
}
