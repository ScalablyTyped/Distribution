package typings.chartist.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AreaBase extends js.Object {
  var areaBase: js.UndefOr[Double] = js.undefined
  var lineSmooth: js.UndefOr[js.Function | Boolean] = js.undefined
  var showArea: js.UndefOr[Boolean] = js.undefined
  var showLine: js.UndefOr[Boolean] = js.undefined
  var showPoint: js.UndefOr[Boolean] = js.undefined
}

object AreaBase {
  @scala.inline
  def apply(
    areaBase: js.UndefOr[Double] = js.undefined,
    lineSmooth: js.Function | Boolean = null,
    showArea: js.UndefOr[Boolean] = js.undefined,
    showLine: js.UndefOr[Boolean] = js.undefined,
    showPoint: js.UndefOr[Boolean] = js.undefined
  ): AreaBase = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(areaBase)) __obj.updateDynamic("areaBase")(areaBase.get.asInstanceOf[js.Any])
    if (lineSmooth != null) __obj.updateDynamic("lineSmooth")(lineSmooth.asInstanceOf[js.Any])
    if (!js.isUndefined(showArea)) __obj.updateDynamic("showArea")(showArea.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showLine)) __obj.updateDynamic("showLine")(showLine.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showPoint)) __obj.updateDynamic("showPoint")(showPoint.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AreaBase]
  }
}

