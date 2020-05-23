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
}

