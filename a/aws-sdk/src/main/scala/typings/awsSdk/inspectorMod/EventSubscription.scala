package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventSubscription extends StObject {
  
  /**
    * The event for which Amazon Simple Notification Service (SNS) notifications are sent.
    */
  var event: InspectorEvent
  
  /**
    * The time at which SubscribeToEvent is called.
    */
  var subscribedAt: Timestamp
}
object EventSubscription {
  
  @scala.inline
  def apply(event: InspectorEvent, subscribedAt: Timestamp): EventSubscription = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], subscribedAt = subscribedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventSubscription]
  }
  
  @scala.inline
  implicit class EventSubscriptionMutableBuilder[Self <: EventSubscription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvent(value: InspectorEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscribedAt(value: Timestamp): Self = StObject.set(x, "subscribedAt", value.asInstanceOf[js.Any])
  }
}
