package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddSourceIdentifierToSubscriptionResult extends StObject {
  
  var EventSubscription: js.UndefOr[typings.awsSdk.rdsMod.EventSubscription] = js.undefined
}
object AddSourceIdentifierToSubscriptionResult {
  
  inline def apply(): AddSourceIdentifierToSubscriptionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddSourceIdentifierToSubscriptionResult]
  }
  
  extension [Self <: AddSourceIdentifierToSubscriptionResult](x: Self) {
    
    inline def setEventSubscription(value: EventSubscription): Self = StObject.set(x, "EventSubscription", value.asInstanceOf[js.Any])
    
    inline def setEventSubscriptionUndefined: Self = StObject.set(x, "EventSubscription", js.undefined)
  }
}
