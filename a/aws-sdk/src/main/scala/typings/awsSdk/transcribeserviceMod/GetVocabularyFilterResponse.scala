package typings.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVocabularyFilterResponse extends js.Object {
  /**
    * The URI of the list of words in the vocabulary filter. You can use this URI to get the list of words.
    */
  var DownloadUri: js.UndefOr[Uri] = js.native
  /**
    * The language code of the words in the vocabulary filter.
    */
  var LanguageCode: js.UndefOr[typings.awsSdk.transcribeserviceMod.LanguageCode] = js.native
  /**
    * The date and time that the contents of the vocabulary filter were updated.
    */
  var LastModifiedTime: js.UndefOr[DateTime] = js.native
  /**
    * The name of the vocabulary filter.
    */
  var VocabularyFilterName: js.UndefOr[typings.awsSdk.transcribeserviceMod.VocabularyFilterName] = js.native
}

object GetVocabularyFilterResponse {
  @scala.inline
  def apply(
    DownloadUri: Uri = null,
    LanguageCode: LanguageCode = null,
    LastModifiedTime: DateTime = null,
    VocabularyFilterName: VocabularyFilterName = null
  ): GetVocabularyFilterResponse = {
    val __obj = js.Dynamic.literal()
    if (DownloadUri != null) __obj.updateDynamic("DownloadUri")(DownloadUri.asInstanceOf[js.Any])
    if (LanguageCode != null) __obj.updateDynamic("LanguageCode")(LanguageCode.asInstanceOf[js.Any])
    if (LastModifiedTime != null) __obj.updateDynamic("LastModifiedTime")(LastModifiedTime.asInstanceOf[js.Any])
    if (VocabularyFilterName != null) __obj.updateDynamic("VocabularyFilterName")(VocabularyFilterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVocabularyFilterResponse]
  }
}

