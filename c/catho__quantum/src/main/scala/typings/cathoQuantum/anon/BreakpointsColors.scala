package typings.cathoQuantum.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BreakpointsColors extends StObject {
  
  var breakpoints: js.UndefOr[js.Object] = js.native
  
  var colors: js.UndefOr[js.Object] = js.native
  
  var components: js.UndefOr[Button] = js.native
  
  var spacing: js.UndefOr[js.Object] = js.native
}
object BreakpointsColors {
  
  @scala.inline
  def apply(): BreakpointsColors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BreakpointsColors]
  }
  
  @scala.inline
  implicit class BreakpointsColorsMutableBuilder[Self <: BreakpointsColors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBreakpoints(value: js.Object): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreakpointsUndefined: Self = StObject.set(x, "breakpoints", js.undefined)
    
    @scala.inline
    def setColors(value: js.Object): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    @scala.inline
    def setComponents(value: Button): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    
    @scala.inline
    def setSpacing(value: js.Object): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
  }
}
