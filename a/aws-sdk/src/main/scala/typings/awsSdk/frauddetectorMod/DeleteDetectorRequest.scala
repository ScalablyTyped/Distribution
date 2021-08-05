package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDetectorRequest extends StObject {
  
  /**
    * The ID of the detector to delete.
    */
  var detectorId: identifier
}
object DeleteDetectorRequest {
  
  inline def apply(detectorId: identifier): DeleteDetectorRequest = {
    val __obj = js.Dynamic.literal(detectorId = detectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDetectorRequest]
  }
  
  extension [Self <: DeleteDetectorRequest](x: Self) {
    
    inline def setDetectorId(value: identifier): Self = StObject.set(x, "detectorId", value.asInstanceOf[js.Any])
  }
}
