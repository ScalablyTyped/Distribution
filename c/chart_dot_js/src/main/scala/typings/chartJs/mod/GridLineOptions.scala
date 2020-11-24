package typings.chartJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridLineOptions extends js.Object {
  
  var borderDash: js.UndefOr[js.Array[Double]] = js.native
  
  var borderDashOffset: js.UndefOr[Double] = js.native
  
  var circular: js.UndefOr[Boolean] = js.native
  
  var color: js.UndefOr[ChartColor] = js.native
  
  var display: js.UndefOr[Boolean] = js.native
  
  var drawBorder: js.UndefOr[Boolean] = js.native
  
  var drawOnChartArea: js.UndefOr[Boolean] = js.native
  
  var drawTicks: js.UndefOr[Boolean] = js.native
  
  var lineWidth: js.UndefOr[Double | js.Array[Double]] = js.native
  
  var offsetGridLines: js.UndefOr[Boolean] = js.native
  
  var tickMarkLength: js.UndefOr[Double] = js.native
  
  var z: js.UndefOr[Double] = js.native
  
  var zeroLineBorderDash: js.UndefOr[js.Array[Double]] = js.native
  
  var zeroLineBorderDashOffset: js.UndefOr[Double] = js.native
  
  var zeroLineColor: js.UndefOr[ChartColor] = js.native
  
  var zeroLineWidth: js.UndefOr[Double] = js.native
}
object GridLineOptions {
  
  @scala.inline
  def apply(): GridLineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridLineOptions]
  }
  
  @scala.inline
  implicit class GridLineOptionsOps[Self <: GridLineOptions] (val x: Self) extends AnyVal {
    
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
    def setBorderDashVarargs(value: Double*): Self = this.set("borderDash", js.Array(value :_*))
    
    @scala.inline
    def setBorderDash(value: js.Array[Double]): Self = this.set("borderDash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderDash: Self = this.set("borderDash", js.undefined)
    
    @scala.inline
    def setBorderDashOffset(value: Double): Self = this.set("borderDashOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderDashOffset: Self = this.set("borderDashOffset", js.undefined)
    
    @scala.inline
    def setCircular(value: Boolean): Self = this.set("circular", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCircular: Self = this.set("circular", js.undefined)
    
    @scala.inline
    def setColorVarargs(value: String*): Self = this.set("color", js.Array(value :_*))
    
    @scala.inline
    def setColor(value: ChartColor): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setDisplay(value: Boolean): Self = this.set("display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    
    @scala.inline
    def setDrawBorder(value: Boolean): Self = this.set("drawBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrawBorder: Self = this.set("drawBorder", js.undefined)
    
    @scala.inline
    def setDrawOnChartArea(value: Boolean): Self = this.set("drawOnChartArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrawOnChartArea: Self = this.set("drawOnChartArea", js.undefined)
    
    @scala.inline
    def setDrawTicks(value: Boolean): Self = this.set("drawTicks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrawTicks: Self = this.set("drawTicks", js.undefined)
    
    @scala.inline
    def setLineWidthVarargs(value: Double*): Self = this.set("lineWidth", js.Array(value :_*))
    
    @scala.inline
    def setLineWidth(value: Double | js.Array[Double]): Self = this.set("lineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineWidth: Self = this.set("lineWidth", js.undefined)
    
    @scala.inline
    def setOffsetGridLines(value: Boolean): Self = this.set("offsetGridLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetGridLines: Self = this.set("offsetGridLines", js.undefined)
    
    @scala.inline
    def setTickMarkLength(value: Double): Self = this.set("tickMarkLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickMarkLength: Self = this.set("tickMarkLength", js.undefined)
    
    @scala.inline
    def setZ(value: Double): Self = this.set("z", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZ: Self = this.set("z", js.undefined)
    
    @scala.inline
    def setZeroLineBorderDashVarargs(value: Double*): Self = this.set("zeroLineBorderDash", js.Array(value :_*))
    
    @scala.inline
    def setZeroLineBorderDash(value: js.Array[Double]): Self = this.set("zeroLineBorderDash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZeroLineBorderDash: Self = this.set("zeroLineBorderDash", js.undefined)
    
    @scala.inline
    def setZeroLineBorderDashOffset(value: Double): Self = this.set("zeroLineBorderDashOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZeroLineBorderDashOffset: Self = this.set("zeroLineBorderDashOffset", js.undefined)
    
    @scala.inline
    def setZeroLineColorVarargs(value: String*): Self = this.set("zeroLineColor", js.Array(value :_*))
    
    @scala.inline
    def setZeroLineColor(value: ChartColor): Self = this.set("zeroLineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZeroLineColor: Self = this.set("zeroLineColor", js.undefined)
    
    @scala.inline
    def setZeroLineWidth(value: Double): Self = this.set("zeroLineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZeroLineWidth: Self = this.set("zeroLineWidth", js.undefined)
  }
}
