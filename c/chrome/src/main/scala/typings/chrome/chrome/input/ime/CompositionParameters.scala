package typings.chrome.chrome.input.ime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompositionParameters extends js.Object {
  /** ID of the context where the composition text will be set */
  var contextID: Double
  /** Position in the text of the cursor. */
  var cursor: Double
  /** Optional. List of segments and their associated types. */
  var segments: js.Array[CompositionParameterSegment]
  /** Optional. Position in the text that the selection ends at. */
  var selectionEnd: js.UndefOr[Double] = js.undefined
  /** Optional. Position in the text that the selection starts at. */
  var selectionStart: js.UndefOr[Double] = js.undefined
  /** Text to set */
  var text: String
}

object CompositionParameters {
  @scala.inline
  def apply(
    contextID: Double,
    cursor: Double,
    segments: js.Array[CompositionParameterSegment],
    text: String,
    selectionEnd: Int | Double = null,
    selectionStart: Int | Double = null
  ): CompositionParameters = {
    val __obj = js.Dynamic.literal(contextID = contextID.asInstanceOf[js.Any], cursor = cursor.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    if (selectionEnd != null) __obj.updateDynamic("selectionEnd")(selectionEnd.asInstanceOf[js.Any])
    if (selectionStart != null) __obj.updateDynamic("selectionStart")(selectionStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompositionParameters]
  }
}

