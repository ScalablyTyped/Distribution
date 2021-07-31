package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateVocabularyFilterRequest extends StObject {
  
  /**
    * The Amazon S3 location of a text file used as input to create the vocabulary filter. Only use characters from the character set defined for custom vocabularies. For a list of character sets, see Character Sets for Custom Vocabularies. The specified file must be less than 50 KB of UTF-8 characters. If you provide the location of a list of words in the VocabularyFilterFileUri parameter, you can't use the Words parameter.
    */
  var VocabularyFilterFileUri: js.UndefOr[Uri] = js.undefined
  
  /**
    * The name of the vocabulary filter to update. If you try to update a vocabulary filter with the same name as another vocabulary filter, you get a ConflictException error.
    */
  var VocabularyFilterName: typings.awsSdk.transcribeserviceMod.VocabularyFilterName
  
  /**
    * The words to use in the vocabulary filter. Only use characters from the character set defined for custom vocabularies. For a list of character sets, see Character Sets for Custom Vocabularies. If you provide a list of words in the Words parameter, you can't use the VocabularyFilterFileUri parameter.
    */
  var Words: js.UndefOr[typings.awsSdk.transcribeserviceMod.Words] = js.undefined
}
object UpdateVocabularyFilterRequest {
  
  @scala.inline
  def apply(VocabularyFilterName: VocabularyFilterName): UpdateVocabularyFilterRequest = {
    val __obj = js.Dynamic.literal(VocabularyFilterName = VocabularyFilterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateVocabularyFilterRequest]
  }
  
  @scala.inline
  implicit class UpdateVocabularyFilterRequestMutableBuilder[Self <: UpdateVocabularyFilterRequest] (val x: Self) extends AnyVal {
    
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
