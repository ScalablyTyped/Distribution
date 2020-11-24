package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscriptionDefinitionVersion extends js.Object {
  
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
  implicit class SubscriptionDefinitionVersionOps[Self <: SubscriptionDefinitionVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSubscriptionsVarargs(value: Subscription*): Self = this.set("Subscriptions", js.Array(value :_*))
    
    @scala.inline
    def setSubscriptions(value: listOfSubscription): Self = this.set("Subscriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscriptions: Self = this.set("Subscriptions", js.undefined)
  }
}
