package typings.awsSdk.clientsTranscribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LanguageIdSettings extends StObject {
  
  /**
    * The name of the custom language model you want to use when processing your transcription job. Note that language model names are case sensitive. The language of the specified language model must match the language code you specify in your transcription request. If the languages don't match, the language model isn't applied. There are no errors or warnings associated with a language mismatch.
    */
  var LanguageModelName: js.UndefOr[ModelName] = js.undefined
  
  /**
    * The name of the custom vocabulary filter you want to use when processing your transcription job. Vocabulary filter names are case sensitive. The language of the specified vocabulary filter must match the language code you specify in your transcription request. If the languages don't match, the vocabulary filter isn't applied. There are no errors or warnings associated with a language mismatch. Note that if you include VocabularyFilterName in your request, you must also include VocabularyFilterMethod.
    */
  var VocabularyFilterName: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.VocabularyFilterName] = js.undefined
  
  /**
    * The name of the custom vocabulary you want to use when processing your transcription job. Vocabulary names are case sensitive. The language of the specified vocabulary must match the language code you specify in your transcription request. If the languages don't match, the vocabulary isn't applied. There are no errors or warnings associated with a language mismatch.
    */
  var VocabularyName: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.VocabularyName] = js.undefined
}
object LanguageIdSettings {
  
  inline def apply(): LanguageIdSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LanguageIdSettings]
  }
  
  extension [Self <: LanguageIdSettings](x: Self) {
    
    inline def setLanguageModelName(value: ModelName): Self = StObject.set(x, "LanguageModelName", value.asInstanceOf[js.Any])
    
    inline def setLanguageModelNameUndefined: Self = StObject.set(x, "LanguageModelName", js.undefined)
    
    inline def setVocabularyFilterName(value: VocabularyFilterName): Self = StObject.set(x, "VocabularyFilterName", value.asInstanceOf[js.Any])
    
    inline def setVocabularyFilterNameUndefined: Self = StObject.set(x, "VocabularyFilterName", js.undefined)
    
    inline def setVocabularyName(value: VocabularyName): Self = StObject.set(x, "VocabularyName", value.asInstanceOf[js.Any])
    
    inline def setVocabularyNameUndefined: Self = StObject.set(x, "VocabularyName", js.undefined)
  }
}
