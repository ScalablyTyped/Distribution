package typings.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteVocabularyFilterRequest extends js.Object {
  /**
    * The name of the vocabulary filter to remove.
    */
  var VocabularyFilterName: typings.awsSdk.transcribeserviceMod.VocabularyFilterName = js.native
}

object DeleteVocabularyFilterRequest {
  @scala.inline
  def apply(VocabularyFilterName: VocabularyFilterName): DeleteVocabularyFilterRequest = {
    val __obj = js.Dynamic.literal(VocabularyFilterName = VocabularyFilterName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteVocabularyFilterRequest]
  }
}

