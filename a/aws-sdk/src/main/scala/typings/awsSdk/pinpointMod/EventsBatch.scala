package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventsBatch extends js.Object {
  
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
  implicit class EventsBatchOps[Self <: EventsBatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEndpoint(value: PublicEndpoint): Self = this.set("Endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvents(value: MapOfEvent): Self = this.set("Events", value.asInstanceOf[js.Any])
  }
}
