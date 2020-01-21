package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdditionalResultAttributeValue extends js.Object {
  /**
    * The text associated with the attribute and information about the highlight to apply to the text.
    */
  var TextWithHighlightsValue: js.UndefOr[TextWithHighlights] = js.native
}

object AdditionalResultAttributeValue {
  @scala.inline
  def apply(TextWithHighlightsValue: TextWithHighlights = null): AdditionalResultAttributeValue = {
    val __obj = js.Dynamic.literal()
    if (TextWithHighlightsValue != null) __obj.updateDynamic("TextWithHighlightsValue")(TextWithHighlightsValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdditionalResultAttributeValue]
  }
}

