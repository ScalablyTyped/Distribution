package typings.chartist.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IChartistSimpleInterpolationOptions
  extends StObject
     with IChartistInterpolationOptions {
  
  var divisor: js.UndefOr[Double] = js.undefined
}
object IChartistSimpleInterpolationOptions {
  
  inline def apply(): IChartistSimpleInterpolationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IChartistSimpleInterpolationOptions]
  }
  
  extension [Self <: IChartistSimpleInterpolationOptions](x: Self) {
    
    inline def setDivisor(value: Double): Self = StObject.set(x, "divisor", value.asInstanceOf[js.Any])
    
    inline def setDivisorUndefined: Self = StObject.set(x, "divisor", js.undefined)
  }
}
