package typings.awsSdk.clientsTranscribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateMedicalVocabularyRequest extends StObject {
  
  /**
    * The language code that represents the language of the entries in the custom vocabulary you want to update. US English (en-US) is the only language supported with Amazon Transcribe Medical.
    */
  var LanguageCode: typings.awsSdk.clientsTranscribeserviceMod.LanguageCode
  
  /**
    * The Amazon S3 location of the text file that contains your custom medical vocabulary. The URI must be located in the same Amazon Web Services Region as the resource you're calling. Here's an example URI path: s3://DOC-EXAMPLE-BUCKET/my-vocab-file.txt 
    */
  var VocabularyFileUri: Uri
  
  /**
    * The name of the custom medical vocabulary you want to update. Custom medical vocabulary names are case sensitive.
    */
  var VocabularyName: typings.awsSdk.clientsTranscribeserviceMod.VocabularyName
}
object UpdateMedicalVocabularyRequest {
  
  inline def apply(LanguageCode: LanguageCode, VocabularyFileUri: Uri, VocabularyName: VocabularyName): UpdateMedicalVocabularyRequest = {
    val __obj = js.Dynamic.literal(LanguageCode = LanguageCode.asInstanceOf[js.Any], VocabularyFileUri = VocabularyFileUri.asInstanceOf[js.Any], VocabularyName = VocabularyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMedicalVocabularyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateMedicalVocabularyRequest] (val x: Self) extends AnyVal {
    
    inline def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setVocabularyFileUri(value: Uri): Self = StObject.set(x, "VocabularyFileUri", value.asInstanceOf[js.Any])
    
    inline def setVocabularyName(value: VocabularyName): Self = StObject.set(x, "VocabularyName", value.asInstanceOf[js.Any])
  }
}
