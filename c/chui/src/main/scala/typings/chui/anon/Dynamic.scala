package typings.chui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dynamic extends StObject {
  
  var callback: js.UndefOr[js.Function1[/* args */ js.UndefOr[js.Any], _]] = js.native
  
  var dynamic: js.UndefOr[Boolean] = js.native
}
object Dynamic {
  
  @scala.inline
  def apply(): Dynamic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dynamic]
  }
  
  @scala.inline
  implicit class DynamicMutableBuilder[Self <: Dynamic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallback(value: /* args */ js.UndefOr[js.Any] => _): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    @scala.inline
    def setDynamic(value: Boolean): Self = StObject.set(x, "dynamic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicUndefined: Self = StObject.set(x, "dynamic", js.undefined)
  }
}
