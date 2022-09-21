package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVocabularyFilterRequest extends StObject {
  
  /**
    * The language code that represents the language of the entries in your vocabulary filter. Each vocabulary filter must contain terms in only one language. A vocabulary filter can only be used to transcribe files in the same language as the filter. For example, if you create a vocabulary filter using US English (en-US), you can only apply this filter to files that contain English audio. For a list of supported languages and their associated language codes, refer to the Supported languages table.
    */
  var LanguageCode: typings.awsSdk.transcribeserviceMod.LanguageCode
  
  /**
    * Adds one or more custom tags, each in the form of a key:value pair, to a new custom vocabulary filter at the time you create this new filter. To learn more about using tags with Amazon Transcribe, refer to Tagging resources.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The Amazon S3 location of the text file that contains your custom vocabulary filter terms. The URI must be located in the same Amazon Web Services Region as the resource you're calling. Here's an example URI path: s3://DOC-EXAMPLE-BUCKET/my-vocab-filter-file.txt  Note that if you include VocabularyFilterFileUri in your request, you cannot use Words; you must choose one or the other.
    */
  var VocabularyFilterFileUri: js.UndefOr[Uri] = js.undefined
  
  /**
    * A unique name, chosen by you, for your new custom vocabulary filter. This name is case sensitive, cannot contain spaces, and must be unique within an Amazon Web Services account. If you try to create a new vocabulary filter with the same name as an existing vocabulary filter, you get a ConflictException error.
    */
  var VocabularyFilterName: typings.awsSdk.transcribeserviceMod.VocabularyFilterName
  
  /**
    * Use this parameter if you want to create your vocabulary filter by including all desired terms, as comma-separated values, within your request. The other option for creating your vocabulary filter is to save your entries in a text file and upload them to an Amazon S3 bucket, then specify the location of your file using the VocabularyFilterFileUri parameter. Note that if you include Words in your request, you cannot use VocabularyFilterFileUri; you must choose one or the other. Each language has a character set that contains all allowed characters for that specific language. If you use unsupported characters, your vocabulary filter request fails. Refer to Character Sets for Custom Vocabularies to get the character set for your language.
    */
  var Words: js.UndefOr[typings.awsSdk.transcribeserviceMod.Words] = js.undefined
}
object CreateVocabularyFilterRequest {
  
  inline def apply(LanguageCode: LanguageCode, VocabularyFilterName: VocabularyFilterName): CreateVocabularyFilterRequest = {
    val __obj = js.Dynamic.literal(LanguageCode = LanguageCode.asInstanceOf[js.Any], VocabularyFilterName = VocabularyFilterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVocabularyFilterRequest]
  }
  
  extension [Self <: CreateVocabularyFilterRequest](x: Self) {
    
    inline def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setVocabularyFilterFileUri(value: Uri): Self = StObject.set(x, "VocabularyFilterFileUri", value.asInstanceOf[js.Any])
    
    inline def setVocabularyFilterFileUriUndefined: Self = StObject.set(x, "VocabularyFilterFileUri", js.undefined)
    
    inline def setVocabularyFilterName(value: VocabularyFilterName): Self = StObject.set(x, "VocabularyFilterName", value.asInstanceOf[js.Any])
    
    inline def setWords(value: Words): Self = StObject.set(x, "Words", value.asInstanceOf[js.Any])
    
    inline def setWordsUndefined: Self = StObject.set(x, "Words", js.undefined)
    
    inline def setWordsVarargs(value: Word*): Self = StObject.set(x, "Words", js.Array(value*))
  }
}
