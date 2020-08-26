package typings.chartJs.mod

import typings.chartJs.chartJsStrings.bottom
import typings.chartJs.chartJsStrings.default
import typings.chartJs.chartJsStrings.monotone
import typings.chartJs.chartJsStrings.top
import typings.chartJs.chartJsStrings.zero
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartLineOptions extends js.Object {
  var backgroundColor: js.UndefOr[ChartColor] = js.native
  var borderCapStyle: js.UndefOr[String] = js.native
  var borderColor: js.UndefOr[ChartColor] = js.native
  var borderDash: js.UndefOr[js.Array[_]] = js.native
  var borderDashOffset: js.UndefOr[Double] = js.native
  var borderJoinStyle: js.UndefOr[String] = js.native
  var borderWidth: js.UndefOr[Double] = js.native
  var capBezierPoints: js.UndefOr[Boolean] = js.native
  var cubicInterpolationMode: js.UndefOr[default | monotone] = js.native
  var fill: js.UndefOr[zero | top | bottom | Boolean] = js.native
  var stepped: js.UndefOr[Boolean] = js.native
  var tension: js.UndefOr[Double] = js.native
}

object ChartLineOptions {
  @scala.inline
  def apply(): ChartLineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartLineOptions]
  }
  @scala.inline
  implicit class ChartLineOptionsOps[Self <: ChartLineOptions] (val x: Self) extends AnyVal {
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
    def setBorderCapStyle(value: String): Self = this.set("borderCapStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderCapStyle: Self = this.set("borderCapStyle", js.undefined)
    @scala.inline
    def setBorderColorVarargs(value: String*): Self = this.set("borderColor", js.Array(value :_*))
    @scala.inline
    def setBorderColor(value: ChartColor): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    @scala.inline
    def setBorderDashVarargs(value: js.Any*): Self = this.set("borderDash", js.Array(value :_*))
    @scala.inline
    def setBorderDash(value: js.Array[_]): Self = this.set("borderDash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderDash: Self = this.set("borderDash", js.undefined)
    @scala.inline
    def setBorderDashOffset(value: Double): Self = this.set("borderDashOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderDashOffset: Self = this.set("borderDashOffset", js.undefined)
    @scala.inline
    def setBorderJoinStyle(value: String): Self = this.set("borderJoinStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderJoinStyle: Self = this.set("borderJoinStyle", js.undefined)
    @scala.inline
    def setBorderWidth(value: Double): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderWidth: Self = this.set("borderWidth", js.undefined)
    @scala.inline
    def setCapBezierPoints(value: Boolean): Self = this.set("capBezierPoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapBezierPoints: Self = this.set("capBezierPoints", js.undefined)
    @scala.inline
    def setCubicInterpolationMode(value: default | monotone): Self = this.set("cubicInterpolationMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCubicInterpolationMode: Self = this.set("cubicInterpolationMode", js.undefined)
    @scala.inline
    def setFill(value: zero | top | bottom | Boolean): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setStepped(value: Boolean): Self = this.set("stepped", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStepped: Self = this.set("stepped", js.undefined)
    @scala.inline
    def setTension(value: Double): Self = this.set("tension", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTension: Self = this.set("tension", js.undefined)
  }
  
}

