package typings.chromeApps.anon

import typings.chromeApps.chrome.webViewRequest.DeclarativeWebRequestEventList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Actions extends StObject {
  
  var actions: js.UndefOr[js.Array[TypeDeclarativeWebRequestActionsList]] = js.undefined
  
  var conditions: js.UndefOr[js.Array[Dictkey]] = js.undefined
  
  /** Event name */
  var event: js.UndefOr[DeclarativeWebRequestEventList] = js.undefined
}
object Actions {
  
  @scala.inline
  def apply(): Actions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Actions]
  }
  
  @scala.inline
  implicit class ActionsMutableBuilder[Self <: Actions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: js.Array[TypeDeclarativeWebRequestActionsList]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    @scala.inline
    def setActionsVarargs(value: TypeDeclarativeWebRequestActionsList*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    @scala.inline
    def setConditions(value: js.Array[Dictkey]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    @scala.inline
    def setConditionsVarargs(value: Dictkey*): Self = StObject.set(x, "conditions", js.Array(value :_*))
    
    @scala.inline
    def setEvent(value: DeclarativeWebRequestEventList): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
  }
}
