package typings.benchmark.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Target extends js.Object {
  var async: js.UndefOr[Boolean] = js.undefined
  var compiled: js.UndefOr[js.Function] = js.undefined
  var count: js.UndefOr[Double] = js.undefined
  var cycles: js.UndefOr[Double] = js.undefined
  var defer: js.UndefOr[Boolean] = js.undefined
  var delay: js.UndefOr[Double] = js.undefined
  var fn: js.UndefOr[js.Function] = js.undefined
  var hz: js.UndefOr[Double] = js.undefined
  var id: Double
  var initCount: js.UndefOr[Double] = js.undefined
  var maxTime: js.UndefOr[Double] = js.undefined
  var minSamples: js.UndefOr[Double] = js.undefined
  var minTime: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var options: Options
  var running: Boolean
  var stats: js.UndefOr[Stats] = js.undefined
  var times: js.UndefOr[Times] = js.undefined
}

object Target {
  @scala.inline
  def apply(
    id: Double,
    options: Options,
    running: Boolean,
    async: js.UndefOr[Boolean] = js.undefined,
    compiled: js.Function = null,
    count: js.UndefOr[Double] = js.undefined,
    cycles: js.UndefOr[Double] = js.undefined,
    defer: js.UndefOr[Boolean] = js.undefined,
    delay: js.UndefOr[Double] = js.undefined,
    fn: js.Function = null,
    hz: js.UndefOr[Double] = js.undefined,
    initCount: js.UndefOr[Double] = js.undefined,
    maxTime: js.UndefOr[Double] = js.undefined,
    minSamples: js.UndefOr[Double] = js.undefined,
    minTime: js.UndefOr[Double] = js.undefined,
    name: String = null,
    stats: Stats = null,
    times: Times = null
  ): Target = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], running = running.asInstanceOf[js.Any])
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.get.asInstanceOf[js.Any])
    if (compiled != null) __obj.updateDynamic("compiled")(compiled.asInstanceOf[js.Any])
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cycles)) __obj.updateDynamic("cycles")(cycles.get.asInstanceOf[js.Any])
    if (!js.isUndefined(defer)) __obj.updateDynamic("defer")(defer.get.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (fn != null) __obj.updateDynamic("fn")(fn.asInstanceOf[js.Any])
    if (!js.isUndefined(hz)) __obj.updateDynamic("hz")(hz.get.asInstanceOf[js.Any])
    if (!js.isUndefined(initCount)) __obj.updateDynamic("initCount")(initCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxTime)) __obj.updateDynamic("maxTime")(maxTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minSamples)) __obj.updateDynamic("minSamples")(minSamples.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minTime)) __obj.updateDynamic("minTime")(minTime.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (stats != null) __obj.updateDynamic("stats")(stats.asInstanceOf[js.Any])
    if (times != null) __obj.updateDynamic("times")(times.asInstanceOf[js.Any])
    __obj.asInstanceOf[Target]
  }
}

