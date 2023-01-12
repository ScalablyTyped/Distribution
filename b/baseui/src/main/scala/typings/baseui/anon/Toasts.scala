package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Toasts extends StObject {
  
  var isMounted: Boolean
  
  var toasts: js.Array[Any]
}
object Toasts {
  
  inline def apply(isMounted: Boolean, toasts: js.Array[Any]): Toasts = {
    val __obj = js.Dynamic.literal(isMounted = isMounted.asInstanceOf[js.Any], toasts = toasts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Toasts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Toasts] (val x: Self) extends AnyVal {
    
    inline def setIsMounted(value: Boolean): Self = StObject.set(x, "isMounted", value.asInstanceOf[js.Any])
    
    inline def setToasts(value: js.Array[Any]): Self = StObject.set(x, "toasts", value.asInstanceOf[js.Any])
    
    inline def setToastsVarargs(value: Any*): Self = StObject.set(x, "toasts", js.Array(value*))
  }
}
