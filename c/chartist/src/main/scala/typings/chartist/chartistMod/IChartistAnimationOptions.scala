package typings.chartist.chartistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IChartistAnimationOptions extends js.Object {
  var begin: js.UndefOr[String] = js.undefined
  var dur: String | Double
  var easing: js.UndefOr[IChartistEasingDefinition | String] = js.undefined
  var fill: js.UndefOr[String] = js.undefined
  var from: String | Double
  var id: js.UndefOr[String] = js.undefined
  var to: String | Double
}

object IChartistAnimationOptions {
  @scala.inline
  def apply(
    dur: String | Double,
    from: String | Double,
    to: String | Double,
    begin: String = null,
    easing: IChartistEasingDefinition | String = null,
    fill: String = null,
    id: String = null
  ): IChartistAnimationOptions = {
    val __obj = js.Dynamic.literal(dur = dur.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    if (begin != null) __obj.updateDynamic("begin")(begin)
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[IChartistAnimationOptions]
  }
}

