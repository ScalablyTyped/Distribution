package typings.bluebirdRetry.mod

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
    backoff: js.UndefOr[Double] = js.undefined,
    context: js.Any = null,
    interval: js.UndefOr[Double] = js.undefined,
    max_interval: js.UndefOr[Double] = js.undefined,
    max_tries: js.UndefOr[Double] = js.undefined,
    predicate: js.Any = null,
    throw_original: js.UndefOr[Boolean] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (!js.isUndefined(backoff)) __obj.updateDynamic("backoff")(backoff.get.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(interval)) __obj.updateDynamic("interval")(interval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max_interval)) __obj.updateDynamic("max_interval")(max_interval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max_tries)) __obj.updateDynamic("max_tries")(max_tries.get.asInstanceOf[js.Any])
    if (predicate != null) __obj.updateDynamic("predicate")(predicate.asInstanceOf[js.Any])
    if (!js.isUndefined(throw_original)) __obj.updateDynamic("throw_original")(throw_original.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

