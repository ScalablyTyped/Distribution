package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectTargetedSentimentRequest extends StObject {
  
  /**
    * The language of the input documents. Currently, English is the only supported language.
    */
  var LanguageCode: typings.awsSdk.comprehendMod.LanguageCode
  
  /**
    * A UTF-8 text string. The maximum string length is 5 KB.
    */
  var Text: CustomerInputString
}
object DetectTargetedSentimentRequest {
  
  inline def apply(LanguageCode: LanguageCode, Text: CustomerInputString): DetectTargetedSentimentRequest = {
    val __obj = js.Dynamic.literal(LanguageCode = LanguageCode.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectTargetedSentimentRequest]
  }
  
  extension [Self <: DetectTargetedSentimentRequest](x: Self) {
    
    inline def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setText(value: CustomerInputString): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
  }
}
