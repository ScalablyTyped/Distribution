package typings.d3pie.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Percentage extends js.Object {
  var label: js.UndefOr[String] = js.undefined
  var percentage: js.UndefOr[Double] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object Percentage {
  @scala.inline
  def apply(
    label: String = null,
    percentage: js.UndefOr[Double] = js.undefined,
    value: js.UndefOr[Double] = js.undefined
  ): Percentage = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(percentage)) __obj.updateDynamic("percentage")(percentage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Percentage]
  }
}

