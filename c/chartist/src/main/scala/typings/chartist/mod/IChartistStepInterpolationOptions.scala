package typings.chartist.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IChartistStepInterpolationOptions extends IChartistInterpolationOptions {
  
  var postpone: js.UndefOr[Boolean] = js.native
}
object IChartistStepInterpolationOptions {
  
  @scala.inline
  def apply(): IChartistStepInterpolationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IChartistStepInterpolationOptions]
  }
  
  @scala.inline
  implicit class IChartistStepInterpolationOptionsMutableBuilder[Self <: IChartistStepInterpolationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPostpone(value: Boolean): Self = StObject.set(x, "postpone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostponeUndefined: Self = StObject.set(x, "postpone", js.undefined)
  }
}
