package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartScales extends StObject {
  
  var display: js.UndefOr[Boolean] = js.undefined
  
  var gridLines: js.UndefOr[GridLineOptions] = js.undefined
  
  var position: js.UndefOr[PositionType | String] = js.undefined
  
  var scaleLabel: js.UndefOr[ScaleTitleOptions] = js.undefined
  
  var ticks: js.UndefOr[TickOptions] = js.undefined
  
  var `type`: js.UndefOr[ScaleType | String] = js.undefined
  
  var xAxes: js.UndefOr[js.Array[ChartXAxe]] = js.undefined
  
  var yAxes: js.UndefOr[js.Array[ChartYAxe]] = js.undefined
}
object ChartScales {
  
  inline def apply(): ChartScales = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartScales]
  }
  
  extension [Self <: ChartScales](x: Self) {
    
    inline def setDisplay(value: Boolean): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    inline def setGridLines(value: GridLineOptions): Self = StObject.set(x, "gridLines", value.asInstanceOf[js.Any])
    
    inline def setGridLinesUndefined: Self = StObject.set(x, "gridLines", js.undefined)
    
    inline def setPosition(value: PositionType | String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setScaleLabel(value: ScaleTitleOptions): Self = StObject.set(x, "scaleLabel", value.asInstanceOf[js.Any])
    
    inline def setScaleLabelUndefined: Self = StObject.set(x, "scaleLabel", js.undefined)
    
    inline def setTicks(value: TickOptions): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
    
    inline def setTicksUndefined: Self = StObject.set(x, "ticks", js.undefined)
    
    inline def setType(value: ScaleType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setXAxes(value: js.Array[ChartXAxe]): Self = StObject.set(x, "xAxes", value.asInstanceOf[js.Any])
    
    inline def setXAxesUndefined: Self = StObject.set(x, "xAxes", js.undefined)
    
    inline def setXAxesVarargs(value: ChartXAxe*): Self = StObject.set(x, "xAxes", js.Array(value :_*))
    
    inline def setYAxes(value: js.Array[ChartYAxe]): Self = StObject.set(x, "yAxes", value.asInstanceOf[js.Any])
    
    inline def setYAxesUndefined: Self = StObject.set(x, "yAxes", js.undefined)
    
    inline def setYAxesVarargs(value: ChartYAxe*): Self = StObject.set(x, "yAxes", js.Array(value :_*))
  }
}
