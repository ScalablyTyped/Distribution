package typings.braintree.braintreeMod

import typings.braintree.Anon_Add
import typings.braintree.Anon_AddRemove
import typings.braintree.Anon_DoNotInheritAddOnsOrDiscounts
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionRequest extends js.Object {
  var addOns: js.UndefOr[Anon_Add] = js.undefined
  var billingDayOfMonth: js.UndefOr[Double] = js.undefined
  var descriptor: js.UndefOr[Descriptor] = js.undefined
  var discounts: js.UndefOr[Anon_AddRemove] = js.undefined
  var firstBillingDate: js.UndefOr[Date] = js.undefined
  var id: String
  var merchantAccountId: String
  var neverExpires: js.UndefOr[Boolean] = js.undefined
  var numberOfBillingCycles: js.UndefOr[Double] = js.undefined
  var options: js.UndefOr[Anon_DoNotInheritAddOnsOrDiscounts] = js.undefined
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
    id: String,
    merchantAccountId: String,
    paymentMethodToken: String,
    planId: String,
    addOns: Anon_Add = null,
    billingDayOfMonth: Int | Double = null,
    descriptor: Descriptor = null,
    discounts: Anon_AddRemove = null,
    firstBillingDate: Date = null,
    neverExpires: js.UndefOr[Boolean] = js.undefined,
    numberOfBillingCycles: Int | Double = null,
    options: Anon_DoNotInheritAddOnsOrDiscounts = null,
    paymentMethodNonce: String = null,
    price: String = null,
    trialDuration: Int | Double = null,
    trialDurationUnit: String = null,
    trialPeriod: js.UndefOr[Boolean] = js.undefined
  ): SubscriptionRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], merchantAccountId = merchantAccountId.asInstanceOf[js.Any], paymentMethodToken = paymentMethodToken.asInstanceOf[js.Any], planId = planId.asInstanceOf[js.Any])
    if (addOns != null) __obj.updateDynamic("addOns")(addOns.asInstanceOf[js.Any])
    if (billingDayOfMonth != null) __obj.updateDynamic("billingDayOfMonth")(billingDayOfMonth.asInstanceOf[js.Any])
    if (descriptor != null) __obj.updateDynamic("descriptor")(descriptor.asInstanceOf[js.Any])
    if (discounts != null) __obj.updateDynamic("discounts")(discounts.asInstanceOf[js.Any])
    if (firstBillingDate != null) __obj.updateDynamic("firstBillingDate")(firstBillingDate.asInstanceOf[js.Any])
    if (!js.isUndefined(neverExpires)) __obj.updateDynamic("neverExpires")(neverExpires.asInstanceOf[js.Any])
    if (numberOfBillingCycles != null) __obj.updateDynamic("numberOfBillingCycles")(numberOfBillingCycles.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (paymentMethodNonce != null) __obj.updateDynamic("paymentMethodNonce")(paymentMethodNonce.asInstanceOf[js.Any])
    if (price != null) __obj.updateDynamic("price")(price.asInstanceOf[js.Any])
    if (trialDuration != null) __obj.updateDynamic("trialDuration")(trialDuration.asInstanceOf[js.Any])
    if (trialDurationUnit != null) __obj.updateDynamic("trialDurationUnit")(trialDurationUnit.asInstanceOf[js.Any])
    if (!js.isUndefined(trialPeriod)) __obj.updateDynamic("trialPeriod")(trialPeriod.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionRequest]
  }
}

