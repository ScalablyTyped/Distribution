package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveSourceIdentifierFromSubscriptionResult extends StObject {
  
  var EventSubscription: js.UndefOr[typings.awsSdk.rdsMod.EventSubscription] = js.native
}
object RemoveSourceIdentifierFromSubscriptionResult {
  
  @scala.inline
  def apply(): RemoveSourceIdentifierFromSubscriptionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveSourceIdentifierFromSubscriptionResult]
  }
  
  @scala.inline
  implicit class RemoveSourceIdentifierFromSubscriptionResultMutableBuilder[Self <: RemoveSourceIdentifierFromSubscriptionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventSubscription(value: EventSubscription): Self = StObject.set(x, "EventSubscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventSubscriptionUndefined: Self = StObject.set(x, "EventSubscription", js.undefined)
  }
}
