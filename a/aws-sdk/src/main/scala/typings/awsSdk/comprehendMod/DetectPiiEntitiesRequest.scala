package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectPiiEntitiesRequest extends StObject {
  
  /**
    * The language of the input documents. Currently, English is the only valid language.
    */
  var LanguageCode: typings.awsSdk.comprehendMod.LanguageCode
  
  /**
    * A UTF-8 text string. The maximum string size is 100 KB.
    */
  var Text: String
}
object DetectPiiEntitiesRequest {
  
  inline def apply(LanguageCode: LanguageCode, Text: String): DetectPiiEntitiesRequest = {
    val __obj = js.Dynamic.literal(LanguageCode = LanguageCode.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectPiiEntitiesRequest]
  }
  
  extension [Self <: DetectPiiEntitiesRequest](x: Self) {
    
    inline def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
  }
}
