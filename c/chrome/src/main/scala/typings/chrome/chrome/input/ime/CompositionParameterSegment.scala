package typings.chrome.chrome.input.ime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompositionParameterSegment extends js.Object {
  /** Index of the character to end this segment after. */
  var end: Double
  /** Index of the character to start this segment at */
  var start: Double
  /** The type of the underline to modify this segment. */
  var style: String
}

object CompositionParameterSegment {
  @scala.inline
  def apply(end: Double, start: Double, style: String): CompositionParameterSegment = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompositionParameterSegment]
  }
}

