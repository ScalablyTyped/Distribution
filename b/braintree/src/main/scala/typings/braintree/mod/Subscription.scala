package typings.braintree.mod

import typings.braintree.anon.Canceled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("braintree", "Subscription")
@js.native
open class Subscription () extends StObject {
  
  var addOns: js.UndefOr[js.Array[AddOn]] = js.native
  
  var balance: String = js.native
  
  var billingDayOfMonth: js.UndefOr[Double] = js.native
  
  var billingPeriodEndDate: String = js.native
  
  var billingPeriodStartDate: String = js.native
  
  var createdAt: String = js.native
  
  var currentBillingCycle: Double = js.native
  
  var daysPastDue: js.UndefOr[Double] = js.native
  
  var descriptor: js.UndefOr[Descriptor] = js.native
  
  var discounts: js.UndefOr[js.Array[Discount]] = js.native
  
  var failureCount: js.UndefOr[Double] = js.native
  
  var firstBillingDate: js.UndefOr[js.Date] = js.native
  
  var id: String = js.native
  
  var merchantAccountId: String = js.native
  
  var neverExpires: js.UndefOr[Boolean] = js.native
  
  var nextBillAmount: String = js.native
  
  var nextBillingDate: String = js.native
  
  var nextBillingPeriodAmount: String = js.native
  
  var numberOfBillingCycles: js.UndefOr[Double] = js.native
  
  var paidThroughDate: js.UndefOr[js.Date] = js.native
  
  var paymentMethodToken: String = js.native
  
  var planId: String = js.native
  
  var price: js.UndefOr[String] = js.native
  
  var status: SubscriptionStatus = js.native
  
  var statusHistory: js.UndefOr[js.Array[SubscriptionHistory]] = js.native
  
  var transactions: js.UndefOr[js.Array[Transaction]] = js.native
  
  var trialDuration: js.UndefOr[Double] = js.native
  
  var trialDurationUnit: js.UndefOr[String] = js.native
  
  var trialPeriod: js.UndefOr[Boolean] = js.native
  
  var updatedAt: String = js.native
}
/* static members */
object Subscription {
  
  @JSImport("braintree", "Subscription")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("braintree", "Subscription.Status")
  @js.native
  def Status: Canceled = js.native
  inline def Status_=(x: Canceled): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Status")(x.asInstanceOf[js.Any])
}
