package typings.chromeApps.anon

import typings.chromeApps.chrome.webViewRequest.DeclarativeWebRequestEventList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Actions extends StObject {
  
  var actions: js.UndefOr[js.Array[Type]] = js.undefined
  
  var conditions: js.UndefOr[js.Array[Dictkey]] = js.undefined
  
  /** Event name */
  var event: js.UndefOr[DeclarativeWebRequestEventList] = js.undefined
}
object Actions {
  
  inline def apply(): Actions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Actions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Actions] (val x: Self) extends AnyVal {
    
    inline def setActions(value: js.Array[Type]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setActionsVarargs(value: Type*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setConditions(value: js.Array[Dictkey]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    inline def setConditionsVarargs(value: Dictkey*): Self = StObject.set(x, "conditions", js.Array(value*))
    
    inline def setEvent(value: DeclarativeWebRequestEventList): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
  }
}
