package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVocabularyFilterRequest extends StObject {
  
  /**
    * The language code of the words in the vocabulary filter. All words in the filter must be in the same language. The vocabulary filter can only be used with transcription jobs in the specified language.
    */
  var LanguageCode: typings.awsSdk.transcribeserviceMod.LanguageCode
  
  /**
    * The Amazon S3 location of a text file used as input to create the vocabulary filter. Only use characters from the character set defined for custom vocabularies. For a list of character sets, see Character Sets for Custom Vocabularies. The specified file must be less than 50 KB of UTF-8 characters. If you provide the location of a list of words in the VocabularyFilterFileUri parameter, you can't use the Words parameter.
    */
  var VocabularyFilterFileUri: js.UndefOr[Uri] = js.undefined
  
  /**
    * The vocabulary filter name. The name must be unique within the account that contains it. If you try to create a vocabulary filter with the same name as another vocabulary filter, you get a ConflictException error.
    */
  var VocabularyFilterName: typings.awsSdk.transcribeserviceMod.VocabularyFilterName
  
  /**
    * The words to use in the vocabulary filter. Only use characters from the character set defined for custom vocabularies. For a list of character sets, see Character Sets for Custom Vocabularies. If you provide a list of words in the Words parameter, you can't use the VocabularyFilterFileUri parameter.
    */
  var Words: js.UndefOr[typings.awsSdk.transcribeserviceMod.Words] = js.undefined
}
object CreateVocabularyFilterRequest {
  
  @scala.inline
  def apply(LanguageCode: LanguageCode, VocabularyFilterName: VocabularyFilterName): CreateVocabularyFilterRequest = {
    val __obj = js.Dynamic.literal(LanguageCode = LanguageCode.asInstanceOf[js.Any], VocabularyFilterName = VocabularyFilterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVocabularyFilterRequest]
  }
  
  @scala.inline
  implicit class CreateVocabularyFilterRequestMutableBuilder[Self <: CreateVocabularyFilterRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVocabularyFilterFileUri(value: Uri): Self = StObject.set(x, "VocabularyFilterFileUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVocabularyFilterFileUriUndefined: Self = StObject.set(x, "VocabularyFilterFileUri", js.undefined)
    
    @scala.inline
    def setVocabularyFilterName(value: VocabularyFilterName): Self = StObject.set(x, "VocabularyFilterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWords(value: Words): Self = StObject.set(x, "Words", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordsUndefined: Self = StObject.set(x, "Words", js.undefined)
    
    @scala.inline
    def setWordsVarargs(value: Word*): Self = StObject.set(x, "Words", js.Array(value :_*))
  }
}
