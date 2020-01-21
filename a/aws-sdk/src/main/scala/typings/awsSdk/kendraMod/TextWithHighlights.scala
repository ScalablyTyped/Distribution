package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextWithHighlights extends js.Object {
  /**
    * The beginning and end of the text that should be highlighted.
    */
  var Highlights: js.UndefOr[HighlightList] = js.native
  /**
    * The text to display to the user.
    */
  var Text: js.UndefOr[String] = js.native
}

object TextWithHighlights {
  @scala.inline
  def apply(Highlights: HighlightList = null, Text: String = null): TextWithHighlights = {
    val __obj = js.Dynamic.literal()
    if (Highlights != null) __obj.updateDynamic("Highlights")(Highlights.asInstanceOf[js.Any])
    if (Text != null) __obj.updateDynamic("Text")(Text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextWithHighlights]
  }
}

