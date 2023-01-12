package typings.awsSdk.clientsTextractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyzeIDDetections extends StObject {
  
  /**
    * The confidence score of the detected text.
    */
  var Confidence: js.UndefOr[Percent] = js.undefined
  
  /**
    * Only returned for dates, returns the type of value detected and the date written in a more machine readable way.
    */
  var NormalizedValue: js.UndefOr[typings.awsSdk.clientsTextractMod.NormalizedValue] = js.undefined
  
  /**
    * Text of either the normalized field or value associated with it.
    */
  var Text: String
}
object AnalyzeIDDetections {
  
  inline def apply(Text: String): AnalyzeIDDetections = {
    val __obj = js.Dynamic.literal(Text = Text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyzeIDDetections]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnalyzeIDDetections] (val x: Self) extends AnyVal {
    
    inline def setConfidence(value: Percent): Self = StObject.set(x, "Confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "Confidence", js.undefined)
    
    inline def setNormalizedValue(value: NormalizedValue): Self = StObject.set(x, "NormalizedValue", value.asInstanceOf[js.Any])
    
    inline def setNormalizedValueUndefined: Self = StObject.set(x, "NormalizedValue", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
  }
}
