package typings.backbone.backboneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistoryOptions extends Silenceable {
  var pushState: js.UndefOr[Boolean] = js.undefined
  var root: js.UndefOr[String] = js.undefined
}

object HistoryOptions {
  @scala.inline
  def apply(
    pushState: js.UndefOr[Boolean] = js.undefined,
    root: String = null,
    silent: js.UndefOr[Boolean] = js.undefined
  ): HistoryOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(pushState)) __obj.updateDynamic("pushState")(pushState)
    if (root != null) __obj.updateDynamic("root")(root)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    __obj.asInstanceOf[HistoryOptions]
  }
}

