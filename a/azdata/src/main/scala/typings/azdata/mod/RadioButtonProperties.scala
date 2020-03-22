package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioButtonProperties extends js.Object {
  var checked: js.UndefOr[Boolean] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object RadioButtonProperties {
  @scala.inline
  def apply(
    checked: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    name: String = null,
    value: String = null
  ): RadioButtonProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadioButtonProperties]
  }
}

