package typings.chartist.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IChartistStepInterpolationOptions
  extends StObject
     with IChartistInterpolationOptions {
  
  var postpone: js.UndefOr[Boolean] = js.undefined
}
object IChartistStepInterpolationOptions {
  
  inline def apply(): IChartistStepInterpolationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IChartistStepInterpolationOptions]
  }
  
  extension [Self <: IChartistStepInterpolationOptions](x: Self) {
    
    inline def setPostpone(value: Boolean): Self = StObject.set(x, "postpone", value.asInstanceOf[js.Any])
    
    inline def setPostponeUndefined: Self = StObject.set(x, "postpone", js.undefined)
  }
}
