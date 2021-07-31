package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEventSubscriptionResult extends StObject {
  
  var EventSubscription: js.UndefOr[typings.awsSdk.rdsMod.EventSubscription] = js.undefined
}
object CreateEventSubscriptionResult {
  
  @scala.inline
  def apply(): CreateEventSubscriptionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateEventSubscriptionResult]
  }
  
  @scala.inline
  implicit class CreateEventSubscriptionResultMutableBuilder[Self <: CreateEventSubscriptionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventSubscription(value: EventSubscription): Self = StObject.set(x, "EventSubscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventSubscriptionUndefined: Self = StObject.set(x, "EventSubscription", js.undefined)
  }
}
