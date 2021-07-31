package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventsMessage extends StObject {
  
  /**
    * A list of Event instances. 
    */
  var Events: js.UndefOr[EventList] = js.undefined
  
  /**
    * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned marker value in the Marker parameter and retrying the command. If the Marker field is empty, all response records have been retrieved for the request. 
    */
  var Marker: js.UndefOr[String] = js.undefined
}
object EventsMessage {
  
  @scala.inline
  def apply(): EventsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventsMessage]
  }
  
  @scala.inline
  implicit class EventsMessageMutableBuilder[Self <: EventsMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvents(value: EventList): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "Events", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: Event*): Self = StObject.set(x, "Events", js.Array(value :_*))
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
