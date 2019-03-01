package typings
package chartDotJsLib.chartDotJsMod.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartAnimationParameter extends js.Object {
  var animationObject: js.UndefOr[js.Any] = js.undefined
  var chartInstance: js.UndefOr[js.Any] = js.undefined
}

object ChartAnimationParameter {
  @scala.inline
  def apply(animationObject: js.Any = null, chartInstance: js.Any = null): ChartAnimationParameter = {
    val __obj = js.Dynamic.literal()
    if (animationObject != null) __obj.updateDynamic("animationObject")(animationObject)
    if (chartInstance != null) __obj.updateDynamic("chartInstance")(chartInstance)
    __obj.asInstanceOf[ChartAnimationParameter]
  }
}

