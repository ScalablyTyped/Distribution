package typings
package benchmarkLib.benchmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var async: js.UndefOr[scala.Boolean] = js.undefined
  var defer: js.UndefOr[scala.Boolean] = js.undefined
  var delay: js.UndefOr[scala.Double] = js.undefined
  var fn: js.UndefOr[js.Function | java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var initCount: js.UndefOr[scala.Double] = js.undefined
  var maxTime: js.UndefOr[scala.Double] = js.undefined
  var minSamples: js.UndefOr[scala.Double] = js.undefined
  var minTime: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var onAbort: js.UndefOr[js.Function] = js.undefined
  var onComplete: js.UndefOr[js.Function] = js.undefined
  var onCycle: js.UndefOr[js.Function] = js.undefined
  var onError: js.UndefOr[js.Function] = js.undefined
  var onReset: js.UndefOr[js.Function] = js.undefined
  var onStart: js.UndefOr[js.Function] = js.undefined
  var queued: js.UndefOr[scala.Boolean] = js.undefined
  var setup: js.UndefOr[js.Function | java.lang.String] = js.undefined
  var teardown: js.UndefOr[js.Function | java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    async: js.UndefOr[scala.Boolean] = js.undefined,
    defer: js.UndefOr[scala.Boolean] = js.undefined,
    delay: scala.Int | scala.Double = null,
    fn: js.Function | java.lang.String = null,
    id: java.lang.String = null,
    initCount: scala.Int | scala.Double = null,
    maxTime: scala.Int | scala.Double = null,
    minSamples: scala.Int | scala.Double = null,
    minTime: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    onAbort: js.Function = null,
    onComplete: js.Function = null,
    onCycle: js.Function = null,
    onError: js.Function = null,
    onReset: js.Function = null,
    onStart: js.Function = null,
    queued: js.UndefOr[scala.Boolean] = js.undefined,
    setup: js.Function | java.lang.String = null,
    teardown: js.Function | java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async)
    if (!js.isUndefined(defer)) __obj.updateDynamic("defer")(defer)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (fn != null) __obj.updateDynamic("fn")(fn.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (initCount != null) __obj.updateDynamic("initCount")(initCount.asInstanceOf[js.Any])
    if (maxTime != null) __obj.updateDynamic("maxTime")(maxTime.asInstanceOf[js.Any])
    if (minSamples != null) __obj.updateDynamic("minSamples")(minSamples.asInstanceOf[js.Any])
    if (minTime != null) __obj.updateDynamic("minTime")(minTime.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (onAbort != null) __obj.updateDynamic("onAbort")(onAbort)
    if (onComplete != null) __obj.updateDynamic("onComplete")(onComplete)
    if (onCycle != null) __obj.updateDynamic("onCycle")(onCycle)
    if (onError != null) __obj.updateDynamic("onError")(onError)
    if (onReset != null) __obj.updateDynamic("onReset")(onReset)
    if (onStart != null) __obj.updateDynamic("onStart")(onStart)
    if (!js.isUndefined(queued)) __obj.updateDynamic("queued")(queued)
    if (setup != null) __obj.updateDynamic("setup")(setup.asInstanceOf[js.Any])
    if (teardown != null) __obj.updateDynamic("teardown")(teardown.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

