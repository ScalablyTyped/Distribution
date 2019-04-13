package typings
package chartistLib.chartistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IChartistAnimationOptions extends js.Object {
  var begin: js.UndefOr[java.lang.String] = js.undefined
  var dur: java.lang.String | scala.Double
  var easing: js.UndefOr[IChartistEasingDefinition | java.lang.String] = js.undefined
  var fill: js.UndefOr[java.lang.String] = js.undefined
  var from: java.lang.String | scala.Double
  var id: js.UndefOr[java.lang.String] = js.undefined
  var to: java.lang.String | scala.Double
}

object IChartistAnimationOptions {
  @scala.inline
  def apply(
    dur: java.lang.String | scala.Double,
    from: java.lang.String | scala.Double,
    to: java.lang.String | scala.Double,
    begin: java.lang.String = null,
    easing: IChartistEasingDefinition | java.lang.String = null,
    fill: java.lang.String = null,
    id: java.lang.String = null
  ): IChartistAnimationOptions = {
    val __obj = js.Dynamic.literal(dur = dur.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    if (begin != null) __obj.updateDynamic("begin")(begin)
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[IChartistAnimationOptions]
  }
}

