package typings.awsSdk.neptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyEventSubscriptionResult extends StObject {
  
  var EventSubscription: js.UndefOr[typings.awsSdk.neptuneMod.EventSubscription] = js.undefined
}
object ModifyEventSubscriptionResult {
  
  @scala.inline
  def apply(): ModifyEventSubscriptionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyEventSubscriptionResult]
  }
  
  @scala.inline
  implicit class ModifyEventSubscriptionResultMutableBuilder[Self <: ModifyEventSubscriptionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventSubscription(value: EventSubscription): Self = StObject.set(x, "EventSubscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventSubscriptionUndefined: Self = StObject.set(x, "EventSubscription", js.undefined)
  }
}
