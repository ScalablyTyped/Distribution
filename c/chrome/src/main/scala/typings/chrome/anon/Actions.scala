package typings.chrome.anon

import typings.chrome.chrome.declarativeContent.PageStateMatcherProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Actions extends StObject {
  
  var actions: js.UndefOr[js.Array[Type]] = js.undefined
  
  var conditions: js.UndefOr[js.Array[PageStateMatcherProperties]] = js.undefined
  
  var event: js.UndefOr[String] = js.undefined
}
object Actions {
  
  inline def apply(): Actions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Actions]
  }
  
  extension [Self <: Actions](x: Self) {
    
    inline def setActions(value: js.Array[Type]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setActionsVarargs(value: Type*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    inline def setConditions(value: js.Array[PageStateMatcherProperties]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    inline def setConditionsVarargs(value: PageStateMatcherProperties*): Self = StObject.set(x, "conditions", js.Array(value :_*))
    
    inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
  }
}
