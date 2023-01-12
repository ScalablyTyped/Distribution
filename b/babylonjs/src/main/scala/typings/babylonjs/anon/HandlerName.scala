package typings.babylonjs.anon

import typings.babylonjs.BABYLON.Nullable
import typings.std.FocusEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HandlerName extends StObject {
  
  var handler: Nullable[js.Function1[/* e */ FocusEvent, Any]]
  
  var name: String
}
object HandlerName {
  
  inline def apply(name: String): HandlerName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], handler = null)
    __obj.asInstanceOf[HandlerName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HandlerName] (val x: Self) extends AnyVal {
    
    inline def setHandler(value: /* e */ FocusEvent => Any): Self = StObject.set(x, "handler", js.Any.fromFunction1(value))
    
    inline def setHandlerNull: Self = StObject.set(x, "handler", null)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
