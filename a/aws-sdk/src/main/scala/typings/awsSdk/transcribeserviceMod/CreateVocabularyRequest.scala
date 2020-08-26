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
    * The S3 location of the text file that contains the definition of the custom vocabulary. The URI must be in the same region as the API endpoint that you are calling. The general form is  For more information about S3 object names, see Object Keys in the Amazon S3 Developer Guide. For more information about custom vocabularies, see Custom Vocabularies.
    */
  var VocabularyFileUri: js.UndefOr[Uri] = js.native
  /**
    * The name of the vocabulary. The name must be unique within an AWS account. The name is case-sensitive. If you try to create a vocabulary with the same name as a previous vocabulary you will receive a ConflictException error.
    */
  var VocabularyName: typings.awsSdk.transcribeserviceMod.VocabularyName = js.native
}

object CreateVocabularyRequest {
  @scala.inline
  def apply(LanguageCode: LanguageCode, VocabularyName: VocabularyName): CreateVocabularyRequest = {
    val __obj = js.Dynamic.literal(LanguageCode = LanguageCode.asInstanceOf[js.Any], VocabularyName = VocabularyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVocabularyRequest]
  }
  @scala.inline
  implicit class CreateVocabularyRequestOps[Self <: CreateVocabularyRequest] (val x: Self) extends AnyVal {
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
    def setVocabularyName(value: VocabularyName): Self = this.set("VocabularyName", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhrasesVarargs(value: Phrase*): Self = this.set("Phrases", js.Array(value :_*))
    @scala.inline
    def setPhrases(value: Phrases): Self = this.set("Phrases", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhrases: Self = this.set("Phrases", js.undefined)
    @scala.inline
    def setVocabularyFileUri(value: Uri): Self = this.set("VocabularyFileUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVocabularyFileUri: Self = this.set("VocabularyFileUri", js.undefined)
  }
  
}

