package typings.chartist.mod

import typings.chartist.anon.Y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBarChartAxis extends StObject {
  
  var labelInterpolationFnc: js.UndefOr[js.Function] = js.undefined
  
  var labelOffset: js.UndefOr[Y] = js.undefined
  
  var offset: js.UndefOr[Double] = js.undefined
  
  var onlyInteger: js.UndefOr[Boolean] = js.undefined
  
  var position: js.UndefOr[String] = js.undefined
  
  var scaleMinSpace: js.UndefOr[Double] = js.undefined
  
  var showGrid: js.UndefOr[Boolean] = js.undefined
  
  var showLabel: js.UndefOr[Boolean] = js.undefined
}
object IBarChartAxis {
  
  inline def apply(): IBarChartAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBarChartAxis]
  }
  
  extension [Self <: IBarChartAxis](x: Self) {
    
    inline def setLabelInterpolationFnc(value: js.Function): Self = StObject.set(x, "labelInterpolationFnc", value.asInstanceOf[js.Any])
    
    inline def setLabelInterpolationFncUndefined: Self = StObject.set(x, "labelInterpolationFnc", js.undefined)
    
    inline def setLabelOffset(value: Y): Self = StObject.set(x, "labelOffset", value.asInstanceOf[js.Any])
    
    inline def setLabelOffsetUndefined: Self = StObject.set(x, "labelOffset", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOnlyInteger(value: Boolean): Self = StObject.set(x, "onlyInteger", value.asInstanceOf[js.Any])
    
    inline def setOnlyIntegerUndefined: Self = StObject.set(x, "onlyInteger", js.undefined)
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setScaleMinSpace(value: Double): Self = StObject.set(x, "scaleMinSpace", value.asInstanceOf[js.Any])
    
    inline def setScaleMinSpaceUndefined: Self = StObject.set(x, "scaleMinSpace", js.undefined)
    
    inline def setShowGrid(value: Boolean): Self = StObject.set(x, "showGrid", value.asInstanceOf[js.Any])
    
    inline def setShowGridUndefined: Self = StObject.set(x, "showGrid", js.undefined)
    
    inline def setShowLabel(value: Boolean): Self = StObject.set(x, "showLabel", value.asInstanceOf[js.Any])
    
    inline def setShowLabelUndefined: Self = StObject.set(x, "showLabel", js.undefined)
  }
}
