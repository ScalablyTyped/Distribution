package typings.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMedicalVocabularyRequest extends js.Object {
  /**
    * The name of the vocabulary you are trying to get information about. The value you enter for this request is case-sensitive. 
    */
  var VocabularyName: typings.awsSdk.transcribeserviceMod.VocabularyName = js.native
}

object GetMedicalVocabularyRequest {
  @scala.inline
  def apply(VocabularyName: VocabularyName): GetMedicalVocabularyRequest = {
    val __obj = js.Dynamic.literal(VocabularyName = VocabularyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMedicalVocabularyRequest]
  }
  @scala.inline
  implicit class GetMedicalVocabularyRequestOps[Self <: GetMedicalVocabularyRequest] (val x: Self) extends AnyVal {
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
    def setVocabularyName(value: VocabularyName): Self = this.set("VocabularyName", value.asInstanceOf[js.Any])
  }
  
}

