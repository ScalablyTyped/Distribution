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
  def apply(): GetVocabularyFilterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVocabularyFilterResponse]
  }
  @scala.inline
  implicit class GetVocabularyFilterResponseOps[Self <: GetVocabularyFilterResponse] (val x: Self) extends AnyVal {
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
    def setDownloadUri(value: Uri): Self = this.set("DownloadUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDownloadUri: Self = this.set("DownloadUri", js.undefined)
    @scala.inline
    def setLanguageCode(value: LanguageCode): Self = this.set("LanguageCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguageCode: Self = this.set("LanguageCode", js.undefined)
    @scala.inline
    def setLastModifiedTime(value: DateTime): Self = this.set("LastModifiedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedTime: Self = this.set("LastModifiedTime", js.undefined)
    @scala.inline
    def setVocabularyFilterName(value: VocabularyFilterName): Self = this.set("VocabularyFilterName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVocabularyFilterName: Self = this.set("VocabularyFilterName", js.undefined)
  }
  
}

