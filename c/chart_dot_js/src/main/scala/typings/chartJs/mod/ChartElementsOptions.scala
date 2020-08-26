package typings.chartJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartElementsOptions extends js.Object {
  var arc: js.UndefOr[ChartArcOptions] = js.native
  var line: js.UndefOr[ChartLineOptions] = js.native
  var point: js.UndefOr[ChartPointOptions] = js.native
  var rectangle: js.UndefOr[ChartRectangleOptions] = js.native
}

object ChartElementsOptions {
  @scala.inline
  def apply(): ChartElementsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartElementsOptions]
  }
  @scala.inline
  implicit class ChartElementsOptionsOps[Self <: ChartElementsOptions] (val x: Self) extends AnyVal {
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
    def setArc(value: ChartArcOptions): Self = this.set("arc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArc: Self = this.set("arc", js.undefined)
    @scala.inline
    def setLine(value: ChartLineOptions): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    @scala.inline
    def setPoint(value: ChartPointOptions): Self = this.set("point", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePoint: Self = this.set("point", js.undefined)
    @scala.inline
    def setRectangle(value: ChartRectangleOptions): Self = this.set("rectangle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRectangle: Self = this.set("rectangle", js.undefined)
  }
  
}

