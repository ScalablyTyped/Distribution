package typings.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateMedicalVocabularyRequest extends js.Object {
  /**
    * The language code used for the entries within your custom vocabulary. The language code of your custom vocabulary must match the language code of your transcription job. US English (en-US) is the only language code available for Amazon Transcribe Medical.
    */
  var LanguageCode: typings.awsSdk.transcribeserviceMod.LanguageCode = js.native
  /**
    * The Amazon S3 location of the text file you use to define your custom vocabulary. The URI must be in the same AWS region as the API endpoint you're calling. Enter information about your VocabularyFileUri in the following format:   https://s3.&lt;aws-region&gt;.amazonaws.com/&lt;bucket-name&gt;/&lt;keyprefix&gt;/&lt;objectkey&gt;   This is an example of a vocabulary file uri location in Amazon S3:  https://s3.us-east-1.amazonaws.com/AWSDOC-EXAMPLE-BUCKET/vocab.txt  For more information about S3 object names, see Object Keys in the Amazon S3 Developer Guide. For more information about custom vocabularies, see Medical Custom Vocabularies.
    */
  var VocabularyFileUri: Uri = js.native
  /**
    * The name of the custom vocabulary. This case-sensitive name must be unique within an AWS account. If you try to create a vocabulary with the same name as a previous vocabulary you will receive a ConflictException error.
    */
  var VocabularyName: typings.awsSdk.transcribeserviceMod.VocabularyName = js.native
}

object CreateMedicalVocabularyRequest {
  @scala.inline
  def apply(LanguageCode: LanguageCode, VocabularyFileUri: Uri, VocabularyName: VocabularyName): CreateMedicalVocabularyRequest = {
    val __obj = js.Dynamic.literal(LanguageCode = LanguageCode.asInstanceOf[js.Any], VocabularyFileUri = VocabularyFileUri.asInstanceOf[js.Any], VocabularyName = VocabularyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMedicalVocabularyRequest]
  }
  @scala.inline
  implicit class CreateMedicalVocabularyRequestOps[Self <: CreateMedicalVocabularyRequest] (val x: Self) extends AnyVal {
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
    def setVocabularyFileUri(value: Uri): Self = this.set("VocabularyFileUri", value.asInstanceOf[js.Any])
    @scala.inline
    def setVocabularyName(value: VocabularyName): Self = this.set("VocabularyName", value.asInstanceOf[js.Any])
  }
  
}

