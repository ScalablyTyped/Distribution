package typings.awsSdk.nimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteStreamingImageResponse extends StObject {
  
  /**
    * The streaming image.
    */
  var streamingImage: js.UndefOr[StreamingImage] = js.undefined
}
object DeleteStreamingImageResponse {
  
  inline def apply(): DeleteStreamingImageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteStreamingImageResponse]
  }
  
  extension [Self <: DeleteStreamingImageResponse](x: Self) {
    
    inline def setStreamingImage(value: StreamingImage): Self = StObject.set(x, "streamingImage", value.asInstanceOf[js.Any])
    
    inline def setStreamingImageUndefined: Self = StObject.set(x, "streamingImage", js.undefined)
  }
}
