package typings.awsSdk.comprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InferSNOMEDCTRequest extends StObject {
  
  /**
    *  The input text to be analyzed using InferSNOMEDCT. The text should be a string with 1 to 10000 characters. 
    */
  var Text: OntologyLinkingBoundedLengthString
}
object InferSNOMEDCTRequest {
  
  inline def apply(Text: OntologyLinkingBoundedLengthString): InferSNOMEDCTRequest = {
    val __obj = js.Dynamic.literal(Text = Text.asInstanceOf[js.Any])
    __obj.asInstanceOf[InferSNOMEDCTRequest]
  }
  
  extension [Self <: InferSNOMEDCTRequest](x: Self) {
    
    inline def setText(value: OntologyLinkingBoundedLengthString): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
  }
}
