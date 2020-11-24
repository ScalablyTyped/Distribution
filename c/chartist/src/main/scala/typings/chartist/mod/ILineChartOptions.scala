package typings.chartist.mod

import org.scalablytyped.runtime.StringDictionary
import typings.chartist.anon.AreaBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILineChartOptions extends IChartOptions {
  
  var areaBase: js.UndefOr[Double] = js.native
  
  var axisX: js.UndefOr[IChartistStepAxis | IChartistFixedScaleAxis | IChartistAutoScaleAxis] = js.native
  
  var axisY: js.UndefOr[IChartistStepAxis | IChartistFixedScaleAxis | IChartistAutoScaleAxis] = js.native
  
  var chartPadding: js.UndefOr[IChartPadding] = js.native
  
  var classNames: js.UndefOr[ILineChartClasses] = js.native
  
  var fullWidth: js.UndefOr[Boolean] = js.native
  
  var height: js.UndefOr[Double | String] = js.native
  
  var high: js.UndefOr[Double] = js.native
  
  var lineSmooth: js.UndefOr[js.Function | Boolean] = js.native
  
  var low: js.UndefOr[Double] = js.native
  
  var series: js.UndefOr[StringDictionary[AreaBase]] = js.native
  
  var showArea: js.UndefOr[Boolean] = js.native
  
  var showLine: js.UndefOr[Boolean] = js.native
  
  var showPoint: js.UndefOr[Boolean] = js.native
  
  var ticks: js.UndefOr[js.Array[String | Double]] = js.native
  
  var width: js.UndefOr[Double | String] = js.native
}
object ILineChartOptions {
  
  @scala.inline
  def apply(): ILineChartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILineChartOptions]
  }
  
  @scala.inline
  implicit class ILineChartOptionsOps[Self <: ILineChartOptions] (val x: Self) extends AnyVal {
    
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
    def setAreaBase(value: Double): Self = this.set("areaBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAreaBase: Self = this.set("areaBase", js.undefined)
    
    @scala.inline
    def setAxisX(value: IChartistStepAxis | IChartistFixedScaleAxis | IChartistAutoScaleAxis): Self = this.set("axisX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxisX: Self = this.set("axisX", js.undefined)
    
    @scala.inline
    def setAxisY(value: IChartistStepAxis | IChartistFixedScaleAxis | IChartistAutoScaleAxis): Self = this.set("axisY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxisY: Self = this.set("axisY", js.undefined)
    
    @scala.inline
    def setChartPadding(value: IChartPadding): Self = this.set("chartPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChartPadding: Self = this.set("chartPadding", js.undefined)
    
    @scala.inline
    def setClassNames(value: ILineChartClasses): Self = this.set("classNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassNames: Self = this.set("classNames", js.undefined)
    
    @scala.inline
    def setFullWidth(value: Boolean): Self = this.set("fullWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullWidth: Self = this.set("fullWidth", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHigh(value: Double): Self = this.set("high", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHigh: Self = this.set("high", js.undefined)
    
    @scala.inline
    def setLineSmooth(value: js.Function | Boolean): Self = this.set("lineSmooth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineSmooth: Self = this.set("lineSmooth", js.undefined)
    
    @scala.inline
    def setLow(value: Double): Self = this.set("low", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLow: Self = this.set("low", js.undefined)
    
    @scala.inline
    def setSeries(value: StringDictionary[AreaBase]): Self = this.set("series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeries: Self = this.set("series", js.undefined)
    
    @scala.inline
    def setShowArea(value: Boolean): Self = this.set("showArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowArea: Self = this.set("showArea", js.undefined)
    
    @scala.inline
    def setShowLine(value: Boolean): Self = this.set("showLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowLine: Self = this.set("showLine", js.undefined)
    
    @scala.inline
    def setShowPoint(value: Boolean): Self = this.set("showPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowPoint: Self = this.set("showPoint", js.undefined)
    
    @scala.inline
    def setTicksVarargs(value: (String | Double)*): Self = this.set("ticks", js.Array(value :_*))
    
    @scala.inline
    def setTicks(value: js.Array[String | Double]): Self = this.set("ticks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTicks: Self = this.set("ticks", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
