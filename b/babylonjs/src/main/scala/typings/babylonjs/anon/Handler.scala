package typings.babylonjs.anon

import typings.babylonjs.typesMod.Nullable
import typings.std.FocusEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Handler extends StObject {
  
  var handler: Nullable[js.Function1[/* e */ FocusEvent, _]] = js.native
  
  var name: String = js.native
}
object Handler {
  
  @scala.inline
  def apply(name: String): Handler = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Handler]
  }
  
  @scala.inline
  implicit class HandlerMutableBuilder[Self <: Handler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandler(value: /* e */ FocusEvent => _): Self = StObject.set(x, "handler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHandlerNull: Self = StObject.set(x, "handler", null)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
