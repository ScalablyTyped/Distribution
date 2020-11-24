package typings.awsSdk.snsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSubscriptionsByTopicResponse extends js.Object {
  
  /**
    * Token to pass along to the next ListSubscriptionsByTopic request. This element is returned if there are more subscriptions to retrieve.
    */
  var NextToken: js.UndefOr[nextToken] = js.native
  
  /**
    * A list of subscriptions.
    */
  var Subscriptions: js.UndefOr[SubscriptionsList] = js.native
}
object ListSubscriptionsByTopicResponse {
  
  @scala.inline
  def apply(): ListSubscriptionsByTopicResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSubscriptionsByTopicResponse]
  }
  
  @scala.inline
  implicit class ListSubscriptionsByTopicResponseOps[Self <: ListSubscriptionsByTopicResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNextToken(value: nextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setSubscriptionsVarargs(value: Subscription*): Self = this.set("Subscriptions", js.Array(value :_*))
    
    @scala.inline
    def setSubscriptions(value: SubscriptionsList): Self = this.set("Subscriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscriptions: Self = this.set("Subscriptions", js.undefined)
  }
}
