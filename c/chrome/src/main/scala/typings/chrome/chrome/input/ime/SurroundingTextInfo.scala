package typings.chrome.chrome.input.ime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SurroundingTextInfo extends js.Object {
  /** The beginning position of the selection. This value indicates caret position if is no selection. */
  var anchor: Double
  /** The ending position of the selection. This value indicates caret position if there is no selection. */
  var focus: Double
  /** The text around cursor. */
  var text: String
}

object SurroundingTextInfo {
  @scala.inline
  def apply(anchor: Double, focus: Double, text: String): SurroundingTextInfo = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SurroundingTextInfo]
  }
}

