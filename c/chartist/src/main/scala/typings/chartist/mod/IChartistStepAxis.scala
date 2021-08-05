package typings.chartist.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IChartistStepAxis
  extends StObject
     with ILineChartAxis {
  
  var stretch: js.UndefOr[Boolean] = js.undefined
  
  var ticks: js.UndefOr[js.Array[Double | String]] = js.undefined
  
  var `type`: js.UndefOr[IStepAxisStatic] = js.undefined
}
object IChartistStepAxis {
  
  inline def apply(): IChartistStepAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IChartistStepAxis]
  }
  
  extension [Self <: IChartistStepAxis](x: Self) {
    
    inline def setStretch(value: Boolean): Self = StObject.set(x, "stretch", value.asInstanceOf[js.Any])
    
    inline def setStretchUndefined: Self = StObject.set(x, "stretch", js.undefined)
    
    inline def setTicks(value: js.Array[Double | String]): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
    
    inline def setTicksUndefined: Self = StObject.set(x, "ticks", js.undefined)
    
    inline def setTicksVarargs(value: (Double | String)*): Self = StObject.set(x, "ticks", js.Array(value :_*))
    
    inline def setType(value: IStepAxisStatic): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
