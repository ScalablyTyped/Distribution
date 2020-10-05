package typings.chartJs.mod

import typings.chartJs.chartJsStrings.bevel
import typings.chartJs.chartJsStrings.butt
import typings.chartJs.chartJsStrings.miter
import typings.chartJs.chartJsStrings.round
import typings.chartJs.chartJsStrings.square
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartLegendItem extends js.Object {
  var fillStyle: js.UndefOr[String] = js.native
  var hidden: js.UndefOr[Boolean] = js.native
  var index: js.UndefOr[Double] = js.native
  var lineCap: js.UndefOr[butt | round | square] = js.native
  var lineDash: js.UndefOr[js.Array[Double]] = js.native
  var lineDashOffset: js.UndefOr[Double] = js.native
  var lineJoin: js.UndefOr[bevel | round | miter] = js.native
  var lineWidth: js.UndefOr[Double] = js.native
  var pointStyle: js.UndefOr[PointStyle] = js.native
  var strokeStyle: js.UndefOr[String] = js.native
  var text: js.UndefOr[String] = js.native
}

object ChartLegendItem {
  @scala.inline
  def apply(): ChartLegendItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartLegendItem]
  }
  @scala.inline
  implicit class ChartLegendItemOps[Self <: ChartLegendItem] (val x: Self) extends AnyVal {
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
    def setFillStyle(value: String): Self = this.set("fillStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillStyle: Self = this.set("fillStyle", js.undefined)
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setLineCap(value: butt | round | square): Self = this.set("lineCap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineCap: Self = this.set("lineCap", js.undefined)
    @scala.inline
    def setLineDashVarargs(value: Double*): Self = this.set("lineDash", js.Array(value :_*))
    @scala.inline
    def setLineDash(value: js.Array[Double]): Self = this.set("lineDash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineDash: Self = this.set("lineDash", js.undefined)
    @scala.inline
    def setLineDashOffset(value: Double): Self = this.set("lineDashOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineDashOffset: Self = this.set("lineDashOffset", js.undefined)
    @scala.inline
    def setLineJoin(value: bevel | round | miter): Self = this.set("lineJoin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineJoin: Self = this.set("lineJoin", js.undefined)
    @scala.inline
    def setLineWidth(value: Double): Self = this.set("lineWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineWidth: Self = this.set("lineWidth", js.undefined)
    @scala.inline
    def setPointStyle(value: PointStyle): Self = this.set("pointStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointStyle: Self = this.set("pointStyle", js.undefined)
    @scala.inline
    def setStrokeStyle(value: String): Self = this.set("strokeStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeStyle: Self = this.set("strokeStyle", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

