package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventsBatch extends StObject {
  
  /**
    * A set of properties and attributes that are associated with the endpoint.
    */
  var Endpoint: PublicEndpoint = js.native
  
  /**
    * A set of properties that are associated with the event.
    */
  var Events: MapOfEvent = js.native
}
object EventsBatch {
  
  @scala.inline
  def apply(Endpoint: PublicEndpoint, Events: MapOfEvent): EventsBatch = {
    val __obj = js.Dynamic.literal(Endpoint = Endpoint.asInstanceOf[js.Any], Events = Events.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventsBatch]
  }
  
  @scala.inline
  implicit class EventsBatchMutableBuilder[Self <: EventsBatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpoint(value: PublicEndpoint): Self = StObject.set(x, "Endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvents(value: MapOfEvent): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
  }
}
