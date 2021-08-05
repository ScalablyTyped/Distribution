package typings.cathoQuantum.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BreakpointsColors extends StObject {
  
  var breakpoints: js.UndefOr[js.Object] = js.undefined
  
  var colors: js.UndefOr[js.Object] = js.undefined
  
  var components: js.UndefOr[Button] = js.undefined
  
  var spacing: js.UndefOr[js.Object] = js.undefined
}
object BreakpointsColors {
  
  inline def apply(): BreakpointsColors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BreakpointsColors]
  }
  
  extension [Self <: BreakpointsColors](x: Self) {
    
    inline def setBreakpoints(value: js.Object): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
    
    inline def setBreakpointsUndefined: Self = StObject.set(x, "breakpoints", js.undefined)
    
    inline def setColors(value: js.Object): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setComponents(value: Button): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    
    inline def setSpacing(value: js.Object): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
  }
}
