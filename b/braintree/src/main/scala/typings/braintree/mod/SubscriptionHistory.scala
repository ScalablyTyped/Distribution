package typings.braintree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscriptionHistory extends StObject {
  
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
  
  @scala.inline
  implicit class SubscriptionHistoryMutableBuilder[Self <: SubscriptionHistory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBalance(value: String): Self = StObject.set(x, "balance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrice(value: String): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: SubscriptionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionSource(value: SubscriptionSource): Self = StObject.set(x, "subscriptionSource", value.asInstanceOf[js.Any])
  }
}
