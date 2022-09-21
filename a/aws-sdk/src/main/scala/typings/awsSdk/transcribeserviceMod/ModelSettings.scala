package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelSettings extends StObject {
  
  /**
    * The name of the custom language model you want to use when processing your transcription job. Note that language model names are case sensitive. The language of the specified language model must match the language code you specify in your transcription request. If the languages don't match, the language model isn't applied. There are no errors or warnings associated with a language mismatch.
    */
  var LanguageModelName: js.UndefOr[ModelName] = js.undefined
}
object ModelSettings {
  
  inline def apply(): ModelSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelSettings]
  }
  
  extension [Self <: ModelSettings](x: Self) {
    
    inline def setLanguageModelName(value: ModelName): Self = StObject.set(x, "LanguageModelName", value.asInstanceOf[js.Any])
    
    inline def setLanguageModelNameUndefined: Self = StObject.set(x, "LanguageModelName", js.undefined)
  }
}
