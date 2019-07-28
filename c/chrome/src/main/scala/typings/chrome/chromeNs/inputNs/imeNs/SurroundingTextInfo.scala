package typings.chrome.chromeNs.inputNs.imeNs

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
    val __obj = js.Dynamic.literal(anchor = anchor, focus = focus, text = text)
  
    __obj.asInstanceOf[SurroundingTextInfo]
  }
}

