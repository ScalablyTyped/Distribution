package typings.awsSdk.clientsTextractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Prediction extends StObject {
  
  /**
    * Amazon Textract's confidence in its predicted value.
    */
  var Confidence: js.UndefOr[Percent] = js.undefined
  
  /**
    * The predicted value of a detected object.
    */
  var Value: js.UndefOr[NonEmptyString] = js.undefined
}
object Prediction {
  
  inline def apply(): Prediction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Prediction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Prediction] (val x: Self) extends AnyVal {
    
    inline def setConfidence(value: Percent): Self = StObject.set(x, "Confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "Confidence", js.undefined)
    
    inline def setValue(value: NonEmptyString): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
