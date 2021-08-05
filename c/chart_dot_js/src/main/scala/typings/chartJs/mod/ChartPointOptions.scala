package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartPointOptions extends StObject {
  
  var backgroundColor: js.UndefOr[ChartColor] = js.undefined
  
  var borderColor: js.UndefOr[ChartColor] = js.undefined
  
  var borderWidth: js.UndefOr[Double] = js.undefined
  
  var hitRadius: js.UndefOr[Double] = js.undefined
  
  var hoverBorderWidth: js.UndefOr[Double] = js.undefined
  
  var hoverRadius: js.UndefOr[Double] = js.undefined
  
  var pointStyle: js.UndefOr[PointStyle] = js.undefined
  
  var radius: js.UndefOr[Double] = js.undefined
  
  var rotation: js.UndefOr[Double] = js.undefined
}
object ChartPointOptions {
  
  inline def apply(): ChartPointOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartPointOptions]
  }
  
  extension [Self <: ChartPointOptions](x: Self) {
    
    inline def setBackgroundColor(value: ChartColor): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBackgroundColorVarargs(value: String*): Self = StObject.set(x, "backgroundColor", js.Array(value :_*))
    
    inline def setBorderColor(value: ChartColor): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setBorderColorVarargs(value: String*): Self = StObject.set(x, "borderColor", js.Array(value :_*))
    
    inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    inline def setHitRadius(value: Double): Self = StObject.set(x, "hitRadius", value.asInstanceOf[js.Any])
    
    inline def setHitRadiusUndefined: Self = StObject.set(x, "hitRadius", js.undefined)
    
    inline def setHoverBorderWidth(value: Double): Self = StObject.set(x, "hoverBorderWidth", value.asInstanceOf[js.Any])
    
    inline def setHoverBorderWidthUndefined: Self = StObject.set(x, "hoverBorderWidth", js.undefined)
    
    inline def setHoverRadius(value: Double): Self = StObject.set(x, "hoverRadius", value.asInstanceOf[js.Any])
    
    inline def setHoverRadiusUndefined: Self = StObject.set(x, "hoverRadius", js.undefined)
    
    inline def setPointStyle(value: PointStyle): Self = StObject.set(x, "pointStyle", value.asInstanceOf[js.Any])
    
    inline def setPointStyleUndefined: Self = StObject.set(x, "pointStyle", js.undefined)
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
  }
}
