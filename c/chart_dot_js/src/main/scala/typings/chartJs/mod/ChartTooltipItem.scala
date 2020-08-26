package typings.chartJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartTooltipItem extends js.Object {
  var datasetIndex: js.UndefOr[Double] = js.native
  var index: js.UndefOr[Double] = js.native
  var label: js.UndefOr[String] = js.native
  var value: js.UndefOr[String] = js.native
  var x: js.UndefOr[Double] = js.native
  var xLabel: js.UndefOr[String | Double] = js.native
  var y: js.UndefOr[Double] = js.native
  var yLabel: js.UndefOr[String | Double] = js.native
}

object ChartTooltipItem {
  @scala.inline
  def apply(): ChartTooltipItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartTooltipItem]
  }
  @scala.inline
  implicit class ChartTooltipItemOps[Self <: ChartTooltipItem] (val x: Self) extends AnyVal {
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
    def setDatasetIndex(value: Double): Self = this.set("datasetIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatasetIndex: Self = this.set("datasetIndex", js.undefined)
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setXLabel(value: String | Double): Self = this.set("xLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXLabel: Self = this.set("xLabel", js.undefined)
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
    @scala.inline
    def setYLabel(value: String | Double): Self = this.set("yLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYLabel: Self = this.set("yLabel", js.undefined)
  }
  
}

