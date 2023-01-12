package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Length extends StObject {
  
  @JSName("$length")
  var $length: Double
  
  @JSName("$shape")
  var $shape: String
}
object Length {
  
  inline def apply($length: Double, $shape: String): Length = {
    val __obj = js.Dynamic.literal($length = $length.asInstanceOf[js.Any], $shape = $shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[Length]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Length] (val x: Self) extends AnyVal {
    
    inline def set$length(value: Double): Self = StObject.set(x, "$length", value.asInstanceOf[js.Any])
    
    inline def set$shape(value: String): Self = StObject.set(x, "$shape", value.asInstanceOf[js.Any])
  }
}
