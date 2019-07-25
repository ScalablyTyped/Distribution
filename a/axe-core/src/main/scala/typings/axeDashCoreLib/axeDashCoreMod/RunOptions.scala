package typings
package axeDashCoreLib.axeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunOptions extends js.Object {
  var absolutePaths: js.UndefOr[scala.Boolean] = js.undefined
  var elementRef: js.UndefOr[scala.Boolean] = js.undefined
  var frameWaitTime: js.UndefOr[scala.Double] = js.undefined
  var iframes: js.UndefOr[scala.Boolean] = js.undefined
  var performanceTimer: js.UndefOr[scala.Boolean] = js.undefined
  var preload: js.UndefOr[scala.Boolean] = js.undefined
  var reporter: js.UndefOr[ReporterVersion] = js.undefined
  var restoreScroll: js.UndefOr[scala.Boolean] = js.undefined
  var resultTypes: js.UndefOr[js.Array[resultGroups]] = js.undefined
  var rules: js.UndefOr[js.Object] = js.undefined
  var runOnly: js.UndefOr[RunOnly] = js.undefined
  var selectors: js.UndefOr[scala.Boolean] = js.undefined
  var xpath: js.UndefOr[scala.Boolean] = js.undefined
}

object RunOptions {
  @scala.inline
  def apply(
    absolutePaths: js.UndefOr[scala.Boolean] = js.undefined,
    elementRef: js.UndefOr[scala.Boolean] = js.undefined,
    frameWaitTime: scala.Int | scala.Double = null,
    iframes: js.UndefOr[scala.Boolean] = js.undefined,
    performanceTimer: js.UndefOr[scala.Boolean] = js.undefined,
    preload: js.UndefOr[scala.Boolean] = js.undefined,
    reporter: ReporterVersion = null,
    restoreScroll: js.UndefOr[scala.Boolean] = js.undefined,
    resultTypes: js.Array[resultGroups] = null,
    rules: js.Object = null,
    runOnly: RunOnly = null,
    selectors: js.UndefOr[scala.Boolean] = js.undefined,
    xpath: js.UndefOr[scala.Boolean] = js.undefined
  ): RunOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(absolutePaths)) __obj.updateDynamic("absolutePaths")(absolutePaths)
    if (!js.isUndefined(elementRef)) __obj.updateDynamic("elementRef")(elementRef)
    if (frameWaitTime != null) __obj.updateDynamic("frameWaitTime")(frameWaitTime.asInstanceOf[js.Any])
    if (!js.isUndefined(iframes)) __obj.updateDynamic("iframes")(iframes)
    if (!js.isUndefined(performanceTimer)) __obj.updateDynamic("performanceTimer")(performanceTimer)
    if (!js.isUndefined(preload)) __obj.updateDynamic("preload")(preload)
    if (reporter != null) __obj.updateDynamic("reporter")(reporter)
    if (!js.isUndefined(restoreScroll)) __obj.updateDynamic("restoreScroll")(restoreScroll)
    if (resultTypes != null) __obj.updateDynamic("resultTypes")(resultTypes)
    if (rules != null) __obj.updateDynamic("rules")(rules)
    if (runOnly != null) __obj.updateDynamic("runOnly")(runOnly)
    if (!js.isUndefined(selectors)) __obj.updateDynamic("selectors")(selectors)
    if (!js.isUndefined(xpath)) __obj.updateDynamic("xpath")(xpath)
    __obj.asInstanceOf[RunOptions]
  }
}

