package typings.axeCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunOptions extends js.Object {
  var absolutePaths: js.UndefOr[Boolean] = js.undefined
  var elementRef: js.UndefOr[Boolean] = js.undefined
  var frameWaitTime: js.UndefOr[Double] = js.undefined
  var iframes: js.UndefOr[Boolean] = js.undefined
  var performanceTimer: js.UndefOr[Boolean] = js.undefined
  var preload: js.UndefOr[Boolean] = js.undefined
  var reporter: js.UndefOr[ReporterVersion] = js.undefined
  var restoreScroll: js.UndefOr[Boolean] = js.undefined
  var resultTypes: js.UndefOr[js.Array[resultGroups]] = js.undefined
  var rules: js.UndefOr[js.Object] = js.undefined
  var runOnly: js.UndefOr[RunOnly | (js.Array[String | TagValue])] = js.undefined
  var selectors: js.UndefOr[Boolean] = js.undefined
  var xpath: js.UndefOr[Boolean] = js.undefined
}

object RunOptions {
  @scala.inline
  def apply(
    absolutePaths: js.UndefOr[Boolean] = js.undefined,
    elementRef: js.UndefOr[Boolean] = js.undefined,
    frameWaitTime: Int | Double = null,
    iframes: js.UndefOr[Boolean] = js.undefined,
    performanceTimer: js.UndefOr[Boolean] = js.undefined,
    preload: js.UndefOr[Boolean] = js.undefined,
    reporter: ReporterVersion = null,
    restoreScroll: js.UndefOr[Boolean] = js.undefined,
    resultTypes: js.Array[resultGroups] = null,
    rules: js.Object = null,
    runOnly: RunOnly | (js.Array[String | TagValue]) = null,
    selectors: js.UndefOr[Boolean] = js.undefined,
    xpath: js.UndefOr[Boolean] = js.undefined
  ): RunOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(absolutePaths)) __obj.updateDynamic("absolutePaths")(absolutePaths.asInstanceOf[js.Any])
    if (!js.isUndefined(elementRef)) __obj.updateDynamic("elementRef")(elementRef.asInstanceOf[js.Any])
    if (frameWaitTime != null) __obj.updateDynamic("frameWaitTime")(frameWaitTime.asInstanceOf[js.Any])
    if (!js.isUndefined(iframes)) __obj.updateDynamic("iframes")(iframes.asInstanceOf[js.Any])
    if (!js.isUndefined(performanceTimer)) __obj.updateDynamic("performanceTimer")(performanceTimer.asInstanceOf[js.Any])
    if (!js.isUndefined(preload)) __obj.updateDynamic("preload")(preload.asInstanceOf[js.Any])
    if (reporter != null) __obj.updateDynamic("reporter")(reporter.asInstanceOf[js.Any])
    if (!js.isUndefined(restoreScroll)) __obj.updateDynamic("restoreScroll")(restoreScroll.asInstanceOf[js.Any])
    if (resultTypes != null) __obj.updateDynamic("resultTypes")(resultTypes.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    if (runOnly != null) __obj.updateDynamic("runOnly")(runOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(selectors)) __obj.updateDynamic("selectors")(selectors.asInstanceOf[js.Any])
    if (!js.isUndefined(xpath)) __obj.updateDynamic("xpath")(xpath.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunOptions]
  }
}

