package typings.chartJs.distChunksHelpersDotcoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementChartOptions[TType /* <: ChartType */] extends StObject {
  
  var elements: ElementOptionsByType[TType]
}
object ElementChartOptions {
  
  inline def apply[TType /* <: ChartType */](elements: ElementOptionsByType[TType]): ElementChartOptions[TType] = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementChartOptions[TType]]
  }
  
  extension [Self <: ElementChartOptions[?], TType /* <: ChartType */](x: Self & ElementChartOptions[TType]) {
    
    inline def setElements(value: ElementOptionsByType[TType]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
  }
}
