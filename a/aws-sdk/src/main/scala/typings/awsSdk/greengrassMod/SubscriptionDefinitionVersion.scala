package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscriptionDefinitionVersion extends StObject {
  
  /**
    * A list of subscriptions.
    */
  var Subscriptions: js.UndefOr[listOfSubscription] = js.native
}
object SubscriptionDefinitionVersion {
  
  @scala.inline
  def apply(): SubscriptionDefinitionVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscriptionDefinitionVersion]
  }
  
  @scala.inline
  implicit class SubscriptionDefinitionVersionMutableBuilder[Self <: SubscriptionDefinitionVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSubscriptions(value: listOfSubscription): Self = StObject.set(x, "Subscriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionsUndefined: Self = StObject.set(x, "Subscriptions", js.undefined)
    
    @scala.inline
    def setSubscriptionsVarargs(value: Subscription*): Self = StObject.set(x, "Subscriptions", js.Array(value :_*))
  }
}
