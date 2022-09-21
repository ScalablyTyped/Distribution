package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageState extends StObject {
  
  /**
    * The reason for the image's status.
    */
  var reason: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The status of the image.
    */
  var status: js.UndefOr[ImageStatus] = js.undefined
}
object ImageState {
  
  inline def apply(): ImageState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageState]
  }
  
  extension [Self <: ImageState](x: Self) {
    
    inline def setReason(value: NonEmptyString): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setStatus(value: ImageStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
