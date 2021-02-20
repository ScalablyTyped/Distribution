package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventSubscriptionsMessage extends StObject {
  
  /**
    * A list of EventSubscriptions data types.
    */
  var EventSubscriptionsList: js.UndefOr[typings.awsSdk.rdsMod.EventSubscriptionsList] = js.native
  
  /**
    *  An optional pagination token provided by a previous DescribeOrderableDBInstanceOptions request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.native
}
object EventSubscriptionsMessage {
  
  @scala.inline
  def apply(): EventSubscriptionsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventSubscriptionsMessage]
  }
  
  @scala.inline
  implicit class EventSubscriptionsMessageMutableBuilder[Self <: EventSubscriptionsMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventSubscriptionsList(value: EventSubscriptionsList): Self = StObject.set(x, "EventSubscriptionsList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventSubscriptionsListUndefined: Self = StObject.set(x, "EventSubscriptionsList", js.undefined)
    
    @scala.inline
    def setEventSubscriptionsListVarargs(value: EventSubscription*): Self = StObject.set(x, "EventSubscriptionsList", js.Array(value :_*))
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
