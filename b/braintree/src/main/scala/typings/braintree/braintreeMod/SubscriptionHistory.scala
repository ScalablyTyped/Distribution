package typings.braintree.braintreeMod

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
    val __obj = js.Dynamic.literal(balance = balance, price = price, status = status, subscriptionSource = subscriptionSource)
  
    __obj.asInstanceOf[SubscriptionHistory]
  }
}

