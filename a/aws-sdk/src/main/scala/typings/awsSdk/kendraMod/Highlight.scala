package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Highlight extends js.Object {
  /**
    * The zero-based location in the response string where the highlight starts.
    */
  var BeginOffset: Integer = js.native
  /**
    * The zero-based location in the response string where the highlight ends.
    */
  var EndOffset: Integer = js.native
  /**
    * Indicates whether the response is the best response. True if this is the best response; otherwise, false.
    */
  var TopAnswer: js.UndefOr[Boolean] = js.native
}

object Highlight {
  @scala.inline
  def apply(BeginOffset: Integer, EndOffset: Integer, TopAnswer: js.UndefOr[Boolean] = js.undefined): Highlight = {
    val __obj = js.Dynamic.literal(BeginOffset = BeginOffset.asInstanceOf[js.Any], EndOffset = EndOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(TopAnswer)) __obj.updateDynamic("TopAnswer")(TopAnswer.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Highlight]
  }
}

