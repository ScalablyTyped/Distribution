package typings.blazy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Breakpoint extends StObject {
  
  var src: String
  
  var width: Double
}
object Breakpoint {
  
  @scala.inline
  def apply(src: String, width: Double): Breakpoint = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Breakpoint]
  }
  
  @scala.inline
  implicit class BreakpointMutableBuilder[Self <: Breakpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
