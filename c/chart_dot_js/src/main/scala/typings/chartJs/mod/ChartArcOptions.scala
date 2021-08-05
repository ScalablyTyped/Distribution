package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartArcOptions extends StObject {
  
  var angle: js.UndefOr[Double] = js.undefined
  
  var backgroundColor: js.UndefOr[ChartColor] = js.undefined
  
  var borderAlign: js.UndefOr[BorderAlignment] = js.undefined
  
  var borderColor: js.UndefOr[ChartColor] = js.undefined
  
  var borderWidth: js.UndefOr[Double] = js.undefined
}
object ChartArcOptions {
  
  inline def apply(): ChartArcOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartArcOptions]
  }
  
  extension [Self <: ChartArcOptions](x: Self) {
    
    inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    inline def setBackgroundColor(value: ChartColor): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBackgroundColorVarargs(value: String*): Self = StObject.set(x, "backgroundColor", js.Array(value :_*))
    
    inline def setBorderAlign(value: BorderAlignment): Self = StObject.set(x, "borderAlign", value.asInstanceOf[js.Any])
    
    inline def setBorderAlignUndefined: Self = StObject.set(x, "borderAlign", js.undefined)
    
    inline def setBorderColor(value: ChartColor): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setBorderColorVarargs(value: String*): Self = StObject.set(x, "borderColor", js.Array(value :_*))
    
    inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
  }
}
