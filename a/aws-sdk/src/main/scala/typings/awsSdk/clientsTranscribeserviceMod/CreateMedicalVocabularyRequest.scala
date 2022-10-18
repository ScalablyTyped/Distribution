package typings.awsSdk.clientsTranscribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMedicalVocabularyRequest extends StObject {
  
  /**
    * The language code that represents the language of the entries in your custom vocabulary. US English (en-US) is the only language supported with Amazon Transcribe Medical.
    */
  var LanguageCode: typings.awsSdk.clientsTranscribeserviceMod.LanguageCode
  
  /**
    * Adds one or more custom tags, each in the form of a key:value pair, to a new medical vocabulary at the time you create this new vocabulary. To learn more about using tags with Amazon Transcribe, refer to Tagging resources.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The Amazon S3 location (URI) of the text file that contains your custom medical vocabulary. The URI must be in the same Amazon Web Services Region as the resource you're calling. Here's an example URI path: s3://DOC-EXAMPLE-BUCKET/my-vocab-file.txt 
    */
  var VocabularyFileUri: Uri
  
  /**
    * A unique name, chosen by you, for your new custom medical vocabulary. This name is case sensitive, cannot contain spaces, and must be unique within an Amazon Web Services account. If you try to create a new medical vocabulary with the same name as an existing medical vocabulary, you get a ConflictException error.
    */
  var VocabularyName: typings.awsSdk.clientsTranscribeserviceMod.VocabularyName
}
object CreateMedicalVocabularyRequest {
  
  inline def apply(LanguageCode: LanguageCode, VocabularyFileUri: Uri, VocabularyName: VocabularyName): CreateMedicalVocabularyRequest = {
    val __obj = js.Dynamic.literal(LanguageCode = LanguageCode.asInstanceOf[js.Any], VocabularyFileUri = VocabularyFileUri.asInstanceOf[js.Any], VocabularyName = VocabularyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMedicalVocabularyRequest]
  }
  
  extension [Self <: CreateMedicalVocabularyRequest](x: Self) {
    
    inline def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setVocabularyFileUri(value: Uri): Self = StObject.set(x, "VocabularyFileUri", value.asInstanceOf[js.Any])
    
    inline def setVocabularyName(value: VocabularyName): Self = StObject.set(x, "VocabularyName", value.asInstanceOf[js.Any])
  }
}
