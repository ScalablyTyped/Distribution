package typings.chayns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogSelectResultItem extends js.Object {
  var name: String
  var value: js.UndefOr[String] = js.undefined
}

object DialogSelectResultItem {
  @scala.inline
  def apply(name: String, value: String = null): DialogSelectResultItem = {
    val __obj = js.Dynamic.literal(name = name)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[DialogSelectResultItem]
  }
}

