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
  var segments: js.UndefOr[js.Array[CompositionParameterSegment]] = js.undefined
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
    text: String,
    segments: js.Array[CompositionParameterSegment] = null,
    selectionEnd: js.UndefOr[Double] = js.undefined,
    selectionStart: js.UndefOr[Double] = js.undefined
  ): CompositionParameters = {
    val __obj = js.Dynamic.literal(contextID = contextID.asInstanceOf[js.Any], cursor = cursor.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    if (segments != null) __obj.updateDynamic("segments")(segments.asInstanceOf[js.Any])
    if (!js.isUndefined(selectionEnd)) __obj.updateDynamic("selectionEnd")(selectionEnd.get.asInstanceOf[js.Any])
    if (!js.isUndefined(selectionStart)) __obj.updateDynamic("selectionStart")(selectionStart.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompositionParameters]
  }
}

