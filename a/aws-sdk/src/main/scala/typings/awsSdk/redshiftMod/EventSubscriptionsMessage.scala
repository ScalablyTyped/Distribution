package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventSubscriptionsMessage extends StObject {
  
  /**
    * A list of event subscriptions.
    */
  var EventSubscriptionsList: js.UndefOr[typings.awsSdk.redshiftMod.EventSubscriptionsList] = js.undefined
  
  /**
    * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned marker value in the Marker parameter and retrying the command. If the Marker field is empty, all response records have been retrieved for the request. 
    */
  var Marker: js.UndefOr[String] = js.undefined
}
object EventSubscriptionsMessage {
  
  inline def apply(): EventSubscriptionsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventSubscriptionsMessage]
  }
  
  extension [Self <: EventSubscriptionsMessage](x: Self) {
    
    inline def setEventSubscriptionsList(value: EventSubscriptionsList): Self = StObject.set(x, "EventSubscriptionsList", value.asInstanceOf[js.Any])
    
    inline def setEventSubscriptionsListUndefined: Self = StObject.set(x, "EventSubscriptionsList", js.undefined)
    
    inline def setEventSubscriptionsListVarargs(value: EventSubscription*): Self = StObject.set(x, "EventSubscriptionsList", js.Array(value :_*))
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
