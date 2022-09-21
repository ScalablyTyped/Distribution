package typings.awsSdk.nimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStreamingImageResponse extends StObject {
  
  /**
    * The streaming image.
    */
  var streamingImage: js.UndefOr[StreamingImage] = js.undefined
}
object GetStreamingImageResponse {
  
  inline def apply(): GetStreamingImageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetStreamingImageResponse]
  }
  
  extension [Self <: GetStreamingImageResponse](x: Self) {
    
    inline def setStreamingImage(value: StreamingImage): Self = StObject.set(x, "streamingImage", value.asInstanceOf[js.Any])
    
    inline def setStreamingImageUndefined: Self = StObject.set(x, "streamingImage", js.undefined)
  }
}
