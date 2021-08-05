package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCollectionResponse extends StObject {
  
  /**
    * HTTP status code that indicates the result of the operation.
    */
  var StatusCode: js.UndefOr[UInteger] = js.undefined
}
object DeleteCollectionResponse {
  
  inline def apply(): DeleteCollectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteCollectionResponse]
  }
  
  extension [Self <: DeleteCollectionResponse](x: Self) {
    
    inline def setStatusCode(value: UInteger): Self = StObject.set(x, "StatusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusCodeUndefined: Self = StObject.set(x, "StatusCode", js.undefined)
  }
}
