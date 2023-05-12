package typings.awsSdk.clientsTextractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignatureDetection extends StObject {
  
  /**
    * The confidence, from 0 to 100, in the predicted values for a detected signature.
    */
  var Confidence: js.UndefOr[Percent] = js.undefined
  
  var Geometry: js.UndefOr[typings.awsSdk.clientsTextractMod.Geometry] = js.undefined
}
object SignatureDetection {
  
  inline def apply(): SignatureDetection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignatureDetection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SignatureDetection] (val x: Self) extends AnyVal {
    
    inline def setConfidence(value: Percent): Self = StObject.set(x, "Confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "Confidence", js.undefined)
    
    inline def setGeometry(value: Geometry): Self = StObject.set(x, "Geometry", value.asInstanceOf[js.Any])
    
    inline def setGeometryUndefined: Self = StObject.set(x, "Geometry", js.undefined)
  }
}
