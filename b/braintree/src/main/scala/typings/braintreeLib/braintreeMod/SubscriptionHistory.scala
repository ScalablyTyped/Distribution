package typings
package braintreeLib.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionHistory extends js.Object {
  var balance: java.lang.String
  var price: java.lang.String
  var status: SubscriptionStatus
  var subscriptionSource: SubscriptionSource
}

object SubscriptionHistory {
  @scala.inline
  def apply(
    balance: java.lang.String,
    price: java.lang.String,
    status: SubscriptionStatus,
    subscriptionSource: SubscriptionSource
  ): SubscriptionHistory = {
    val __obj = js.Dynamic.literal(balance = balance, price = price, status = status, subscriptionSource = subscriptionSource)
  
    __obj.asInstanceOf[SubscriptionHistory]
  }
}

