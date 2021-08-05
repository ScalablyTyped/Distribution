package typings.awsSdk.ioteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDetectorModelRequest extends StObject {
  
  /**
    * The name of the detector model to be deleted.
    */
  var detectorModelName: DetectorModelName
}
object DeleteDetectorModelRequest {
  
  inline def apply(detectorModelName: DetectorModelName): DeleteDetectorModelRequest = {
    val __obj = js.Dynamic.literal(detectorModelName = detectorModelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDetectorModelRequest]
  }
  
  extension [Self <: DeleteDetectorModelRequest](x: Self) {
    
    inline def setDetectorModelName(value: DetectorModelName): Self = StObject.set(x, "detectorModelName", value.asInstanceOf[js.Any])
  }
}
