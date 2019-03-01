package typings
package chartistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AreaBase extends js.Object {
  var areaBase: js.UndefOr[scala.Double] = js.undefined
  var lineSmooth: js.UndefOr[js.Function | scala.Boolean] = js.undefined
  var showArea: js.UndefOr[scala.Boolean] = js.undefined
  var showLine: js.UndefOr[scala.Boolean] = js.undefined
  var showPoint: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_AreaBase {
  @scala.inline
  def apply(
    areaBase: scala.Int | scala.Double = null,
    lineSmooth: js.Function | scala.Boolean = null,
    showArea: js.UndefOr[scala.Boolean] = js.undefined,
    showLine: js.UndefOr[scala.Boolean] = js.undefined,
    showPoint: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_AreaBase = {
    val __obj = js.Dynamic.literal()
    if (areaBase != null) __obj.updateDynamic("areaBase")(areaBase.asInstanceOf[js.Any])
    if (lineSmooth != null) __obj.updateDynamic("lineSmooth")(lineSmooth.asInstanceOf[js.Any])
    if (!js.isUndefined(showArea)) __obj.updateDynamic("showArea")(showArea)
    if (!js.isUndefined(showLine)) __obj.updateDynamic("showLine")(showLine)
    if (!js.isUndefined(showPoint)) __obj.updateDynamic("showPoint")(showPoint)
    __obj.asInstanceOf[Anon_AreaBase]
  }
}

