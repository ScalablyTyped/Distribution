package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AngleLineOptions extends StObject {
  
  var borderDash: js.UndefOr[js.Array[Double]] = js.undefined
  
  var borderDashOffset: js.UndefOr[Double] = js.undefined
  
  var color: js.UndefOr[ChartColor] = js.undefined
  
  var display: js.UndefOr[Boolean] = js.undefined
  
  var lineWidth: js.UndefOr[Double] = js.undefined
}
object AngleLineOptions {
  
  inline def apply(): AngleLineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AngleLineOptions]
  }
  
  extension [Self <: AngleLineOptions](x: Self) {
    
    inline def setBorderDash(value: js.Array[Double]): Self = StObject.set(x, "borderDash", value.asInstanceOf[js.Any])
    
    inline def setBorderDashOffset(value: Double): Self = StObject.set(x, "borderDashOffset", value.asInstanceOf[js.Any])
    
    inline def setBorderDashOffsetUndefined: Self = StObject.set(x, "borderDashOffset", js.undefined)
    
    inline def setBorderDashUndefined: Self = StObject.set(x, "borderDash", js.undefined)
    
    inline def setBorderDashVarargs(value: Double*): Self = StObject.set(x, "borderDash", js.Array(value :_*))
    
    inline def setColor(value: ChartColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColorVarargs(value: String*): Self = StObject.set(x, "color", js.Array(value :_*))
    
    inline def setDisplay(value: Boolean): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    inline def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    inline def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
  }
}
