package typings.chartJs.distTypesIndexMod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElementChartOptions[?], TType /* <: ChartType */] (val x: Self & ElementChartOptions[TType]) extends AnyVal {
    
    inline def setElements(value: ElementOptionsByType[TType]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
  }
}
