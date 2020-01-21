package typings.awsSdk.snsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSubscriptionsResponse extends js.Object {
  /**
    * Token to pass along to the next ListSubscriptions request. This element is returned if there are more subscriptions to retrieve.
    */
  var NextToken: js.UndefOr[nextToken] = js.native
  /**
    * A list of subscriptions.
    */
  var Subscriptions: js.UndefOr[SubscriptionsList] = js.native
}

object ListSubscriptionsResponse {
  @scala.inline
  def apply(NextToken: nextToken = null, Subscriptions: SubscriptionsList = null): ListSubscriptionsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Subscriptions != null) __obj.updateDynamic("Subscriptions")(Subscriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSubscriptionsResponse]
  }
}

