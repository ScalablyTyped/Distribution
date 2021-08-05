package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartRectangleOptions extends StObject {
  
  var backgroundColor: js.UndefOr[ChartColor] = js.undefined
  
  var borderColor: js.UndefOr[ChartColor] = js.undefined
  
  var borderSkipped: js.UndefOr[String] = js.undefined
  
  var borderWidth: js.UndefOr[Double] = js.undefined
}
object ChartRectangleOptions {
  
  inline def apply(): ChartRectangleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartRectangleOptions]
  }
  
  extension [Self <: ChartRectangleOptions](x: Self) {
    
    inline def setBackgroundColor(value: ChartColor): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBackgroundColorVarargs(value: String*): Self = StObject.set(x, "backgroundColor", js.Array(value :_*))
    
    inline def setBorderColor(value: ChartColor): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setBorderColorVarargs(value: String*): Self = StObject.set(x, "borderColor", js.Array(value :_*))
    
    inline def setBorderSkipped(value: String): Self = StObject.set(x, "borderSkipped", value.asInstanceOf[js.Any])
    
    inline def setBorderSkippedUndefined: Self = StObject.set(x, "borderSkipped", js.undefined)
    
    inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
  }
}
