package typings.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VocabularyFilterInfo extends js.Object {
  /**
    * The language code of the words in the vocabulary filter.
    */
  var LanguageCode: js.UndefOr[typings.awsSdk.transcribeserviceMod.LanguageCode] = js.native
  /**
    * The date and time that the vocabulary was last updated.
    */
  var LastModifiedTime: js.UndefOr[DateTime] = js.native
  /**
    * The name of the vocabulary filter. The name must be unique in the account that holds the filter.
    */
  var VocabularyFilterName: js.UndefOr[typings.awsSdk.transcribeserviceMod.VocabularyFilterName] = js.native
}

object VocabularyFilterInfo {
  @scala.inline
  def apply(
    LanguageCode: LanguageCode = null,
    LastModifiedTime: DateTime = null,
    VocabularyFilterName: VocabularyFilterName = null
  ): VocabularyFilterInfo = {
    val __obj = js.Dynamic.literal()
    if (LanguageCode != null) __obj.updateDynamic("LanguageCode")(LanguageCode.asInstanceOf[js.Any])
    if (LastModifiedTime != null) __obj.updateDynamic("LastModifiedTime")(LastModifiedTime.asInstanceOf[js.Any])
    if (VocabularyFilterName != null) __obj.updateDynamic("VocabularyFilterName")(VocabularyFilterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[VocabularyFilterInfo]
  }
}

