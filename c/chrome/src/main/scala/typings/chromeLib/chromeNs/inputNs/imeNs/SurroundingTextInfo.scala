package typings
package chromeLib.chromeNs.inputNs.imeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SurroundingTextInfo extends js.Object {
  /** The beginning position of the selection. This value indicates caret position if is no selection. */
  var anchor: scala.Double
  /** The ending position of the selection. This value indicates caret position if there is no selection. */
  var focus: scala.Double
  /** The text around cursor. */
  var text: java.lang.String
}

object SurroundingTextInfo {
  @scala.inline
  def apply(anchor: scala.Double, focus: scala.Double, text: java.lang.String): SurroundingTextInfo = {
    val __obj = js.Dynamic.literal(anchor = anchor, focus = focus, text = text)
  
    __obj.asInstanceOf[SurroundingTextInfo]
  }
}

