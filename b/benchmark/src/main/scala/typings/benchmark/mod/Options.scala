package typings.benchmark.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var async: js.UndefOr[Boolean] = js.undefined
  var defer: js.UndefOr[Boolean] = js.undefined
  var delay: js.UndefOr[Double] = js.undefined
  var fn: js.UndefOr[js.Function | String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var initCount: js.UndefOr[Double] = js.undefined
  var maxTime: js.UndefOr[Double] = js.undefined
  var minSamples: js.UndefOr[Double] = js.undefined
  var minTime: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onAbort: js.UndefOr[js.Function] = js.undefined
  var onComplete: js.UndefOr[js.Function] = js.undefined
  var onCycle: js.UndefOr[js.Function] = js.undefined
  var onError: js.UndefOr[js.Function] = js.undefined
  var onReset: js.UndefOr[js.Function] = js.undefined
  var onStart: js.UndefOr[js.Function] = js.undefined
  var queued: js.UndefOr[Boolean] = js.undefined
  var setup: js.UndefOr[js.Function | String] = js.undefined
  var teardown: js.UndefOr[js.Function | String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    async: js.UndefOr[Boolean] = js.undefined,
    defer: js.UndefOr[Boolean] = js.undefined,
    delay: js.UndefOr[Double] = js.undefined,
    fn: js.Function | String = null,
    id: String = null,
    initCount: js.UndefOr[Double] = js.undefined,
    maxTime: js.UndefOr[Double] = js.undefined,
    minSamples: js.UndefOr[Double] = js.undefined,
    minTime: js.UndefOr[Double] = js.undefined,
    name: String = null,
    onAbort: js.Function = null,
    onComplete: js.Function = null,
    onCycle: js.Function = null,
    onError: js.Function = null,
    onReset: js.Function = null,
    onStart: js.Function = null,
    queued: js.UndefOr[Boolean] = js.undefined,
    setup: js.Function | String = null,
    teardown: js.Function | String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.get.asInstanceOf[js.Any])
    if (!js.isUndefined(defer)) __obj.updateDynamic("defer")(defer.get.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (fn != null) __obj.updateDynamic("fn")(fn.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(initCount)) __obj.updateDynamic("initCount")(initCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxTime)) __obj.updateDynamic("maxTime")(maxTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minSamples)) __obj.updateDynamic("minSamples")(minSamples.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minTime)) __obj.updateDynamic("minTime")(minTime.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onAbort != null) __obj.updateDynamic("onAbort")(onAbort.asInstanceOf[js.Any])
    if (onComplete != null) __obj.updateDynamic("onComplete")(onComplete.asInstanceOf[js.Any])
    if (onCycle != null) __obj.updateDynamic("onCycle")(onCycle.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(onError.asInstanceOf[js.Any])
    if (onReset != null) __obj.updateDynamic("onReset")(onReset.asInstanceOf[js.Any])
    if (onStart != null) __obj.updateDynamic("onStart")(onStart.asInstanceOf[js.Any])
    if (!js.isUndefined(queued)) __obj.updateDynamic("queued")(queued.get.asInstanceOf[js.Any])
    if (setup != null) __obj.updateDynamic("setup")(setup.asInstanceOf[js.Any])
    if (teardown != null) __obj.updateDynamic("teardown")(teardown.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

