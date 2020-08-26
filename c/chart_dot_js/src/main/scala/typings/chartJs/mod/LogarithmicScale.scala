package typings.chartJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogarithmicScale extends ChartScales {
  @JSName("ticks")
  var ticks_LogarithmicScale: js.UndefOr[LogarithmicTickOptions] = js.native
}

object LogarithmicScale {
  @scala.inline
  def apply(): LogarithmicScale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogarithmicScale]
  }
  @scala.inline
  implicit class LogarithmicScaleOps[Self <: LogarithmicScale] (val x: Self) extends AnyVal {
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
    def setTicks(value: LogarithmicTickOptions): Self = this.set("ticks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTicks: Self = this.set("ticks", js.undefined)
  }
  
}

