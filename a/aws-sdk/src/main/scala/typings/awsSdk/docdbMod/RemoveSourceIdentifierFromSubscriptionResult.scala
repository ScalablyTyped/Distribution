package typings.awsSdk.docdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveSourceIdentifierFromSubscriptionResult extends StObject {
  
  var EventSubscription: js.UndefOr[typings.awsSdk.docdbMod.EventSubscription] = js.undefined
}
object RemoveSourceIdentifierFromSubscriptionResult {
  
  inline def apply(): RemoveSourceIdentifierFromSubscriptionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveSourceIdentifierFromSubscriptionResult]
  }
  
  extension [Self <: RemoveSourceIdentifierFromSubscriptionResult](x: Self) {
    
    inline def setEventSubscription(value: EventSubscription): Self = StObject.set(x, "EventSubscription", value.asInstanceOf[js.Any])
    
    inline def setEventSubscriptionUndefined: Self = StObject.set(x, "EventSubscription", js.undefined)
  }
}
