package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartAnimationParameter extends StObject {
  
  var animationObject: js.UndefOr[js.Any] = js.undefined
  
  var chartInstance: js.UndefOr[js.Any] = js.undefined
}
object ChartAnimationParameter {
  
  inline def apply(): ChartAnimationParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartAnimationParameter]
  }
  
  extension [Self <: ChartAnimationParameter](x: Self) {
    
    inline def setAnimationObject(value: js.Any): Self = StObject.set(x, "animationObject", value.asInstanceOf[js.Any])
    
    inline def setAnimationObjectUndefined: Self = StObject.set(x, "animationObject", js.undefined)
    
    inline def setChartInstance(value: js.Any): Self = StObject.set(x, "chartInstance", value.asInstanceOf[js.Any])
    
    inline def setChartInstanceUndefined: Self = StObject.set(x, "chartInstance", js.undefined)
  }
}
