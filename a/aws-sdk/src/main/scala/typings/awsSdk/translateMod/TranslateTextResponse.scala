package typings.awsSdk.translateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TranslateTextResponse extends StObject {
  
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
  
  @scala.inline
  def apply(
    SourceLanguageCode: LanguageCodeString,
    TargetLanguageCode: LanguageCodeString,
    TranslatedText: String
  ): TranslateTextResponse = {
    val __obj = js.Dynamic.literal(SourceLanguageCode = SourceLanguageCode.asInstanceOf[js.Any], TargetLanguageCode = TargetLanguageCode.asInstanceOf[js.Any], TranslatedText = TranslatedText.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranslateTextResponse]
  }
  
  @scala.inline
  implicit class TranslateTextResponseMutableBuilder[Self <: TranslateTextResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppliedTerminologies(value: AppliedTerminologyList): Self = StObject.set(x, "AppliedTerminologies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppliedTerminologiesUndefined: Self = StObject.set(x, "AppliedTerminologies", js.undefined)
    
    @scala.inline
    def setAppliedTerminologiesVarargs(value: AppliedTerminology*): Self = StObject.set(x, "AppliedTerminologies", js.Array(value :_*))
    
    @scala.inline
    def setSourceLanguageCode(value: LanguageCodeString): Self = StObject.set(x, "SourceLanguageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetLanguageCode(value: LanguageCodeString): Self = StObject.set(x, "TargetLanguageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslatedText(value: String): Self = StObject.set(x, "TranslatedText", value.asInstanceOf[js.Any])
  }
}
