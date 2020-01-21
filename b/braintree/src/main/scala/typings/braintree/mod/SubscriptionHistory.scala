package typings.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionHistory extends js.Object {
  var balance: String
  var price: String
  var status: SubscriptionStatus
  var subscriptionSource: SubscriptionSource
}

object SubscriptionHistory {
  @scala.inline
  def apply(balance: String, price: String, status: SubscriptionStatus, subscriptionSource: SubscriptionSource): SubscriptionHistory = {
    val __obj = js.Dynamic.literal(balance = balance.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subscriptionSource = subscriptionSource.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SubscriptionHistory]
  }
}

