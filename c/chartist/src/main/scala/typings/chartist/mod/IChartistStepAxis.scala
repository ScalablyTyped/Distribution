package typings.chartist.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IChartistStepAxis extends ILineChartAxis {
  
  var stretch: js.UndefOr[Boolean] = js.native
  
  var ticks: js.UndefOr[js.Array[Double | String]] = js.native
  
  var `type`: js.UndefOr[IStepAxisStatic] = js.native
}
object IChartistStepAxis {
  
  @scala.inline
  def apply(): IChartistStepAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IChartistStepAxis]
  }
  
  @scala.inline
  implicit class IChartistStepAxisMutableBuilder[Self <: IChartistStepAxis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStretch(value: Boolean): Self = StObject.set(x, "stretch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStretchUndefined: Self = StObject.set(x, "stretch", js.undefined)
    
    @scala.inline
    def setTicks(value: js.Array[Double | String]): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicksUndefined: Self = StObject.set(x, "ticks", js.undefined)
    
    @scala.inline
    def setTicksVarargs(value: (Double | String)*): Self = StObject.set(x, "ticks", js.Array(value :_*))
    
    @scala.inline
    def setType(value: IStepAxisStatic): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
