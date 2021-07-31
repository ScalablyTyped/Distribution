package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartRenderProps extends StObject {
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var easing: js.UndefOr[Easing] = js.undefined
  
  var `lazy`: js.UndefOr[Boolean] = js.undefined
}
object ChartRenderProps {
  
  @scala.inline
  def apply(): ChartRenderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartRenderProps]
  }
  
  @scala.inline
  implicit class ChartRenderPropsMutableBuilder[Self <: ChartRenderProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setEasing(value: Easing): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    @scala.inline
    def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
  }
}
