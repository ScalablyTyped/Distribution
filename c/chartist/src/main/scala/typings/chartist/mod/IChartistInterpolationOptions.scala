package typings.chartist.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IChartistInterpolationOptions extends StObject {
  
  var fillHoles: js.UndefOr[Boolean] = js.undefined
}
object IChartistInterpolationOptions {
  
  inline def apply(): IChartistInterpolationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IChartistInterpolationOptions]
  }
  
  extension [Self <: IChartistInterpolationOptions](x: Self) {
    
    inline def setFillHoles(value: Boolean): Self = StObject.set(x, "fillHoles", value.asInstanceOf[js.Any])
    
    inline def setFillHolesUndefined: Self = StObject.set(x, "fillHoles", js.undefined)
  }
}
