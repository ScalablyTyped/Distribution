package typings.baseui.themesTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Breakpoints extends StObject {
  
  var large: Double
  
  var medium: Double
  
  var small: Double
}
object Breakpoints {
  
  inline def apply(large: Double, medium: Double, small: Double): Breakpoints = {
    val __obj = js.Dynamic.literal(large = large.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any])
    __obj.asInstanceOf[Breakpoints]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Breakpoints] (val x: Self) extends AnyVal {
    
    inline def setLarge(value: Double): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
    
    inline def setMedium(value: Double): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
    
    inline def setSmall(value: Double): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
  }
}
