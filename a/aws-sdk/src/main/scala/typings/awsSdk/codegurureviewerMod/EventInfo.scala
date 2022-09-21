package typings.awsSdk.codegurureviewerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventInfo extends StObject {
  
  /**
    * The name of the event. The possible names are pull_request, workflow_dispatch, schedule, and push 
    */
  var Name: js.UndefOr[EventName] = js.undefined
  
  /**
    * The state of an event. The state might be open, closed, or another state.
    */
  var State: js.UndefOr[EventState] = js.undefined
}
object EventInfo {
  
  inline def apply(): EventInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventInfo]
  }
  
  extension [Self <: EventInfo](x: Self) {
    
    inline def setName(value: EventName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setState(value: EventState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
