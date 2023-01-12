package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurrentAny extends StObject {
  
  var current: Any
}
object CurrentAny {
  
  inline def apply(current: Any): CurrentAny = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentAny]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CurrentAny] (val x: Self) extends AnyVal {
    
    inline def setCurrent(value: Any): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
  }
}
