package typings.awsSdk.clientsTextractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpenseDetection extends StObject {
  
  /**
    * The confidence in detection, as a percentage
    */
  var Confidence: js.UndefOr[Percent] = js.undefined
  
  var Geometry: js.UndefOr[typings.awsSdk.clientsTextractMod.Geometry] = js.undefined
  
  /**
    * The word or line of text recognized by Amazon Textract
    */
  var Text: js.UndefOr[String] = js.undefined
}
object ExpenseDetection {
  
  inline def apply(): ExpenseDetection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpenseDetection]
  }
  
  extension [Self <: ExpenseDetection](x: Self) {
    
    inline def setConfidence(value: Percent): Self = StObject.set(x, "Confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "Confidence", js.undefined)
    
    inline def setGeometry(value: Geometry): Self = StObject.set(x, "Geometry", value.asInstanceOf[js.Any])
    
    inline def setGeometryUndefined: Self = StObject.set(x, "Geometry", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "Text", js.undefined)
  }
}
