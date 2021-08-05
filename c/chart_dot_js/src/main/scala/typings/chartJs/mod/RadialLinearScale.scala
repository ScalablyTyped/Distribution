package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RadialLinearScale extends StObject {
  
  var angleLines: js.UndefOr[AngleLineOptions] = js.undefined
  
  var animate: js.UndefOr[Boolean] = js.undefined
  
  var display: js.UndefOr[Boolean] = js.undefined
  
  var gridLines: js.UndefOr[GridLineOptions] = js.undefined
  
  var pointLabels: js.UndefOr[PointLabelOptions] = js.undefined
  
  var position: js.UndefOr[PositionType] = js.undefined
  
  var ticks: js.UndefOr[LinearTickOptions] = js.undefined
}
object RadialLinearScale {
  
  inline def apply(): RadialLinearScale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadialLinearScale]
  }
  
  extension [Self <: RadialLinearScale](x: Self) {
    
    inline def setAngleLines(value: AngleLineOptions): Self = StObject.set(x, "angleLines", value.asInstanceOf[js.Any])
    
    inline def setAngleLinesUndefined: Self = StObject.set(x, "angleLines", js.undefined)
    
    inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setDisplay(value: Boolean): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    inline def setGridLines(value: GridLineOptions): Self = StObject.set(x, "gridLines", value.asInstanceOf[js.Any])
    
    inline def setGridLinesUndefined: Self = StObject.set(x, "gridLines", js.undefined)
    
    inline def setPointLabels(value: PointLabelOptions): Self = StObject.set(x, "pointLabels", value.asInstanceOf[js.Any])
    
    inline def setPointLabelsUndefined: Self = StObject.set(x, "pointLabels", js.undefined)
    
    inline def setPosition(value: PositionType): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setTicks(value: LinearTickOptions): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
    
    inline def setTicksUndefined: Self = StObject.set(x, "ticks", js.undefined)
  }
}
