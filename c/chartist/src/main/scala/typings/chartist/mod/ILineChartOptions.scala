package typings.chartist.mod

import org.scalablytyped.runtime.StringDictionary
import typings.chartist.anon.AreaBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILineChartOptions
  extends StObject
     with IChartOptions {
  
  var areaBase: js.UndefOr[Double] = js.undefined
  
  var axisX: js.UndefOr[IChartistStepAxis | IChartistFixedScaleAxis | IChartistAutoScaleAxis] = js.undefined
  
  var axisY: js.UndefOr[IChartistStepAxis | IChartistFixedScaleAxis | IChartistAutoScaleAxis] = js.undefined
  
  var chartPadding: js.UndefOr[IChartPadding] = js.undefined
  
  var classNames: js.UndefOr[ILineChartClasses] = js.undefined
  
  var fullWidth: js.UndefOr[Boolean] = js.undefined
  
  var height: js.UndefOr[Double | String] = js.undefined
  
  var high: js.UndefOr[Double] = js.undefined
  
  var lineSmooth: js.UndefOr[js.Function | Boolean] = js.undefined
  
  var low: js.UndefOr[Double] = js.undefined
  
  var series: js.UndefOr[StringDictionary[AreaBase]] = js.undefined
  
  var showArea: js.UndefOr[Boolean] = js.undefined
  
  var showLine: js.UndefOr[Boolean] = js.undefined
  
  var showPoint: js.UndefOr[Boolean] = js.undefined
  
  var ticks: js.UndefOr[js.Array[String | Double]] = js.undefined
  
  var width: js.UndefOr[Double | String] = js.undefined
}
object ILineChartOptions {
  
  @scala.inline
  def apply(): ILineChartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILineChartOptions]
  }
  
  @scala.inline
  implicit class ILineChartOptionsMutableBuilder[Self <: ILineChartOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAreaBase(value: Double): Self = StObject.set(x, "areaBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAreaBaseUndefined: Self = StObject.set(x, "areaBase", js.undefined)
    
    @scala.inline
    def setAxisX(value: IChartistStepAxis | IChartistFixedScaleAxis | IChartistAutoScaleAxis): Self = StObject.set(x, "axisX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisXUndefined: Self = StObject.set(x, "axisX", js.undefined)
    
    @scala.inline
    def setAxisY(value: IChartistStepAxis | IChartistFixedScaleAxis | IChartistAutoScaleAxis): Self = StObject.set(x, "axisY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisYUndefined: Self = StObject.set(x, "axisY", js.undefined)
    
    @scala.inline
    def setChartPadding(value: IChartPadding): Self = StObject.set(x, "chartPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChartPaddingUndefined: Self = StObject.set(x, "chartPadding", js.undefined)
    
    @scala.inline
    def setClassNames(value: ILineChartClasses): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
    
    @scala.inline
    def setFullWidth(value: Boolean): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullWidthUndefined: Self = StObject.set(x, "fullWidth", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHigh(value: Double): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighUndefined: Self = StObject.set(x, "high", js.undefined)
    
    @scala.inline
    def setLineSmooth(value: js.Function | Boolean): Self = StObject.set(x, "lineSmooth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineSmoothUndefined: Self = StObject.set(x, "lineSmooth", js.undefined)
    
    @scala.inline
    def setLow(value: Double): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowUndefined: Self = StObject.set(x, "low", js.undefined)
    
    @scala.inline
    def setSeries(value: StringDictionary[AreaBase]): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    @scala.inline
    def setShowArea(value: Boolean): Self = StObject.set(x, "showArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowAreaUndefined: Self = StObject.set(x, "showArea", js.undefined)
    
    @scala.inline
    def setShowLine(value: Boolean): Self = StObject.set(x, "showLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowLineUndefined: Self = StObject.set(x, "showLine", js.undefined)
    
    @scala.inline
    def setShowPoint(value: Boolean): Self = StObject.set(x, "showPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowPointUndefined: Self = StObject.set(x, "showPoint", js.undefined)
    
    @scala.inline
    def setTicks(value: js.Array[String | Double]): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicksUndefined: Self = StObject.set(x, "ticks", js.undefined)
    
    @scala.inline
    def setTicksVarargs(value: (String | Double)*): Self = StObject.set(x, "ticks", js.Array(value :_*))
    
    @scala.inline
    def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
