package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMedicalVocabularyRequest extends StObject {
  
  /**
    * The language code for the language used for the entries in your custom vocabulary. The language code of your custom vocabulary must match the language code of your transcription job. US English (en-US) is the only language code available for Amazon Transcribe Medical.
    */
  var LanguageCode: typings.awsSdk.transcribeserviceMod.LanguageCode
  
  /**
    * The location in Amazon S3 of the text file you use to define your custom vocabulary. The URI must be in the same AWS Region as the resource that you're calling. Enter information about your VocabularyFileUri in the following format:   https://s3.&lt;aws-region&gt;.amazonaws.com/&lt;bucket-name&gt;/&lt;keyprefix&gt;/&lt;objectkey&gt;   The following is an example URI for a vocabulary file that is stored in Amazon S3:  https://s3.us-east-1.amazonaws.com/AWSDOC-EXAMPLE-BUCKET/vocab.txt  For more information about Amazon S3 object names, see Object Keys in the Amazon S3 Developer Guide. For more information about custom vocabularies, see Medical Custom Vocabularies.
    */
  var VocabularyFileUri: Uri
  
  /**
    * The name of the custom vocabulary. This case-sensitive name must be unique within an AWS account. If you try to create a vocabulary with the same name as a previous vocabulary, you get a ConflictException error.
    */
  var VocabularyName: typings.awsSdk.transcribeserviceMod.VocabularyName
}
object CreateMedicalVocabularyRequest {
  
  @scala.inline
  def apply(LanguageCode: LanguageCode, VocabularyFileUri: Uri, VocabularyName: VocabularyName): CreateMedicalVocabularyRequest = {
    val __obj = js.Dynamic.literal(LanguageCode = LanguageCode.asInstanceOf[js.Any], VocabularyFileUri = VocabularyFileUri.asInstanceOf[js.Any], VocabularyName = VocabularyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMedicalVocabularyRequest]
  }
  
  @scala.inline
  implicit class CreateMedicalVocabularyRequestMutableBuilder[Self <: CreateMedicalVocabularyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVocabularyFileUri(value: Uri): Self = StObject.set(x, "VocabularyFileUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVocabularyName(value: VocabularyName): Self = StObject.set(x, "VocabularyName", value.asInstanceOf[js.Any])
  }
}
