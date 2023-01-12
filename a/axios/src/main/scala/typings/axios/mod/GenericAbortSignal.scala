package typings.axios.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenericAbortSignal extends StObject {
  
  val aborted: Boolean
  
  var addEventListener: js.UndefOr[js.Function1[/* args */ Any, Any]] = js.undefined
  
  var onabort: js.UndefOr[(js.Function1[/* args */ Any, Any]) | Null] = js.undefined
  
  var removeEventListener: js.UndefOr[js.Function1[/* args */ Any, Any]] = js.undefined
}
object GenericAbortSignal {
  
  inline def apply(aborted: Boolean): GenericAbortSignal = {
    val __obj = js.Dynamic.literal(aborted = aborted.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenericAbortSignal]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GenericAbortSignal] (val x: Self) extends AnyVal {
    
    inline def setAborted(value: Boolean): Self = StObject.set(x, "aborted", value.asInstanceOf[js.Any])
    
    inline def setAddEventListener(value: /* args */ Any => Any): Self = StObject.set(x, "addEventListener", js.Any.fromFunction1(value))
    
    inline def setAddEventListenerUndefined: Self = StObject.set(x, "addEventListener", js.undefined)
    
    inline def setOnabort(value: /* args */ Any => Any): Self = StObject.set(x, "onabort", js.Any.fromFunction1(value))
    
    inline def setOnabortNull: Self = StObject.set(x, "onabort", null)
    
    inline def setOnabortUndefined: Self = StObject.set(x, "onabort", js.undefined)
    
    inline def setRemoveEventListener(value: /* args */ Any => Any): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction1(value))
    
    inline def setRemoveEventListenerUndefined: Self = StObject.set(x, "removeEventListener", js.undefined)
  }
}
