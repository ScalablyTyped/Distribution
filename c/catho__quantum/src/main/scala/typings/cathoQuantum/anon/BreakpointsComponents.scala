package typings.cathoQuantum.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BreakpointsComponents extends StObject {
  
  var breakpoints: js.UndefOr[js.Object] = js.undefined
  
  var components: js.UndefOr[js.Object] = js.undefined
}
object BreakpointsComponents {
  
  @scala.inline
  def apply(): BreakpointsComponents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BreakpointsComponents]
  }
  
  @scala.inline
  implicit class BreakpointsComponentsMutableBuilder[Self <: BreakpointsComponents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBreakpoints(value: js.Object): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreakpointsUndefined: Self = StObject.set(x, "breakpoints", js.undefined)
    
    @scala.inline
    def setComponents(value: js.Object): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
  }
}
