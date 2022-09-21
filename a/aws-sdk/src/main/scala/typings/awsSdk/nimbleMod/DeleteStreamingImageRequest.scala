package typings.awsSdk.nimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteStreamingImageRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don’t specify a client token, the AWS SDK automatically generates a client token and uses it for the request to ensure idempotency.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The streaming image ID.
    */
  var streamingImageId: String
  
  /**
    * The studio ID. 
    */
  var studioId: String
}
object DeleteStreamingImageRequest {
  
  inline def apply(streamingImageId: String, studioId: String): DeleteStreamingImageRequest = {
    val __obj = js.Dynamic.literal(streamingImageId = streamingImageId.asInstanceOf[js.Any], studioId = studioId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteStreamingImageRequest]
  }
  
  extension [Self <: DeleteStreamingImageRequest](x: Self) {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setStreamingImageId(value: String): Self = StObject.set(x, "streamingImageId", value.asInstanceOf[js.Any])
    
    inline def setStudioId(value: String): Self = StObject.set(x, "studioId", value.asInstanceOf[js.Any])
  }
}
