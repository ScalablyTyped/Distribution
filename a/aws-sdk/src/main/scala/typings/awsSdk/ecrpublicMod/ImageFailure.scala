package typings.awsSdk.ecrpublicMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageFailure extends StObject {
  
  /**
    * The code associated with the failure.
    */
  var failureCode: js.UndefOr[ImageFailureCode] = js.undefined
  
  /**
    * The reason for the failure.
    */
  var failureReason: js.UndefOr[ImageFailureReason] = js.undefined
  
  /**
    * The image ID associated with the failure.
    */
  var imageId: js.UndefOr[ImageIdentifier] = js.undefined
}
object ImageFailure {
  
  inline def apply(): ImageFailure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageFailure]
  }
  
  extension [Self <: ImageFailure](x: Self) {
    
    inline def setFailureCode(value: ImageFailureCode): Self = StObject.set(x, "failureCode", value.asInstanceOf[js.Any])
    
    inline def setFailureCodeUndefined: Self = StObject.set(x, "failureCode", js.undefined)
    
    inline def setFailureReason(value: ImageFailureReason): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "failureReason", js.undefined)
    
    inline def setImageId(value: ImageIdentifier): Self = StObject.set(x, "imageId", value.asInstanceOf[js.Any])
    
    inline def setImageIdUndefined: Self = StObject.set(x, "imageId", js.undefined)
  }
}
