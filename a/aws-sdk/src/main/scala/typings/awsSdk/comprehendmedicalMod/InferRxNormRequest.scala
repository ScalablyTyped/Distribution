package typings.awsSdk.comprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InferRxNormRequest extends js.Object {
  /**
    * The input text used for analysis. The input for InferRxNorm is a string from 1 to 10000 characters.
    */
  var Text: OntologyLinkingBoundedLengthString = js.native
}

object InferRxNormRequest {
  @scala.inline
  def apply(Text: OntologyLinkingBoundedLengthString): InferRxNormRequest = {
    val __obj = js.Dynamic.literal(Text = Text.asInstanceOf[js.Any])
    __obj.asInstanceOf[InferRxNormRequest]
  }
  @scala.inline
  implicit class InferRxNormRequestOps[Self <: InferRxNormRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setText(value: OntologyLinkingBoundedLengthString): Self = this.set("Text", value.asInstanceOf[js.Any])
  }
  
}

