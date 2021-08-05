package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDetectorVersionResult extends StObject {
  
  /**
    * The ID for the created version's parent detector.
    */
  var detectorId: js.UndefOr[identifier] = js.undefined
  
  /**
    * The ID for the created detector. 
    */
  var detectorVersionId: js.UndefOr[nonEmptyString] = js.undefined
  
  /**
    * The status of the detector version.
    */
  var status: js.UndefOr[DetectorVersionStatus] = js.undefined
}
object CreateDetectorVersionResult {
  
  inline def apply(): CreateDetectorVersionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDetectorVersionResult]
  }
  
  extension [Self <: CreateDetectorVersionResult](x: Self) {
    
    inline def setDetectorId(value: identifier): Self = StObject.set(x, "detectorId", value.asInstanceOf[js.Any])
    
    inline def setDetectorIdUndefined: Self = StObject.set(x, "detectorId", js.undefined)
    
    inline def setDetectorVersionId(value: nonEmptyString): Self = StObject.set(x, "detectorVersionId", value.asInstanceOf[js.Any])
    
    inline def setDetectorVersionIdUndefined: Self = StObject.set(x, "detectorVersionId", js.undefined)
    
    inline def setStatus(value: DetectorVersionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
