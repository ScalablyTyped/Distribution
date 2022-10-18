package typings.awsSdk.clientsTextractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpenseType extends StObject {
  
  /**
    * The confidence of accuracy, as a percentage.
    */
  var Confidence: js.UndefOr[Percent] = js.undefined
  
  /**
    * The word or line of text detected by Amazon Textract.
    */
  var Text: js.UndefOr[String] = js.undefined
}
object ExpenseType {
  
  inline def apply(): ExpenseType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpenseType]
  }
  
  extension [Self <: ExpenseType](x: Self) {
    
    inline def setConfidence(value: Percent): Self = StObject.set(x, "Confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "Confidence", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "Text", js.undefined)
  }
}
