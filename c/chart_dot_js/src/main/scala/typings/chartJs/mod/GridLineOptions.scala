package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridLineOptions extends StObject {
  
  var borderDash: js.UndefOr[js.Array[Double]] = js.undefined
  
  var borderDashOffset: js.UndefOr[Double] = js.undefined
  
  var circular: js.UndefOr[Boolean] = js.undefined
  
  var color: js.UndefOr[ChartColor] = js.undefined
  
  var display: js.UndefOr[Boolean] = js.undefined
  
  var drawBorder: js.UndefOr[Boolean] = js.undefined
  
  var drawOnChartArea: js.UndefOr[Boolean] = js.undefined
  
  var drawTicks: js.UndefOr[Boolean] = js.undefined
  
  var lineWidth: js.UndefOr[Double | js.Array[Double]] = js.undefined
  
  var offsetGridLines: js.UndefOr[Boolean] = js.undefined
  
  var tickMarkLength: js.UndefOr[Double] = js.undefined
  
  var z: js.UndefOr[Double] = js.undefined
  
  var zeroLineBorderDash: js.UndefOr[js.Array[Double]] = js.undefined
  
  var zeroLineBorderDashOffset: js.UndefOr[Double] = js.undefined
  
  var zeroLineColor: js.UndefOr[ChartColor] = js.undefined
  
  var zeroLineWidth: js.UndefOr[Double] = js.undefined
}
object GridLineOptions {
  
  inline def apply(): GridLineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridLineOptions]
  }
  
  extension [Self <: GridLineOptions](x: Self) {
    
    inline def setBorderDash(value: js.Array[Double]): Self = StObject.set(x, "borderDash", value.asInstanceOf[js.Any])
    
    inline def setBorderDashOffset(value: Double): Self = StObject.set(x, "borderDashOffset", value.asInstanceOf[js.Any])
    
    inline def setBorderDashOffsetUndefined: Self = StObject.set(x, "borderDashOffset", js.undefined)
    
    inline def setBorderDashUndefined: Self = StObject.set(x, "borderDash", js.undefined)
    
    inline def setBorderDashVarargs(value: Double*): Self = StObject.set(x, "borderDash", js.Array(value :_*))
    
    inline def setCircular(value: Boolean): Self = StObject.set(x, "circular", value.asInstanceOf[js.Any])
    
    inline def setCircularUndefined: Self = StObject.set(x, "circular", js.undefined)
    
    inline def setColor(value: ChartColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColorVarargs(value: String*): Self = StObject.set(x, "color", js.Array(value :_*))
    
    inline def setDisplay(value: Boolean): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    inline def setDrawBorder(value: Boolean): Self = StObject.set(x, "drawBorder", value.asInstanceOf[js.Any])
    
    inline def setDrawBorderUndefined: Self = StObject.set(x, "drawBorder", js.undefined)
    
    inline def setDrawOnChartArea(value: Boolean): Self = StObject.set(x, "drawOnChartArea", value.asInstanceOf[js.Any])
    
    inline def setDrawOnChartAreaUndefined: Self = StObject.set(x, "drawOnChartArea", js.undefined)
    
    inline def setDrawTicks(value: Boolean): Self = StObject.set(x, "drawTicks", value.asInstanceOf[js.Any])
    
    inline def setDrawTicksUndefined: Self = StObject.set(x, "drawTicks", js.undefined)
    
    inline def setLineWidth(value: Double | js.Array[Double]): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    inline def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
    
    inline def setLineWidthVarargs(value: Double*): Self = StObject.set(x, "lineWidth", js.Array(value :_*))
    
    inline def setOffsetGridLines(value: Boolean): Self = StObject.set(x, "offsetGridLines", value.asInstanceOf[js.Any])
    
    inline def setOffsetGridLinesUndefined: Self = StObject.set(x, "offsetGridLines", js.undefined)
    
    inline def setTickMarkLength(value: Double): Self = StObject.set(x, "tickMarkLength", value.asInstanceOf[js.Any])
    
    inline def setTickMarkLengthUndefined: Self = StObject.set(x, "tickMarkLength", js.undefined)
    
    inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    
    inline def setZUndefined: Self = StObject.set(x, "z", js.undefined)
    
    inline def setZeroLineBorderDash(value: js.Array[Double]): Self = StObject.set(x, "zeroLineBorderDash", value.asInstanceOf[js.Any])
    
    inline def setZeroLineBorderDashOffset(value: Double): Self = StObject.set(x, "zeroLineBorderDashOffset", value.asInstanceOf[js.Any])
    
    inline def setZeroLineBorderDashOffsetUndefined: Self = StObject.set(x, "zeroLineBorderDashOffset", js.undefined)
    
    inline def setZeroLineBorderDashUndefined: Self = StObject.set(x, "zeroLineBorderDash", js.undefined)
    
    inline def setZeroLineBorderDashVarargs(value: Double*): Self = StObject.set(x, "zeroLineBorderDash", js.Array(value :_*))
    
    inline def setZeroLineColor(value: ChartColor): Self = StObject.set(x, "zeroLineColor", value.asInstanceOf[js.Any])
    
    inline def setZeroLineColorUndefined: Self = StObject.set(x, "zeroLineColor", js.undefined)
    
    inline def setZeroLineColorVarargs(value: String*): Self = StObject.set(x, "zeroLineColor", js.Array(value :_*))
    
    inline def setZeroLineWidth(value: Double): Self = StObject.set(x, "zeroLineWidth", value.asInstanceOf[js.Any])
    
    inline def setZeroLineWidthUndefined: Self = StObject.set(x, "zeroLineWidth", js.undefined)
  }
}
