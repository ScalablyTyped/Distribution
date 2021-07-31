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
  
  @scala.inline
  def apply(): IChartistCardinalInterpolationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IChartistCardinalInterpolationOptions]
  }
  
  @scala.inline
  implicit class IChartistCardinalInterpolationOptionsMutableBuilder[Self <: IChartistCardinalInterpolationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTension(value: Double): Self = StObject.set(x, "tension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTensionUndefined: Self = StObject.set(x, "tension", js.undefined)
  }
}
