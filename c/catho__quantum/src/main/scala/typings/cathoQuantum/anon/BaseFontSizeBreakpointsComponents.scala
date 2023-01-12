package typings.cathoQuantum.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseFontSizeBreakpointsComponents extends StObject {
  
  var baseFontSize: js.UndefOr[Double] = js.undefined
  
  var breakpoints: js.UndefOr[js.Object] = js.undefined
  
  var components: js.UndefOr[TabbedView] = js.undefined
  
  var spacing: js.UndefOr[js.Object] = js.undefined
}
object BaseFontSizeBreakpointsComponents {
  
  inline def apply(): BaseFontSizeBreakpointsComponents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseFontSizeBreakpointsComponents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseFontSizeBreakpointsComponents] (val x: Self) extends AnyVal {
    
    inline def setBaseFontSize(value: Double): Self = StObject.set(x, "baseFontSize", value.asInstanceOf[js.Any])
    
    inline def setBaseFontSizeUndefined: Self = StObject.set(x, "baseFontSize", js.undefined)
    
    inline def setBreakpoints(value: js.Object): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
    
    inline def setBreakpointsUndefined: Self = StObject.set(x, "breakpoints", js.undefined)
    
    inline def setComponents(value: TabbedView): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    
    inline def setSpacing(value: js.Object): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
  }
}
