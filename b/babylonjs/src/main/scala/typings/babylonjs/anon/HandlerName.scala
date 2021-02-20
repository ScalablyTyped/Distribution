package typings.babylonjs.anon

import typings.babylonjs.BABYLON.Nullable
import typings.std.FocusEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HandlerName extends StObject {
  
  var handler: Nullable[js.Function1[/* e */ FocusEvent, _]] = js.native
  
  var name: String = js.native
}
object HandlerName {
  
  @scala.inline
  def apply(name: String): HandlerName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandlerName]
  }
  
  @scala.inline
  implicit class HandlerNameMutableBuilder[Self <: HandlerName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandler(value: /* e */ FocusEvent => _): Self = StObject.set(x, "handler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHandlerNull: Self = StObject.set(x, "handler", null)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
