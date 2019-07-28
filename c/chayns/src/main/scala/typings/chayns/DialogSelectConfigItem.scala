package typings.chayns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogSelectConfigItem extends js.Object {
  var image: js.UndefOr[String] = js.undefined
  var isSelected: js.UndefOr[Boolean] = js.undefined
  var name: String
  var value: js.UndefOr[String] = js.undefined
}

object DialogSelectConfigItem {
  @scala.inline
  def apply(
    name: String,
    image: String = null,
    isSelected: js.UndefOr[Boolean] = js.undefined,
    value: String = null
  ): DialogSelectConfigItem = {
    val __obj = js.Dynamic.literal(name = name)
    if (image != null) __obj.updateDynamic("image")(image)
    if (!js.isUndefined(isSelected)) __obj.updateDynamic("isSelected")(isSelected)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[DialogSelectConfigItem]
  }
}

