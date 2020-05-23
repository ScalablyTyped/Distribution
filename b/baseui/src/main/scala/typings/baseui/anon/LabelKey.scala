package typings.baseui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelKey extends js.Object {
  var labelKey: String
  var valueKey: String
}

object LabelKey {
  @scala.inline
  def apply(labelKey: String, valueKey: String): LabelKey = {
    val __obj = js.Dynamic.literal(labelKey = labelKey.asInstanceOf[js.Any], valueKey = valueKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelKey]
  }
}

