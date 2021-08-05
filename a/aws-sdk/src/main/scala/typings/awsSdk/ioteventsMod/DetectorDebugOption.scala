package typings.awsSdk.ioteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectorDebugOption extends StObject {
  
  /**
    * The name of the detector model.
    */
  var detectorModelName: DetectorModelName
  
  /**
    * The value of the input attribute key used to create the detector (the instance of the detector model).
    */
  var keyValue: js.UndefOr[KeyValue] = js.undefined
}
object DetectorDebugOption {
  
  inline def apply(detectorModelName: DetectorModelName): DetectorDebugOption = {
    val __obj = js.Dynamic.literal(detectorModelName = detectorModelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectorDebugOption]
  }
  
  extension [Self <: DetectorDebugOption](x: Self) {
    
    inline def setDetectorModelName(value: DetectorModelName): Self = StObject.set(x, "detectorModelName", value.asInstanceOf[js.Any])
    
    inline def setKeyValue(value: KeyValue): Self = StObject.set(x, "keyValue", value.asInstanceOf[js.Any])
    
    inline def setKeyValueUndefined: Self = StObject.set(x, "keyValue", js.undefined)
  }
}
