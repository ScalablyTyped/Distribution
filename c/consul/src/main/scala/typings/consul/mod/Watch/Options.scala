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
    backoffFactor: Int | Double = null,
    backoffMax: Int | Double = null,
    maxAttempts: Int | Double = null,
    options: CommonOptions with WatchOptions = null
  ): Options = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
    if (backoffFactor != null) __obj.updateDynamic("backoffFactor")(backoffFactor.asInstanceOf[js.Any])
    if (backoffMax != null) __obj.updateDynamic("backoffMax")(backoffMax.asInstanceOf[js.Any])
    if (maxAttempts != null) __obj.updateDynamic("maxAttempts")(maxAttempts.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

