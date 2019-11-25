package typings.connectDashHistoryDashApiDashFallback.connectDashHistoryDashApiDashFallbackMod

import typings.connectDashHistoryDashApiDashFallback.Fn_Message
import typings.connectDashHistoryDashApiDashFallback.connectDashHistoryDashApiDashFallbackNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var disableDotRule: js.UndefOr[`true`] = js.undefined
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
    htmlAcceptHeaders: js.Array[String] = null,
    index: String = null,
    logger: Fn_Message = null,
    rewrites: js.Array[Rewrite] = null,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (disableDotRule != null) __obj.updateDynamic("disableDotRule")(disableDotRule.asInstanceOf[js.Any])
    if (htmlAcceptHeaders != null) __obj.updateDynamic("htmlAcceptHeaders")(htmlAcceptHeaders.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (rewrites != null) __obj.updateDynamic("rewrites")(rewrites.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

