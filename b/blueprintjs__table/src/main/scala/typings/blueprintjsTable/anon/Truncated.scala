package typings.blueprintjsTable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Truncated extends js.Object {
  var truncated: Boolean
  var wrapText: Boolean
}

object Truncated {
  @scala.inline
  def apply(truncated: Boolean, wrapText: Boolean): Truncated = {
    val __obj = js.Dynamic.literal(truncated = truncated.asInstanceOf[js.Any], wrapText = wrapText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Truncated]
  }
}

