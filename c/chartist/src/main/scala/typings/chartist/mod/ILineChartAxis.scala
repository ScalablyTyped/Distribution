package typings.chartist.mod

import typings.chartist.anon.Y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILineChartAxis extends js.Object {
  var labelInterpolationFnc: js.UndefOr[js.Function] = js.native
  var labelOffset: js.UndefOr[Y] = js.native
  var offset: js.UndefOr[Double] = js.native
  var position: js.UndefOr[String] = js.native
  var showGrid: js.UndefOr[Boolean] = js.native
  var showLabel: js.UndefOr[Boolean] = js.native
}

object ILineChartAxis {
  @scala.inline
  def apply(): ILineChartAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILineChartAxis]
  }
  @scala.inline
  implicit class ILineChartAxisOps[Self <: ILineChartAxis] (val x: Self) extends AnyVal {
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
    def setLabelInterpolationFnc(value: js.Function): Self = this.set("labelInterpolationFnc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelInterpolationFnc: Self = this.set("labelInterpolationFnc", js.undefined)
    @scala.inline
    def setLabelOffset(value: Y): Self = this.set("labelOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelOffset: Self = this.set("labelOffset", js.undefined)
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setShowGrid(value: Boolean): Self = this.set("showGrid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowGrid: Self = this.set("showGrid", js.undefined)
    @scala.inline
    def setShowLabel(value: Boolean): Self = this.set("showLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowLabel: Self = this.set("showLabel", js.undefined)
  }
  
}

