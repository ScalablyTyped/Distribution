package typings
package d3pieLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorEnabled extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  var percentage: js.UndefOr[scala.Double] = js.undefined
}

object Anon_ColorEnabled {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    percentage: scala.Int | scala.Double = null
  ): Anon_ColorEnabled = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (percentage != null) __obj.updateDynamic("percentage")(percentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ColorEnabled]
  }
}

