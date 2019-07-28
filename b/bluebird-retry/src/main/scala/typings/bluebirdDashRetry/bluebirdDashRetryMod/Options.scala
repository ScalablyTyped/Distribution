package typings.bluebirdDashRetry.bluebirdDashRetryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var args: js.UndefOr[js.Any] = js.undefined
  var backoff: js.UndefOr[Double] = js.undefined
  var context: js.UndefOr[js.Any] = js.undefined
  var interval: js.UndefOr[Double] = js.undefined
  var max_interval: js.UndefOr[Double] = js.undefined
  var max_tries: js.UndefOr[Double] = js.undefined
  var predicate: js.UndefOr[js.Any] = js.undefined
  var throw_original: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    args: js.Any = null,
    backoff: Int | Double = null,
    context: js.Any = null,
    interval: Int | Double = null,
    max_interval: Int | Double = null,
    max_tries: Int | Double = null,
    predicate: js.Any = null,
    throw_original: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args)
    if (backoff != null) __obj.updateDynamic("backoff")(backoff.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context)
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (max_interval != null) __obj.updateDynamic("max_interval")(max_interval.asInstanceOf[js.Any])
    if (max_tries != null) __obj.updateDynamic("max_tries")(max_tries.asInstanceOf[js.Any])
    if (predicate != null) __obj.updateDynamic("predicate")(predicate)
    if (!js.isUndefined(throw_original)) __obj.updateDynamic("throw_original")(throw_original)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

