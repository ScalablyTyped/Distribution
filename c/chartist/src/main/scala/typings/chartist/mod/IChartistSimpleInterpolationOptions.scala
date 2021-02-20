package typings.chartist.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IChartistSimpleInterpolationOptions extends IChartistInterpolationOptions {
  
  var divisor: js.UndefOr[Double] = js.native
}
object IChartistSimpleInterpolationOptions {
  
  @scala.inline
  def apply(): IChartistSimpleInterpolationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IChartistSimpleInterpolationOptions]
  }
  
  @scala.inline
  implicit class IChartistSimpleInterpolationOptionsMutableBuilder[Self <: IChartistSimpleInterpolationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDivisor(value: Double): Self = StObject.set(x, "divisor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDivisorUndefined: Self = StObject.set(x, "divisor", js.undefined)
  }
}
