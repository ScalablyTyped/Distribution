package typings.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateVocabularyFilterRequest extends js.Object {
  
  /**
    * The language code of the words in the vocabulary filter. All words in the filter must be in the same language. The vocabulary filter can only be used with transcription jobs in the specified language.
    */
  var LanguageCode: typings.awsSdk.transcribeserviceMod.LanguageCode = js.native
  
  /**
    * The Amazon S3 location of a text file used as input to create the vocabulary filter. Only use characters from the character set defined for custom vocabularies. For a list of character sets, see Character Sets for Custom Vocabularies. The specified file must be less than 50 KB of UTF-8 characters. If you provide the location of a list of words in the VocabularyFilterFileUri parameter, you can't use the Words parameter.
    */
  var VocabularyFilterFileUri: js.UndefOr[Uri] = js.native
  
  /**
    * The vocabulary filter name. The name must be unique within the account that contains it. If you try to create a vocabulary filter with the same name as another vocabulary filter, you get a ConflictException error.
    */
  var VocabularyFilterName: typings.awsSdk.transcribeserviceMod.VocabularyFilterName = js.native
  
  /**
    * The words to use in the vocabulary filter. Only use characters from the character set defined for custom vocabularies. For a list of character sets, see Character Sets for Custom Vocabularies. If you provide a list of words in the Words parameter, you can't use the VocabularyFilterFileUri parameter.
    */
  var Words: js.UndefOr[typings.awsSdk.transcribeserviceMod.Words] = js.native
}
object CreateVocabularyFilterRequest {
  
  @scala.inline
  def apply(LanguageCode: LanguageCode, VocabularyFilterName: VocabularyFilterName): CreateVocabularyFilterRequest = {
    val __obj = js.Dynamic.literal(LanguageCode = LanguageCode.asInstanceOf[js.Any], VocabularyFilterName = VocabularyFilterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVocabularyFilterRequest]
  }
  
  @scala.inline
  implicit class CreateVocabularyFilterRequestOps[Self <: CreateVocabularyFilterRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLanguageCode(value: LanguageCode): Self = this.set("LanguageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVocabularyFilterName(value: VocabularyFilterName): Self = this.set("VocabularyFilterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVocabularyFilterFileUri(value: Uri): Self = this.set("VocabularyFilterFileUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVocabularyFilterFileUri: Self = this.set("VocabularyFilterFileUri", js.undefined)
    
    @scala.inline
    def setWordsVarargs(value: Word*): Self = this.set("Words", js.Array(value :_*))
    
    @scala.inline
    def setWords(value: Words): Self = this.set("Words", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWords: Self = this.set("Words", js.undefined)
  }
}
