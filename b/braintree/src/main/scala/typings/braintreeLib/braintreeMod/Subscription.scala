package typings
package braintreeLib.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("braintree", "Subscription")
@js.native
class Subscription () extends js.Object {
  var addOns: js.UndefOr[js.Array[AddOn]] = js.native
  var balance: java.lang.String = js.native
  var billingDayOfMonth: js.UndefOr[scala.Double] = js.native
  var billingPeriodEndDate: stdLib.Date = js.native
  var billingPeriodStartDate: stdLib.Date = js.native
  var createdAt: stdLib.Date = js.native
  var currentBillingCycle: scala.Double = js.native
  var daysPastDue: js.UndefOr[scala.Double] = js.native
  var descriptor: js.UndefOr[Descriptor] = js.native
  var discounts: js.UndefOr[js.Array[Discount]] = js.native
  var failureCount: js.UndefOr[scala.Double] = js.native
  var firstBillingDate: js.UndefOr[stdLib.Date] = js.native
  var id: java.lang.String = js.native
  var merchantAccountId: java.lang.String = js.native
  var neverExpires: js.UndefOr[scala.Boolean] = js.native
  var nextBillAmount: java.lang.String = js.native
  var nextBillingDate: stdLib.Date = js.native
  var nextBillingPeriodAmount: java.lang.String = js.native
  var numberOfBillingCycles: js.UndefOr[scala.Double] = js.native
  var paidThroughDate: stdLib.Date = js.native
  var paymentMethodToken: java.lang.String = js.native
  var planId: java.lang.String = js.native
  var price: js.UndefOr[java.lang.String] = js.native
  var status: SubscriptionStatus = js.native
  var statusHistory: js.UndefOr[js.Array[SubscriptionHistory]] = js.native
  var transactions: js.UndefOr[js.Array[Transaction]] = js.native
  var trialDuration: js.UndefOr[scala.Double] = js.native
  var trialDurationUnit: js.UndefOr[java.lang.String] = js.native
  var trialPeriod: js.UndefOr[scala.Boolean] = js.native
  var updatedAt: stdLib.Date = js.native
}

