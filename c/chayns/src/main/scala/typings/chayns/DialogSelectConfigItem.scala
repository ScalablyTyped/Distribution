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
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (!js.isUndefined(isSelected)) __obj.updateDynamic("isSelected")(isSelected.get.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogSelectConfigItem]
  }
}

