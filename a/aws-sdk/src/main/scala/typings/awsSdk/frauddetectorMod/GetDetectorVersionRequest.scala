package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDetectorVersionRequest extends StObject {
  
  /**
    * The detector ID.
    */
  var detectorId: identifier
  
  /**
    * The detector version ID.
    */
  var detectorVersionId: wholeNumberVersionString
}
object GetDetectorVersionRequest {
  
  inline def apply(detectorId: identifier, detectorVersionId: wholeNumberVersionString): GetDetectorVersionRequest = {
    val __obj = js.Dynamic.literal(detectorId = detectorId.asInstanceOf[js.Any], detectorVersionId = detectorVersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDetectorVersionRequest]
  }
  
  extension [Self <: GetDetectorVersionRequest](x: Self) {
    
    inline def setDetectorId(value: identifier): Self = StObject.set(x, "detectorId", value.asInstanceOf[js.Any])
    
    inline def setDetectorVersionId(value: wholeNumberVersionString): Self = StObject.set(x, "detectorVersionId", value.asInstanceOf[js.Any])
  }
}
