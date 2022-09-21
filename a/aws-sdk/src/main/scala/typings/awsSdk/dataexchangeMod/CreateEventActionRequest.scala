package typings.awsSdk.dataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEventActionRequest extends StObject {
  
  /**
    * What occurs after a certain event.
    */
  var Action: typings.awsSdk.dataexchangeMod.Action
  
  /**
    * What occurs to start an action.
    */
  var Event: typings.awsSdk.dataexchangeMod.Event
}
object CreateEventActionRequest {
  
  inline def apply(Action: Action, Event: Event): CreateEventActionRequest = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Event = Event.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEventActionRequest]
  }
  
  extension [Self <: CreateEventActionRequest](x: Self) {
    
    inline def setAction(value: Action): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: Event): Self = StObject.set(x, "Event", value.asInstanceOf[js.Any])
  }
}
