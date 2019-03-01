package typings
package chaynsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogSelectConfigItem extends js.Object {
  var image: js.UndefOr[java.lang.String] = js.undefined
  var isSelected: js.UndefOr[scala.Boolean] = js.undefined
  var name: java.lang.String
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object DialogSelectConfigItem {
  @scala.inline
  def apply(
    name: java.lang.String,
    image: java.lang.String = null,
    isSelected: js.UndefOr[scala.Boolean] = js.undefined,
    value: java.lang.String = null
  ): DialogSelectConfigItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    if (image != null) __obj.updateDynamic("image")(image)
    if (!js.isUndefined(isSelected)) __obj.updateDynamic("isSelected")(isSelected)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[DialogSelectConfigItem]
  }
}

