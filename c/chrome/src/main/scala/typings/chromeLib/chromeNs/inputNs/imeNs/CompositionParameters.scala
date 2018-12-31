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

