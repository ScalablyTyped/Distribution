package typings.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteMedicalVocabularyRequest extends js.Object {
  /**
    * The name of the vocabulary you are choosing to delete.
    */
  var VocabularyName: typings.awsSdk.transcribeserviceMod.VocabularyName = js.native
}

object DeleteMedicalVocabularyRequest {
  @scala.inline
  def apply(VocabularyName: VocabularyName): DeleteMedicalVocabularyRequest = {
    val __obj = js.Dynamic.literal(VocabularyName = VocabularyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMedicalVocabularyRequest]
  }
}

