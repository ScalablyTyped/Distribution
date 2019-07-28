package typings.debounceDashPromise.debounceDashPromiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DebounceOptions extends js.Object {
  var accumulate: js.UndefOr[Boolean] = js.undefined
  var leading: js.UndefOr[Boolean] = js.undefined
}

object DebounceOptions {
  @scala.inline
  def apply(accumulate: js.UndefOr[Boolean] = js.undefined, leading: js.UndefOr[Boolean] = js.undefined): DebounceOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(accumulate)) __obj.updateDynamic("accumulate")(accumulate)
    if (!js.isUndefined(leading)) __obj.updateDynamic("leading")(leading)
    __obj.asInstanceOf[DebounceOptions]
  }
}

