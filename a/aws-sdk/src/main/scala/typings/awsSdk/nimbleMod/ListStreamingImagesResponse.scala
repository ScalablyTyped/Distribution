package typings.awsSdk.nimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStreamingImagesResponse extends StObject {
  
  /**
    * The token for the next set of results, or null if there are no more results.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * A collection of streaming images.
    */
  var streamingImages: js.UndefOr[StreamingImageList] = js.undefined
}
object ListStreamingImagesResponse {
  
  inline def apply(): ListStreamingImagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStreamingImagesResponse]
  }
  
  extension [Self <: ListStreamingImagesResponse](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setStreamingImages(value: StreamingImageList): Self = StObject.set(x, "streamingImages", value.asInstanceOf[js.Any])
    
    inline def setStreamingImagesUndefined: Self = StObject.set(x, "streamingImages", js.undefined)
    
    inline def setStreamingImagesVarargs(value: StreamingImage*): Self = StObject.set(x, "streamingImages", js.Array(value*))
  }
}
