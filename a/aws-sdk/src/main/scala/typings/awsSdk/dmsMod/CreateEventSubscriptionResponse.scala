package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEventSubscriptionResponse extends StObject {
  
  /**
    * The event subscription that was created.
    */
  var EventSubscription: js.UndefOr[typings.awsSdk.dmsMod.EventSubscription] = js.undefined
}
object CreateEventSubscriptionResponse {
  
  @scala.inline
  def apply(): CreateEventSubscriptionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateEventSubscriptionResponse]
  }
  
  @scala.inline
  implicit class CreateEventSubscriptionResponseMutableBuilder[Self <: CreateEventSubscriptionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventSubscription(value: EventSubscription): Self = StObject.set(x, "EventSubscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventSubscriptionUndefined: Self = StObject.set(x, "EventSubscription", js.undefined)
  }
}
