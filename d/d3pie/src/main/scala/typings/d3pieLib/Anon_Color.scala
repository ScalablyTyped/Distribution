package typings
package d3pieLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Color extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  var label: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[scala.Double] = js.undefined
  var valueType: js.UndefOr[d3pieLib.d3pieLibStrings.percentage | d3pieLib.d3pieLibStrings.value] = js.undefined
}

object Anon_Color {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    label: java.lang.String = null,
    value: scala.Int | scala.Double = null,
    valueType: d3pieLib.d3pieLibStrings.percentage | d3pieLib.d3pieLibStrings.value = null
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

