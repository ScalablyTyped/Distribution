package typings.awsSdk.clientsTextractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentityDocumentField extends StObject {
  
  var Type: js.UndefOr[AnalyzeIDDetections] = js.undefined
  
  var ValueDetection: js.UndefOr[AnalyzeIDDetections] = js.undefined
}
object IdentityDocumentField {
  
  inline def apply(): IdentityDocumentField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityDocumentField]
  }
  
  extension [Self <: IdentityDocumentField](x: Self) {
    
    inline def setType(value: AnalyzeIDDetections): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setValueDetection(value: AnalyzeIDDetections): Self = StObject.set(x, "ValueDetection", value.asInstanceOf[js.Any])
    
    inline def setValueDetectionUndefined: Self = StObject.set(x, "ValueDetection", js.undefined)
  }
}
