package typings.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateVocabularyRequest extends js.Object {
  /**
    * The language code of the vocabulary entries.
    */
  var LanguageCode: typings.awsSdk.transcribeserviceMod.LanguageCode = js.native
  /**
    * An array of strings that contains the vocabulary entries. 
    */
  var Phrases: js.UndefOr[typings.awsSdk.transcribeserviceMod.Phrases] = js.native
  /**
    * The S3 location of the text file that contains the definition of the custom vocabulary. The URI must be in the same region as the API endpoint that you are calling. The general form is    https://s3.&lt;aws-region&gt;.amazonaws.com/&lt;bucket-name&gt;/&lt;keyprefix&gt;/&lt;objectkey&gt;   For example:  https://s3.us-east-1.amazonaws.com/examplebucket/vocab.txt  For more information about S3 object names, see Object Keys in the Amazon S3 Developer Guide. For more information about custom vocabularies, see Custom Vocabularies.
    */
  var VocabularyFileUri: js.UndefOr[Uri] = js.native
  /**
    * The name of the vocabulary. The name must be unique within an AWS account. The name is case-sensitive.
    */
  var VocabularyName: typings.awsSdk.transcribeserviceMod.VocabularyName = js.native
}

object CreateVocabularyRequest {
  @scala.inline
  def apply(
    LanguageCode: LanguageCode,
    VocabularyName: VocabularyName,
    Phrases: Phrases = null,
    VocabularyFileUri: Uri = null
  ): CreateVocabularyRequest = {
    val __obj = js.Dynamic.literal(LanguageCode = LanguageCode.asInstanceOf[js.Any], VocabularyName = VocabularyName.asInstanceOf[js.Any])
    if (Phrases != null) __obj.updateDynamic("Phrases")(Phrases.asInstanceOf[js.Any])
    if (VocabularyFileUri != null) __obj.updateDynamic("VocabularyFileUri")(VocabularyFileUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVocabularyRequest]
  }
}

