package typings.awsSdk.clientsTranscribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallAnalyticsJobSettings extends StObject {
  
  var ContentRedaction: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.ContentRedaction] = js.undefined
  
  /**
    * If using automatic language identification in your request and you want to apply a custom language model, a custom vocabulary, or a custom vocabulary filter, include LanguageIdSettings with the relevant sub-parameters (VocabularyName, LanguageModelName, and VocabularyFilterName).  LanguageIdSettings supports two to five language codes. Each language code you include can have an associated custom language model, custom vocabulary, and custom vocabulary filter. The language codes that you specify must match the languages of the associated custom language models, custom vocabularies, and custom vocabulary filters. It's recommended that you include LanguageOptions when using LanguageIdSettings to ensure that the correct language dialect is identified. For example, if you specify a custom vocabulary that is in en-US but Amazon Transcribe determines that the language spoken in your media is en-AU, your custom vocabulary is not applied to your transcription. If you include LanguageOptions and include en-US as the only English language dialect, your custom vocabulary is applied to your transcription. If you want to include a custom language model, custom vocabulary, or custom vocabulary filter with your request but do not want to use automatic language identification, use instead the  parameter with the LanguageModelName, VocabularyName, or VocabularyFilterName sub-parameters. For a list of languages supported with Call Analytics, refer to Supported languages and language-specific features.
    */
  var LanguageIdSettings: js.UndefOr[LanguageIdSettingsMap] = js.undefined
  
  /**
    * The name of the custom language model you want to use when processing your Call Analytics job. Note that custom language model names are case sensitive. The language of the specified custom language model must match the language code that you specify in your transcription request. If the languages don't match, the custom language model isn't applied. There are no errors or warnings associated with a language mismatch.
    */
  var LanguageModelName: js.UndefOr[ModelName] = js.undefined
  
  /**
    * You can specify two or more language codes that represent the languages you think may be present in your media. Including more than five is not recommended. If you're unsure what languages are present, do not include this parameter. Including language options can improve the accuracy of language identification. For a list of languages supported with Call Analytics, refer to the Supported languages table. To transcribe speech in Modern Standard Arabic (ar-SA), your media file must be encoded at a sample rate of 16,000 Hz or higher.
    */
  var LanguageOptions: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.LanguageOptions] = js.undefined
  
  /**
    * Specify how you want your custom vocabulary filter applied to your transcript. To replace words with ***, choose mask. To delete words, choose remove. To flag words without changing them, choose tag.
    */
  var VocabularyFilterMethod: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.VocabularyFilterMethod] = js.undefined
  
  /**
    * The name of the custom vocabulary filter you want to include in your Call Analytics transcription request. Custom vocabulary filter names are case sensitive. Note that if you include VocabularyFilterName in your request, you must also include VocabularyFilterMethod.
    */
  var VocabularyFilterName: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.VocabularyFilterName] = js.undefined
  
  /**
    * The name of the custom vocabulary you want to include in your Call Analytics transcription request. Custom vocabulary names are case sensitive.
    */
  var VocabularyName: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.VocabularyName] = js.undefined
}
object CallAnalyticsJobSettings {
  
  inline def apply(): CallAnalyticsJobSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallAnalyticsJobSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CallAnalyticsJobSettings] (val x: Self) extends AnyVal {
    
    inline def setContentRedaction(value: ContentRedaction): Self = StObject.set(x, "ContentRedaction", value.asInstanceOf[js.Any])
    
    inline def setContentRedactionUndefined: Self = StObject.set(x, "ContentRedaction", js.undefined)
    
    inline def setLanguageIdSettings(value: LanguageIdSettingsMap): Self = StObject.set(x, "LanguageIdSettings", value.asInstanceOf[js.Any])
    
    inline def setLanguageIdSettingsUndefined: Self = StObject.set(x, "LanguageIdSettings", js.undefined)
    
    inline def setLanguageModelName(value: ModelName): Self = StObject.set(x, "LanguageModelName", value.asInstanceOf[js.Any])
    
    inline def setLanguageModelNameUndefined: Self = StObject.set(x, "LanguageModelName", js.undefined)
    
    inline def setLanguageOptions(value: LanguageOptions): Self = StObject.set(x, "LanguageOptions", value.asInstanceOf[js.Any])
    
    inline def setLanguageOptionsUndefined: Self = StObject.set(x, "LanguageOptions", js.undefined)
    
    inline def setLanguageOptionsVarargs(value: LanguageCode*): Self = StObject.set(x, "LanguageOptions", js.Array(value*))
    
    inline def setVocabularyFilterMethod(value: VocabularyFilterMethod): Self = StObject.set(x, "VocabularyFilterMethod", value.asInstanceOf[js.Any])
    
    inline def setVocabularyFilterMethodUndefined: Self = StObject.set(x, "VocabularyFilterMethod", js.undefined)
    
    inline def setVocabularyFilterName(value: VocabularyFilterName): Self = StObject.set(x, "VocabularyFilterName", value.asInstanceOf[js.Any])
    
    inline def setVocabularyFilterNameUndefined: Self = StObject.set(x, "VocabularyFilterName", js.undefined)
    
    inline def setVocabularyName(value: VocabularyName): Self = StObject.set(x, "VocabularyName", value.asInstanceOf[js.Any])
    
    inline def setVocabularyNameUndefined: Self = StObject.set(x, "VocabularyName", js.undefined)
  }
}
