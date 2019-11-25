package typings.braintree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddBillingAddressToPaymentMethod extends js.Object {
  var addBillingAddressToPaymentMethod: js.UndefOr[Boolean] = js.undefined
  var holdInEscrow: js.UndefOr[Boolean] = js.undefined
  var paypal: js.UndefOr[Anon_CustomField] = js.undefined
  var skipAdvancedFraudChecking: js.UndefOr[Boolean] = js.undefined
  var skipAvs: js.UndefOr[Boolean] = js.undefined
  var skipCvv: js.UndefOr[Boolean] = js.undefined
  var storeInVault: js.UndefOr[Boolean] = js.undefined
  var storeInVaultOnSuccess: js.UndefOr[Boolean] = js.undefined
  var storeShippingAddressInVault: js.UndefOr[Boolean] = js.undefined
  var submitForSettlement: js.UndefOr[Boolean] = js.undefined
  var threeDSecure: js.UndefOr[Anon_Required] = js.undefined
  var venmo: js.UndefOr[Anon_ProfileId] = js.undefined
}

object Anon_AddBillingAddressToPaymentMethod {
  @scala.inline
  def apply(
    addBillingAddressToPaymentMethod: js.UndefOr[Boolean] = js.undefined,
    holdInEscrow: js.UndefOr[Boolean] = js.undefined,
    paypal: Anon_CustomField = null,
    skipAdvancedFraudChecking: js.UndefOr[Boolean] = js.undefined,
    skipAvs: js.UndefOr[Boolean] = js.undefined,
    skipCvv: js.UndefOr[Boolean] = js.undefined,
    storeInVault: js.UndefOr[Boolean] = js.undefined,
    storeInVaultOnSuccess: js.UndefOr[Boolean] = js.undefined,
    storeShippingAddressInVault: js.UndefOr[Boolean] = js.undefined,
    submitForSettlement: js.UndefOr[Boolean] = js.undefined,
    threeDSecure: Anon_Required = null,
    venmo: Anon_ProfileId = null
  ): Anon_AddBillingAddressToPaymentMethod = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addBillingAddressToPaymentMethod)) __obj.updateDynamic("addBillingAddressToPaymentMethod")(addBillingAddressToPaymentMethod.asInstanceOf[js.Any])
    if (!js.isUndefined(holdInEscrow)) __obj.updateDynamic("holdInEscrow")(holdInEscrow.asInstanceOf[js.Any])
    if (paypal != null) __obj.updateDynamic("paypal")(paypal.asInstanceOf[js.Any])
    if (!js.isUndefined(skipAdvancedFraudChecking)) __obj.updateDynamic("skipAdvancedFraudChecking")(skipAdvancedFraudChecking.asInstanceOf[js.Any])
    if (!js.isUndefined(skipAvs)) __obj.updateDynamic("skipAvs")(skipAvs.asInstanceOf[js.Any])
    if (!js.isUndefined(skipCvv)) __obj.updateDynamic("skipCvv")(skipCvv.asInstanceOf[js.Any])
    if (!js.isUndefined(storeInVault)) __obj.updateDynamic("storeInVault")(storeInVault.asInstanceOf[js.Any])
    if (!js.isUndefined(storeInVaultOnSuccess)) __obj.updateDynamic("storeInVaultOnSuccess")(storeInVaultOnSuccess.asInstanceOf[js.Any])
    if (!js.isUndefined(storeShippingAddressInVault)) __obj.updateDynamic("storeShippingAddressInVault")(storeShippingAddressInVault.asInstanceOf[js.Any])
    if (!js.isUndefined(submitForSettlement)) __obj.updateDynamic("submitForSettlement")(submitForSettlement.asInstanceOf[js.Any])
    if (threeDSecure != null) __obj.updateDynamic("threeDSecure")(threeDSecure.asInstanceOf[js.Any])
    if (venmo != null) __obj.updateDynamic("venmo")(venmo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AddBillingAddressToPaymentMethod]
  }
}

