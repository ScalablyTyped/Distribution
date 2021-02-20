package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartScales extends StObject {
  
  var display: js.UndefOr[Boolean] = js.native
  
  var gridLines: js.UndefOr[GridLineOptions] = js.native
  
  var position: js.UndefOr[PositionType | String] = js.native
  
  var scaleLabel: js.UndefOr[ScaleTitleOptions] = js.native
  
  var ticks: js.UndefOr[TickOptions] = js.native
  
  var `type`: js.UndefOr[ScaleType | String] = js.native
  
  var xAxes: js.UndefOr[js.Array[ChartXAxe]] = js.native
  
  var yAxes: js.UndefOr[js.Array[ChartYAxe]] = js.native
}
object ChartScales {
  
  @scala.inline
  def apply(): ChartScales = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartScales]
  }
  
  @scala.inline
  implicit class ChartScalesMutableBuilder[Self <: ChartScales] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplay(value: Boolean): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    @scala.inline
    def setGridLines(value: GridLineOptions): Self = StObject.set(x, "gridLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridLinesUndefined: Self = StObject.set(x, "gridLines", js.undefined)
    
    @scala.inline
    def setPosition(value: PositionType | String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setScaleLabel(value: ScaleTitleOptions): Self = StObject.set(x, "scaleLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleLabelUndefined: Self = StObject.set(x, "scaleLabel", js.undefined)
    
    @scala.inline
    def setTicks(value: TickOptions): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicksUndefined: Self = StObject.set(x, "ticks", js.undefined)
    
    @scala.inline
    def setType(value: ScaleType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setXAxes(value: js.Array[ChartXAxe]): Self = StObject.set(x, "xAxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXAxesUndefined: Self = StObject.set(x, "xAxes", js.undefined)
    
    @scala.inline
    def setXAxesVarargs(value: ChartXAxe*): Self = StObject.set(x, "xAxes", js.Array(value :_*))
    
    @scala.inline
    def setYAxes(value: js.Array[ChartYAxe]): Self = StObject.set(x, "yAxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYAxesUndefined: Self = StObject.set(x, "yAxes", js.undefined)
    
    @scala.inline
    def setYAxesVarargs(value: ChartYAxe*): Self = StObject.set(x, "yAxes", js.Array(value :_*))
  }
}
