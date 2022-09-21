package typings.awsSdk.dataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEventActionRequest extends StObject {
  
  /**
    * The unique identifier for the event action.
    */
  var EventActionId: string
}
object GetEventActionRequest {
  
  inline def apply(EventActionId: string): GetEventActionRequest = {
    val __obj = js.Dynamic.literal(EventActionId = EventActionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEventActionRequest]
  }
  
  extension [Self <: GetEventActionRequest](x: Self) {
    
    inline def setEventActionId(value: string): Self = StObject.set(x, "EventActionId", value.asInstanceOf[js.Any])
  }
}
