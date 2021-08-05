package typings.cathoQuantum.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BreakpointsObject extends StObject {
  
  var breakpoints: js.Object
}
object BreakpointsObject {
  
  inline def apply(breakpoints: js.Object): BreakpointsObject = {
    val __obj = js.Dynamic.literal(breakpoints = breakpoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreakpointsObject]
  }
  
  extension [Self <: BreakpointsObject](x: Self) {
    
    inline def setBreakpoints(value: js.Object): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
  }
}
