package typings.benchmark.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Target extends js.Object {
  var async: js.UndefOr[Boolean] = js.native
  var compiled: js.UndefOr[js.Function] = js.native
  var count: js.UndefOr[Double] = js.native
  var cycles: js.UndefOr[Double] = js.native
  var defer: js.UndefOr[Boolean] = js.native
  var delay: js.UndefOr[Double] = js.native
  var fn: js.UndefOr[js.Function] = js.native
  var hz: js.UndefOr[Double] = js.native
  var id: Double = js.native
  var initCount: js.UndefOr[Double] = js.native
  var maxTime: js.UndefOr[Double] = js.native
  var minSamples: js.UndefOr[Double] = js.native
  var minTime: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var options: Options = js.native
  var running: Boolean = js.native
  var stats: js.UndefOr[Stats] = js.native
  var times: js.UndefOr[Times] = js.native
}

object Target {
  @scala.inline
  def apply(id: Double, options: Options, running: Boolean): Target = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], running = running.asInstanceOf[js.Any])
    __obj.asInstanceOf[Target]
  }
  @scala.inline
  implicit class TargetOps[Self <: Target] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: Options): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setRunning(value: Boolean): Self = this.set("running", value.asInstanceOf[js.Any])
    @scala.inline
    def setAsync(value: Boolean): Self = this.set("async", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsync: Self = this.set("async", js.undefined)
    @scala.inline
    def setCompiled(value: js.Function): Self = this.set("compiled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompiled: Self = this.set("compiled", js.undefined)
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setCycles(value: Double): Self = this.set("cycles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCycles: Self = this.set("cycles", js.undefined)
    @scala.inline
    def setDefer(value: Boolean): Self = this.set("defer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefer: Self = this.set("defer", js.undefined)
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setFn(value: js.Function): Self = this.set("fn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFn: Self = this.set("fn", js.undefined)
    @scala.inline
    def setHz(value: Double): Self = this.set("hz", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHz: Self = this.set("hz", js.undefined)
    @scala.inline
    def setInitCount(value: Double): Self = this.set("initCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitCount: Self = this.set("initCount", js.undefined)
    @scala.inline
    def setMaxTime(value: Double): Self = this.set("maxTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxTime: Self = this.set("maxTime", js.undefined)
    @scala.inline
    def setMinSamples(value: Double): Self = this.set("minSamples", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinSamples: Self = this.set("minSamples", js.undefined)
    @scala.inline
    def setMinTime(value: Double): Self = this.set("minTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinTime: Self = this.set("minTime", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setStats(value: Stats): Self = this.set("stats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStats: Self = this.set("stats", js.undefined)
    @scala.inline
    def setTimes(value: Times): Self = this.set("times", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimes: Self = this.set("times", js.undefined)
  }
  
}

