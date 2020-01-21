package typings.awsSdk.comprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InferICD10CMRequest extends js.Object {
  /**
    * The input text used for analysis. The input for InferICD10CM is a string from 1 to 10000 characters.
    */
  var Text: OntologyLinkingBoundedLengthString = js.native
}

object InferICD10CMRequest {
  @scala.inline
  def apply(Text: OntologyLinkingBoundedLengthString): InferICD10CMRequest = {
    val __obj = js.Dynamic.literal(Text = Text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InferICD10CMRequest]
  }
}

