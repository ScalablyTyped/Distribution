package typings.connectDashHistoryDashApiDashFallbackDashExclusions.connectDashHistoryDashApiDashFallbackDashExclusionsMod

import typings.connectDashHistoryDashApiDashFallbackDashExclusions.Fn_Message
import typings.connectDashHistoryDashApiDashFallbackDashExclusions.connectDashHistoryDashApiDashFallbackDashExclusionsNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var disableDotRule: js.UndefOr[`true`] = js.undefined
  var exclusions: js.UndefOr[js.Array[String]] = js.undefined
  var htmlAcceptHeaders: js.UndefOr[js.Array[String]] = js.undefined
  var index: js.UndefOr[String] = js.undefined
  var logger: js.UndefOr[Fn_Message] = js.undefined
  var rewrites: js.UndefOr[js.Array[Rewrite]] = js.undefined
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    disableDotRule: `true` = null,
    exclusions: js.Array[String] = null,
    htmlAcceptHeaders: js.Array[String] = null,
    index: String = null,
    logger: Fn_Message = null,
    rewrites: js.Array[Rewrite] = null,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (disableDotRule != null) __obj.updateDynamic("disableDotRule")(disableDotRule)
    if (exclusions != null) __obj.updateDynamic("exclusions")(exclusions)
    if (htmlAcceptHeaders != null) __obj.updateDynamic("htmlAcceptHeaders")(htmlAcceptHeaders)
    if (index != null) __obj.updateDynamic("index")(index)
    if (logger != null) __obj.updateDynamic("logger")(logger)
    if (rewrites != null) __obj.updateDynamic("rewrites")(rewrites)
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose)
    __obj.asInstanceOf[Options]
  }
}

