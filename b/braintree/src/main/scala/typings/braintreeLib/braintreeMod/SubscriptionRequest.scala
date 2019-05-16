package typings
package braintreeLib.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionRequest extends js.Object {
  var addOns: js.UndefOr[braintreeLib.Anon_Add] = js.undefined
  var billingDayOfMonth: js.UndefOr[scala.Double] = js.undefined
  var descriptor: js.UndefOr[Descriptor] = js.undefined
  var discounts: js.UndefOr[braintreeLib.Anon_AddRemove] = js.undefined
  var firstBillingDate: js.UndefOr[stdLib.Date] = js.undefined
  var id: java.lang.String
  var merchantAccountId: java.lang.String
  var neverExpires: js.UndefOr[scala.Boolean] = js.undefined
  var numberOfBillingCycles: js.UndefOr[scala.Double] = js.undefined
  var options: js.UndefOr[braintreeLib.Anon_DoNotInheritAddOnsOrDiscounts] = js.undefined
  var paymentMethodNonce: js.UndefOr[java.lang.String] = js.undefined
  var paymentMethodToken: java.lang.String
  var planId: java.lang.String
  var price: js.UndefOr[java.lang.String] = js.undefined
  var trialDuration: js.UndefOr[scala.Double] = js.undefined
  var trialDurationUnit: js.UndefOr[java.lang.String] = js.undefined
  var trialPeriod: js.UndefOr[scala.Boolean] = js.undefined
}

object SubscriptionRequest {
  @scala.inline
  def apply(
    id: java.lang.String,
    merchantAccountId: java.lang.String,
    paymentMethodToken: java.lang.String,
    planId: java.lang.String,
    addOns: braintreeLib.Anon_Add = null,
    billingDayOfMonth: scala.Int | scala.Double = null,
    descriptor: Descriptor = null,
    discounts: braintreeLib.Anon_AddRemove = null,
    firstBillingDate: stdLib.Date = null,
    neverExpires: js.UndefOr[scala.Boolean] = js.undefined,
    numberOfBillingCycles: scala.Int | scala.Double = null,
    options: braintreeLib.Anon_DoNotInheritAddOnsOrDiscounts = null,
    paymentMethodNonce: java.lang.String = null,
    price: java.lang.String = null,
    trialDuration: scala.Int | scala.Double = null,
    trialDurationUnit: java.lang.String = null,
    trialPeriod: js.UndefOr[scala.Boolean] = js.undefined
  ): SubscriptionRequest = {
    val __obj = js.Dynamic.literal(id = id, merchantAccountId = merchantAccountId, paymentMethodToken = paymentMethodToken, planId = planId)
    if (addOns != null) __obj.updateDynamic("addOns")(addOns)
    if (billingDayOfMonth != null) __obj.updateDynamic("billingDayOfMonth")(billingDayOfMonth.asInstanceOf[js.Any])
    if (descriptor != null) __obj.updateDynamic("descriptor")(descriptor)
    if (discounts != null) __obj.updateDynamic("discounts")(discounts)
    if (firstBillingDate != null) __obj.updateDynamic("firstBillingDate")(firstBillingDate)
    if (!js.isUndefined(neverExpires)) __obj.updateDynamic("neverExpires")(neverExpires)
    if (numberOfBillingCycles != null) __obj.updateDynamic("numberOfBillingCycles")(numberOfBillingCycles.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options)
    if (paymentMethodNonce != null) __obj.updateDynamic("paymentMethodNonce")(paymentMethodNonce)
    if (price != null) __obj.updateDynamic("price")(price)
    if (trialDuration != null) __obj.updateDynamic("trialDuration")(trialDuration.asInstanceOf[js.Any])
    if (trialDurationUnit != null) __obj.updateDynamic("trialDurationUnit")(trialDurationUnit)
    if (!js.isUndefined(trialPeriod)) __obj.updateDynamic("trialPeriod")(trialPeriod)
    __obj.asInstanceOf[SubscriptionRequest]
  }
}

