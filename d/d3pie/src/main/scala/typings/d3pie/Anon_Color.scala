package typings.d3pie

import typings.d3pie.d3pieStrings.percentage
import typings.d3pie.d3pieStrings.value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Color extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
  var valueType: js.UndefOr[percentage | value] = js.undefined
}

object Anon_Color {
  @scala.inline
  def apply(
    color: String = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    value: Int | Double = null,
    valueType: percentage | value = null
  ): Anon_Color = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (label != null) __obj.updateDynamic("label")(label)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueType != null) __obj.updateDynamic("valueType")(valueType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Color]
  }
}

