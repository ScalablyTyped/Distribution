package typings.awsSdk.ecrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetImageResponse extends StObject {
  
  /**
    * Any failures associated with the call.
    */
  var failures: js.UndefOr[ImageFailureList] = js.undefined
  
  /**
    * A list of image objects corresponding to the image references in the request.
    */
  var images: js.UndefOr[ImageList] = js.undefined
}
object BatchGetImageResponse {
  
  inline def apply(): BatchGetImageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetImageResponse]
  }
  
  extension [Self <: BatchGetImageResponse](x: Self) {
    
    inline def setFailures(value: ImageFailureList): Self = StObject.set(x, "failures", value.asInstanceOf[js.Any])
    
    inline def setFailuresUndefined: Self = StObject.set(x, "failures", js.undefined)
    
    inline def setFailuresVarargs(value: ImageFailure*): Self = StObject.set(x, "failures", js.Array(value*))
    
    inline def setImages(value: ImageList): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    inline def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
    
    inline def setImagesVarargs(value: Image*): Self = StObject.set(x, "images", js.Array(value*))
  }
}
