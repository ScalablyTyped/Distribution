package typings.d3pie.anon

import typings.d3pie.d3pieStrings.percentage
import typings.d3pie.d3pieStrings.value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
  var valueType: js.UndefOr[percentage | value] = js.undefined
}

object Color {
  @scala.inline
  def apply(
    color: String = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    value: js.UndefOr[Double] = js.undefined,
    valueType: percentage | value = null
  ): Color = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    if (valueType != null) __obj.updateDynamic("valueType")(valueType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
}

