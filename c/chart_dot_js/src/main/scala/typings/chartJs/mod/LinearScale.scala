package typings.chartJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinearScale extends ChartScales {
  @JSName("ticks")
  var ticks_LinearScale: js.UndefOr[LinearTickOptions] = js.native
}

object LinearScale {
  @scala.inline
  def apply(): LinearScale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinearScale]
  }
  @scala.inline
  implicit class LinearScaleOps[Self <: LinearScale] (val x: Self) extends AnyVal {
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
    def setTicks(value: LinearTickOptions): Self = this.set("ticks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTicks: Self = this.set("ticks", js.undefined)
  }
  
}

