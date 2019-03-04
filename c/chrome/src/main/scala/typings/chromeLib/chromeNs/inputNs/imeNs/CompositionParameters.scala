package typings
package chromeLib.chromeNs.inputNs.imeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompositionParameters extends js.Object {
  /** ID of the context where the composition text will be set */
  var contextID: scala.Double
  /** Position in the text of the cursor. */
  var cursor: scala.Double
  /** Optional. List of segments and their associated types. */
  var segments: js.Array[CompositionParameterSegment]
  /** Optional. Position in the text that the selection ends at. */
  var selectionEnd: js.UndefOr[scala.Double] = js.undefined
  /** Optional. Position in the text that the selection starts at. */
  var selectionStart: js.UndefOr[scala.Double] = js.undefined
  /** Text to set */
  var text: java.lang.String
}

object CompositionParameters {
  @scala.inline
  def apply(
    contextID: scala.Double,
    cursor: scala.Double,
    segments: js.Array[CompositionParameterSegment],
    text: java.lang.String,
    selectionEnd: scala.Int | scala.Double = null,
    selectionStart: scala.Int | scala.Double = null
  ): CompositionParameters = {
    val __obj = js.Dynamic.literal(contextID = contextID, cursor = cursor, segments = segments, text = text)
    if (selectionEnd != null) __obj.updateDynamic("selectionEnd")(selectionEnd.asInstanceOf[js.Any])
    if (selectionStart != null) __obj.updateDynamic("selectionStart")(selectionStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompositionParameters]
  }
}

