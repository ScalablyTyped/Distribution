package typings.chartJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartScales extends js.Object {
  var display: js.UndefOr[Boolean] = js.native
  var gridLines: js.UndefOr[GridLineOptions] = js.native
  var position: js.UndefOr[PositionType | String] = js.native
  var scaleLabel: js.UndefOr[ScaleTitleOptions] = js.native
  var ticks: js.UndefOr[TickOptions] = js.native
  var `type`: js.UndefOr[ScaleType | String] = js.native
  var xAxes: js.UndefOr[js.Array[ChartXAxe]] = js.native
  var yAxes: js.UndefOr[js.Array[ChartYAxe]] = js.native
}

object ChartScales {
  @scala.inline
  def apply(): ChartScales = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartScales]
  }
  @scala.inline
  implicit class ChartScalesOps[Self <: ChartScales] (val x: Self) extends AnyVal {
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
    def setDisplay(value: Boolean): Self = this.set("display", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    @scala.inline
    def setGridLines(value: GridLineOptions): Self = this.set("gridLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridLines: Self = this.set("gridLines", js.undefined)
    @scala.inline
    def setPosition(value: PositionType | String): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setScaleLabel(value: ScaleTitleOptions): Self = this.set("scaleLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaleLabel: Self = this.set("scaleLabel", js.undefined)
    @scala.inline
    def setTicks(value: TickOptions): Self = this.set("ticks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTicks: Self = this.set("ticks", js.undefined)
    @scala.inline
    def setType(value: ScaleType | String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setXAxesVarargs(value: ChartXAxe*): Self = this.set("xAxes", js.Array(value :_*))
    @scala.inline
    def setXAxes(value: js.Array[ChartXAxe]): Self = this.set("xAxes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXAxes: Self = this.set("xAxes", js.undefined)
    @scala.inline
    def setYAxesVarargs(value: ChartYAxe*): Self = this.set("yAxes", js.Array(value :_*))
    @scala.inline
    def setYAxes(value: js.Array[ChartYAxe]): Self = this.set("yAxes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYAxes: Self = this.set("yAxes", js.undefined)
  }
  
}

