package typings.consul.mod.Watch

import typings.consul.mod.CommonOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var backoffFactor: js.UndefOr[Double] = js.undefined
  var backoffMax: js.UndefOr[Double] = js.undefined
  var maxAttempts: js.UndefOr[Double] = js.undefined
  var method: js.Function
  var options: js.UndefOr[CommonOptions with WatchOptions] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    method: js.Function,
    backoffFactor: js.UndefOr[Double] = js.undefined,
    backoffMax: js.UndefOr[Double] = js.undefined,
    maxAttempts: js.UndefOr[Double] = js.undefined,
    options: CommonOptions with WatchOptions = null
  ): Options = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
    if (!js.isUndefined(backoffFactor)) __obj.updateDynamic("backoffFactor")(backoffFactor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(backoffMax)) __obj.updateDynamic("backoffMax")(backoffMax.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxAttempts)) __obj.updateDynamic("maxAttempts")(maxAttempts.get.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

