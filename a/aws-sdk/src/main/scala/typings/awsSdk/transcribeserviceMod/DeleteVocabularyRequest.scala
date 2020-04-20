package typings.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteVocabularyRequest extends js.Object {
  /**
    * The name of the vocabulary to delete. 
    */
  var VocabularyName: typings.awsSdk.transcribeserviceMod.VocabularyName = js.native
}

object DeleteVocabularyRequest {
  @scala.inline
  def apply(VocabularyName: VocabularyName): DeleteVocabularyRequest = {
    val __obj = js.Dynamic.literal(VocabularyName = VocabularyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVocabularyRequest]
  }
}

