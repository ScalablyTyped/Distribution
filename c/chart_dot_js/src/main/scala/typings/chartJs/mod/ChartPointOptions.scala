package typings.chartJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartPointOptions extends js.Object {
  var backgroundColor: js.UndefOr[ChartColor] = js.native
  var borderColor: js.UndefOr[ChartColor] = js.native
  var borderWidth: js.UndefOr[Double] = js.native
  var hitRadius: js.UndefOr[Double] = js.native
  var hoverBorderWidth: js.UndefOr[Double] = js.native
  var hoverRadius: js.UndefOr[Double] = js.native
  var pointStyle: js.UndefOr[PointStyle] = js.native
  var radius: js.UndefOr[Double] = js.native
}

object ChartPointOptions {
  @scala.inline
  def apply(): ChartPointOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartPointOptions]
  }
  @scala.inline
  implicit class ChartPointOptionsOps[Self <: ChartPointOptions] (val x: Self) extends AnyVal {
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
    def setBackgroundColorVarargs(value: String*): Self = this.set("backgroundColor", js.Array(value :_*))
    @scala.inline
    def setBackgroundColor(value: ChartColor): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setBorderColorVarargs(value: String*): Self = this.set("borderColor", js.Array(value :_*))
    @scala.inline
    def setBorderColor(value: ChartColor): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    @scala.inline
    def setBorderWidth(value: Double): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderWidth: Self = this.set("borderWidth", js.undefined)
    @scala.inline
    def setHitRadius(value: Double): Self = this.set("hitRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHitRadius: Self = this.set("hitRadius", js.undefined)
    @scala.inline
    def setHoverBorderWidth(value: Double): Self = this.set("hoverBorderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverBorderWidth: Self = this.set("hoverBorderWidth", js.undefined)
    @scala.inline
    def setHoverRadius(value: Double): Self = this.set("hoverRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverRadius: Self = this.set("hoverRadius", js.undefined)
    @scala.inline
    def setPointStyle(value: PointStyle): Self = this.set("pointStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointStyle: Self = this.set("pointStyle", js.undefined)
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
  }
  
}

