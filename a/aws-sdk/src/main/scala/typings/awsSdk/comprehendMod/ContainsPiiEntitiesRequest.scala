package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainsPiiEntitiesRequest extends StObject {
  
  /**
    * The language of the input documents. Currently, English is the only valid language.
    */
  var LanguageCode: typings.awsSdk.comprehendMod.LanguageCode
  
  /**
    * Creates a new document classification request to analyze a single document in real-time, returning personally identifiable information (PII) entity labels.
    */
  var Text: String
}
object ContainsPiiEntitiesRequest {
  
  inline def apply(LanguageCode: LanguageCode, Text: String): ContainsPiiEntitiesRequest = {
    val __obj = js.Dynamic.literal(LanguageCode = LanguageCode.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainsPiiEntitiesRequest]
  }
  
  extension [Self <: ContainsPiiEntitiesRequest](x: Self) {
    
    inline def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
  }
}
