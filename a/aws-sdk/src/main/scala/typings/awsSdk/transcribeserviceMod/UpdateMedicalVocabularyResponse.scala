package typings.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateMedicalVocabularyResponse extends js.Object {
  /**
    * The language code for the text file used to update the custom vocabulary. US English (en-US) is the only language supported in Amazon Transcribe Medical.
    */
  var LanguageCode: js.UndefOr[typings.awsSdk.transcribeserviceMod.LanguageCode] = js.native
  /**
    * The date and time the vocabulary was updated.
    */
  var LastModifiedTime: js.UndefOr[DateTime] = js.native
  /**
    * The name of the updated vocabulary.
    */
  var VocabularyName: js.UndefOr[typings.awsSdk.transcribeserviceMod.VocabularyName] = js.native
  /**
    * The processing state of the update to the vocabulary. When the VocabularyState field is READY the vocabulary is ready to be used in a StartMedicalTranscriptionJob request.
    */
  var VocabularyState: js.UndefOr[typings.awsSdk.transcribeserviceMod.VocabularyState] = js.native
}

object UpdateMedicalVocabularyResponse {
  @scala.inline
  def apply(
    LanguageCode: LanguageCode = null,
    LastModifiedTime: DateTime = null,
    VocabularyName: VocabularyName = null,
    VocabularyState: VocabularyState = null
  ): UpdateMedicalVocabularyResponse = {
    val __obj = js.Dynamic.literal()
    if (LanguageCode != null) __obj.updateDynamic("LanguageCode")(LanguageCode.asInstanceOf[js.Any])
    if (LastModifiedTime != null) __obj.updateDynamic("LastModifiedTime")(LastModifiedTime.asInstanceOf[js.Any])
    if (VocabularyName != null) __obj.updateDynamic("VocabularyName")(VocabularyName.asInstanceOf[js.Any])
    if (VocabularyState != null) __obj.updateDynamic("VocabularyState")(VocabularyState.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMedicalVocabularyResponse]
  }
}

