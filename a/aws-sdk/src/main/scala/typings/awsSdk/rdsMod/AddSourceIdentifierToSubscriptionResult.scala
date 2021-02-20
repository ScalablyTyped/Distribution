package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddSourceIdentifierToSubscriptionResult extends StObject {
  
  var EventSubscription: js.UndefOr[typings.awsSdk.rdsMod.EventSubscription] = js.native
}
object AddSourceIdentifierToSubscriptionResult {
  
  @scala.inline
  def apply(): AddSourceIdentifierToSubscriptionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddSourceIdentifierToSubscriptionResult]
  }
  
  @scala.inline
  implicit class AddSourceIdentifierToSubscriptionResultMutableBuilder[Self <: AddSourceIdentifierToSubscriptionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventSubscription(value: EventSubscription): Self = StObject.set(x, "EventSubscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventSubscriptionUndefined: Self = StObject.set(x, "EventSubscription", js.undefined)
  }
}
