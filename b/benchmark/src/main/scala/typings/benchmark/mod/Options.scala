package typings.benchmark.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var async: js.UndefOr[Boolean] = js.native
  var defer: js.UndefOr[Boolean] = js.native
  var delay: js.UndefOr[Double] = js.native
  var fn: js.UndefOr[js.Function | String] = js.native
  var id: js.UndefOr[String] = js.native
  var initCount: js.UndefOr[Double] = js.native
  var maxTime: js.UndefOr[Double] = js.native
  var minSamples: js.UndefOr[Double] = js.native
  var minTime: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var onAbort: js.UndefOr[js.Function] = js.native
  var onComplete: js.UndefOr[js.Function] = js.native
  var onCycle: js.UndefOr[js.Function] = js.native
  var onError: js.UndefOr[js.Function] = js.native
  var onReset: js.UndefOr[js.Function] = js.native
  var onStart: js.UndefOr[js.Function] = js.native
  var queued: js.UndefOr[Boolean] = js.native
  var setup: js.UndefOr[js.Function | String] = js.native
  var teardown: js.UndefOr[js.Function | String] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setAsync(value: Boolean): Self = this.set("async", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsync: Self = this.set("async", js.undefined)
    @scala.inline
    def setDefer(value: Boolean): Self = this.set("defer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefer: Self = this.set("defer", js.undefined)
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setFn(value: js.Function | String): Self = this.set("fn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFn: Self = this.set("fn", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
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
    def setOnAbort(value: js.Function): Self = this.set("onAbort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnAbort: Self = this.set("onAbort", js.undefined)
    @scala.inline
    def setOnComplete(value: js.Function): Self = this.set("onComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnComplete: Self = this.set("onComplete", js.undefined)
    @scala.inline
    def setOnCycle(value: js.Function): Self = this.set("onCycle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnCycle: Self = this.set("onCycle", js.undefined)
    @scala.inline
    def setOnError(value: js.Function): Self = this.set("onError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    @scala.inline
    def setOnReset(value: js.Function): Self = this.set("onReset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnReset: Self = this.set("onReset", js.undefined)
    @scala.inline
    def setOnStart(value: js.Function): Self = this.set("onStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnStart: Self = this.set("onStart", js.undefined)
    @scala.inline
    def setQueued(value: Boolean): Self = this.set("queued", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueued: Self = this.set("queued", js.undefined)
    @scala.inline
    def setSetup(value: js.Function | String): Self = this.set("setup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetup: Self = this.set("setup", js.undefined)
    @scala.inline
    def setTeardown(value: js.Function | String): Self = this.set("teardown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTeardown: Self = this.set("teardown", js.undefined)
  }
  
}

