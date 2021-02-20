package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartAnimationParameter extends StObject {
  
  var animationObject: js.UndefOr[js.Any] = js.native
  
  var chartInstance: js.UndefOr[js.Any] = js.native
}
object ChartAnimationParameter {
  
  @scala.inline
  def apply(): ChartAnimationParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartAnimationParameter]
  }
  
  @scala.inline
  implicit class ChartAnimationParameterMutableBuilder[Self <: ChartAnimationParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimationObject(value: js.Any): Self = StObject.set(x, "animationObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationObjectUndefined: Self = StObject.set(x, "animationObject", js.undefined)
    
    @scala.inline
    def setChartInstance(value: js.Any): Self = StObject.set(x, "chartInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChartInstanceUndefined: Self = StObject.set(x, "chartInstance", js.undefined)
  }
}
