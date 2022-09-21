package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateVocabularyRequest extends StObject {
  
  /**
    * The language code that represents the language of the entries in the custom vocabulary you want to update. Each vocabulary must contain terms in only one language. A custom vocabulary can only be used to transcribe files in the same language as the vocabulary. For example, if you create a vocabulary using US English (en-US), you can only apply this vocabulary to files that contain English audio. For a list of supported languages and their associated language codes, refer to the Supported languages table.
    */
  var LanguageCode: typings.awsSdk.transcribeserviceMod.LanguageCode
  
  /**
    * Use this parameter if you want to update your vocabulary by including all desired terms, as comma-separated values, within your request. The other option for updating your vocabulary is to save your entries in a text file and upload them to an Amazon S3 bucket, then specify the location of your file using the VocabularyFileUri parameter. Note that if you include Phrases in your request, you cannot use VocabularyFileUri; you must choose one or the other. Each language has a character set that contains all allowed characters for that specific language. If you use unsupported characters, your vocabulary filter request fails. Refer to Character Sets for Custom Vocabularies to get the character set for your language.
    */
  var Phrases: js.UndefOr[typings.awsSdk.transcribeserviceMod.Phrases] = js.undefined
  
  /**
    * The Amazon S3 location of the text file that contains your custom vocabulary. The URI must be located in the same Amazon Web Services Region as the resource you're calling. Here's an example URI path: s3://DOC-EXAMPLE-BUCKET/my-vocab-file.txt  Note that if you include VocabularyFileUri in your request, you cannot use the Phrases flag; you must choose one or the other.
    */
  var VocabularyFileUri: js.UndefOr[Uri] = js.undefined
  
  /**
    * The name of the custom vocabulary you want to update. Vocabulary names are case sensitive.
    */
  var VocabularyName: typings.awsSdk.transcribeserviceMod.VocabularyName
}
object UpdateVocabularyRequest {
  
  inline def apply(LanguageCode: LanguageCode, VocabularyName: VocabularyName): UpdateVocabularyRequest = {
    val __obj = js.Dynamic.literal(LanguageCode = LanguageCode.asInstanceOf[js.Any], VocabularyName = VocabularyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateVocabularyRequest]
  }
  
  extension [Self <: UpdateVocabularyRequest](x: Self) {
    
    inline def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setPhrases(value: Phrases): Self = StObject.set(x, "Phrases", value.asInstanceOf[js.Any])
    
    inline def setPhrasesUndefined: Self = StObject.set(x, "Phrases", js.undefined)
    
    inline def setPhrasesVarargs(value: Phrase*): Self = StObject.set(x, "Phrases", js.Array(value*))
    
    inline def setVocabularyFileUri(value: Uri): Self = StObject.set(x, "VocabularyFileUri", value.asInstanceOf[js.Any])
    
    inline def setVocabularyFileUriUndefined: Self = StObject.set(x, "VocabularyFileUri", js.undefined)
    
    inline def setVocabularyName(value: VocabularyName): Self = StObject.set(x, "VocabularyName", value.asInstanceOf[js.Any])
  }
}
