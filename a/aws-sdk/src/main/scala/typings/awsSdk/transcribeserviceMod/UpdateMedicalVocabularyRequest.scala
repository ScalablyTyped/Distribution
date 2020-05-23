package typings.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateMedicalVocabularyRequest extends js.Object {
  /**
    * The language code of the entries in the updated vocabulary. US English (en-US) is the only valid language code in Amazon Transcribe Medical.
    */
  var LanguageCode: typings.awsSdk.transcribeserviceMod.LanguageCode = js.native
  /**
    * The Amazon S3 location of the text file containing the definition of the custom vocabulary. The URI must be in the same AWS region as the API endpoint you are calling. You can see the fields you need to enter for you Amazon S3 location in the example URI here:   https://s3.&lt;aws-region&gt;.amazonaws.com/&lt;bucket-name&gt;/&lt;keyprefix&gt;/&lt;objectkey&gt;   For example:  https://s3.us-east-1.amazonaws.com/AWSDOC-EXAMPLE-BUCKET/vocab.txt  For more information about S3 object names, see Object Keys in the Amazon S3 Developer Guide. For more information about custom vocabularies in Amazon Transcribe Medical, see Medical Custom Vocabularies.
    */
  var VocabularyFileUri: js.UndefOr[Uri] = js.native
  /**
    * The name of the vocabulary to update. The name is case-sensitive. If you try to update a vocabulary with the same name as a previous vocabulary you will receive a ConflictException error.
    */
  var VocabularyName: typings.awsSdk.transcribeserviceMod.VocabularyName = js.native
}

object UpdateMedicalVocabularyRequest {
  @scala.inline
  def apply(LanguageCode: LanguageCode, VocabularyName: VocabularyName, VocabularyFileUri: Uri = null): UpdateMedicalVocabularyRequest = {
    val __obj = js.Dynamic.literal(LanguageCode = LanguageCode.asInstanceOf[js.Any], VocabularyName = VocabularyName.asInstanceOf[js.Any])
    if (VocabularyFileUri != null) __obj.updateDynamic("VocabularyFileUri")(VocabularyFileUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMedicalVocabularyRequest]
  }
}

