package typings.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLabelKey extends js.Object {
  var labelKey: String
  var valueKey: String
}

object AnonLabelKey {
  @scala.inline
  def apply(labelKey: String, valueKey: String): AnonLabelKey = {
    val __obj = js.Dynamic.literal(labelKey = labelKey.asInstanceOf[js.Any], valueKey = valueKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLabelKey]
  }
}

