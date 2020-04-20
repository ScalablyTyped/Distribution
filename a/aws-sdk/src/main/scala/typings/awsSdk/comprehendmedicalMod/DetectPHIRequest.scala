package typings.awsSdk.comprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectPHIRequest extends js.Object {
  /**
    *  A UTF-8 text string containing the clinical content being examined for PHI entities. Each string must contain fewer than 20,000 bytes of characters.
    */
  var Text: BoundedLengthString = js.native
}

object DetectPHIRequest {
  @scala.inline
  def apply(Text: BoundedLengthString): DetectPHIRequest = {
    val __obj = js.Dynamic.literal(Text = Text.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectPHIRequest]
  }
}

