package typings.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VocabularyInfo extends js.Object {
  /**
    * The language code of the vocabulary entries.
    */
  var LanguageCode: js.UndefOr[typings.awsSdk.transcribeserviceMod.LanguageCode] = js.native
  /**
    * The date and time that the vocabulary was last modified.
    */
  var LastModifiedTime: js.UndefOr[DateTime] = js.native
  /**
    * The name of the vocabulary.
    */
  var VocabularyName: js.UndefOr[typings.awsSdk.transcribeserviceMod.VocabularyName] = js.native
  /**
    * The processing state of the vocabulary. If the state is READY you can use the vocabulary in a StartTranscriptionJob request.
    */
  var VocabularyState: js.UndefOr[typings.awsSdk.transcribeserviceMod.VocabularyState] = js.native
}

object VocabularyInfo {
  @scala.inline
  def apply(): VocabularyInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VocabularyInfo]
  }
  @scala.inline
  implicit class VocabularyInfoOps[Self <: VocabularyInfo] (val x: Self) extends AnyVal {
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
    def deleteLanguageCode: Self = this.set("LanguageCode", js.undefined)
    @scala.inline
    def setLastModifiedTime(value: DateTime): Self = this.set("LastModifiedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedTime: Self = this.set("LastModifiedTime", js.undefined)
    @scala.inline
    def setVocabularyName(value: VocabularyName): Self = this.set("VocabularyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVocabularyName: Self = this.set("VocabularyName", js.undefined)
    @scala.inline
    def setVocabularyState(value: VocabularyState): Self = this.set("VocabularyState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVocabularyState: Self = this.set("VocabularyState", js.undefined)
  }
  
}

