package typings.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVocabularyFilterRequest extends js.Object {
  /**
    * The name of the vocabulary filter for which to return information.
    */
  var VocabularyFilterName: typings.awsSdk.transcribeserviceMod.VocabularyFilterName = js.native
}

object GetVocabularyFilterRequest {
  @scala.inline
  def apply(VocabularyFilterName: VocabularyFilterName): GetVocabularyFilterRequest = {
    val __obj = js.Dynamic.literal(VocabularyFilterName = VocabularyFilterName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetVocabularyFilterRequest]
  }
}

