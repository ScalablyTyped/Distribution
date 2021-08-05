package typings.chartist.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IChartistCardinalInterpolationOptions
  extends StObject
     with IChartistInterpolationOptions {
  
  var tension: js.UndefOr[Double] = js.undefined
}
object IChartistCardinalInterpolationOptions {
  
  inline def apply(): IChartistCardinalInterpolationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IChartistCardinalInterpolationOptions]
  }
  
  extension [Self <: IChartistCardinalInterpolationOptions](x: Self) {
    
    inline def setTension(value: Double): Self = StObject.set(x, "tension", value.asInstanceOf[js.Any])
    
    inline def setTensionUndefined: Self = StObject.set(x, "tension", js.undefined)
  }
}
