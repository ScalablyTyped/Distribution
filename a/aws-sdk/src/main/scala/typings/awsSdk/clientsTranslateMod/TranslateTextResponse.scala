package typings.awsSdk.clientsTranslateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TranslateTextResponse extends StObject {
  
  /**
    * Settings that configure the translation output.
    */
  var AppliedSettings: js.UndefOr[TranslationSettings] = js.undefined
  
  /**
    * The names of the custom terminologies applied to the input text by Amazon Translate for the translated text response.
    */
  var AppliedTerminologies: js.UndefOr[AppliedTerminologyList] = js.undefined
  
  /**
    * The language code for the language of the source text.
    */
  var SourceLanguageCode: LanguageCodeString
  
  /**
    * The language code for the language of the target text. 
    */
  var TargetLanguageCode: LanguageCodeString
  
  /**
    * The translated text.
    */
  var TranslatedText: String
}
object TranslateTextResponse {
  
  inline def apply(
    SourceLanguageCode: LanguageCodeString,
    TargetLanguageCode: LanguageCodeString,
    TranslatedText: String
  ): TranslateTextResponse = {
    val __obj = js.Dynamic.literal(SourceLanguageCode = SourceLanguageCode.asInstanceOf[js.Any], TargetLanguageCode = TargetLanguageCode.asInstanceOf[js.Any], TranslatedText = TranslatedText.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranslateTextResponse]
  }
  
  extension [Self <: TranslateTextResponse](x: Self) {
    
    inline def setAppliedSettings(value: TranslationSettings): Self = StObject.set(x, "AppliedSettings", value.asInstanceOf[js.Any])
    
    inline def setAppliedSettingsUndefined: Self = StObject.set(x, "AppliedSettings", js.undefined)
    
    inline def setAppliedTerminologies(value: AppliedTerminologyList): Self = StObject.set(x, "AppliedTerminologies", value.asInstanceOf[js.Any])
    
    inline def setAppliedTerminologiesUndefined: Self = StObject.set(x, "AppliedTerminologies", js.undefined)
    
    inline def setAppliedTerminologiesVarargs(value: AppliedTerminology*): Self = StObject.set(x, "AppliedTerminologies", js.Array(value*))
    
    inline def setSourceLanguageCode(value: LanguageCodeString): Self = StObject.set(x, "SourceLanguageCode", value.asInstanceOf[js.Any])
    
    inline def setTargetLanguageCode(value: LanguageCodeString): Self = StObject.set(x, "TargetLanguageCode", value.asInstanceOf[js.Any])
    
    inline def setTranslatedText(value: String): Self = StObject.set(x, "TranslatedText", value.asInstanceOf[js.Any])
  }
}
