package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyEventSubscriptionResponse extends StObject {
  
  /**
    * The modified event subscription.
    */
  var EventSubscription: js.UndefOr[typings.awsSdk.dmsMod.EventSubscription] = js.native
}
object ModifyEventSubscriptionResponse {
  
  @scala.inline
  def apply(): ModifyEventSubscriptionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyEventSubscriptionResponse]
  }
  
  @scala.inline
  implicit class ModifyEventSubscriptionResponseMutableBuilder[Self <: ModifyEventSubscriptionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventSubscription(value: EventSubscription): Self = StObject.set(x, "EventSubscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventSubscriptionUndefined: Self = StObject.set(x, "EventSubscription", js.undefined)
  }
}
