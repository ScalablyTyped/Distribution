package typings.awsSdk.ecrpublicMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDeleteImageResponse extends StObject {
  
  /**
    * Any failures associated with the call.
    */
  var failures: js.UndefOr[ImageFailureList] = js.undefined
  
  /**
    * The image IDs of the deleted images.
    */
  var imageIds: js.UndefOr[ImageIdentifierList] = js.undefined
}
object BatchDeleteImageResponse {
  
  inline def apply(): BatchDeleteImageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDeleteImageResponse]
  }
  
  extension [Self <: BatchDeleteImageResponse](x: Self) {
    
    inline def setFailures(value: ImageFailureList): Self = StObject.set(x, "failures", value.asInstanceOf[js.Any])
    
    inline def setFailuresUndefined: Self = StObject.set(x, "failures", js.undefined)
    
    inline def setFailuresVarargs(value: ImageFailure*): Self = StObject.set(x, "failures", js.Array(value*))
    
    inline def setImageIds(value: ImageIdentifierList): Self = StObject.set(x, "imageIds", value.asInstanceOf[js.Any])
    
    inline def setImageIdsUndefined: Self = StObject.set(x, "imageIds", js.undefined)
    
    inline def setImageIdsVarargs(value: ImageIdentifier*): Self = StObject.set(x, "imageIds", js.Array(value*))
  }
}
