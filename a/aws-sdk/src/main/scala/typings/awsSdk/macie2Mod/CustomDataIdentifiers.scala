package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomDataIdentifiers extends StObject {
  
  /**
    * The custom data identifiers that detected the data, and the number of occurrences of the data that each identifier detected.
    */
  var detections: js.UndefOr[CustomDetections] = js.undefined
  
  /**
    * The total number of occurrences of the data that was detected by the custom data identifiers and produced the finding.
    */
  var totalCount: js.UndefOr[long] = js.undefined
}
object CustomDataIdentifiers {
  
  inline def apply(): CustomDataIdentifiers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomDataIdentifiers]
  }
  
  extension [Self <: CustomDataIdentifiers](x: Self) {
    
    inline def setDetections(value: CustomDetections): Self = StObject.set(x, "detections", value.asInstanceOf[js.Any])
    
    inline def setDetectionsUndefined: Self = StObject.set(x, "detections", js.undefined)
    
    inline def setDetectionsVarargs(value: CustomDetection*): Self = StObject.set(x, "detections", js.Array(value*))
    
    inline def setTotalCount(value: long): Self = StObject.set(x, "totalCount", value.asInstanceOf[js.Any])
    
    inline def setTotalCountUndefined: Self = StObject.set(x, "totalCount", js.undefined)
  }
}
