package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartUpdateProps extends StObject {
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var easing: js.UndefOr[Easing] = js.undefined
  
  var `lazy`: js.UndefOr[Boolean] = js.undefined
}
object ChartUpdateProps {
  
  inline def apply(): ChartUpdateProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartUpdateProps]
  }
  
  extension [Self <: ChartUpdateProps](x: Self) {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEasing(value: Easing): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    inline def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
    
    inline def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
  }
}
