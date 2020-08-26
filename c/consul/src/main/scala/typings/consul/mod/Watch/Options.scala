package typings.consul.mod.Watch

import typings.consul.mod.CommonOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var backoffFactor: js.UndefOr[Double] = js.native
  var backoffMax: js.UndefOr[Double] = js.native
  var maxAttempts: js.UndefOr[Double] = js.native
  var method: js.Function = js.native
  var options: js.UndefOr[CommonOptions with WatchOptions] = js.native
}

object Options {
  @scala.inline
  def apply(method: js.Function): Options = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
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
    def setMethod(value: js.Function): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackoffFactor(value: Double): Self = this.set("backoffFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackoffFactor: Self = this.set("backoffFactor", js.undefined)
    @scala.inline
    def setBackoffMax(value: Double): Self = this.set("backoffMax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackoffMax: Self = this.set("backoffMax", js.undefined)
    @scala.inline
    def setMaxAttempts(value: Double): Self = this.set("maxAttempts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxAttempts: Self = this.set("maxAttempts", js.undefined)
    @scala.inline
    def setOptions(value: CommonOptions with WatchOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
  
}

