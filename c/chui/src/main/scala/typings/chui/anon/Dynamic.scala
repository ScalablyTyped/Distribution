package typings.chui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dynamic extends StObject {
  
  var callback: js.UndefOr[js.Function1[/* args */ js.UndefOr[Any], Any]] = js.undefined
  
  var dynamic: js.UndefOr[Boolean] = js.undefined
}
object Dynamic {
  
  inline def apply(): Dynamic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dynamic]
  }
  
  extension [Self <: Dynamic](x: Self) {
    
    inline def setCallback(value: /* args */ js.UndefOr[Any] => Any): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setDynamic(value: Boolean): Self = StObject.set(x, "dynamic", value.asInstanceOf[js.Any])
    
    inline def setDynamicUndefined: Self = StObject.set(x, "dynamic", js.undefined)
  }
}
