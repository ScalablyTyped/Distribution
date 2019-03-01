package typings
package axeDashCoreLib.axeDashCoreMod.axeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunOptions extends js.Object {
  var elementRef: js.UndefOr[scala.Boolean] = js.undefined
  var iframes: js.UndefOr[scala.Boolean] = js.undefined
  var resultTypes: js.UndefOr[js.Array[resultGroups]] = js.undefined
  var rules: js.UndefOr[js.Object] = js.undefined
  var runOnly: js.UndefOr[RunOnly] = js.undefined
  var selectors: js.UndefOr[scala.Boolean] = js.undefined
}

object RunOptions {
  @scala.inline
  def apply(
    elementRef: js.UndefOr[scala.Boolean] = js.undefined,
    iframes: js.UndefOr[scala.Boolean] = js.undefined,
    resultTypes: js.Array[resultGroups] = null,
    rules: js.Object = null,
    runOnly: RunOnly = null,
    selectors: js.UndefOr[scala.Boolean] = js.undefined
  ): RunOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(elementRef)) __obj.updateDynamic("elementRef")(elementRef)
    if (!js.isUndefined(iframes)) __obj.updateDynamic("iframes")(iframes)
    if (resultTypes != null) __obj.updateDynamic("resultTypes")(resultTypes)
    if (rules != null) __obj.updateDynamic("rules")(rules)
    if (runOnly != null) __obj.updateDynamic("runOnly")(runOnly)
    if (!js.isUndefined(selectors)) __obj.updateDynamic("selectors")(selectors)
    __obj.asInstanceOf[RunOptions]
  }
}

