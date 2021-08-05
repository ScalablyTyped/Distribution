package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartElementsOptions extends StObject {
  
  var arc: js.UndefOr[ChartArcOptions] = js.undefined
  
  var line: js.UndefOr[ChartLineOptions] = js.undefined
  
  var point: js.UndefOr[ChartPointOptions] = js.undefined
  
  var rectangle: js.UndefOr[ChartRectangleOptions] = js.undefined
}
object ChartElementsOptions {
  
  inline def apply(): ChartElementsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartElementsOptions]
  }
  
  extension [Self <: ChartElementsOptions](x: Self) {
    
    inline def setArc(value: ChartArcOptions): Self = StObject.set(x, "arc", value.asInstanceOf[js.Any])
    
    inline def setArcUndefined: Self = StObject.set(x, "arc", js.undefined)
    
    inline def setLine(value: ChartLineOptions): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setPoint(value: ChartPointOptions): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    inline def setPointUndefined: Self = StObject.set(x, "point", js.undefined)
    
    inline def setRectangle(value: ChartRectangleOptions): Self = StObject.set(x, "rectangle", value.asInstanceOf[js.Any])
    
    inline def setRectangleUndefined: Self = StObject.set(x, "rectangle", js.undefined)
  }
}
