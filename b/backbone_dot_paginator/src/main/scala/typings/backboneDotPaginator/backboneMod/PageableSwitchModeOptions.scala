package typings.backboneDotPaginator.backboneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageableSwitchModeOptions extends js.Object {
  var fetch: js.UndefOr[Boolean] = js.undefined
  var resetState: js.UndefOr[Boolean] = js.undefined
}

object PageableSwitchModeOptions {
  @scala.inline
  def apply(fetch: js.UndefOr[Boolean] = js.undefined, resetState: js.UndefOr[Boolean] = js.undefined): PageableSwitchModeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fetch)) __obj.updateDynamic("fetch")(fetch.asInstanceOf[js.Any])
    if (!js.isUndefined(resetState)) __obj.updateDynamic("resetState")(resetState.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageableSwitchModeOptions]
  }
}

