package typings.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMedicalVocabularyResponse extends js.Object {
  /**
    * The Amazon S3 location where the vocabulary is stored. Use this URI to get the contents of the vocabulary. You can download your vocabulary from the URI for a limited time.
    */
  var DownloadUri: js.UndefOr[Uri] = js.native
  /**
    * If the VocabularyState is FAILED, this field contains information about why the job failed.
    */
  var FailureReason: js.UndefOr[typings.awsSdk.transcribeserviceMod.FailureReason] = js.native
  /**
    * The valid language code returned for your vocabulary entries.
    */
  var LanguageCode: js.UndefOr[typings.awsSdk.transcribeserviceMod.LanguageCode] = js.native
  /**
    * The date and time the vocabulary was last modified with a text file different from what was previously used.
    */
  var LastModifiedTime: js.UndefOr[DateTime] = js.native
  /**
    * The valid name that Amazon Transcribe Medical returns.
    */
  var VocabularyName: js.UndefOr[typings.awsSdk.transcribeserviceMod.VocabularyName] = js.native
  /**
    * The processing state of the vocabulary.
    */
  var VocabularyState: js.UndefOr[typings.awsSdk.transcribeserviceMod.VocabularyState] = js.native
}

object GetMedicalVocabularyResponse {
  @scala.inline
  def apply(
    DownloadUri: Uri = null,
    FailureReason: FailureReason = null,
    LanguageCode: LanguageCode = null,
    LastModifiedTime: DateTime = null,
    VocabularyName: VocabularyName = null,
    VocabularyState: VocabularyState = null
  ): GetMedicalVocabularyResponse = {
    val __obj = js.Dynamic.literal()
    if (DownloadUri != null) __obj.updateDynamic("DownloadUri")(DownloadUri.asInstanceOf[js.Any])
    if (FailureReason != null) __obj.updateDynamic("FailureReason")(FailureReason.asInstanceOf[js.Any])
    if (LanguageCode != null) __obj.updateDynamic("LanguageCode")(LanguageCode.asInstanceOf[js.Any])
    if (LastModifiedTime != null) __obj.updateDynamic("LastModifiedTime")(LastModifiedTime.asInstanceOf[js.Any])
    if (VocabularyName != null) __obj.updateDynamic("VocabularyName")(VocabularyName.asInstanceOf[js.Any])
    if (VocabularyState != null) __obj.updateDynamic("VocabularyState")(VocabularyState.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMedicalVocabularyResponse]
  }
}

