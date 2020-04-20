package typings.blueprintjsTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTruncated extends js.Object {
  var truncated: Boolean
  var wrapText: Boolean
}

object AnonTruncated {
  @scala.inline
  def apply(truncated: Boolean, wrapText: Boolean): AnonTruncated = {
    val __obj = js.Dynamic.literal(truncated = truncated.asInstanceOf[js.Any], wrapText = wrapText.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTruncated]
  }
}

