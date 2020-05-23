package typings.braintree.mod

import typings.braintree.anon.Add
import typings.braintree.anon.DoNotInheritAddOnsOrDiscounts
import typings.braintree.anon.Remove
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionRequest extends js.Object {
  var addOns: js.UndefOr[Add] = js.undefined
  var billingDayOfMonth: js.UndefOr[Double] = js.undefined
  var descriptor: js.UndefOr[Descriptor] = js.undefined
  var discounts: js.UndefOr[Remove] = js.undefined
  var firstBillingDate: js.UndefOr[Date] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var merchantAccountId: js.UndefOr[String] = js.undefined
  var neverExpires: js.UndefOr[Boolean] = js.undefined
  var numberOfBillingCycles: js.UndefOr[Double] = js.undefined
  var options: js.UndefOr[DoNotInheritAddOnsOrDiscounts] = js.undefined
  var paymentMethodNonce: js.UndefOr[String] = js.undefined
  var paymentMethodToken: String
  var planId: String
  var price: js.UndefOr[String] = js.undefined
  var trialDuration: js.UndefOr[Double] = js.undefined
  var trialDurationUnit: js.UndefOr[String] = js.undefined
  var trialPeriod: js.UndefOr[Boolean] = js.undefined
}

object SubscriptionRequest {
  @scala.inline
  def apply(
    paymentMethodToken: String,
    planId: String,
    addOns: Add = null,
    billingDayOfMonth: js.UndefOr[Double] = js.undefined,
    descriptor: Descriptor = null,
    discounts: Remove = null,
    firstBillingDate: Date = null,
    id: String = null,
    merchantAccountId: String = null,
    neverExpires: js.UndefOr[Boolean] = js.undefined,
    numberOfBillingCycles: js.UndefOr[Double] = js.undefined,
    options: DoNotInheritAddOnsOrDiscounts = null,
    paymentMethodNonce: String = null,
    price: String = null,
    trialDuration: js.UndefOr[Double] = js.undefined,
    trialDurationUnit: String = null,
    trialPeriod: js.UndefOr[Boolean] = js.undefined
  ): SubscriptionRequest = {
    val __obj = js.Dynamic.literal(paymentMethodToken = paymentMethodToken.asInstanceOf[js.Any], planId = planId.asInstanceOf[js.Any])
    if (addOns != null) __obj.updateDynamic("addOns")(addOns.asInstanceOf[js.Any])
    if (!js.isUndefined(billingDayOfMonth)) __obj.updateDynamic("billingDayOfMonth")(billingDayOfMonth.get.asInstanceOf[js.Any])
    if (descriptor != null) __obj.updateDynamic("descriptor")(descriptor.asInstanceOf[js.Any])
    if (discounts != null) __obj.updateDynamic("discounts")(discounts.asInstanceOf[js.Any])
    if (firstBillingDate != null) __obj.updateDynamic("firstBillingDate")(firstBillingDate.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (merchantAccountId != null) __obj.updateDynamic("merchantAccountId")(merchantAccountId.asInstanceOf[js.Any])
    if (!js.isUndefined(neverExpires)) __obj.updateDynamic("neverExpires")(neverExpires.get.asInstanceOf[js.Any])
    if (!js.isUndefined(numberOfBillingCycles)) __obj.updateDynamic("numberOfBillingCycles")(numberOfBillingCycles.get.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (paymentMethodNonce != null) __obj.updateDynamic("paymentMethodNonce")(paymentMethodNonce.asInstanceOf[js.Any])
    if (price != null) __obj.updateDynamic("price")(price.asInstanceOf[js.Any])
    if (!js.isUndefined(trialDuration)) __obj.updateDynamic("trialDuration")(trialDuration.get.asInstanceOf[js.Any])
    if (trialDurationUnit != null) __obj.updateDynamic("trialDurationUnit")(trialDurationUnit.asInstanceOf[js.Any])
    if (!js.isUndefined(trialPeriod)) __obj.updateDynamic("trialPeriod")(trialPeriod.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionRequest]
  }
}

