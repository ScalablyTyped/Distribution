package typings.d3pie.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorEnabled extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var percentage: js.UndefOr[Double] = js.undefined
}

object ColorEnabled {
  @scala.inline
  def apply(
    color: String = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    percentage: js.UndefOr[Double] = js.undefined
  ): ColorEnabled = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(percentage)) __obj.updateDynamic("percentage")(percentage.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorEnabled]
  }
}

